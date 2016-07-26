package de.gaalop.tba.cfgImport.optimization;

import de.gaalop.cfg.ControlFlowGraph;
import de.gaalop.cfg.SequentialNode;
import de.gaalop.tba.UseAlgebra;

/**
 * Facade class for the one expression removal optimization
 * @author Christian Steinmetz
 */
public class OptOneExpressionsRemoval implements OptimizationStrategyWithModifyFlag {

    @Override
    public boolean transform(ControlFlowGraph graph, UseAlgebra usedAlgebra) {
        OneExpressionRemoval oneExpressionRemoval = new OneExpressionRemoval(usedAlgebra);
        graph.accept(oneExpressionRemoval);

        // remove all nodes that are marked for removal
        for (SequentialNode node : oneExpressionRemoval.getNodeRemovals()) {
            graph.removeNode(node);
        }

        UpdateLocalVariableSet.updateVariableSets(graph);

        return oneExpressionRemoval.isGraphModified();
    }
}
