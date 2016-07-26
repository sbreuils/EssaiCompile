package de.gaalop.tba.cfgImport.optimization;

import de.gaalop.api.dfg.DFGNodeType;
import de.gaalop.api.dfg.DFGNodeTypeGetter;
import de.gaalop.cfg.AssignmentNode;
import de.gaalop.cfg.BlockEndNode;
import de.gaalop.cfg.BreakNode;
import de.gaalop.cfg.ColorNode;
import de.gaalop.cfg.ControlFlowVisitor;
import de.gaalop.cfg.EndNode;
import de.gaalop.cfg.ExpressionStatement;
import de.gaalop.cfg.IfThenElseNode;
import de.gaalop.cfg.LoopNode;
import de.gaalop.cfg.Macro;
import de.gaalop.cfg.StartNode;
import de.gaalop.cfg.StoreResultNode;
import de.gaalop.dfg.Addition;
import de.gaalop.dfg.BaseVector;
import de.gaalop.dfg.Division;
import de.gaalop.dfg.Equality;
import de.gaalop.dfg.Exponentiation;
import de.gaalop.dfg.Expression;
import de.gaalop.dfg.ExpressionVisitor;
import de.gaalop.dfg.FloatConstant;
import de.gaalop.dfg.FunctionArgument;
import de.gaalop.dfg.Inequality;
import de.gaalop.dfg.InnerProduct;
import de.gaalop.dfg.LogicalAnd;
import de.gaalop.dfg.LogicalNegation;
import de.gaalop.dfg.LogicalOr;
import de.gaalop.dfg.MacroCall;
import de.gaalop.dfg.MathFunction;
import de.gaalop.dfg.MathFunctionCall;
import de.gaalop.dfg.Multiplication;
import de.gaalop.dfg.MultivectorComponent;
import de.gaalop.dfg.Negation;
import de.gaalop.dfg.OuterProduct;
import de.gaalop.dfg.Relation;
import de.gaalop.dfg.Reverse;
import de.gaalop.dfg.Subtraction;
import de.gaalop.dfg.Variable;

/**
 * Performs a constant folding on a ControlFlowGraph or Expression
 * @author fs first implementation and main ideas
 * @author chs further additions
 */
public class ConstantFolding implements ExpressionVisitor, ControlFlowVisitor {

    /* global visitor return variable */
    private Expression resultExpr;
    private static final double EPSILON = (double) 10E-10; 
    private boolean graphModified = false;

    public Expression getResultExpr() {
        return resultExpr;
    }

    public boolean isGraphModified() {
        return graphModified;
    }

    private void setGraphModified() {
        graphModified = true;
    }

    /**
     * Determines if two floats are equal using a given precision.
     *
     * The precision is defined my the member EPSILON.
     * @param val1 The first float
     * @param val2 The second float
     * @return <value>true</value> if the given floats are equal, <value>false</value> otherwise
     */
    private boolean doubleEquals(double val1, double val2) {
        return (Math.abs(val1 - val2) <= EPSILON);
    }

    /**
     * Determines if a expression is a FloatConstant
     * @param expr The expression
     * @return <value>true</value> if the given expression is a FloatConstant, <value>false</value> otherwise
     */
    private boolean isConstant(Expression expr) {
        return DFGNodeTypeGetter.getTypeOfDFGNode(expr) == DFGNodeType.FloatConstant;
    }

    @Override
    public void visit(Subtraction node) {
        node.getLeft().accept(this);
        Expression left = resultExpr;
        node.getRight().accept(this);
        Expression right = resultExpr;
        resultExpr = new Subtraction(left, right);
        if (isConstant(left)
                && isConstant(right)) {
            FloatConstant leftc = (FloatConstant) left;
            FloatConstant rightc = (FloatConstant) right;
            resultExpr = new FloatConstant(leftc.getValue() - rightc.getValue());
            setGraphModified();
        } else if (DFGNodeTypeGetter.getTypeOfDFGNode(right) == DFGNodeType.Negation) {
            Negation neg = (Negation) right;
            resultExpr = new Addition(left, neg.getOperand());
            setGraphModified();
        } else if (isConstant(left)) {
            FloatConstant leftc = (FloatConstant) left;
            if (doubleEquals(leftc.getValue(), 0.0f)) {
                resultExpr = new Negation(right);
                setGraphModified();
            }
        } else if (isConstant(right)) {
            FloatConstant rightc = (FloatConstant) right;
            if (doubleEquals(rightc.getValue(), 0.0f)) {
                resultExpr = left;
                setGraphModified();
            }
        }
    }

