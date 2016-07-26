package de.gaalop;

import de.gaalop.cfg.ControlFlowGraph;

/**
 * This interface describes a strategy for source-to-source compilation which
 * consists of a simple graph to graph transformation on the control flow graph
 * that has been produced by the frontend.
 */
public interface GlobalSettingsStrategy {

    /**
     * Transforms a graph by applying GlobalSettings.
     *
     * @param graph The control flow graph to operate on.
     * @throws OptimizationException If any error occurs during the transformation.
     */
    void transform(ControlFlowGraph graph) throws OptimizationException;

}
