package de.gaalop.gapp.variables;

/**
 * Defines a visitor for GAPP variables
 * @author Christian Steinmetz
 */
public interface GAPPVariableVisitor {

    public Object visitConstant(GAPPConstant gappConstant, Object arg);

    public Object visitMultivector(GAPPMultivector gappMultivector, Object arg);

    public Object visitMultivectorComponent(GAPPMultivectorComponent gappMultivectorComponent, Object arg);

    public Object visitScalarVariable(GAPPScalarVariable gappScalarVariable, Object arg);

    public Object visitVector(GAPPVector gappVector, Object arg);
}