    @Override
    public void visit(Addition node) {
        node.getLeft().accept(this);
        Expression left = resultExpr;
        node.getRight().accept(this);
        Expression right = resultExpr;
        resultExpr = new Addition(left, right);
        if (isConstant(left)
                && isConstant(right)) {
            FloatConstant leftc = (FloatConstant) left;
            FloatConstant rightc = (FloatConstant) right;
            resultExpr = new FloatConstant(leftc.getValue() + rightc.getValue());
            setGraphModified();
        } else if (isConstant(left)) {
            FloatConstant leftc = (FloatConstant) left;
            if (doubleEquals(leftc.getValue(), 0.0f)) {
                resultExpr = right;
                setGraphModified();
            }
        } else if (isConstant(right)) {
            FloatConstant rightc = (FloatConstant) right;
            if (doubleEquals(rightc.getValue(), 0.0f)) {
                resultExpr = left;
                setGraphModified();
            }
        }
    }

    @Override
    public void visit(Division node) {
        node.getLeft().accept(this);
        Expression left = resultExpr;
        node.getRight().accept(this);
        Expression right = resultExpr;
        resultExpr = new Division(left, right);
        if (isConstant(left)
                && isConstant(right)) {
            FloatConstant leftc = (FloatConstant) left;
            FloatConstant rightc = (FloatConstant) right;
            resultExpr = new FloatConstant(leftc.getValue() / rightc.getValue());
            setGraphModified();
        } else if (isConstant(node.getRight())) {
            /* division by 1 gets canceled */
            FloatConstant floatConst = (FloatConstant) node.getRight();
            if (doubleEquals(floatConst.getValue(), 1.0f)) {
                resultExpr = left;
                setGraphModified();
            }
        }

    }

    @Override
    public void visit(InnerProduct node) {
        resultExpr = node;
    }

    @Override
    public void visit(Multiplication node) {
        node.getLeft().accept(this);
        Expression left = resultExpr;
        node.getRight().accept(this);
        Expression right = resultExpr;
        resultExpr = new Multiplication(left, right);
        if (isConstant(left)
                && isConstant(right)) {
            FloatConstant leftc = (FloatConstant) left;
            FloatConstant rightc = (FloatConstant) right;
            resultExpr = new FloatConstant(leftc.getValue() * rightc.getValue());
            setGraphModified();
        } else if (isConstant(right)) {
            /* mult by 1 gets canceled */
            FloatConstant floatConst = (FloatConstant) right;
            if (doubleEquals(floatConst.getValue(), 1.0f)) {
                resultExpr = left;
                setGraphModified();
            } else if (doubleEquals(floatConst.getValue(), 0.5f)) {
                resultExpr = new Division(left, new FloatConstant(2.0f));
                setGraphModified();
            } else if (doubleEquals(floatConst.getValue(), -1.0f)) {
                resultExpr = new Negation(left);
                setGraphModified();
            } else if (doubleEquals(floatConst.getValue(), 0.0f)) {
                resultExpr = right;
                setGraphModified();
            }
        } else if (isConstant(left)) {
            /* mult by 1 gets canceld */
            FloatConstant floatConst = (FloatConstant) left;
            if (doubleEquals(floatConst.getValue(), 1.0f)) {
                resultExpr = right;
                setGraphModified();
            } else if (doubleEquals(floatConst.getValue(), 0.5f)) {
                resultExpr = new Division(right, new FloatConstant(2.0f));
                setGraphModified();
            } else if (doubleEquals(floatConst.getValue(), -1.0f)) {
                resultExpr = new Negation(right);
                setGraphModified();
            } else if (doubleEquals(floatConst.getValue(), 0.0f)) {
                resultExpr = left;
                setGraphModified();
            }

        } else if ((DFGNodeTypeGetter.getTypeOfDFGNode(left) == DFGNodeType.MathFunctionCall)
                && (DFGNodeTypeGetter.getTypeOfDFGNode(right) == DFGNodeType.MathFunctionCall)) {
            /* optimize sqrts and abs function calls by combining them */
            MathFunctionCall leftFunc = (MathFunctionCall) left;
            MathFunctionCall rightFunc = (MathFunctionCall) right;
            if ((leftFunc.getFunction() == MathFunction.ABS)
                    && (rightFunc.getFunction() == MathFunction.ABS)) {
                resultExpr = new MathFunctionCall(new Multiplication(rightFunc.getOperand(), leftFunc.getOperand()), MathFunction.ABS);
                setGraphModified();
            }
            if ((leftFunc.getFunction() == MathFunction.SQRT)
                    && (rightFunc.getFunction() == MathFunction.SQRT)) {
                resultExpr = new MathFunctionCall(new Multiplication(rightFunc.getOperand(), leftFunc.getOperand()), MathFunction.SQRT);
                setGraphModified();
            }
        }
    }

