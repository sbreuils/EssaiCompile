package de.gaalop.java;

import de.gaalop.dfg.*;

/**
 * Creates code for a single expression. The code can afterwards be queried via {@link #getCode()}.
 */
public class BladePrinter implements ExpressionVisitor {

    private StringBuilder code = new StringBuilder();

    public String getCode() {
        return code.toString();
    }

    /**
     * Handles a binary operation: Prints the operator between the left and the right operand (infix)
     * @param operation The binary operation
     * @param operator The operator to be used
     * @param withSpaces <value>true</value> if spaces should be printed next to operator, otherwise <value>false</value>
     */
    private void handleInfix(BinaryOperation operation, String operator, boolean withSpaces) {
        addChild(operation, operation.getLeft());
        if (withSpaces) {
            code.append(' ');
            code.append(operator);
            code.append(' ');
        } else {
            code.append(operator);
        }
        addChild(operation, operation.getRight());
    }

    /**
     * Adds a child expression. If the child has a lower priority than the parent,
     * it is parenthesized
     * @param parent The parent expression
     * @param child The child expression
     */
    private void addChild(Expression parent, Expression child) {
        if (OperatorPriority.hasLowerPriority(parent, child)) {
            code.append('(');
            child.accept(this);
            code.append(')');
        } else {
            child.accept(this);
        }
    }

    @Override
    public void visit(Subtraction subtraction) {
        handleInfix(subtraction, "-", true);
    }

    @Override
    public void visit(Addition addition) {
        handleInfix(addition, "+", true);
    }

    @Override
    public void visit(Division division) {
        handleInfix(division, "/", true);
    }

    @Override
    public void visit(InnerProduct innerProduct) {
        handleInfix(innerProduct, ".", true);
    }

    @Override
    public void visit(Multiplication multiplication) {
        handleInfix(multiplication, "*", true);
    }

    @Override
    public void visit(MathFunctionCall mathFunctionCall) {
        code.append(mathFunctionCall.getFunction().toString());
        code.append('(');
        mathFunctionCall.getOperand().accept(this);
        code.append(')');
    }

    @Override
    public void visit(Variable variable) {
        code.append(variable.getName());
    }

    @Override
    public void visit(MultivectorComponent component) {
        code.append(component.getName());
        code.append('(');
        code.append(component.getBladeIndex() + 1);
        code.append(')');
    }

    @Override
    public void visit(Exponentiation exponentiation) {
        code.append("Math.pow(");
        addChild(exponentiation, exponentiation.getLeft());
        code.append(',');
        addChild(exponentiation, exponentiation.getRight());
        code.append(")");
    }

    @Override
    public void visit(FloatConstant floatConstant) {
        code.append(Double.toString(floatConstant.getValue()));
    }

    @Override
    public void visit(OuterProduct outerProduct) {
        handleInfix(outerProduct, "^", false);
    }

    @Override
    public void visit(BaseVector baseVector) {
        code.append(baseVector.toString());
    }

    @Override
    public void visit(Negation negation) {
        code.append('-');
        addChild(negation, negation.getOperand());
    }

    @Override
    public void visit(Reverse node) {
        code.append('~');
        addChild(node, node.getOperand());
    }

    @Override
    public void visit(LogicalOr node) {
        handleInfix(node, "||", true);
    }

    @Override
    public void visit(LogicalAnd node) {
        handleInfix(node, "&&", true);
    }

    @Override
    public void visit(LogicalNegation node) {
        code.append('!');
        addChild(node, node.getOperand());
    }

    @Override
    public void visit(Equality node) {
        handleInfix(node, "==", true);
    }

    @Override
    public void visit(Inequality node) {
        handleInfix(node, "!=", true);
    }

    @Override
    public void visit(Relation relation) {
        handleInfix(relation, relation.getTypeString(), false);
    }

    @Override
    public void visit(FunctionArgument node) {
        throw new IllegalStateException("Macros should have been inlined and are not allowed for output.");
    }

    @Override
    public void visit(MacroCall node) {
        throw new IllegalStateException("Macros should have been inlined and are not allowed for output.");
    }
}
