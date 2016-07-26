package de.gaalop.testbenchTbaGapp.gapp;

import de.gaalop.AlgebraStrategy;
import de.gaalop.CodeGenerator;
import de.gaalop.CodeGeneratorException;
import de.gaalop.CodeGeneratorPlugin;
import de.gaalop.CodeParser;
import de.gaalop.CodeParserException;
import de.gaalop.InputFile;
import de.gaalop.gapp.executer.Executer;
import java.util.HashMap;
import de.gaalop.OptimizationException;
import de.gaalop.OutputFile;
import de.gaalop.cfg.ControlFlowGraph;
import de.gaalop.gapp.importing.GAPPDecoratingMain;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Provides methods for testing the GAPP importing pass with a GAPPTestable object
 * @author Christian Steinmetz
 */
public class Base {

    /**
     * Compiles and execute the GAPP code in a program, defined in a given GAPPTestable object
     * @param testable The GAPPTestable object which defines the program to be tested
     * @param cluName The name of the clucalc script to be tested
     * @return The executer object which was used for executing
     * @throws OptimizationException
     * @throws CodeParserException
     */
    protected Executer executeProgram(GAPPTestable testable, String cluName) throws OptimizationException, CodeParserException {
        CodeParser parser = (new de.gaalop.clucalc.input.Plugin()).createCodeParser();
        ControlFlowGraph graph = parser.parseFile(new InputFile(cluName, testable.getSource()));
        graph.algebraName = "5d";
        graph.asRessource = true;
        
        de.gaalop.algebra.Plugin alPlugin = new de.gaalop.algebra.Plugin();
        alPlugin.usePrecalulatedTables = true;
        AlgebraStrategy algebraStrategy = alPlugin.createAlgebraStrategy();
        algebraStrategy.transform(graph);
        

        GAPPDecoratingMain importer = new GAPPDecoratingMain();
        importer.decorateGraph(graph);

        outputPlugin(new de.gaalop.codegenGapp.Plugin(), graph);
        outputPlugin(new de.gaalop.clucalc.output.Plugin(), graph);

        //printStatistics(graph);

        //Evaluate!
        HashMap<String, Double> inputValues = testable.getInputs();
        Executer executer = new Executer(inputValues);
        graph.accept(executer);
        return executer;
    }

    /**
     * Writes the output of a plugin, called for a given graph, into files
     * @param plugin The plugin to be used
     * @param graph The underlying graph
     */
    public static void outputPlugin(CodeGeneratorPlugin plugin, ControlFlowGraph graph) {
        CodeGenerator generator = plugin.createCodeGenerator();
        Set<OutputFile> outputFiles;
        try {
            outputFiles = generator.generate(graph);
            for (OutputFile outputFile : outputFiles) {
                writeFile(outputFile);
            }
        } catch (CodeGeneratorException ex) {
            Logger.getLogger(GAPPDecoratingMain.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Writes an output file in the generatedTests directory
     * @param outputFile The file to be outputted
     */
    protected static void writeFile(OutputFile outputFile) {
        try {
            PrintWriter out = new PrintWriter("src/test/java/de/gaalop/testbenchTbaGapp/gapp/generatedTests/" + outputFile.getName());
            out.print(outputFile.getContent());
            out.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(GAPPDecoratingMain.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