    @Override
    public void visit(MathFunctionCall node) {
        node.getOperand().accept(this);
        Expression operandExpr = resultExpr;
        resultExpr = new MathFunctionCall(operandExpr, node.getFunction());
        if ((node.getFunction() == MathFunction.SQRT)
                && isConstant(operandExpr)) {
            FloatConstant operand = (FloatConstant) operandExpr;
            resultExpr = new FloatConstant(Math.sqrt(operand.getValue()));
            setGraphModified();
        } else if ((node.getFunction() == MathFunction.ABS)
                && (DFGNodeTypeGetter.getTypeOfDFGNode(operandExpr) == DFGNodeType.MathFunctionCall)) {
            // remove abs() around sqrts, as they are always positive
            MathFunctionCall insideFunc = (MathFunctionCall) operandExpr;
            if (insideFunc.getFunction() == MathFunction.ABS
                    || insideFunc.getFunction() == MathFunction.SQRT) {
                resultExpr = operandExpr;
                setGraphModified();
            }
        } // this results in a endless loop, when uncommenting!
        /*  else if ((node.getFunction() == MathFunction.SQRT)
        && ((DFGNodeTypeGetter.getTypeOfDFGNode(operandExpr) == DFGNodeType.MathFunctionCall)
        && (((MathFunctionCall) operandExpr).getFunction() != MathFunction.ABS))) {
        // insert in every sqrt() an abs()
        resultExpr = new MathFunctionCall(new MathFunctionCall(operandExpr, MathFunction.ABS), MathFunction.SQRT);
        setGraphModified();
        }*/ else if ((node.getFunction() == MathFunction.ABS)
                && isConstant(operandExpr)) {
            FloatConstant operand = (FloatConstant) operandExpr;
            resultExpr = new FloatConstant(Math.abs(operand.getValue()));
            setGraphModified();
        }

    }

    @Override
    public void visit(Variable node) {
        resultExpr = node;
    }

    @Override
    public void visit(MultivectorComponent node) {
        resultExpr = node;
    }

