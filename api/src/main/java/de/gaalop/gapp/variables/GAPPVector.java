package de.gaalop.gapp.variables;

/**
 * Represents a vector in the GAPP IR.
 *
 * A vector contains components, which are not organized in a fixed order
 *
 * @author Christian Steinmetz
 */
public class GAPPVector extends GAPPSetOfVariables {

    public GAPPVector(String name) {
        super(name);
    }

    @Override
    public Object accept(GAPPVariableVisitor visitor, Object arg) {
        return visitor.visitVector(this, arg);
    }
}
