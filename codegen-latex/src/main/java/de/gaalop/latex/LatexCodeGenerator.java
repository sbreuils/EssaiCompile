package de.gaalop.latex;

import de.gaalop.CodeGenerator;
import de.gaalop.OutputFile;
import de.gaalop.cfg.ControlFlowGraph;

import java.util.Set;
import java.util.Collections;
import java.nio.charset.Charset;

/**
 * This class facilitates LaTeX code generation.
 */
public enum LatexCodeGenerator implements CodeGenerator {

    INSTANCE;

    @Override
    public Set<OutputFile> generate(ControlFlowGraph in) {
        String code = generateCode(in);

        String filename = generateFilename(in);

        OutputFile sourceFile = new OutputFile(filename, code, Charset.forName("UTF-8"));
        return Collections.singleton(sourceFile);
    }

    private String generateFilename(ControlFlowGraph in) {
        String filename = "gaalop.tex";
        if (in.getSource() != null) {
            filename = in.getSource().getName();
            int lastDotIndex = filename.lastIndexOf('.');
            if (lastDotIndex != -1) {
                filename = filename.substring(0, lastDotIndex);
            }
            filename += ".tex";
        }
        return filename;
    }

    /**
     * Generates source code for a control dataflow graph.
     *
     * @param in
     * @return
     */
    private String generateCode(ControlFlowGraph in) {
        LatexVisitor visitor = new LatexVisitor();
        in.accept(visitor);
        return visitor.getCode();
    }

}