    @Override
    public void visit(Exponentiation node) {
        node.getLeft().accept(this);
        Expression left = resultExpr;
        node.getRight().accept(this);
        Expression right = resultExpr;
        resultExpr = new Exponentiation(left, right);
        if (isConstant(left) && isConstant(right)) {
            // const ^ const => const
            FloatConstant leftc = (FloatConstant) left;
            FloatConstant rightc = (FloatConstant) right;
            resultExpr = new FloatConstant(new Float(Math.pow(leftc.getValue(), rightc.getValue())));
            setGraphModified();
        } else if (isConstant(left) && doubleEquals(((FloatConstant) left).getValue(), 0.0f)) {
            // 0 ^ x => 0
            resultExpr = left;
            setGraphModified();
        } else if (isConstant(right)) {
            // x ^ const
            FloatConstant rightc = (FloatConstant) right;
            boolean isSqrt = doubleEquals(rightc.getValue() - (double) new Double(rightc.getValue()).intValue(), 0.5f);
            if (isSqrt && !doubleEquals(rightc.getValue(), 0.5f)) {
                MathFunctionCall newsqrt = new MathFunctionCall(new Exponentiation(
                        left, new FloatConstant(rightc.getValue() - 0.5f)), MathFunction.SQRT);
                resultExpr = newsqrt;
                setGraphModified();
            }
            if (doubleEquals(rightc.getValue(), 1.0f)) {
                // x ^ 1 => x
                resultExpr = left;
                setGraphModified();
            } else if (doubleEquals(rightc.getValue(), 0.5f)) {
                MathFunctionCall newsqrt = new MathFunctionCall(left, MathFunction.SQRT);
                newsqrt.accept(this);
                setGraphModified();
            } else if (doubleEquals(rightc.getValue(), 2.0f)) {
                resultExpr = new Multiplication(left, left);
                setGraphModified();
            }
        }
    }

    @Override
    public void visit(FloatConstant node) {
        resultExpr = node;
    }

    @Override
    public void visit(OuterProduct node) {
        resultExpr = node;
    }

    @Override
    public void visit(BaseVector node) {
        resultExpr = node;
    }

    @Override
    public void visit(Negation node) {
        node.getOperand().accept(this);
        Expression operandExpr = resultExpr;
        resultExpr = new Negation(resultExpr);
        if (isConstant(operandExpr)) {
            FloatConstant operand = (FloatConstant) operandExpr;
            if (doubleEquals(operand.getValue(), 0.0f)) {
                resultExpr = new FloatConstant(0.0f);
            } else {
                resultExpr = new FloatConstant(-operand.getValue());
            }
            setGraphModified();
        } else if (DFGNodeTypeGetter.getTypeOfDFGNode(operandExpr) == DFGNodeType.Negation) {
            Negation operand = (Negation) operandExpr;
            resultExpr = operand.getOperand();
            setGraphModified();
        }
    }

    @Override
    public void visit(Reverse node) {
        resultExpr = node;
    }

    @Override
    public void visit(LogicalOr node) {
        node.getLeft().accept(this);
        Expression left = resultExpr;
        node.getRight().accept(this);
        Expression right = resultExpr;
        resultExpr = new LogicalOr(left, right);
        if (isConstant(left)) {
            FloatConstant leftc = (FloatConstant) left;
            if (doubleEquals(leftc.getValue(), 0.0f)) {
                resultExpr = right;
                setGraphModified();
            }
            if (doubleEquals(leftc.getValue(), 1.0f)) {
                resultExpr = left;
                setGraphModified();
            }
        } else if (isConstant(right)) {
            FloatConstant rightc = (FloatConstant) right;
            if (doubleEquals(rightc.getValue(), 0.0f)) {
                resultExpr = left;
                setGraphModified();
            }
            if (doubleEquals(rightc.getValue(), 1.0f)) {
                resultExpr = right;
                setGraphModified();
            }
        }
    }

    @Override
    public void visit(LogicalAnd node) {
        node.getLeft().accept(this);
        Expression left = resultExpr;
        node.getRight().accept(this);
        Expression right = resultExpr;
        resultExpr = new LogicalAnd(left, right);
        if (isConstant(left)) {
            FloatConstant leftc = (FloatConstant) left;
            if (isConstant(right)) {
                FloatConstant rightc = (FloatConstant) right;

                if (doubleEquals(leftc.getValue(), 1.0f) && doubleEquals(rightc.getValue(), 1.0f)) {
                    resultExpr = left;
                } else {
                    resultExpr = new FloatConstant(0.0f);
                }

                setGraphModified();
            } else {
                if (doubleEquals(leftc.getValue(), 0.0f)) {
                    resultExpr = left;
                    setGraphModified();
                }
            }

        } else if (isConstant(right)) {
            FloatConstant rightc = (FloatConstant) right;
            if (doubleEquals(rightc.getValue(), 0.0f)) {
                resultExpr = right;
                setGraphModified();
            }
        }
    }

