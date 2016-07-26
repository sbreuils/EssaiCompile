package de.gaalop.tba.cfgImport;

import de.gaalop.cfg.AlgebraDefinitionFile;
import de.gaalop.cfg.AssignmentNode;
import de.gaalop.dfg.Expression;
import de.gaalop.dfg.MultivectorComponent;
import de.gaalop.dfg.Variable;
import de.gaalop.tba.UseAlgebra;
import de.gaalop.tba.cfgImport.optimization.UpdateLocalVariableSet;

/**
 * Changes the control flow graph by building the mvExpressions.
 * This is the main transformer class for TBA plugin
 *
 * @author Christian Steinmetz
 */
public class CFGImporter extends MvExpressionsBuilder {

    public CFGImporter(UseAlgebra usedAlgebra, boolean scalarFunctions, AlgebraDefinitionFile alFile) {
        super(usedAlgebra, scalarFunctions, alFile);
    }

    @Override
    protected AssignmentNode changeGraph(AssignmentNode node, MvExpressions mvExpr, Variable variable) {
        AssignmentNode lastNode = node;

        boolean inserted = false;

        // At first, output all assignments
        for (int i = 0; i < bladeCount; i++) {

            Expression e = mvExpr.bladeExpressions[i];

            if (e != null) {
                inserted = true;
                AssignmentNode insNode = new AssignmentNode(node.getGraph(), new MultivectorComponent(variable.getName(), i), e);

                lastNode.insertAfter(insNode);
                lastNode = insNode;
            }

        }

        node.getGraph().removeNode(node);

        /*
        if (!inserted) {
            //Remove local variable (for gcd),
            //since there are no non-empty multivector components
            node.getGraph().removeLocalVariable(node.getVariable());

        }*/

        UpdateLocalVariableSet.updateVariableSets(node.getGraph());

        return lastNode;
    }
}