    @Override
    public void visit(Equality node) {
        node.getLeft().accept(this);
        Expression left = resultExpr;
        node.getRight().accept(this);
        Expression right = resultExpr;
        resultExpr = new Equality(left, right);
        if (isConstant(left) && isConstant(right)) {
            FloatConstant leftc = (FloatConstant) left;
            FloatConstant rightc = (FloatConstant) right;
            if (doubleEquals(leftc.getValue(), rightc.getValue())) {
                resultExpr = new FloatConstant(1.0f);
            } else {
                resultExpr = new FloatConstant(0.0f);
            }
            setGraphModified();
        }
    }

    @Override
    public void visit(Inequality node) {
        node.getLeft().accept(this);
        Expression left = resultExpr;
        node.getRight().accept(this);
        Expression right = resultExpr;
        resultExpr = new Inequality(left, right);
        if (isConstant(left) && isConstant(right)) {
            FloatConstant leftc = (FloatConstant) left;
            FloatConstant rightc = (FloatConstant) right;
            if (doubleEquals(leftc.getValue(), rightc.getValue())) {
                resultExpr = new FloatConstant(0.0f);
            } else {
                resultExpr = new FloatConstant(1.0f);
            }
            setGraphModified();
        }
    }

    @Override
    public void visit(Relation relation) {
        relation.getLeft().accept(this);
        Expression left = resultExpr;
        relation.getRight().accept(this);
        Expression right = resultExpr;
        resultExpr = new Relation(left, right, relation.getType());
        if (isConstant(left) && isConstant(right)) {
            FloatConstant leftc = (FloatConstant) left;
            FloatConstant rightc = (FloatConstant) right;

            boolean unknown = false;

            switch (relation.getType()) {
                case GREATER:
                    resultExpr = (leftc.getValue() > rightc.getValue())
                            ? new FloatConstant(1.0f)
                            : new FloatConstant(0.0f);
                    break;
                case GREATER_OR_EQUAL:
                    resultExpr = (leftc.getValue() >= rightc.getValue())
                            ? new FloatConstant(1.0f)
                            : new FloatConstant(0.0f);
                    break;
                case LESS:
                    resultExpr = (leftc.getValue() < rightc.getValue())
                            ? new FloatConstant(1.0f)
                            : new FloatConstant(0.0f);
                    break;
                case LESS_OR_EQUAL:
                    resultExpr = (leftc.getValue() <= rightc.getValue())
                            ? new FloatConstant(1.0f)
                            : new FloatConstant(0.0f);
                    break;
                default:
                    System.err.println("Warning: Unknown relation type " + relation.getTypeString() + ": Relation won't be optimized.");
                    unknown = true;
                    break;
            }

            if (!unknown) {
                setGraphModified();
            }
        }
    }

    @Override
    public void visit(StartNode node) {
        node.getSuccessor().accept(this);
    }

    @Override
    public void visit(AssignmentNode node) {
        node.getSuccessor().accept(this);
        node.getValue().accept(this);
        node.setValue(resultExpr);
    }

    @Override
    public void visit(StoreResultNode node) {
        node.getSuccessor().accept(this);
    }

    @Override
    public void visit(IfThenElseNode node) {
        node.getSuccessor().accept(this);
    }

    @Override
    public void visit(BlockEndNode node) {
    }

    @Override
    public void visit(EndNode node) {
    }

    @Override
    public void visit(LogicalNegation node) {
        node.getOperand().accept(this);
    }

    @Override
    public void visit(FunctionArgument node) {
        // not used here
    }

    @Override
    public void visit(MacroCall node) {
        for (Expression arg : node.getArguments()) {
            arg.accept(this);
        }
    }

    @Override
    public void visit(LoopNode node) {
        node.getBody().accept(this);
        node.getSuccessor().accept(this);
    }

    @Override
    public void visit(BreakNode node) {
        node.getSuccessor().accept(this);
    }

    @Override
    public void visit(Macro node) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void visit(ExpressionStatement node) {
        node.getExpression().accept(this);
    }

    @Override
    public void visit(ColorNode node) {
        node.getSuccessor().accept(this);
    }
}
