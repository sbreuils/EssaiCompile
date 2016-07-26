// $ANTLR 3.1.1 de\\gaalop\\clucalc\\input\\CluCalcParser.g 2016-07-22 23:31:07

  package de.gaalop.clucalc.input;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;

public class CluCalcParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "DECIMAL_LITERAL", "EXPONENT", "FLOATTYPESUFFIX", "FLOATING_POINT_LITERAL", "RANGE_LITERAL", "UNROLL_LITERAL", "COUNT_LITERAL", "STRING_LITERAL", "MINUS", "OPNS", "IPNS", "IF", "ELSE", "LOOP", "BREAK", "SLIDER_LITERAL", "COLOR_LITERAL", "BGCOLOR_LITERAL", "BLACK", "BLUE", "CYAN", "GREEN", "MAGENTA", "ORANGE", "RED", "WHITE", "YELLOW", "LETTER", "DIGIT", "IDENTIFIER", "ARGUMENT_PREFIX", "WS", "COMMENT", "PRAGMA", "LINE_COMMENT", "EQUALS", "COMMA", "PLUS", "STAR", "SLASH", "MODULO", "LSBRACKET", "RSBRACKET", "LBRACKET", "RBRACKET", "CLBRACKET", "CRBRACKET", "REVERSE", "NOT", "DOUBLE_NOT", "SEMICOLON", "WEDGE", "DOT", "QUESTIONMARK", "COLON", "DOUBLE_BAR", "DOUBLE_AND", "DOUBLE_EQUALS", "UNEQUAL", "LESS", "GREATER", "LESS_OR_EQUAL", "GREATER_OR_EQUAL", "REFERENCE_OPERATOR", "FUNCTION", "NEGATION", "DUAL", "BLOCK", "ELSEIF", "MACRO", "ARGUMENT", "RETURN", "SLIDER", "STRING", "COLOR", "BGCOLOR", "IGNORE_LITERAL"
    };
    public static final int LETTER=31;
    public static final int ELSEIF=72;
    public static final int UNROLL_LITERAL=9;
    public static final int LOOP=17;
    public static final int BGCOLOR_LITERAL=21;
    public static final int IPNS=14;
    public static final int MINUS=12;
    public static final int GREATER_OR_EQUAL=66;
    public static final int SLIDER=76;
    public static final int SEMICOLON=54;
    public static final int COLOR=78;
    public static final int BREAK=18;
    public static final int ELSE=16;
    public static final int SLIDER_LITERAL=19;
    public static final int PRAGMA=37;
    public static final int BLACK=22;
    public static final int REVERSE=51;
    public static final int IF=15;
    public static final int RANGE_LITERAL=8;
    public static final int DOUBLE_AND=60;
    public static final int COUNT_LITERAL=10;
    public static final int DOUBLE_EQUALS=61;
    public static final int ARGUMENT_PREFIX=34;
    public static final int MODULO=44;
    public static final int DOT=56;
    public static final int BLOCK=71;
    public static final int DOUBLE_NOT=53;
    public static final int FUNCTION=68;
    public static final int NOT=52;
    public static final int LINE_COMMENT=38;
    public static final int MAGENTA=26;
    public static final int LESS=63;
    public static final int YELLOW=30;
    public static final int CYAN=24;
    public static final int CRBRACKET=50;
    public static final int PLUS=41;
    public static final int COLOR_LITERAL=20;
    public static final int CLBRACKET=49;
    public static final int OPNS=13;
    public static final int BLUE=23;
    public static final int BGCOLOR=79;
    public static final int COMMENT=36;
    public static final int RSBRACKET=46;
    public static final int RETURN=75;
    public static final int QUESTIONMARK=57;
    public static final int REFERENCE_OPERATOR=67;
    public static final int ARGUMENT=74;
    public static final int IDENTIFIER=33;
    public static final int WS=35;
    public static final int DUAL=70;
    public static final int EOF=-1;
    public static final int IGNORE_LITERAL=80;
    public static final int ORANGE=27;
    public static final int COMMA=40;
    public static final int WHITE=29;
    public static final int EQUALS=39;
    public static final int UNEQUAL=62;
    public static final int FLOATING_POINT_LITERAL=7;
    public static final int SLASH=43;
    public static final int GREATER=64;
    public static final int LBRACKET=47;
    public static final int NEGATION=69;
    public static final int RBRACKET=48;
    public static final int COLON=58;
    public static final int FLOATTYPESUFFIX=6;
    public static final int GREEN=25;
    public static final int DIGIT=32;
    public static final int DOUBLE_BAR=59;
    public static final int LSBRACKET=45;
    public static final int RED=28;
    public static final int LESS_OR_EQUAL=65;
    public static final int STAR=42;
    public static final int MACRO=73;
    public static final int EXPONENT=5;
    public static final int STRING=77;
    public static final int STRING_LITERAL=11;
    public static final int WEDGE=55;
    public static final int DECIMAL_LITERAL=4;

    // delegates
    // delegators


        public CluCalcParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public CluCalcParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
            this.state.ruleMemo = new HashMap[100+1];
             
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return CluCalcParser.tokenNames; }
    public String getGrammarFileName() { return "de\\gaalop\\clucalc\\input\\CluCalcParser.g"; }


        private List<String> errors = new ArrayList<String>();
        public void displayRecognitionError(String[] tokenNames,
                                            RecognitionException e) {
            String hdr = getErrorHeader(e);
            String msg = getErrorMessage(e, tokenNames);
            errors.add(hdr + " " + msg);
        }
        public List<String> getErrors() {
            return errors;
        }


    public static class script_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "script"
    // de\\gaalop\\clucalc\\input\\CluCalcParser.g:45:1: script : ( statement )* EOF ;
    public final CluCalcParser.script_return script() throws RecognitionException {
        CluCalcParser.script_return retval = new CluCalcParser.script_return();
        retval.start = input.LT(1);
        int script_StartIndex = input.index();
        Object root_0 = null;

        Token EOF2=null;
        CluCalcParser.statement_return statement1 = null;


        Object EOF2_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return retval; }
            // de\\gaalop\\clucalc\\input\\CluCalcParser.g:45:9: ( ( statement )* EOF )
            // de\\gaalop\\clucalc\\input\\CluCalcParser.g:46:3: ( statement )* EOF
            {
            root_0 = (Object)adaptor.nil();

            // de\\gaalop\\clucalc\\input\\CluCalcParser.g:46:3: ( statement )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==DECIMAL_LITERAL||LA1_0==FLOATING_POINT_LITERAL||LA1_0==MINUS||LA1_0==IF||(LA1_0>=LOOP && LA1_0<=BREAK)||LA1_0==BGCOLOR_LITERAL||(LA1_0>=IDENTIFIER && LA1_0<=ARGUMENT_PREFIX)||LA1_0==PRAGMA||LA1_0==STAR||LA1_0==LBRACKET||LA1_0==CLBRACKET||LA1_0==REVERSE||(LA1_0>=DOUBLE_NOT && LA1_0<=SEMICOLON)||(LA1_0>=QUESTIONMARK && LA1_0<=COLON)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // de\\gaalop\\clucalc\\input\\CluCalcParser.g:0:0: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_script127);
            	    statement1=statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement1.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_script130); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 1, script_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "script"

    public static class float_literal_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "float_literal"
    // de\\gaalop\\clucalc\\input\\CluCalcParser.g:49:1: float_literal : ( MINUS )? FLOATING_POINT_LITERAL ;
    public final CluCalcParser.float_literal_return float_literal() throws RecognitionException {
        CluCalcParser.float_literal_return retval = new CluCalcParser.float_literal_return();
        retval.start = input.LT(1);
        int float_literal_StartIndex = input.index();
        Object root_0 = null;

        Token MINUS3=null;
        Token FLOATING_POINT_LITERAL4=null;

        Object MINUS3_tree=null;
        Object FLOATING_POINT_LITERAL4_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return retval; }
            // de\\gaalop\\clucalc\\input\\CluCalcParser.g:49:14: ( ( MINUS )? FLOATING_POINT_LITERAL )
            // de\\gaalop\\clucalc\\input\\CluCalcParser.g:50:3: ( MINUS )? FLOATING_POINT_LITERAL
            {
            root_0 = (Object)adaptor.nil();

            // de\\gaalop\\clucalc\\input\\CluCalcParser.g:50:3: ( MINUS )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==MINUS) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // de\\gaalop\\clucalc\\input\\CluCalcParser.g:0:0: MINUS
                    {
                    MINUS3=(Token)match(input,MINUS,FOLLOW_MINUS_in_float_literal144); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    MINUS3_tree = (Object)adaptor.create(MINUS3);
                    adaptor.addChild(root_0, MINUS3_tree);
                    }

                    }
                    break;

            }

            FLOATING_POINT_LITERAL4=(Token)match(input,FLOATING_POINT_LITERAL,FOLLOW_FLOATING_POINT_LITERAL_in_float_literal147); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            FLOATING_POINT_LITERAL4_tree = (Object)adaptor.create(FLOATING_POINT_LITERAL4);
            adaptor.addChild(root_0, FLOATING_POINT_LITERAL4_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 2, float_literal_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "float_literal"

    public static class pragma_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "pragma"
    // de\\gaalop\\clucalc\\input\\CluCalcParser.g:56:1: pragma : ( PRAGMA RANGE_LITERAL float_literal LESS_OR_EQUAL IDENTIFIER LESS_OR_EQUAL float_literal | PRAGMA IGNORE_LITERAL IDENTIFIER );
    public final CluCalcParser.pragma_return pragma() throws RecognitionException {
        CluCalcParser.pragma_return retval = new CluCalcParser.pragma_return();
        retval.start = input.LT(1);
        int pragma_StartIndex = input.index();
        Object root_0 = null;

        Token PRAGMA5=null;
        Token RANGE_LITERAL6=null;
        Token LESS_OR_EQUAL8=null;
        Token IDENTIFIER9=null;
        Token LESS_OR_EQUAL10=null;
        Token PRAGMA12=null;
        Token IGNORE_LITERAL13=null;
        Token IDENTIFIER14=null;
        CluCalcParser.float_literal_return float_literal7 = null;

        CluCalcParser.float_literal_return float_literal11 = null;


        Object PRAGMA5_tree=null;
        Object RANGE_LITERAL6_tree=null;
        Object LESS_OR_EQUAL8_tree=null;
        Object IDENTIFIER9_tree=null;
        Object LESS_OR_EQUAL10_tree=null;
        Object PRAGMA12_tree=null;
        Object IGNORE_LITERAL13_tree=null;
        Object IDENTIFIER14_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return retval; }
            // de\\gaalop\\clucalc\\input\\CluCalcParser.g:57:3: ( PRAGMA RANGE_LITERAL float_literal LESS_OR_EQUAL IDENTIFIER LESS_OR_EQUAL float_literal | PRAGMA IGNORE_LITERAL IDENTIFIER )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==PRAGMA) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==RANGE_LITERAL) ) {
                    alt3=1;
                }
                else if ( (LA3_1==IGNORE_LITERAL) ) {
                    alt3=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // de\\gaalop\\clucalc\\input\\CluCalcParser.g:57:5: PRAGMA RANGE_LITERAL float_literal LESS_OR_EQUAL IDENTIFIER LESS_OR_EQUAL float_literal
                    {
                    root_0 = (Object)adaptor.nil();

                    PRAGMA5=(Token)match(input,PRAGMA,FOLLOW_PRAGMA_in_pragma162); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    PRAGMA5_tree = (Object)adaptor.create(PRAGMA5);
                    adaptor.addChild(root_0, PRAGMA5_tree);
                    }
                    RANGE_LITERAL6=(Token)match(input,RANGE_LITERAL,FOLLOW_RANGE_LITERAL_in_pragma164); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RANGE_LITERAL6_tree = (Object)adaptor.create(RANGE_LITERAL6);
                    adaptor.addChild(root_0, RANGE_LITERAL6_tree);
                    }
                    pushFollow(FOLLOW_float_literal_in_pragma166);
                    float_literal7=float_literal();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, float_literal7.getTree());
                    LESS_OR_EQUAL8=(Token)match(input,LESS_OR_EQUAL,FOLLOW_LESS_OR_EQUAL_in_pragma168); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LESS_OR_EQUAL8_tree = (Object)adaptor.create(LESS_OR_EQUAL8);
                    adaptor.addChild(root_0, LESS_OR_EQUAL8_tree);
                    }
                    IDENTIFIER9=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_pragma170); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENTIFIER9_tree = (Object)adaptor.create(IDENTIFIER9);
                    adaptor.addChild(root_0, IDENTIFIER9_tree);
                    }
                    LESS_OR_EQUAL10=(Token)match(input,LESS_OR_EQUAL,FOLLOW_LESS_OR_EQUAL_in_pragma172); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LESS_OR_EQUAL10_tree = (Object)adaptor.create(LESS_OR_EQUAL10);
                    adaptor.addChild(root_0, LESS_OR_EQUAL10_tree);
                    }
                    pushFollow(FOLLOW_float_literal_in_pragma174);
                    float_literal11=float_literal();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, float_literal11.getTree());

                    }
                    break;
                case 2 :
                    // de\\gaalop\\clucalc\\input\\CluCalcParser.g:58:5: PRAGMA IGNORE_LITERAL IDENTIFIER
                    {
                    root_0 = (Object)adaptor.nil();

                    PRAGMA12=(Token)match(input,PRAGMA,FOLLOW_PRAGMA_in_pragma180); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    PRAGMA12_tree = (Object)adaptor.create(PRAGMA12);
                    adaptor.addChild(root_0, PRAGMA12_tree);
                    }
                    IGNORE_LITERAL13=(Token)match(input,IGNORE_LITERAL,FOLLOW_IGNORE_LITERAL_in_pragma182); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IGNORE_LITERAL13_tree = (Object)adaptor.create(IGNORE_LITERAL13);
                    adaptor.addChild(root_0, IGNORE_LITERAL13_tree);
                    }
                    IDENTIFIER14=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_pragma184); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENTIFIER14_tree = (Object)adaptor.create(IDENTIFIER14);
                    adaptor.addChild(root_0, IDENTIFIER14_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 3, pragma_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "pragma"

    public static class expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expression"
    // de\\gaalop\\clucalc\\input\\CluCalcParser.g:64:1: expression : ( lvalue EQUALS expression -> ^( EQUALS lvalue expression ) | logical_or_expression );
    public final CluCalcParser.expression_return expression() throws RecognitionException {
        CluCalcParser.expression_return retval = new CluCalcParser.expression_return();
        retval.start = input.LT(1);
        int expression_StartIndex = input.index();
        Object root_0 = null;

        Token EQUALS16=null;
        CluCalcParser.lvalue_return lvalue15 = null;

        CluCalcParser.expression_return expression17 = null;

        CluCalcParser.logical_or_expression_return logical_or_expression18 = null;


        Object EQUALS16_tree=null;
        RewriteRuleTokenStream stream_EQUALS=new RewriteRuleTokenStream(adaptor,"token EQUALS");
        RewriteRuleSubtreeStream stream_lvalue=new RewriteRuleSubtreeStream(adaptor,"rule lvalue");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return retval; }
            // de\\gaalop\\clucalc\\input\\CluCalcParser.g:65:3: ( lvalue EQUALS expression -> ^( EQUALS lvalue expression ) | logical_or_expression )
            int alt4=2;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // de\\gaalop\\clucalc\\input\\CluCalcParser.g:65:5: lvalue EQUALS expression
                    {
                    pushFollow(FOLLOW_lvalue_in_expression199);
                    lvalue15=lvalue();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_lvalue.add(lvalue15.getTree());
                    EQUALS16=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_expression201); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EQUALS.add(EQUALS16);

                    pushFollow(FOLLOW_expression_in_expression203);
                    expression17=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression17.getTree());


                    // AST REWRITE
                    // elements: EQUALS, lvalue, expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 65:30: -> ^( EQUALS lvalue expression )
                    {
                        // de\\gaalop\\clucalc\\input\\CluCalcParser.g:65:33: ^( EQUALS lvalue expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_EQUALS.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_lvalue.nextTree());
                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // de\\gaalop\\clucalc\\input\\CluCalcParser.g:66:5: logical_or_expression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_logical_or_expression_in_expression219);
                    logical_or_expression18=logical_or_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, logical_or_expression18.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 4, expression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "expression"

    public static class argument_expression_list_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "argument_expression_list"
    // de\\gaalop\\clucalc\\input\\CluCalcParser.g:69:1: argument_expression_list : expression ( COMMA expression )* ;
    public final CluCalcParser.argument_expression_list_return argument_expression_list() throws RecognitionException {
        CluCalcParser.argument_expression_list_return retval = new CluCalcParser.argument_expression_list_return();
        retval.start = input.LT(1);
        int argument_expression_list_StartIndex = input.index();
        Object root_0 = null;

        Token COMMA20=null;
        CluCalcParser.expression_return expression19 = null;

        CluCalcParser.expression_return expression21 = null;


        Object COMMA20_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return retval; }
            // de\\gaalop\\clucalc\\input\\CluCalcParser.g:70:3: ( expression ( COMMA expression )* )
            // de\\gaalop\\clucalc\\input\\CluCalcParser.g:70:7: expression ( COMMA expression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_expression_in_argument_expression_list234);
            expression19=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression19.getTree());
            // de\\gaalop\\clucalc\\input\\CluCalcParser.g:70:18: ( COMMA expression )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==COMMA) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // de\\gaalop\\clucalc\\input\\CluCalcParser.g:70:20: COMMA expression
            	    {
            	    COMMA20=(Token)match(input,COMMA,FOLLOW_COMMA_in_argument_expression_list238); if (state.failed) return retval;
            	    pushFollow(FOLLOW_expression_in_argument_expression_list241);
            	    expression21=expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression21.getTree());

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 5, argument_expression_list_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "argument_expression_list"

    public static class lvalue_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "lvalue"
    // de\\gaalop\\clucalc\\input\\CluCalcParser.g:73:1: lvalue : unary_expression ;
    public final CluCalcParser.lvalue_return lvalue() throws RecognitionException {
        CluCalcParser.lvalue_return retval = new CluCalcParser.lvalue_return();
        retval.start = input.LT(1);
        int lvalue_StartIndex = input.index();
        Object root_0 = null;

        CluCalcParser.unary_expression_return unary_expression22 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return retval; }
            // de\\gaalop\\clucalc\\input\\CluCalcParser.g:74:3: ( unary_expression )
            // de\\gaalop\\clucalc\\input\\CluCalcParser.g:74:5: unary_expression
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_unary_expression_in_lvalue259);
            unary_expression22=unary_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, unary_expression22.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 6, lvalue_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "lvalue"

    public static class logical_or_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "logical_or_expression"
    // de\\gaalop\\clucalc\\input\\CluCalcParser.g:77:1: logical_or_expression : logical_and_expression ( DOUBLE_BAR logical_and_expression )* ;
    public final CluCalcParser.logical_or_expression_return logical_or_expression() throws RecognitionException {
        CluCalcParser.logical_or_expression_return retval = new CluCalcParser.logical_or_expression_return();
        retval.start = input.LT(1);
        int logical_or_expression_StartIndex = input.index();
        Object root_0 = null;

        Token DOUBLE_BAR24=null;
        CluCalcParser.logical_and_expression_return logical_and_expression23 = null;

        CluCalcParser.logical_and_expression_return logical_and_expression25 = null;


        Object DOUBLE_BAR24_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return retval; }
            // de\\gaalop\\clucalc\\input\\CluCalcParser.g:78:3: ( logical_and_expression ( DOUBLE_BAR logical_and_expression )* )
            // de\\gaalop\\clucalc\\input\\CluCalcParser.g:78:5: logical_and_expression ( DOUBLE_BAR logical_and_expression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_logical_and_expression_in_logical_or_expression272);
            logical_and_expression23=logical_and_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, logical_and_expression23.getTree());
            // de\\gaalop\\clucalc\\input\\CluCalcParser.g:78:28: ( DOUBLE_BAR logical_and_expression )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==DOUBLE_BAR) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // de\\gaalop\\clucalc\\input\\CluCalcParser.g:78:29: DOUBLE_BAR logical_and_expression
            	    {
            	    DOUBLE_BAR24=(Token)match(input,DOUBLE_BAR,FOLLOW_DOUBLE_BAR_in_logical_or_expression275); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    DOUBLE_BAR24_tree = (Object)adaptor.create(DOUBLE_BAR24);
            	    root_0 = (Object)adaptor.becomeRoot(DOUBLE_BAR24_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_logical_and_expression_in_logical_or_expression278);
            	    logical_and_expression25=logical_and_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, logical_and_expression25.getTree());

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 7, logical_or_expression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "logical_or_expression"

    public static class logical_and_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "logical_and_expression"
    // de\\gaalop\\clucalc\\input\\CluCalcParser.g:81:1: logical_and_expression : equality_expression ( DOUBLE_AND equality_expression )* ;
    public final CluCalcParser.logical_and_expression_return logical_and_expression() throws RecognitionException {
        CluCalcParser.logical_and_expression_return retval = new CluCalcParser.logical_and_expression_return();
        retval.start = input.LT(1);
        int logical_and_expression_StartIndex = input.index();
        Object root_0 = null;

        Token DOUBLE_AND27=null;
        CluCalcParser.equality_expression_return equality_expression26 = null;

        CluCalcParser.equality_expression_return equality_expression28 = null;


        Object DOUBLE_AND27_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return retval; }
            // de\\gaalop\\clucalc\\input\\CluCalcParser.g:82:3: ( equality_expression ( DOUBLE_AND equality_expression )* )
            // de\\gaalop\\clucalc\\input\\CluCalcParser.g:82:5: equality_expression ( DOUBLE_AND equality_expression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_equality_expression_in_logical_and_expression293);
            equality_expression26=equality_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, equality_expression26.getTree());
            // de\\gaalop\\clucalc\\input\\CluCalcParser.g:82:25: ( DOUBLE_AND equality_expression )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==DOUBLE_AND) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // de\\gaalop\\clucalc\\input\\CluCalcParser.g:82:26: DOUBLE_AND equality_expression
            	    {
            	    DOUBLE_AND27=(Token)match(input,DOUBLE_AND,FOLLOW_DOUBLE_AND_in_logical_and_expression296); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    DOUBLE_AND27_tree = (Object)adaptor.create(DOUBLE_AND27);
            	    root_0 = (Object)adaptor.becomeRoot(DOUBLE_AND27_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_equality_expression_in_logical_and_expression299);
            	    equality_expression28=equality_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, equality_expression28.getTree());

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 8, logical_and_expression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "logical_and_expression"

    public static class equality_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "equality_expression"
    // de\\gaalop\\clucalc\\input\\CluCalcParser.g:85:1: equality_expression : relational_expression ( ( DOUBLE_EQUALS | UNEQUAL ) relational_expression )* ;
    public final CluCalcParser.equality_expression_return equality_expression() throws RecognitionException {
        CluCalcParser.equality_expression_return retval = new CluCalcParser.equality_expression_return();
        retval.start = input.LT(1);
        int equality_expression_StartIndex = input.index();
        Object root_0 = null;

        Token DOUBLE_EQUALS30=null;
        Token UNEQUAL31=null;
        CluCalcParser.relational_expression_return relational_expression29 = null;

        CluCalcParser.relational_expression_return relational_expression32 = null;


        Object DOUBLE_EQUALS30_tree=null;
        Object UNEQUAL31_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return retval; }
            // de\\gaalop\\clucalc\\input\\CluCalcParser.g:86:3: ( relational_expression ( ( DOUBLE_EQUALS | UNEQUAL ) relational_expression )* )
            // de\\gaalop\\clucalc\\input\\CluCalcParser.g:86:5: relational_expression ( ( DOUBLE_EQUALS | UNEQUAL ) relational_expression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_relational_expression_in_equality_expression314);
            relational_expression29=relational_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, relational_expression29.getTree());
            // de\\gaalop\\clucalc\\input\\CluCalcParser.g:86:27: ( ( DOUBLE_EQUALS | UNEQUAL ) relational_expression )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=DOUBLE_EQUALS && LA9_0<=UNEQUAL)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // de\\gaalop\\clucalc\\input\\CluCalcParser.g:86:28: ( DOUBLE_EQUALS | UNEQUAL ) relational_expression
            	    {
            	    // de\\gaalop\\clucalc\\input\\CluCalcParser.g:86:28: ( DOUBLE_EQUALS | UNEQUAL )
            	    int alt8=2;
            	    int LA8_0 = input.LA(1);

            	    if ( (LA8_0==DOUBLE_EQUALS) ) {
            	        alt8=1;
            	    }
            	    else if ( (LA8_0==UNEQUAL) ) {
            	        alt8=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 8, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt8) {
            	        case 1 :
            	            // de\\gaalop\\clucalc\\input\\CluCalcParser.g:86:29: DOUBLE_EQUALS
            	            {
            	            DOUBLE_EQUALS30=(Token)match(input,DOUBLE_EQUALS,FOLLOW_DOUBLE_EQUALS_in_equality_expression318); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            DOUBLE_EQUALS30_tree = (Object)adaptor.create(DOUBLE_EQUALS30);
            	            root_0 = (Object)adaptor.becomeRoot(DOUBLE_EQUALS30_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // de\\gaalop\\clucalc\\input\\CluCalcParser.g:86:46: UNEQUAL
            	            {
            	            UNEQUAL31=(Token)match(input,UNEQUAL,FOLLOW_UNEQUAL_in_equality_expression323); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            UNEQUAL31_tree = (Object)adaptor.create(UNEQUAL31);
            	            root_0 = (Object)adaptor.becomeRoot(UNEQUAL31_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_relational_expression_in_equality_expression327);
            	    relational_expression32=relational_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, relational_expression32.getTree());

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 9, equality_expression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "equality_expression"

    public static class relational_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "relational_expression"
    // de\\gaalop\\clucalc\\input\\CluCalcParser.g:89:1: relational_expression : additive_expression ( ( LESS | GREATER | LESS_OR_EQUAL | GREATER_OR_EQUAL ) additive_expression )* ;
    public final CluCalcParser.relational_expression_return relational_expression() throws RecognitionException {
        CluCalcParser.relational_expression_return retval = new CluCalcParser.relational_expression_return();
        retval.start = input.LT(1);
        int relational_expression_StartIndex = input.index();
        Object root_0 = null;

        Token LESS34=null;
        Token GREATER35=null;
        Token LESS_OR_EQUAL36=null;
        Token GREATER_OR_EQUAL37=null;
        CluCalcParser.additive_expression_return additive_expression33 = null;

        CluCalcParser.additive_expression_return additive_expression38 = null;


        Object LESS34_tree=null;
        Object GREATER35_tree=null;
        Object LESS_OR_EQUAL36_tree=null;
        Object GREATER_OR_EQUAL37_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return retval; }
            // de\\gaalop\\clucalc\\input\\CluCalcParser.g:90:3: ( additive_expression ( ( LESS | GREATER | LESS_OR_EQUAL | GREATER_OR_EQUAL ) additive_expression )* )
            // de\\gaalop\\clucalc\\input\\CluCalcParser.g:90:5: additive_expression ( ( LESS | GREATER | LESS_OR_EQUAL | GREATER_OR_EQUAL ) additive_expression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_additive_expression_in_relational_expression342);
            additive_expression33=additive_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, additive_expression33.getTree());
            // de\\gaalop\\clucalc\\input\\CluCalcParser.g:90:25: ( ( LESS | GREATER | LESS_OR_EQUAL | GREATER_OR_EQUAL ) additive_expression )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=LESS && LA11_0<=GREATER_OR_EQUAL)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // de\\gaalop\\clucalc\\input\\CluCalcParser.g:90:26: ( LESS | GREATER | LESS_OR_EQUAL | GREATER_OR_EQUAL ) additive_expression
            	    {
            	    // de\\gaalop\\clucalc\\input\\CluCalcParser.g:90:26: ( LESS | GREATER | LESS_OR_EQUAL | GREATER_OR_EQUAL )
            	    int alt10=4;
            	    switch ( input.LA(1) ) {
            	    case LESS:
            	        {
            	        alt10=1;
            	        }
            	        break;
            	    case GREATER:
            	        {
            	        alt10=2;
            	        }
            	        break;
            	    case LESS_OR_EQUAL:
            	        {
            	        alt10=3;
            	        }
            	        break;
            	    case GREATER_OR_EQUAL:
            	        {
            	        alt10=4;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 10, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt10) {
            	        case 1 :
            	            // de\\gaalop\\clucalc\\input\\CluCalcParser.g:90:27: LESS
            	            {
            	            LESS34=(Token)match(input,LESS,FOLLOW_LESS_in_relational_expression346); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            LESS34_tree = (Object)adaptor.create(LESS34);
            	            root_0 = (Object)adaptor.becomeRoot(LESS34_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // de\\gaalop\\clucalc\\input\\CluCalcParser.g:90:35: GREATER
            	            {
            	            GREATER35=(Token)match(input,GREATER,FOLLOW_GREATER_in_relational_expression351); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            GREATER35_tree = (Object)adaptor.create(GREATER35);
            	            root_0 = (Object)adaptor.becomeRoot(GREATER35_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // de\\gaalop\\clucalc\\input\\CluCalcParser.g:90:46: LESS_OR_EQUAL
            	            {
            	            LESS_OR_EQUAL36=(Token)match(input,LESS_OR_EQUAL,FOLLOW_LESS_OR_EQUAL_in_relational_expression356); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            LESS_OR_EQUAL36_tree = (Object)adaptor.create(LESS_OR_EQUAL36);
            	            root_0 = (Object)adaptor.becomeRoot(LESS_OR_EQUAL36_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // de\\gaalop\\clucalc\\input\\CluCalcParser.g:90:63: GREATER_OR_EQUAL
            	            {
            	            GREATER_OR_EQUAL37=(Token)match(input,GREATER_OR_EQUAL,FOLLOW_GREATER_OR_EQUAL_in_relational_expression361); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            GREATER_OR_EQUAL37_tree = (Object)adaptor.create(GREATER_OR_EQUAL37);
            	            root_0 = (Object)adaptor.becomeRoot(GREATER_OR_EQUAL37_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_additive_expression_in_relational_expression365);
            	    additive_expression38=additive_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, additive_expression38.getTree());

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 10, relational_expression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "relational_expression"

    public static class additive_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "additive_expression"
    // de\\gaalop\\clucalc\\input\\CluCalcParser.g:93:1: additive_expression : multiplicative_expression ( ( PLUS | MINUS ) multiplicative_expression )* ;
    public final CluCalcParser.additive_expression_return additive_expression() throws RecognitionException {
        CluCalcParser.additive_expression_return retval = new CluCalcParser.additive_expression_return();
        retval.start = input.LT(1);
        int additive_expression_StartIndex = input.index();
        Object root_0 = null;

        Token PLUS40=null;
        Token MINUS41=null;
        CluCalcParser.multiplicative_expression_return multiplicative_expression39 = null;

        CluCalcParser.multiplicative_expression_return multiplicative_expression42 = null;


        Object PLUS40_tree=null;
        Object MINUS41_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return retval; }
            // de\\gaalop\\clucalc\\input\\CluCalcParser.g:94:3: ( multiplicative_expression ( ( PLUS | MINUS ) multiplicative_expression )* )
            // de\\gaalop\\clucalc\\input\\CluCalcParser.g:94:5: multiplicative_expression ( ( PLUS | MINUS ) multiplicative_expression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_multiplicative_expression_in_additive_expression380);
            multiplicative_expression39=multiplicative_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplicative_expression39.getTree());
            // de\\gaalop\\clucalc\\input\\CluCalcParser.g:94:31: ( ( PLUS | MINUS ) multiplicative_expression )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==MINUS||LA13_0==PLUS) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // de\\gaalop\\clucalc\\input\\CluCalcParser.g:94:33: ( PLUS | MINUS ) multiplicative_expression
            	    {
            	    // de\\gaalop\\clucalc\\input\\CluCalcParser.g:94:33: ( PLUS | MINUS )
            	    int alt12=2;
            	    int LA12_0 = input.LA(1);

            	    if ( (LA12_0==PLUS) ) {
            	        alt12=1;
            	    }
            	    else if ( (LA12_0==MINUS) ) {
            	        alt12=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 12, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt12) {
            	        case 1 :
            	            // de\\gaalop\\clucalc\\input\\CluCalcParser.g:94:34: PLUS
            	            {
            	            PLUS40=(Token)match(input,PLUS,FOLLOW_PLUS_in_additive_expression385); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            PLUS40_tree = (Object)adaptor.create(PLUS40);
            	            root_0 = (Object)adaptor.becomeRoot(PLUS40_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // de\\gaalop\\clucalc\\input\\CluCalcParser.g:94:42: MINUS
            	            {
            	            MINUS41=(Token)match(input,MINUS,FOLLOW_MINUS_in_additive_expression390); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            MINUS41_tree = (Object)adaptor.create(MINUS41);
            	            root_0 = (Object)adaptor.becomeRoot(MINUS41_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_multiplicative_expression_in_additive_expression394);
            	    multiplicative_expression42=multiplicative_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplicative_expression42.getTree());

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 11, additive_expression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "additive_expression"

    public static class multiplicative_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "multiplicative_expression"
    // de\\gaalop\\clucalc\\input\\CluCalcParser.g:97:1: multiplicative_expression : outer_product_expression ( ( STAR | SLASH ) outer_product_expression )* ;
    public final CluCalcParser.multiplicative_expression_return multiplicative_expression() throws RecognitionException {
        CluCalcParser.multiplicative_expression_return retval = new CluCalcParser.multiplicative_expression_return();
        retval.start = input.LT(1);
        int multiplicative_expression_StartIndex = input.index();
        Object root_0 = null;

        Token STAR44=null;
        Token SLASH45=null;
        CluCalcParser.outer_product_expression_return outer_product_expression43 = null;

        CluCalcParser.outer_product_expression_return outer_product_expression46 = null;


        Object STAR44_tree=null;
        Object SLASH45_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return retval; }
            // de\\gaalop\\clucalc\\input\\CluCalcParser.g:98:3: ( outer_product_expression ( ( STAR | SLASH ) outer_product_expression )* )
            // de\\gaalop\\clucalc\\input\\CluCalcParser.g:98:5: outer_product_expression ( ( STAR | SLASH ) outer_product_expression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_outer_product_expression_in_multiplicative_expression410);
            outer_product_expression43=outer_product_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, outer_product_expression43.getTree());
            // de\\gaalop\\clucalc\\input\\CluCalcParser.g:98:30: ( ( STAR | SLASH ) outer_product_expression )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=STAR && LA15_0<=SLASH)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // de\\gaalop\\clucalc\\input\\CluCalcParser.g:98:32: ( STAR | SLASH ) outer_product_expression
            	    {
            	    // de\\gaalop\\clucalc\\input\\CluCalcParser.g:98:32: ( STAR | SLASH )
            	    int alt14=2;
            	    int LA14_0 = input.LA(1);

            	    if ( (LA14_0==STAR) ) {
            	        alt14=1;
            	    }
            	    else if ( (LA14_0==SLASH) ) {
            	        alt14=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 14, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt14) {
            	        case 1 :
            	            // de\\gaalop\\clucalc\\input\\CluCalcParser.g:98:33: STAR
            	            {
            	            STAR44=(Token)match(input,STAR,FOLLOW_STAR_in_multiplicative_expression415); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            STAR44_tree = (Object)adaptor.create(STAR44);
            	            root_0 = (Object)adaptor.becomeRoot(STAR44_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // de\\gaalop\\clucalc\\input\\CluCalcParser.g:98:41: SLASH
            	            {
            	            SLASH45=(Token)match(input,SLASH,FOLLOW_SLASH_in_multiplicative_expression420); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            SLASH45_tree = (Object)adaptor.create(SLASH45);
            	            root_0 = (Object)adaptor.becomeRoot(SLASH45_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_outer_product_expression_in_multiplicative_expression424);
            	    outer_product_expression46=outer_product_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, outer_product_expression46.getTree());

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 12, multiplicative_expression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "multiplicative_expression"

    public static class outer_product_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "outer_product_expression"
    // de\\gaalop\\clucalc\\input\\CluCalcParser.g:101:1: outer_product_expression : inner_product_expression ( WEDGE inner_product_expression )* ;
    public final CluCalcParser.outer_product_expression_return outer_product_expression() throws RecognitionException {
        CluCalcParser.outer_product_expression_return retval = new CluCalcParser.outer_product_expression_return();
        retval.start = input.LT(1);
        int outer_product_expression_StartIndex = input.index();
        Object root_0 = null;

        Token WEDGE48=null;
        CluCalcParser.inner_product_expression_return inner_product_expression47 = null;

        CluCalcParser.inner_product_expression_return inner_product_expression49 = null;


        Object WEDGE48_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return retval; }
            // de\\gaalop\\clucalc\\input\\CluCalcParser.g:102:3: ( inner_product_expression ( WEDGE inner_product_expression )* )
            // de\\gaalop\\clucalc\\input\\CluCalcParser.g:102:5: inner_product_expression ( WEDGE inner_product_expression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_inner_product_expression_in_outer_product_expression440);
            inner_product_expression47=inner_product_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, inner_product_expression47.getTree());
            // de\\gaalop\\clucalc\\input\\CluCalcParser.g:102:30: ( WEDGE inner_product_expression )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==WEDGE) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // de\\gaalop\\clucalc\\input\\CluCalcParser.g:102:32: WEDGE inner_product_expression
            	    {
            	    WEDGE48=(Token)match(input,WEDGE,FOLLOW_WEDGE_in_outer_product_expression444); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    WEDGE48_tree = (Object)adaptor.create(WEDGE48);
            	    root_0 = (Object)adaptor.becomeRoot(WEDGE48_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_inner_product_expression_in_outer_product_expression447);
            	    inner_product_expression49=inner_product_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, inner_product_expression49.getTree());

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 13, outer_product_expression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "outer_product_expression"

    public static class inner_product_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "inner_product_expression"
    // de\\gaalop\\clucalc\\input\\CluCalcParser.g:105:1: inner_product_expression : modulo_expression ( DOT modulo_expression )* ;
    public final CluCalcParser.inner_product_expression_return inner_product_expression() throws RecognitionException {
        CluCalcParser.inner_product_expression_return retval = new CluCalcParser.inner_product_expression_return();
        retval.start = input.LT(1);
        int inner_product_expression_StartIndex = input.index();
        Object root_0 = null;

        Token DOT51=null;
        CluCalcParser.modulo_expression_return modulo_expression50 = null;

        CluCalcParser.modulo_expression_return modulo_expression52 = null;


        Object DOT51_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return retval; }
            // de\\gaalop\\clucalc\\input\\CluCalcParser.g:106:3: ( modulo_expression ( DOT modulo_expression )* )
            // de\\gaalop\\clucalc\\input\\CluCalcParser.g:106:5: modulo_expression ( DOT modulo_expression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_modulo_expression_in_inner_product_expression463);
            modulo_expression50=modulo_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, modulo_expression50.getTree());
            // de\\gaalop\\clucalc\\input\\CluCalcParser.g:106:23: ( DOT modulo_expression )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==DOT) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // de\\gaalop\\clucalc\\input\\CluCalcParser.g:106:25: DOT modulo_expression
            	    {
            	    DOT51=(Token)match(input,DOT,FOLLOW_DOT_in_inner_product_expression467); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    DOT51_tree = (Object)adaptor.create(DOT51);
            	    root_0 = (Object)adaptor.becomeRoot(DOT51_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_modulo_expression_in_inner_product_expression470);
            	    modulo_expression52=modulo_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, modulo_expression52.getTree());

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 14, inner_product_expression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "inner_product_expression"

    public static class modulo_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "modulo_expression"
    // de\\gaalop\\clucalc\\input\\CluCalcParser.g:109:1: modulo_expression : unary_expression ( MODULO unary_expression )* ;
    public final CluCalcParser.modulo_expression_return modulo_expression() throws RecognitionException {
        CluCalcParser.modulo_expression_return retval = new CluCalcParser.modulo_expression_return();
        retval.start = input.LT(1);
        int modulo_expression_StartIndex = input.index();
        Object root_0 = null;

        Token MODULO54=null;
        CluCalcParser.unary_expression_return unary_expression53 = null;

        CluCalcParser.unary_expression_return unary_expression55 = null;


        Object MODULO54_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return retval; }
            // de\\gaalop\\clucalc\\input\\CluCalcParser.g:110:3: ( unary_expression ( MODULO unary_expression )* )
            // de\\gaalop\\clucalc\\input\\CluCalcParser.g:110:5: unary_expression ( MODULO unary_expression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_unary_expression_in_modulo_expression486);
            unary_expression53=unary_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, unary_expression53.getTree());
            // de\\gaalop\\clucalc\\input\\CluCalcParser.g:110:22: ( MODULO unary_expression )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==MODULO) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // de\\gaalop\\clucalc\\input\\CluCalcParser.g:110:24: MODULO unary_expression
            	    {
            	    MODULO54=(Token)match(input,MODULO,FOLLOW_MODULO_in_modulo_expression490); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    MODULO54_tree = (Object)adaptor.create(MODULO54);
            	    root_0 = (Object)adaptor.becomeRoot(MODULO54_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_unary_expression_in_modulo_expression493);
            	    unary_expression55=unary_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, unary_expression55.getTree());

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 15, modulo_expression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "modulo_expression"

    public static class unary_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "unary_expression"
    // de\\gaalop\\clucalc\\input\\CluCalcParser.g:113:1: unary_expression : ( postfix_expression | STAR operand= unary_expression -> ^( DUAL $operand) | MINUS operand= unary_expression -> ^( NEGATION $operand) | REVERSE operand= unary_expression -> ^( REVERSE $operand) | DOUBLE_NOT operand= unary_expression -> ^( DOUBLE_NOT $operand) );
    public final CluCalcParser.unary_expression_return unary_expression() throws RecognitionException {
        CluCalcParser.unary_expression_return retval = new CluCalcParser.unary_expression_return();
        retval.start = input.LT(1);
        int unary_expression_StartIndex = input.index();
        Object root_0 = null;

        Token STAR57=null;
        Token MINUS58=null;
        Token REVERSE59=null;
        Token DOUBLE_NOT60=null;
        CluCalcParser.unary_expression_return operand = null;

        CluCalcParser.postfix_expression_return postfix_expression56 = null;


        Object STAR57_tree=null;
        Object MINUS58_tree=null;
        Object REVERSE59_tree=null;
        Object DOUBLE_NOT60_tree=null;
        RewriteRuleTokenStream stream_STAR=new RewriteRuleTokenStream(adaptor,"token STAR");
        RewriteRuleTokenStream stream_REVERSE=new RewriteRuleTokenStream(adaptor,"token REVERSE");
        RewriteRuleTokenStream stream_DOUBLE_NOT=new RewriteRuleTokenStream(adaptor,"token DOUBLE_NOT");
        RewriteRuleTokenStream stream_MINUS=new RewriteRuleTokenStream(adaptor,"token MINUS");
        RewriteRuleSubtreeStream stream_unary_expression=new RewriteRuleSubtreeStream(adaptor,"rule unary_expression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return retval; }
            // de\\gaalop\\clucalc\\input\\CluCalcParser.g:114:3: ( postfix_expression | STAR operand= unary_expression -> ^( DUAL $operand) | MINUS operand= unary_expression -> ^( NEGATION $operand) | REVERSE operand= unary_expression -> ^( REVERSE $operand) | DOUBLE_NOT operand= unary_expression -> ^( DOUBLE_NOT $operand) )
            int alt19=5;
            switch ( input.LA(1) ) {
            case DECIMAL_LITERAL:
            case FLOATING_POINT_LITERAL:
            case IDENTIFIER:
            case ARGUMENT_PREFIX:
            case LBRACKET:
                {
                alt19=1;
                }
                break;
            case STAR:
                {
                alt19=2;
                }
                break;
            case MINUS:
                {
                alt19=3;
                }
                break;
            case REVERSE:
                {
                alt19=4;
                }
                break;
            case DOUBLE_NOT:
                {
                alt19=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // de\\gaalop\\clucalc\\input\\CluCalcParser.g:114:5: postfix_expression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_postfix_expression_in_unary_expression509);
                    postfix_expression56=postfix_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, postfix_expression56.getTree());

                    }
                    break;
                case 2 :
                    // de\\gaalop\\clucalc\\input\\CluCalcParser.g:115:5: STAR operand= unary_expression
                    {
                    STAR57=(Token)match(input,STAR,FOLLOW_STAR_in_unary_expression515); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_STAR.add(STAR57);

                    pushFollow(FOLLOW_unary_expression_in_unary_expression519);
                    operand=unary_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_unary_expression.add(operand.getTree());


                    // AST REWRITE
                    // elements: operand
                    // token labels: 
                    // rule labels: operand, retval
                    // token list labels: 
                    // rule list labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_operand=new RewriteRuleSubtreeStream(adaptor,"token operand",operand!=null?operand.tree:null);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 115:35: -> ^( DUAL $operand)
                    {
                        // de\\gaalop\\clucalc\\input\\CluCalcParser.g:115:38: ^( DUAL $operand)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DUAL, "DUAL"), root_1);

                        adaptor.addChild(root_1, stream_operand.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // de\\gaalop\\clucalc\\input\\CluCalcParser.g:116:5: MINUS operand= unary_expression
                    {
                    MINUS58=(Token)match(input,MINUS,FOLLOW_MINUS_in_unary_expression534); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MINUS.add(MINUS58);

                    pushFollow(FOLLOW_unary_expression_in_unary_expression538);
                    operand=unary_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_unary_expression.add(operand.getTree());


                    // AST REWRITE
                    // elements: operand
                    // token labels: 
                    // rule labels: operand, retval
                    // token list labels: 
                    // rule list labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_operand=new RewriteRuleSubtreeStream(adaptor,"token operand",operand!=null?operand.tree:null);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 116:36: -> ^( NEGATION $operand)
                    {
                        // de\\gaalop\\clucalc\\input\\CluCalcParser.g:116:39: ^( NEGATION $operand)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(NEGATION, "NEGATION"), root_1);

                        adaptor.addChild(root_1, stream_operand.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // de\\gaalop\\clucalc\\input\\CluCalcParser.g:117:5: REVERSE operand= unary_expression
                    {
                    REVERSE59=(Token)match(input,REVERSE,FOLLOW_REVERSE_in_unary_expression553); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_REVERSE.add(REVERSE59);

                    pushFollow(FOLLOW_unary_expression_in_unary_expression557);
                    operand=unary_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_unary_expression.add(operand.getTree());


                    // AST REWRITE
                    // elements: REVERSE, operand
                    // token labels: 
                    // rule labels: operand, retval
                    // token list labels: 
                    // rule list labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_operand=new RewriteRuleSubtreeStream(adaptor,"token operand",operand!=null?operand.tree:null);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 117:38: -> ^( REVERSE $operand)
                    {
                        // de\\gaalop\\clucalc\\input\\CluCalcParser.g:117:41: ^( REVERSE $operand)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_REVERSE.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_operand.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // de\\gaalop\\clucalc\\input\\CluCalcParser.g:118:5: DOUBLE_NOT operand= unary_expression
                    {
                    DOUBLE_NOT60=(Token)match(input,DOUBLE_NOT,FOLLOW_DOUBLE_NOT_in_unary_expression572); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DOUBLE_NOT.add(DOUBLE_NOT60);

                    pushFollow(FOLLOW_unary_expression_in_unary_expression576);
                    operand=unary_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_unary_expression.add(operand.getTree());


                    // AST REWRITE
                    // elements: DOUBLE_NOT, operand
                    // token labels: 
                    // rule labels: operand, retval
                    // token list labels: 
                    // rule list labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_operand=new RewriteRuleSubtreeStream(adaptor,"token operand",operand!=null?operand.tree:null);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 118:41: -> ^( DOUBLE_NOT $operand)
                    {
                        // de\\gaalop\\clucalc\\input\\CluCalcParser.g:118:44: ^( DOUBLE_NOT $operand)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_DOUBLE_NOT.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_operand.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 16, unary_expression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "unary_expression"

    public static class postfix_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "postfix_expression"
    // de\\gaalop\\clucalc\\input\\CluCalcParser.g:121:1: postfix_expression : ( primary_expression | function_call );
    public final CluCalcParser.postfix_expression_return postfix_expression() throws RecognitionException {
        CluCalcParser.postfix_expression_return retval = new CluCalcParser.postfix_expression_return();
        retval.start = input.LT(1);
        int postfix_expression_StartIndex = input.index();
        Object root_0 = null;

        CluCalcParser.primary_expression_return primary_expression61 = null;

        CluCalcParser.function_call_return function_call62 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return retval; }
            // de\\gaalop\\clucalc\\input\\CluCalcParser.g:122:3: ( primary_expression | function_call )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==IDENTIFIER) ) {
                int LA20_1 = input.LA(2);

                if ( (LA20_1==LBRACKET) ) {
                    alt20=2;
                }
                else if ( (LA20_1==EOF||LA20_1==MINUS||(LA20_1>=EQUALS && LA20_1<=MODULO)||LA20_1==RBRACKET||LA20_1==CRBRACKET||(LA20_1>=SEMICOLON && LA20_1<=DOT)||(LA20_1>=DOUBLE_BAR && LA20_1<=GREATER_OR_EQUAL)) ) {
                    alt20=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA20_0==DECIMAL_LITERAL||LA20_0==FLOATING_POINT_LITERAL||LA20_0==ARGUMENT_PREFIX||LA20_0==LBRACKET) ) {
                alt20=1;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // de\\gaalop\\clucalc\\input\\CluCalcParser.g:122:5: primary_expression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_primary_expression_in_postfix_expression600);
                    primary_expression61=primary_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primary_expression61.getTree());

                    }
                    break;
                case 2 :
                    // de\\gaalop\\clucalc\\input\\CluCalcParser.g:123:5: function_call
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_function_call_in_postfix_expression606);
                    function_call62=function_call();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, function_call62.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 17, postfix_expression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "postfix_expression"

    public static class function_call_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "function_call"
    // de\\gaalop\\clucalc\\input\\CluCalcParser.g:126:1: function_call : (name= IDENTIFIER LBRACKET (args= argument_expression_list )? RBRACKET ) -> ^( FUNCTION $name ( $args)? ) ;
    public final CluCalcParser.function_call_return function_call() throws RecognitionException {
        CluCalcParser.function_call_return retval = new CluCalcParser.function_call_return();
        retval.start = input.LT(1);
        int function_call_StartIndex = input.index();
        Object root_0 = null;

        Token name=null;
        Token LBRACKET63=null;
        Token RBRACKET64=null;
        CluCalcParser.argument_expression_list_return args = null;


        Object name_tree=null;
        Object LBRACKET63_tree=null;
        Object RBRACKET64_tree=null;
        RewriteRuleTokenStream stream_LBRACKET=new RewriteRuleTokenStream(adaptor,"token LBRACKET");
        RewriteRuleTokenStream stream_RBRACKET=new RewriteRuleTokenStream(adaptor,"token RBRACKET");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleSubtreeStream stream_argument_expression_list=new RewriteRuleSubtreeStream(adaptor,"rule argument_expression_list");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return retval; }
            // de\\gaalop\\clucalc\\input\\CluCalcParser.g:127:3: ( (name= IDENTIFIER LBRACKET (args= argument_expression_list )? RBRACKET ) -> ^( FUNCTION $name ( $args)? ) )
            // de\\gaalop\\clucalc\\input\\CluCalcParser.g:127:5: (name= IDENTIFIER LBRACKET (args= argument_expression_list )? RBRACKET )
            {
            // de\\gaalop\\clucalc\\input\\CluCalcParser.g:127:5: (name= IDENTIFIER LBRACKET (args= argument_expression_list )? RBRACKET )
            // de\\gaalop\\clucalc\\input\\CluCalcParser.g:127:6: name= IDENTIFIER LBRACKET (args= argument_expression_list )? RBRACKET
            {
            name=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_function_call622); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(name);

            LBRACKET63=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_function_call624); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACKET.add(LBRACKET63);

            // de\\gaalop\\clucalc\\input\\CluCalcParser.g:127:35: (args= argument_expression_list )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==DECIMAL_LITERAL||LA21_0==FLOATING_POINT_LITERAL||LA21_0==MINUS||(LA21_0>=IDENTIFIER && LA21_0<=ARGUMENT_PREFIX)||LA21_0==STAR||LA21_0==LBRACKET||LA21_0==REVERSE||LA21_0==DOUBLE_NOT) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // de\\gaalop\\clucalc\\input\\CluCalcParser.g:0:0: args= argument_expression_list
                    {
                    pushFollow(FOLLOW_argument_expression_list_in_function_call628);
                    args=argument_expression_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_argument_expression_list.add(args.getTree());

                    }
                    break;

            }

            RBRACKET64=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_function_call631); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RBRACKET.add(RBRACKET64);


            }



            // AST REWRITE
            // elements: name, args
            // token labels: name
            // rule labels: args, retval
            // token list labels: 
            // rule list labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleTokenStream stream_name=new RewriteRuleTokenStream(adaptor,"token name",name);
            RewriteRuleSubtreeStream stream_args=new RewriteRuleSubtreeStream(adaptor,"token args",args!=null?args.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 128:3: -> ^( FUNCTION $name ( $args)? )
            {
                // de\\gaalop\\clucalc\\input\\CluCalcParser.g:128:6: ^( FUNCTION $name ( $args)? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNCTION, "FUNCTION"), root_1);

                adaptor.addChild(root_1, stream_name.nextNode());
                // de\\gaalop\\clucalc\\input\\CluCalcParser.g:128:23: ( $args)?
                if ( stream_args.hasNext() ) {
                    adaptor.addChild(root_1, stream_args.nextTree());

                }
                stream_args.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 18, function_call_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "function_call"

    public static class primary_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "primary_expression"
    // de\\gaalop\\clucalc\\input\\CluCalcParser.g:131:1: primary_expression : ( IDENTIFIER | function_argument | constant | LBRACKET expression RBRACKET );
    public final CluCalcParser.primary_expression_return primary_expression() throws RecognitionException {
        CluCalcParser.primary_expression_return retval = new CluCalcParser.primary_expression_return();
        retval.start = input.LT(1);
        int primary_expression_StartIndex = input.index();
        Object root_0 = null;

        Token IDENTIFIER65=null;
        Token LBRACKET68=null;
        Token RBRACKET70=null;
        CluCalcParser.function_argument_return function_argument66 = null;

        CluCalcParser.constant_return constant67 = null;

        CluCalcParser.expression_return expression69 = null;


        Object IDENTIFIER65_tree=null;
        Object LBRACKET68_tree=null;
        Object RBRACKET70_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return retval; }
            // de\\gaalop\\clucalc\\input\\CluCalcParser.g:132:3: ( IDENTIFIER | function_argument | constant | LBRACKET expression RBRACKET )
            int alt22=4;
            switch ( input.LA(1) ) {
            case IDENTIFIER:
                {
                alt22=1;
                }
                break;
            case ARGUMENT_PREFIX:
                {
                alt22=2;
                }
                break;
            case DECIMAL_LITERAL:
            case FLOATING_POINT_LITERAL:
                {
                alt22=3;
                }
                break;
            case LBRACKET:
                {
                alt22=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // de\\gaalop\\clucalc\\input\\CluCalcParser.g:132:5: IDENTIFIER
                    {
                    root_0 = (Object)adaptor.nil();

                    IDENTIFIER65=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_primary_expression660); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENTIFIER65_tree = (Object)adaptor.create(IDENTIFIER65);
                    adaptor.addChild(root_0, IDENTIFIER65_tree);
                    }

                    }
                    break;
                case 2 :
                    // de\\gaalop\\clucalc\\input\\CluCalcParser.g:133:5: function_argument
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_function_argument_in_primary_expression666);
                    function_argument66=function_argument();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, function_argument66.getTree());

                    }
                    break;
                case 3 :
                    // de\\gaalop\\clucalc\\input\\CluCalcParser.g:134:5: constant
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_constant_in_primary_expression673);
                    constant67=constant();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, constant67.getTree());

                    }
                    break;
                case 4 :
                    // de\\gaalop\\clucalc\\input\\CluCalcParser.g:135:5: LBRACKET expression RBRACKET
                    {
                    root_0 = (Object)adaptor.nil();

                    LBRACKET68=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_primary_expression679); if (state.failed) return retval;
                    pushFollow(FOLLOW_expression_in_primary_expression682);
                    expression69=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression69.getTree());
                    RBRACKET70=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_primary_expression684); if (state.failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 19, primary_expression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "primary_expression"

    public static class constant_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "constant"
    // de\\gaalop\\clucalc\\input\\CluCalcParser.g:137:1: constant : ( DECIMAL_LITERAL | FLOATING_POINT_LITERAL );
    public final CluCalcParser.constant_return constant() throws RecognitionException {
        CluCalcParser.constant_return retval = new CluCalcParser.constant_return();
        retval.start = input.LT(1);
        int constant_StartIndex = input.index();
        Object root_0 = null;

        Token set71=null;

        Object set71_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return retval; }
            // de\\gaalop\\clucalc\\input\\CluCalcParser.g:138:5: ( DECIMAL_LITERAL | FLOATING_POINT_LITERAL )
            // de\\gaalop\\clucalc\\input\\CluCalcParser.g:
            {
            root_0 = (Object)adaptor.nil();

            set71=(Token)input.LT(1);
            if ( input.LA(1)==DECIMAL_LITERAL||input.LA(1)==FLOATING_POINT_LITERAL ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set71));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 20, constant_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "constant"

    public static class color_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "color"
    // de\\gaalop\\clucalc\\input\\CluCalcParser.g:142:1: color : ( ( COLON COLOR_LITERAL LBRACKET args= argument_expression_list RBRACKET SEMICOLON ) -> ^( COLOR $args) | COLON name= color_name SEMICOLON -> ^( COLOR $name) );
    public final CluCalcParser.color_return color() throws RecognitionException {
        CluCalcParser.color_return retval = new CluCalcParser.color_return();
        retval.start = input.LT(1);
        int color_StartIndex = input.index();
        Object root_0 = null;

        Token COLON72=null;
        Token COLOR_LITERAL73=null;
        Token LBRACKET74=null;
        Token RBRACKET75=null;
        Token SEMICOLON76=null;
        Token COLON77=null;
        Token SEMICOLON78=null;
        CluCalcParser.argument_expression_list_return args = null;

        CluCalcParser.color_name_return name = null;


        Object COLON72_tree=null;
        Object COLOR_LITERAL73_tree=null;
        Object LBRACKET74_tree=null;
        Object RBRACKET75_tree=null;
        Object SEMICOLON76_tree=null;
        Object COLON77_tree=null;
        Object SEMICOLON78_tree=null;
        RewriteRuleTokenStream stream_COLOR_LITERAL=new RewriteRuleTokenStream(adaptor,"token COLOR_LITERAL");
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleTokenStream stream_LBRACKET=new RewriteRuleTokenStream(adaptor,"token LBRACKET");
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_RBRACKET=new RewriteRuleTokenStream(adaptor,"token RBRACKET");
        RewriteRuleSubtreeStream stream_argument_expression_list=new RewriteRuleSubtreeStream(adaptor,"rule argument_expression_list");
        RewriteRuleSubtreeStream stream_color_name=new RewriteRuleSubtreeStream(adaptor,"rule color_name");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return retval; }
            // de\\gaalop\\clucalc\\input\\CluCalcParser.g:143:3: ( ( COLON COLOR_LITERAL LBRACKET args= argument_expression_list RBRACKET SEMICOLON ) -> ^( COLOR $args) | COLON name= color_name SEMICOLON -> ^( COLOR $name) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==COLON) ) {
                int LA23_1 = input.LA(2);

                if ( (LA23_1==COLOR_LITERAL) ) {
                    alt23=1;
                }
                else if ( ((LA23_1>=BLACK && LA23_1<=YELLOW)) ) {
                    alt23=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 23, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // de\\gaalop\\clucalc\\input\\CluCalcParser.g:143:5: ( COLON COLOR_LITERAL LBRACKET args= argument_expression_list RBRACKET SEMICOLON )
                    {
                    // de\\gaalop\\clucalc\\input\\CluCalcParser.g:143:5: ( COLON COLOR_LITERAL LBRACKET args= argument_expression_list RBRACKET SEMICOLON )
                    // de\\gaalop\\clucalc\\input\\CluCalcParser.g:143:6: COLON COLOR_LITERAL LBRACKET args= argument_expression_list RBRACKET SEMICOLON
                    {
                    COLON72=(Token)match(input,COLON,FOLLOW_COLON_in_color732); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(COLON72);

                    COLOR_LITERAL73=(Token)match(input,COLOR_LITERAL,FOLLOW_COLOR_LITERAL_in_color734); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLOR_LITERAL.add(COLOR_LITERAL73);

                    LBRACKET74=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_color736); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LBRACKET.add(LBRACKET74);

                    pushFollow(FOLLOW_argument_expression_list_in_color740);
                    args=argument_expression_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_argument_expression_list.add(args.getTree());
                    RBRACKET75=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_color742); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RBRACKET.add(RBRACKET75);

                    SEMICOLON76=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_color744); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMICOLON.add(SEMICOLON76);


                    }



                    // AST REWRITE
                    // elements: args
                    // token labels: 
                    // rule labels: args, retval
                    // token list labels: 
                    // rule list labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_args=new RewriteRuleSubtreeStream(adaptor,"token args",args!=null?args.tree:null);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 143:85: -> ^( COLOR $args)
                    {
                        // de\\gaalop\\clucalc\\input\\CluCalcParser.g:143:88: ^( COLOR $args)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(COLOR, "COLOR"), root_1);

                        adaptor.addChild(root_1, stream_args.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // de\\gaalop\\clucalc\\input\\CluCalcParser.g:144:5: COLON name= color_name SEMICOLON
                    {
                    COLON77=(Token)match(input,COLON,FOLLOW_COLON_in_color760); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(COLON77);

                    pushFollow(FOLLOW_color_name_in_color764);
                    name=color_name();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_color_name.add(name.getTree());
                    SEMICOLON78=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_color766); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMICOLON.add(SEMICOLON78);



                    // AST REWRITE
                    // elements: name
                    // token labels: 
                    // rule labels: name, retval
                    // token list labels: 
                    // rule list labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_name=new RewriteRuleSubtreeStream(adaptor,"token name",name!=null?name.tree:null);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 144:37: -> ^( COLOR $name)
                    {
                        // de\\gaalop\\clucalc\\input\\CluCalcParser.g:144:40: ^( COLOR $name)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(COLOR, "COLOR"), root_1);

                        adaptor.addChild(root_1, stream_name.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 21, color_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "color"

    public static class color_name_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "color_name"
    // de\\gaalop\\clucalc\\input\\CluCalcParser.g:147:1: color_name : ( BLACK | BLUE | CYAN | GREEN | MAGENTA | ORANGE | RED | WHITE | YELLOW ) ;
    public final CluCalcParser.color_name_return color_name() throws RecognitionException {
        CluCalcParser.color_name_return retval = new CluCalcParser.color_name_return();
        retval.start = input.LT(1);
        int color_name_StartIndex = input.index();
        Object root_0 = null;

        Token set79=null;

        Object set79_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return retval; }
            // de\\gaalop\\clucalc\\input\\CluCalcParser.g:148:3: ( ( BLACK | BLUE | CYAN | GREEN | MAGENTA | ORANGE | RED | WHITE | YELLOW ) )
            // de\\gaalop\\clucalc\\input\\CluCalcParser.g:148:5: ( BLACK | BLUE | CYAN | GREEN | MAGENTA | ORANGE | RED | WHITE | YELLOW )
            {
            root_0 = (Object)adaptor.nil();

            set79=(Token)input.LT(1);
            if ( (input.LA(1)>=BLACK && input.LA(1)<=YELLOW) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set79));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 22, color_name_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "color_name"

    public static class bgcolor_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bgcolor"
    // de\\gaalop\\clucalc\\input\\CluCalcParser.g:151:1: bgcolor : BGCOLOR_LITERAL EQUALS COLOR_LITERAL LBRACKET args= argument_expression_list RBRACKET SEMICOLON -> ^( BGCOLOR $args) ;
    public final CluCalcParser.bgcolor_return bgcolor() throws RecognitionException {
        CluCalcParser.bgcolor_return retval = new CluCalcParser.bgcolor_return();
        retval.start = input.LT(1);
        int bgcolor_StartIndex = input.index();
        Object root_0 = null;

        Token BGCOLOR_LITERAL80=null;
        Token EQUALS81=null;
        Token COLOR_LITERAL82=null;
        Token LBRACKET83=null;
        Token RBRACKET84=null;
        Token SEMICOLON85=null;
        CluCalcParser.argument_expression_list_return args = null;


        Object BGCOLOR_LITERAL80_tree=null;
        Object EQUALS81_tree=null;
        Object COLOR_LITERAL82_tree=null;
        Object LBRACKET83_tree=null;
        Object RBRACKET84_tree=null;
        Object SEMICOLON85_tree=null;
        RewriteRuleTokenStream stream_COLOR_LITERAL=new RewriteRuleTokenStream(adaptor,"token COLOR_LITERAL");
        RewriteRuleTokenStream stream_EQUALS=new RewriteRuleTokenStream(adaptor,"token EQUALS");
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleTokenStream stream_BGCOLOR_LITERAL=new RewriteRuleTokenStream(adaptor,"token BGCOLOR_LITERAL");
        RewriteRuleTokenStream stream_LBRACKET=new RewriteRuleTokenStream(adaptor,"token LBRACKET");
        RewriteRuleTokenStream stream_RBRACKET=new RewriteRuleTokenStream(adaptor,"token RBRACKET");
        RewriteRuleSubtreeStream stream_argument_expression_list=new RewriteRuleSubtreeStream(adaptor,"rule argument_expression_list");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return retval; }
            // de\\gaalop\\clucalc\\input\\CluCalcParser.g:152:3: ( BGCOLOR_LITERAL EQUALS COLOR_LITERAL LBRACKET args= argument_expression_list RBRACKET SEMICOLON -> ^( BGCOLOR $args) )
            // de\\gaalop\\clucalc\\input\\CluCalcParser.g:152:5: BGCOLOR_LITERAL EQUALS COLOR_LITERAL LBRACKET args= argument_expression_list RBRACKET SEMICOLON
            {
            BGCOLOR_LITERAL80=(Token)match(input,BGCOLOR_LITERAL,FOLLOW_BGCOLOR_LITERAL_in_bgcolor839); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_BGCOLOR_LITERAL.add(BGCOLOR_LITERAL80);

            EQUALS81=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_bgcolor841); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_EQUALS.add(EQUALS81);

            COLOR_LITERAL82=(Token)match(input,COLOR_LITERAL,FOLLOW_COLOR_LITERAL_in_bgcolor843); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COLOR_LITERAL.add(COLOR_LITERAL82);

            LBRACKET83=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_bgcolor845); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACKET.add(LBRACKET83);

            pushFollow(FOLLOW_argument_expression_list_in_bgcolor849);
            args=argument_expression_list();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_argument_expression_list.add(args.getTree());
            RBRACKET84=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_bgcolor851); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RBRACKET.add(RBRACKET84);

            SEMICOLON85=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_bgcolor853); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SEMICOLON.add(SEMICOLON85);



            // AST REWRITE
            // elements: args
            // token labels: 
            // rule labels: args, retval
            // token list labels: 
            // rule list labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_args=new RewriteRuleSubtreeStream(adaptor,"token args",args!=null?args.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 152:100: -> ^( BGCOLOR $args)
            {
                // de\\gaalop\\clucalc\\input\\CluCalcParser.g:152:103: ^( BGCOLOR $args)
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BGCOLOR, "BGCOLOR"), root_1);

                adaptor.addChild(root_1, stream_args.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 23, bgcolor_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "bgcolor"

    public static class function_argument_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "function_argument"
    // de\\gaalop\\clucalc\\input\\CluCalcParser.g:155:1: function_argument : ARGUMENT_PREFIX index= DECIMAL_LITERAL RBRACKET -> ^( ARGUMENT $index) ;
    public final CluCalcParser.function_argument_return function_argument() throws RecognitionException {
        CluCalcParser.function_argument_return retval = new CluCalcParser.function_argument_return();
        retval.start = input.LT(1);
        int function_argument_StartIndex = input.index();
        Object root_0 = null;

        Token index=null;
        Token ARGUMENT_PREFIX86=null;
        Token RBRACKET87=null;

        Object index_tree=null;
        Object ARGUMENT_PREFIX86_tree=null;
        Object RBRACKET87_tree=null;
        RewriteRuleTokenStream stream_ARGUMENT_PREFIX=new RewriteRuleTokenStream(adaptor,"token ARGUMENT_PREFIX");
        RewriteRuleTokenStream stream_RBRACKET=new RewriteRuleTokenStream(adaptor,"token RBRACKET");
        RewriteRuleTokenStream stream_DECIMAL_LITERAL=new RewriteRuleTokenStream(adaptor,"token DECIMAL_LITERAL");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return retval; }
            // de\\gaalop\\clucalc\\input\\CluCalcParser.g:156:3: ( ARGUMENT_PREFIX index= DECIMAL_LITERAL RBRACKET -> ^( ARGUMENT $index) )
            // de\\gaalop\\clucalc\\input\\CluCalcParser.g:156:5: ARGUMENT_PREFIX index= DECIMAL_LITERAL RBRACKET
            {
            ARGUMENT_PREFIX86=(Token)match(input,ARGUMENT_PREFIX,FOLLOW_ARGUMENT_PREFIX_in_function_argument879); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ARGUMENT_PREFIX.add(ARGUMENT_PREFIX86);

            index=(Token)match(input,DECIMAL_LITERAL,FOLLOW_DECIMAL_LITERAL_in_function_argument883); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DECIMAL_LITERAL.add(index);

            RBRACKET87=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_function_argument885); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RBRACKET.add(RBRACKET87);



            // AST REWRITE
            // elements: index
            // token labels: index
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleTokenStream stream_index=new RewriteRuleTokenStream(adaptor,"token index",index);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 156:52: -> ^( ARGUMENT $index)
            {
                // de\\gaalop\\clucalc\\input\\CluCalcParser.g:156:55: ^( ARGUMENT $index)
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARGUMENT, "ARGUMENT"), root_1);

                adaptor.addChild(root_1, stream_index.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 24, function_argument_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "function_argument"

    public static class statement_list_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "statement_list"
    // de\\gaalop\\clucalc\\input\\CluCalcParser.g:162:1: statement_list : ( statement )+ ;
    public final CluCalcParser.statement_list_return statement_list() throws RecognitionException {
        CluCalcParser.statement_list_return retval = new CluCalcParser.statement_list_return();
        retval.start = input.LT(1);
        int statement_list_StartIndex = input.index();
        Object root_0 = null;

        CluCalcParser.statement_return statement88 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return retval; }
            // de\\gaalop\\clucalc\\input\\CluCalcParser.g:163:3: ( ( statement )+ )
            // de\\gaalop\\clucalc\\input\\CluCalcParser.g:163:5: ( statement )+
            {
            root_0 = (Object)adaptor.nil();

            // de\\gaalop\\clucalc\\input\\CluCalcParser.g:163:5: ( statement )+
            int cnt24=0;
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==DECIMAL_LITERAL||LA24_0==FLOATING_POINT_LITERAL||LA24_0==MINUS||LA24_0==IF||(LA24_0>=LOOP && LA24_0<=BREAK)||LA24_0==BGCOLOR_LITERAL||(LA24_0>=IDENTIFIER && LA24_0<=ARGUMENT_PREFIX)||LA24_0==PRAGMA||LA24_0==STAR||LA24_0==LBRACKET||LA24_0==CLBRACKET||LA24_0==REVERSE||(LA24_0>=DOUBLE_NOT && LA24_0<=SEMICOLON)||(LA24_0>=QUESTIONMARK && LA24_0<=COLON)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // de\\gaalop\\clucalc\\input\\CluCalcParser.g:0:0: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_statement_list909);
            	    statement88=statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement88.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt24 >= 1 ) break loop24;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(24, input);
                        throw eee;
                }
                cnt24++;
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 25, statement_list_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "statement_list"

    public static class statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "statement"
    // de\\gaalop\\clucalc\\input\\CluCalcParser.g:169:1: statement : ( expression_statement | slider | color | bgcolor | macro_definition | draw_mode | block | if_statement | loop | BREAK | pragma );
    public final CluCalcParser.statement_return statement() throws RecognitionException {
        CluCalcParser.statement_return retval = new CluCalcParser.statement_return();
        retval.start = input.LT(1);
        int statement_StartIndex = input.index();
        Object root_0 = null;

        Token BREAK98=null;
        CluCalcParser.expression_statement_return expression_statement89 = null;

        CluCalcParser.slider_return slider90 = null;

        CluCalcParser.color_return color91 = null;

        CluCalcParser.bgcolor_return bgcolor92 = null;

        CluCalcParser.macro_definition_return macro_definition93 = null;

        CluCalcParser.draw_mode_return draw_mode94 = null;

        CluCalcParser.block_return block95 = null;

        CluCalcParser.if_statement_return if_statement96 = null;

        CluCalcParser.loop_return loop97 = null;

        CluCalcParser.pragma_return pragma99 = null;


        Object BREAK98_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return retval; }
            // de\\gaalop\\clucalc\\input\\CluCalcParser.g:170:3: ( expression_statement | slider | color | bgcolor | macro_definition | draw_mode | block | if_statement | loop | BREAK | pragma )
            int alt25=11;
            alt25 = dfa25.predict(input);
            switch (alt25) {
                case 1 :
                    // de\\gaalop\\clucalc\\input\\CluCalcParser.g:170:5: expression_statement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_expression_statement_in_statement927);
                    expression_statement89=expression_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression_statement89.getTree());

                    }
                    break;
                case 2 :
                    // de\\gaalop\\clucalc\\input\\CluCalcParser.g:171:5: slider
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_slider_in_statement933);
                    slider90=slider();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, slider90.getTree());

                    }
                    break;
                case 3 :
                    // de\\gaalop\\clucalc\\input\\CluCalcParser.g:172:5: color
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_color_in_statement939);
                    color91=color();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, color91.getTree());

                    }
                    break;
                case 4 :
                    // de\\gaalop\\clucalc\\input\\CluCalcParser.g:173:5: bgcolor
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_bgcolor_in_statement945);
                    bgcolor92=bgcolor();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, bgcolor92.getTree());

                    }
                    break;
                case 5 :
                    // de\\gaalop\\clucalc\\input\\CluCalcParser.g:174:5: macro_definition
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_macro_definition_in_statement951);
                    macro_definition93=macro_definition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, macro_definition93.getTree());

                    }
                    break;
                case 6 :
                    // de\\gaalop\\clucalc\\input\\CluCalcParser.g:175:5: draw_mode
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_draw_mode_in_statement957);
                    draw_mode94=draw_mode();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, draw_mode94.getTree());

                    }
                    break;
                case 7 :
                    // de\\gaalop\\clucalc\\input\\CluCalcParser.g:176:5: block
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_block_in_statement963);
                    block95=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, block95.getTree());

                    }
                    break;
                case 8 :
                    // de\\gaalop\\clucalc\\input\\CluCalcParser.g:177:5: if_statement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_if_statement_in_statement969);
                    if_statement96=if_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, if_statement96.getTree());

                    }
                    break;
                case 9 :
                    // de\\gaalop\\clucalc\\input\\CluCalcParser.g:178:5: loop
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_loop_in_statement975);
                    loop97=loop();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, loop97.getTree());

                    }
                    break;
                case 10 :
                    // de\\gaalop\\clucalc\\input\\CluCalcParser.g:179:5: BREAK
                    {
                    root_0 = (Object)adaptor.nil();

                    BREAK98=(Token)match(input,BREAK,FOLLOW_BREAK_in_statement981); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    BREAK98_tree = (Object)adaptor.create(BREAK98);
                    adaptor.addChild(root_0, BREAK98_tree);
                    }

                    }
                    break;
                case 11 :
                    // de\\gaalop\\clucalc\\input\\CluCalcParser.g:180:5: pragma
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_pragma_in_statement987);
                    pragma99=pragma();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, pragma99.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 26, statement_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "statement"

    public static class slider_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "slider"
    // de\\gaalop\\clucalc\\input\\CluCalcParser.g:183:10: fragment slider : IDENTIFIER EQUALS SLIDER_LITERAL LBRACKET slider_args RBRACKET SEMICOLON -> ^( SLIDER IDENTIFIER slider_args ) ;
    public final CluCalcParser.slider_return slider() throws RecognitionException {
        CluCalcParser.slider_return retval = new CluCalcParser.slider_return();
        retval.start = input.LT(1);
        int slider_StartIndex = input.index();
        Object root_0 = null;

        Token IDENTIFIER100=null;
        Token EQUALS101=null;
        Token SLIDER_LITERAL102=null;
        Token LBRACKET103=null;
        Token RBRACKET105=null;
        Token SEMICOLON106=null;
        CluCalcParser.slider_args_return slider_args104 = null;


        Object IDENTIFIER100_tree=null;
        Object EQUALS101_tree=null;
        Object SLIDER_LITERAL102_tree=null;
        Object LBRACKET103_tree=null;
        Object RBRACKET105_tree=null;
        Object SEMICOLON106_tree=null;
        RewriteRuleTokenStream stream_EQUALS=new RewriteRuleTokenStream(adaptor,"token EQUALS");
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleTokenStream stream_SLIDER_LITERAL=new RewriteRuleTokenStream(adaptor,"token SLIDER_LITERAL");
        RewriteRuleTokenStream stream_LBRACKET=new RewriteRuleTokenStream(adaptor,"token LBRACKET");
        RewriteRuleTokenStream stream_RBRACKET=new RewriteRuleTokenStream(adaptor,"token RBRACKET");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleSubtreeStream stream_slider_args=new RewriteRuleSubtreeStream(adaptor,"rule slider_args");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return retval; }
            // de\\gaalop\\clucalc\\input\\CluCalcParser.g:184:3: ( IDENTIFIER EQUALS SLIDER_LITERAL LBRACKET slider_args RBRACKET SEMICOLON -> ^( SLIDER IDENTIFIER slider_args ) )
            // de\\gaalop\\clucalc\\input\\CluCalcParser.g:184:5: IDENTIFIER EQUALS SLIDER_LITERAL LBRACKET slider_args RBRACKET SEMICOLON
            {
            IDENTIFIER100=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_slider1005); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER100);

            EQUALS101=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_slider1007); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_EQUALS.add(EQUALS101);

            SLIDER_LITERAL102=(Token)match(input,SLIDER_LITERAL,FOLLOW_SLIDER_LITERAL_in_slider1009); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SLIDER_LITERAL.add(SLIDER_LITERAL102);

            LBRACKET103=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_slider1011); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACKET.add(LBRACKET103);

            pushFollow(FOLLOW_slider_args_in_slider1013);
            slider_args104=slider_args();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_slider_args.add(slider_args104.getTree());
            RBRACKET105=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_slider1015); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RBRACKET.add(RBRACKET105);

            SEMICOLON106=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_slider1017); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SEMICOLON.add(SEMICOLON106);



            // AST REWRITE
            // elements: slider_args, IDENTIFIER
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 184:78: -> ^( SLIDER IDENTIFIER slider_args )
            {
                // de\\gaalop\\clucalc\\input\\CluCalcParser.g:184:81: ^( SLIDER IDENTIFIER slider_args )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(SLIDER, "SLIDER"), root_1);

                adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
                adaptor.addChild(root_1, stream_slider_args.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 27, slider_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "slider"

    public static class slider_args_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "slider_args"
    // de\\gaalop\\clucalc\\input\\CluCalcParser.g:187:10: fragment slider_args : STRING_LITERAL COMMA float_or_dec COMMA float_or_dec COMMA float_or_dec COMMA float_or_dec ;
    public final CluCalcParser.slider_args_return slider_args() throws RecognitionException {
        CluCalcParser.slider_args_return retval = new CluCalcParser.slider_args_return();
        retval.start = input.LT(1);
        int slider_args_StartIndex = input.index();
        Object root_0 = null;

        Token STRING_LITERAL107=null;
        Token COMMA108=null;
        Token COMMA110=null;
        Token COMMA112=null;
        Token COMMA114=null;
        CluCalcParser.float_or_dec_return float_or_dec109 = null;

        CluCalcParser.float_or_dec_return float_or_dec111 = null;

        CluCalcParser.float_or_dec_return float_or_dec113 = null;

        CluCalcParser.float_or_dec_return float_or_dec115 = null;


        Object STRING_LITERAL107_tree=null;
        Object COMMA108_tree=null;
        Object COMMA110_tree=null;
        Object COMMA112_tree=null;
        Object COMMA114_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return retval; }
            // de\\gaalop\\clucalc\\input\\CluCalcParser.g:188:3: ( STRING_LITERAL COMMA float_or_dec COMMA float_or_dec COMMA float_or_dec COMMA float_or_dec )
            // de\\gaalop\\clucalc\\input\\CluCalcParser.g:188:5: STRING_LITERAL COMMA float_or_dec COMMA float_or_dec COMMA float_or_dec COMMA float_or_dec
            {
            root_0 = (Object)adaptor.nil();

            STRING_LITERAL107=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_slider_args1046); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            STRING_LITERAL107_tree = (Object)adaptor.create(STRING_LITERAL107);
            adaptor.addChild(root_0, STRING_LITERAL107_tree);
            }
            COMMA108=(Token)match(input,COMMA,FOLLOW_COMMA_in_slider_args1048); if (state.failed) return retval;
            pushFollow(FOLLOW_float_or_dec_in_slider_args1051);
            float_or_dec109=float_or_dec();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, float_or_dec109.getTree());
            COMMA110=(Token)match(input,COMMA,FOLLOW_COMMA_in_slider_args1053); if (state.failed) return retval;
            pushFollow(FOLLOW_float_or_dec_in_slider_args1056);
            float_or_dec111=float_or_dec();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, float_or_dec111.getTree());
            COMMA112=(Token)match(input,COMMA,FOLLOW_COMMA_in_slider_args1058); if (state.failed) return retval;
            pushFollow(FOLLOW_float_or_dec_in_slider_args1061);
            float_or_dec113=float_or_dec();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, float_or_dec113.getTree());
            COMMA114=(Token)match(input,COMMA,FOLLOW_COMMA_in_slider_args1063); if (state.failed) return retval;
            pushFollow(FOLLOW_float_or_dec_in_slider_args1066);
            float_or_dec115=float_or_dec();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, float_or_dec115.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 28, slider_args_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "slider_args"

    public static class float_or_dec_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "float_or_dec"
    // de\\gaalop\\clucalc\\input\\CluCalcParser.g:191:10: fragment float_or_dec : ( ( MINUS )? DECIMAL_LITERAL | float_literal );
    public final CluCalcParser.float_or_dec_return float_or_dec() throws RecognitionException {
        CluCalcParser.float_or_dec_return retval = new CluCalcParser.float_or_dec_return();
        retval.start = input.LT(1);
        int float_or_dec_StartIndex = input.index();
        Object root_0 = null;

        Token MINUS116=null;
        Token DECIMAL_LITERAL117=null;
        CluCalcParser.float_literal_return float_literal118 = null;


        Object MINUS116_tree=null;
        Object DECIMAL_LITERAL117_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return retval; }
            // de\\gaalop\\clucalc\\input\\CluCalcParser.g:192:3: ( ( MINUS )? DECIMAL_LITERAL | float_literal )
            int alt27=2;
            switch ( input.LA(1) ) {
            case MINUS:
                {
                int LA27_1 = input.LA(2);

                if ( (LA27_1==FLOATING_POINT_LITERAL) ) {
                    alt27=2;
                }
                else if ( (LA27_1==DECIMAL_LITERAL) ) {
                    alt27=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 27, 1, input);

                    throw nvae;
                }
                }
                break;
            case DECIMAL_LITERAL:
                {
                alt27=1;
                }
                break;
            case FLOATING_POINT_LITERAL:
                {
                alt27=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // de\\gaalop\\clucalc\\input\\CluCalcParser.g:192:5: ( MINUS )? DECIMAL_LITERAL
                    {
                    root_0 = (Object)adaptor.nil();

                    // de\\gaalop\\clucalc\\input\\CluCalcParser.g:192:5: ( MINUS )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==MINUS) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // de\\gaalop\\clucalc\\input\\CluCalcParser.g:192:6: MINUS
                            {
                            MINUS116=(Token)match(input,MINUS,FOLLOW_MINUS_in_float_or_dec1084); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            MINUS116_tree = (Object)adaptor.create(MINUS116);
                            adaptor.addChild(root_0, MINUS116_tree);
                            }

                            }
                            break;

                    }

                    DECIMAL_LITERAL117=(Token)match(input,DECIMAL_LITERAL,FOLLOW_DECIMAL_LITERAL_in_float_or_dec1088); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DECIMAL_LITERAL117_tree = (Object)adaptor.create(DECIMAL_LITERAL117);
                    adaptor.addChild(root_0, DECIMAL_LITERAL117_tree);
                    }

                    }
                    break;
                case 2 :
                    // de\\gaalop\\clucalc\\input\\CluCalcParser.g:193:5: float_literal
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_float_literal_in_float_or_dec1094);
                    float_literal118=float_literal();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, float_literal118.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 29, float_or_dec_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "float_or_dec"

    public static class macro_definition_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "macro_definition"
    // de\\gaalop\\clucalc\\input\\CluCalcParser.g:196:1: macro_definition : id= IDENTIFIER EQUALS CLBRACKET ( statement )* (e= return_value )? CRBRACKET -> ^( MACRO $id ( statement )* ( $e)? ) ;
    public final CluCalcParser.macro_definition_return macro_definition() throws RecognitionException {
        CluCalcParser.macro_definition_return retval = new CluCalcParser.macro_definition_return();
        retval.start = input.LT(1);
        int macro_definition_StartIndex = input.index();
        Object root_0 = null;

        Token id=null;
        Token EQUALS119=null;
        Token CLBRACKET120=null;
        Token CRBRACKET122=null;
        CluCalcParser.return_value_return e = null;

        CluCalcParser.statement_return statement121 = null;


        Object id_tree=null;
        Object EQUALS119_tree=null;
        Object CLBRACKET120_tree=null;
        Object CRBRACKET122_tree=null;
        RewriteRuleTokenStream stream_CLBRACKET=new RewriteRuleTokenStream(adaptor,"token CLBRACKET");
        RewriteRuleTokenStream stream_EQUALS=new RewriteRuleTokenStream(adaptor,"token EQUALS");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleTokenStream stream_CRBRACKET=new RewriteRuleTokenStream(adaptor,"token CRBRACKET");
        RewriteRuleSubtreeStream stream_return_value=new RewriteRuleSubtreeStream(adaptor,"rule return_value");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return retval; }
            // de\\gaalop\\clucalc\\input\\CluCalcParser.g:197:3: (id= IDENTIFIER EQUALS CLBRACKET ( statement )* (e= return_value )? CRBRACKET -> ^( MACRO $id ( statement )* ( $e)? ) )
            // de\\gaalop\\clucalc\\input\\CluCalcParser.g:197:5: id= IDENTIFIER EQUALS CLBRACKET ( statement )* (e= return_value )? CRBRACKET
            {
            id=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_macro_definition1111); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(id);

            EQUALS119=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_macro_definition1113); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_EQUALS.add(EQUALS119);

            CLBRACKET120=(Token)match(input,CLBRACKET,FOLLOW_CLBRACKET_in_macro_definition1115); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CLBRACKET.add(CLBRACKET120);

            // de\\gaalop\\clucalc\\input\\CluCalcParser.g:197:36: ( statement )*
            loop28:
            do {
                int alt28=2;
                alt28 = dfa28.predict(input);
                switch (alt28) {
            	case 1 :
            	    // de\\gaalop\\clucalc\\input\\CluCalcParser.g:0:0: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_macro_definition1117);
            	    statement121=statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_statement.add(statement121.getTree());

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            // de\\gaalop\\clucalc\\input\\CluCalcParser.g:197:48: (e= return_value )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==DECIMAL_LITERAL||LA29_0==FLOATING_POINT_LITERAL||LA29_0==MINUS||(LA29_0>=IDENTIFIER && LA29_0<=ARGUMENT_PREFIX)||LA29_0==STAR||LA29_0==LBRACKET||LA29_0==REVERSE||LA29_0==DOUBLE_NOT) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // de\\gaalop\\clucalc\\input\\CluCalcParser.g:0:0: e= return_value
                    {
                    pushFollow(FOLLOW_return_value_in_macro_definition1122);
                    e=return_value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_return_value.add(e.getTree());

                    }
                    break;

            }

            CRBRACKET122=(Token)match(input,CRBRACKET,FOLLOW_CRBRACKET_in_macro_definition1125); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CRBRACKET.add(CRBRACKET122);



            // AST REWRITE
            // elements: id, e, statement
            // token labels: id
            // rule labels: e, retval
            // token list labels: 
            // rule list labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleTokenStream stream_id=new RewriteRuleTokenStream(adaptor,"token id",id);
            RewriteRuleSubtreeStream stream_e=new RewriteRuleSubtreeStream(adaptor,"token e",e!=null?e.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 197:73: -> ^( MACRO $id ( statement )* ( $e)? )
            {
                // de\\gaalop\\clucalc\\input\\CluCalcParser.g:197:76: ^( MACRO $id ( statement )* ( $e)? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(MACRO, "MACRO"), root_1);

                adaptor.addChild(root_1, stream_id.nextNode());
                // de\\gaalop\\clucalc\\input\\CluCalcParser.g:197:88: ( statement )*
                while ( stream_statement.hasNext() ) {
                    adaptor.addChild(root_1, stream_statement.nextTree());

                }
                stream_statement.reset();
                // de\\gaalop\\clucalc\\input\\CluCalcParser.g:197:99: ( $e)?
                if ( stream_e.hasNext() ) {
                    adaptor.addChild(root_1, stream_e.nextTree());

                }
                stream_e.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 30, macro_definition_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "macro_definition"

    public static class return_value_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "return_value"
    // de\\gaalop\\clucalc\\input\\CluCalcParser.g:200:1: return_value : (add= additive_expression -> ^( RETURN $add) | or= logical_or_expression -> ^( RETURN $or) );
    public final CluCalcParser.return_value_return return_value() throws RecognitionException {
        CluCalcParser.return_value_return retval = new CluCalcParser.return_value_return();
        retval.start = input.LT(1);
        int return_value_StartIndex = input.index();
        Object root_0 = null;

        CluCalcParser.additive_expression_return add = null;

        CluCalcParser.logical_or_expression_return or = null;


        RewriteRuleSubtreeStream stream_additive_expression=new RewriteRuleSubtreeStream(adaptor,"rule additive_expression");
        RewriteRuleSubtreeStream stream_logical_or_expression=new RewriteRuleSubtreeStream(adaptor,"rule logical_or_expression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return retval; }
            // de\\gaalop\\clucalc\\input\\CluCalcParser.g:201:3: (add= additive_expression -> ^( RETURN $add) | or= logical_or_expression -> ^( RETURN $or) )
            int alt30=2;
            alt30 = dfa30.predict(input);
            switch (alt30) {
                case 1 :
                    // de\\gaalop\\clucalc\\input\\CluCalcParser.g:201:5: add= additive_expression
                    {
                    pushFollow(FOLLOW_additive_expression_in_return_value1158);
                    add=additive_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_additive_expression.add(add.getTree());


                    // AST REWRITE
                    // elements: add
                    // token labels: 
                    // rule labels: add, retval
                    // token list labels: 
                    // rule list labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_add=new RewriteRuleSubtreeStream(adaptor,"token add",add!=null?add.tree:null);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 201:29: -> ^( RETURN $add)
                    {
                        // de\\gaalop\\clucalc\\input\\CluCalcParser.g:201:32: ^( RETURN $add)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(RETURN, "RETURN"), root_1);

                        adaptor.addChild(root_1, stream_add.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // de\\gaalop\\clucalc\\input\\CluCalcParser.g:202:5: or= logical_or_expression
                    {
                    pushFollow(FOLLOW_logical_or_expression_in_return_value1175);
                    or=logical_or_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_logical_or_expression.add(or.getTree());


                    // AST REWRITE
                    // elements: or
                    // token labels: 
                    // rule labels: or, retval
                    // token list labels: 
                    // rule list labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_or=new RewriteRuleSubtreeStream(adaptor,"token or",or!=null?or.tree:null);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 202:30: -> ^( RETURN $or)
                    {
                        // de\\gaalop\\clucalc\\input\\CluCalcParser.g:202:33: ^( RETURN $or)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(RETURN, "RETURN"), root_1);

                        adaptor.addChild(root_1, stream_or.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 31, return_value_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "return_value"

    public static class block_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "block"
    // de\\gaalop\\clucalc\\input\\CluCalcParser.g:205:1: block : CLBRACKET ( statement )* CRBRACKET -> ^( BLOCK ( statement )* ) ;
    public final CluCalcParser.block_return block() throws RecognitionException {
        CluCalcParser.block_return retval = new CluCalcParser.block_return();
        retval.start = input.LT(1);
        int block_StartIndex = input.index();
        Object root_0 = null;

        Token CLBRACKET123=null;
        Token CRBRACKET125=null;
        CluCalcParser.statement_return statement124 = null;


        Object CLBRACKET123_tree=null;
        Object CRBRACKET125_tree=null;
        RewriteRuleTokenStream stream_CLBRACKET=new RewriteRuleTokenStream(adaptor,"token CLBRACKET");
        RewriteRuleTokenStream stream_CRBRACKET=new RewriteRuleTokenStream(adaptor,"token CRBRACKET");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return retval; }
            // de\\gaalop\\clucalc\\input\\CluCalcParser.g:206:3: ( CLBRACKET ( statement )* CRBRACKET -> ^( BLOCK ( statement )* ) )
            // de\\gaalop\\clucalc\\input\\CluCalcParser.g:206:5: CLBRACKET ( statement )* CRBRACKET
            {
            CLBRACKET123=(Token)match(input,CLBRACKET,FOLLOW_CLBRACKET_in_block1199); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CLBRACKET.add(CLBRACKET123);

            // de\\gaalop\\clucalc\\input\\CluCalcParser.g:206:15: ( statement )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==DECIMAL_LITERAL||LA31_0==FLOATING_POINT_LITERAL||LA31_0==MINUS||LA31_0==IF||(LA31_0>=LOOP && LA31_0<=BREAK)||LA31_0==BGCOLOR_LITERAL||(LA31_0>=IDENTIFIER && LA31_0<=ARGUMENT_PREFIX)||LA31_0==PRAGMA||LA31_0==STAR||LA31_0==LBRACKET||LA31_0==CLBRACKET||LA31_0==REVERSE||(LA31_0>=DOUBLE_NOT && LA31_0<=SEMICOLON)||(LA31_0>=QUESTIONMARK && LA31_0<=COLON)) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // de\\gaalop\\clucalc\\input\\CluCalcParser.g:0:0: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_block1201);
            	    statement124=statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_statement.add(statement124.getTree());

            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            CRBRACKET125=(Token)match(input,CRBRACKET,FOLLOW_CRBRACKET_in_block1204); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CRBRACKET.add(CRBRACKET125);



            // AST REWRITE
            // elements: statement
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 206:36: -> ^( BLOCK ( statement )* )
            {
                // de\\gaalop\\clucalc\\input\\CluCalcParser.g:206:39: ^( BLOCK ( statement )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BLOCK, "BLOCK"), root_1);

                // de\\gaalop\\clucalc\\input\\CluCalcParser.g:206:47: ( statement )*
                while ( stream_statement.hasNext() ) {
                    adaptor.addChild(root_1, stream_statement.nextTree());

                }
                stream_statement.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 32, block_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "block"

    public static class draw_mode_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "draw_mode"
    // de\\gaalop\\clucalc\\input\\CluCalcParser.g:209:1: draw_mode : ( ( COLON IPNS ) -> ^( IPNS ) | ( COLON OPNS ) -> ^( OPNS ) );
    public final CluCalcParser.draw_mode_return draw_mode() throws RecognitionException {
        CluCalcParser.draw_mode_return retval = new CluCalcParser.draw_mode_return();
        retval.start = input.LT(1);
        int draw_mode_StartIndex = input.index();
        Object root_0 = null;

        Token COLON126=null;
        Token IPNS127=null;
        Token COLON128=null;
        Token OPNS129=null;

        Object COLON126_tree=null;
        Object IPNS127_tree=null;
        Object COLON128_tree=null;
        Object OPNS129_tree=null;
        RewriteRuleTokenStream stream_OPNS=new RewriteRuleTokenStream(adaptor,"token OPNS");
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_IPNS=new RewriteRuleTokenStream(adaptor,"token IPNS");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return retval; }
            // de\\gaalop\\clucalc\\input\\CluCalcParser.g:210:3: ( ( COLON IPNS ) -> ^( IPNS ) | ( COLON OPNS ) -> ^( OPNS ) )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==COLON) ) {
                int LA32_1 = input.LA(2);

                if ( (LA32_1==IPNS) ) {
                    alt32=1;
                }
                else if ( (LA32_1==OPNS) ) {
                    alt32=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 32, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // de\\gaalop\\clucalc\\input\\CluCalcParser.g:210:5: ( COLON IPNS )
                    {
                    // de\\gaalop\\clucalc\\input\\CluCalcParser.g:210:5: ( COLON IPNS )
                    // de\\gaalop\\clucalc\\input\\CluCalcParser.g:210:6: COLON IPNS
                    {
                    COLON126=(Token)match(input,COLON,FOLLOW_COLON_in_draw_mode1229); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(COLON126);

                    IPNS127=(Token)match(input,IPNS,FOLLOW_IPNS_in_draw_mode1231); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IPNS.add(IPNS127);


                    }



                    // AST REWRITE
                    // elements: IPNS
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 210:18: -> ^( IPNS )
                    {
                        // de\\gaalop\\clucalc\\input\\CluCalcParser.g:210:21: ^( IPNS )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_IPNS.nextNode(), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // de\\gaalop\\clucalc\\input\\CluCalcParser.g:211:5: ( COLON OPNS )
                    {
                    // de\\gaalop\\clucalc\\input\\CluCalcParser.g:211:5: ( COLON OPNS )
                    // de\\gaalop\\clucalc\\input\\CluCalcParser.g:211:6: COLON OPNS
                    {
                    COLON128=(Token)match(input,COLON,FOLLOW_COLON_in_draw_mode1245); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(COLON128);

                    OPNS129=(Token)match(input,OPNS,FOLLOW_OPNS_in_draw_mode1247); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OPNS.add(OPNS129);


                    }



                    // AST REWRITE
                    // elements: OPNS
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 211:18: -> ^( OPNS )
                    {
                        // de\\gaalop\\clucalc\\input\\CluCalcParser.g:211:21: ^( OPNS )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_OPNS.nextNode(), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 33, draw_mode_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "draw_mode"

    public static class expression_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expression_statement"
    // de\\gaalop\\clucalc\\input\\CluCalcParser.g:214:1: expression_statement : ( SEMICOLON | ( QUESTIONMARK | COLON )? expression SEMICOLON );
    public final CluCalcParser.expression_statement_return expression_statement() throws RecognitionException {
        CluCalcParser.expression_statement_return retval = new CluCalcParser.expression_statement_return();
        retval.start = input.LT(1);
        int expression_statement_StartIndex = input.index();
        Object root_0 = null;

        Token SEMICOLON130=null;
        Token QUESTIONMARK131=null;
        Token COLON132=null;
        Token SEMICOLON134=null;
        CluCalcParser.expression_return expression133 = null;


        Object SEMICOLON130_tree=null;
        Object QUESTIONMARK131_tree=null;
        Object COLON132_tree=null;
        Object SEMICOLON134_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return retval; }
            // de\\gaalop\\clucalc\\input\\CluCalcParser.g:215:3: ( SEMICOLON | ( QUESTIONMARK | COLON )? expression SEMICOLON )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==SEMICOLON) ) {
                alt34=1;
            }
            else if ( (LA34_0==DECIMAL_LITERAL||LA34_0==FLOATING_POINT_LITERAL||LA34_0==MINUS||(LA34_0>=IDENTIFIER && LA34_0<=ARGUMENT_PREFIX)||LA34_0==STAR||LA34_0==LBRACKET||LA34_0==REVERSE||LA34_0==DOUBLE_NOT||(LA34_0>=QUESTIONMARK && LA34_0<=COLON)) ) {
                alt34=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // de\\gaalop\\clucalc\\input\\CluCalcParser.g:215:5: SEMICOLON
                    {
                    root_0 = (Object)adaptor.nil();

                    SEMICOLON130=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_expression_statement1271); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // de\\gaalop\\clucalc\\input\\CluCalcParser.g:216:5: ( QUESTIONMARK | COLON )? expression SEMICOLON
                    {
                    root_0 = (Object)adaptor.nil();

                    // de\\gaalop\\clucalc\\input\\CluCalcParser.g:216:5: ( QUESTIONMARK | COLON )?
                    int alt33=3;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==QUESTIONMARK) ) {
                        alt33=1;
                    }
                    else if ( (LA33_0==COLON) ) {
                        alt33=2;
                    }
                    switch (alt33) {
                        case 1 :
                            // de\\gaalop\\clucalc\\input\\CluCalcParser.g:216:6: QUESTIONMARK
                            {
                            QUESTIONMARK131=(Token)match(input,QUESTIONMARK,FOLLOW_QUESTIONMARK_in_expression_statement1279); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            QUESTIONMARK131_tree = (Object)adaptor.create(QUESTIONMARK131);
                            root_0 = (Object)adaptor.becomeRoot(QUESTIONMARK131_tree, root_0);
                            }

                            }
                            break;
                        case 2 :
                            // de\\gaalop\\clucalc\\input\\CluCalcParser.g:216:22: COLON
                            {
                            COLON132=(Token)match(input,COLON,FOLLOW_COLON_in_expression_statement1284); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            COLON132_tree = (Object)adaptor.create(COLON132);
                            root_0 = (Object)adaptor.becomeRoot(COLON132_tree, root_0);
                            }

                            }
                            break;

                    }

                    pushFollow(FOLLOW_expression_in_expression_statement1289);
                    expression133=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression133.getTree());
                    SEMICOLON134=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_expression_statement1291); if (state.failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 34, expression_statement_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "expression_statement"

    public static class if_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "if_statement"
    // de\\gaalop\\clucalc\\input\\CluCalcParser.g:219:1: if_statement : IF LBRACKET condition= logical_or_expression RBRACKET then_part= statement ( else_part )? -> ^( IF $condition $then_part ( else_part )? ) ;
    public final CluCalcParser.if_statement_return if_statement() throws RecognitionException {
        CluCalcParser.if_statement_return retval = new CluCalcParser.if_statement_return();
        retval.start = input.LT(1);
        int if_statement_StartIndex = input.index();
        Object root_0 = null;

        Token IF135=null;
        Token LBRACKET136=null;
        Token RBRACKET137=null;
        CluCalcParser.logical_or_expression_return condition = null;

        CluCalcParser.statement_return then_part = null;

        CluCalcParser.else_part_return else_part138 = null;


        Object IF135_tree=null;
        Object LBRACKET136_tree=null;
        Object RBRACKET137_tree=null;
        RewriteRuleTokenStream stream_LBRACKET=new RewriteRuleTokenStream(adaptor,"token LBRACKET");
        RewriteRuleTokenStream stream_RBRACKET=new RewriteRuleTokenStream(adaptor,"token RBRACKET");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_else_part=new RewriteRuleSubtreeStream(adaptor,"rule else_part");
        RewriteRuleSubtreeStream stream_logical_or_expression=new RewriteRuleSubtreeStream(adaptor,"rule logical_or_expression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return retval; }
            // de\\gaalop\\clucalc\\input\\CluCalcParser.g:220:3: ( IF LBRACKET condition= logical_or_expression RBRACKET then_part= statement ( else_part )? -> ^( IF $condition $then_part ( else_part )? ) )
            // de\\gaalop\\clucalc\\input\\CluCalcParser.g:220:5: IF LBRACKET condition= logical_or_expression RBRACKET then_part= statement ( else_part )?
            {
            IF135=(Token)match(input,IF,FOLLOW_IF_in_if_statement1308); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IF.add(IF135);

            LBRACKET136=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_if_statement1310); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACKET.add(LBRACKET136);

            pushFollow(FOLLOW_logical_or_expression_in_if_statement1314);
            condition=logical_or_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_logical_or_expression.add(condition.getTree());
            RBRACKET137=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_if_statement1316); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RBRACKET.add(RBRACKET137);

            pushFollow(FOLLOW_statement_in_if_statement1329);
            then_part=statement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statement.add(then_part.getTree());
            // de\\gaalop\\clucalc\\input\\CluCalcParser.g:222:5: ( else_part )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==ELSE) ) {
                int LA35_1 = input.LA(2);

                if ( (synpred61_CluCalcParser()) ) {
                    alt35=1;
                }
            }
            switch (alt35) {
                case 1 :
                    // de\\gaalop\\clucalc\\input\\CluCalcParser.g:222:6: else_part
                    {
                    pushFollow(FOLLOW_else_part_in_if_statement1374);
                    else_part138=else_part();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_else_part.add(else_part138.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: condition, IF, then_part, else_part
            // token labels: 
            // rule labels: condition, then_part, retval
            // token list labels: 
            // rule list labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_condition=new RewriteRuleSubtreeStream(adaptor,"token condition",condition!=null?condition.tree:null);
            RewriteRuleSubtreeStream stream_then_part=new RewriteRuleSubtreeStream(adaptor,"token then_part",then_part!=null?then_part.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 223:5: -> ^( IF $condition $then_part ( else_part )? )
            {
                // de\\gaalop\\clucalc\\input\\CluCalcParser.g:223:8: ^( IF $condition $then_part ( else_part )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_IF.nextNode(), root_1);

                adaptor.addChild(root_1, stream_condition.nextTree());
                adaptor.addChild(root_1, stream_then_part.nextTree());
                // de\\gaalop\\clucalc\\input\\CluCalcParser.g:223:35: ( else_part )?
                if ( stream_else_part.hasNext() ) {
                    adaptor.addChild(root_1, stream_else_part.nextTree());

                }
                stream_else_part.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 35, if_statement_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "if_statement"

    public static class else_part_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "else_part"
    // de\\gaalop\\clucalc\\input\\CluCalcParser.g:226:1: else_part : ( ELSE block -> ^( ELSE block ) | ELSE stmt= if_statement -> ^( ELSEIF $stmt) );
    public final CluCalcParser.else_part_return else_part() throws RecognitionException {
        CluCalcParser.else_part_return retval = new CluCalcParser.else_part_return();
        retval.start = input.LT(1);
        int else_part_StartIndex = input.index();
        Object root_0 = null;

        Token ELSE139=null;
        Token ELSE141=null;
        CluCalcParser.if_statement_return stmt = null;

        CluCalcParser.block_return block140 = null;


        Object ELSE139_tree=null;
        Object ELSE141_tree=null;
        RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
        RewriteRuleSubtreeStream stream_if_statement=new RewriteRuleSubtreeStream(adaptor,"rule if_statement");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 36) ) { return retval; }
            // de\\gaalop\\clucalc\\input\\CluCalcParser.g:227:3: ( ELSE block -> ^( ELSE block ) | ELSE stmt= if_statement -> ^( ELSEIF $stmt) )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==ELSE) ) {
                int LA36_1 = input.LA(2);

                if ( (LA36_1==IF) ) {
                    alt36=2;
                }
                else if ( (LA36_1==CLBRACKET) ) {
                    alt36=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 36, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // de\\gaalop\\clucalc\\input\\CluCalcParser.g:227:5: ELSE block
                    {
                    ELSE139=(Token)match(input,ELSE,FOLLOW_ELSE_in_else_part1477); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ELSE.add(ELSE139);

                    pushFollow(FOLLOW_block_in_else_part1479);
                    block140=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block140.getTree());


                    // AST REWRITE
                    // elements: ELSE, block
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 227:16: -> ^( ELSE block )
                    {
                        // de\\gaalop\\clucalc\\input\\CluCalcParser.g:227:19: ^( ELSE block )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_ELSE.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_block.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // de\\gaalop\\clucalc\\input\\CluCalcParser.g:228:5: ELSE stmt= if_statement
                    {
                    ELSE141=(Token)match(input,ELSE,FOLLOW_ELSE_in_else_part1493); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ELSE.add(ELSE141);

                    pushFollow(FOLLOW_if_statement_in_else_part1497);
                    stmt=if_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_if_statement.add(stmt.getTree());


                    // AST REWRITE
                    // elements: stmt
                    // token labels: 
                    // rule labels: stmt, retval
                    // token list labels: 
                    // rule list labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_stmt=new RewriteRuleSubtreeStream(adaptor,"token stmt",stmt!=null?stmt.tree:null);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 228:28: -> ^( ELSEIF $stmt)
                    {
                        // de\\gaalop\\clucalc\\input\\CluCalcParser.g:228:31: ^( ELSEIF $stmt)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ELSEIF, "ELSEIF"), root_1);

                        adaptor.addChild(root_1, stream_stmt.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 36, else_part_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "else_part"

    public static class loop_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "loop"
    // de\\gaalop\\clucalc\\input\\CluCalcParser.g:231:1: loop : ( PRAGMA UNROLL_LITERAL number= DECIMAL_LITERAL )? LOOP stmt= statement -> ^( LOOP $stmt ( $number)? ) ;
    public final CluCalcParser.loop_return loop() throws RecognitionException {
        CluCalcParser.loop_return retval = new CluCalcParser.loop_return();
        retval.start = input.LT(1);
        int loop_StartIndex = input.index();
        Object root_0 = null;

        Token number=null;
        Token PRAGMA142=null;
        Token UNROLL_LITERAL143=null;
        Token LOOP144=null;
        CluCalcParser.statement_return stmt = null;


        Object number_tree=null;
        Object PRAGMA142_tree=null;
        Object UNROLL_LITERAL143_tree=null;
        Object LOOP144_tree=null;
        RewriteRuleTokenStream stream_UNROLL_LITERAL=new RewriteRuleTokenStream(adaptor,"token UNROLL_LITERAL");
        RewriteRuleTokenStream stream_LOOP=new RewriteRuleTokenStream(adaptor,"token LOOP");
        RewriteRuleTokenStream stream_PRAGMA=new RewriteRuleTokenStream(adaptor,"token PRAGMA");
        RewriteRuleTokenStream stream_DECIMAL_LITERAL=new RewriteRuleTokenStream(adaptor,"token DECIMAL_LITERAL");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 37) ) { return retval; }
            // de\\gaalop\\clucalc\\input\\CluCalcParser.g:232:3: ( ( PRAGMA UNROLL_LITERAL number= DECIMAL_LITERAL )? LOOP stmt= statement -> ^( LOOP $stmt ( $number)? ) )
            // de\\gaalop\\clucalc\\input\\CluCalcParser.g:232:5: ( PRAGMA UNROLL_LITERAL number= DECIMAL_LITERAL )? LOOP stmt= statement
            {
            // de\\gaalop\\clucalc\\input\\CluCalcParser.g:232:5: ( PRAGMA UNROLL_LITERAL number= DECIMAL_LITERAL )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==PRAGMA) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // de\\gaalop\\clucalc\\input\\CluCalcParser.g:232:6: PRAGMA UNROLL_LITERAL number= DECIMAL_LITERAL
                    {
                    PRAGMA142=(Token)match(input,PRAGMA,FOLLOW_PRAGMA_in_loop1522); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PRAGMA.add(PRAGMA142);

                    UNROLL_LITERAL143=(Token)match(input,UNROLL_LITERAL,FOLLOW_UNROLL_LITERAL_in_loop1524); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_UNROLL_LITERAL.add(UNROLL_LITERAL143);

                    number=(Token)match(input,DECIMAL_LITERAL,FOLLOW_DECIMAL_LITERAL_in_loop1528); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DECIMAL_LITERAL.add(number);


                    }
                    break;

            }

            LOOP144=(Token)match(input,LOOP,FOLLOW_LOOP_in_loop1532); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LOOP.add(LOOP144);

            pushFollow(FOLLOW_statement_in_loop1536);
            stmt=statement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statement.add(stmt.getTree());


            // AST REWRITE
            // elements: number, stmt, LOOP
            // token labels: number
            // rule labels: stmt, retval
            // token list labels: 
            // rule list labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleTokenStream stream_number=new RewriteRuleTokenStream(adaptor,"token number",number);
            RewriteRuleSubtreeStream stream_stmt=new RewriteRuleSubtreeStream(adaptor,"token stmt",stmt!=null?stmt.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 232:73: -> ^( LOOP $stmt ( $number)? )
            {
                // de\\gaalop\\clucalc\\input\\CluCalcParser.g:232:76: ^( LOOP $stmt ( $number)? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_LOOP.nextNode(), root_1);

                adaptor.addChild(root_1, stream_stmt.nextTree());
                // de\\gaalop\\clucalc\\input\\CluCalcParser.g:232:89: ( $number)?
                if ( stream_number.hasNext() ) {
                    adaptor.addChild(root_1, stream_number.nextNode());

                }
                stream_number.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 37, loop_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "loop"

    // $ANTLR start synpred4_CluCalcParser
    public final void synpred4_CluCalcParser_fragment() throws RecognitionException {   
        // de\\gaalop\\clucalc\\input\\CluCalcParser.g:65:5: ( lvalue EQUALS expression )
        // de\\gaalop\\clucalc\\input\\CluCalcParser.g:65:5: lvalue EQUALS expression
        {
        pushFollow(FOLLOW_lvalue_in_synpred4_CluCalcParser199);
        lvalue();

        state._fsp--;
        if (state.failed) return ;
        match(input,EQUALS,FOLLOW_EQUALS_in_synpred4_CluCalcParser201); if (state.failed) return ;
        pushFollow(FOLLOW_expression_in_synpred4_CluCalcParser203);
        expression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred4_CluCalcParser

    // $ANTLR start synpred53_CluCalcParser
    public final void synpred53_CluCalcParser_fragment() throws RecognitionException {   
        // de\\gaalop\\clucalc\\input\\CluCalcParser.g:197:36: ( statement )
        // de\\gaalop\\clucalc\\input\\CluCalcParser.g:197:36: statement
        {
        pushFollow(FOLLOW_statement_in_synpred53_CluCalcParser1117);
        statement();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred53_CluCalcParser

    // $ANTLR start synpred55_CluCalcParser
    public final void synpred55_CluCalcParser_fragment() throws RecognitionException {   
        CluCalcParser.additive_expression_return add = null;


        // de\\gaalop\\clucalc\\input\\CluCalcParser.g:201:5: (add= additive_expression )
        // de\\gaalop\\clucalc\\input\\CluCalcParser.g:201:5: add= additive_expression
        {
        pushFollow(FOLLOW_additive_expression_in_synpred55_CluCalcParser1158);
        add=additive_expression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred55_CluCalcParser

    // $ANTLR start synpred61_CluCalcParser
    public final void synpred61_CluCalcParser_fragment() throws RecognitionException {   
        // de\\gaalop\\clucalc\\input\\CluCalcParser.g:222:6: ( else_part )
        // de\\gaalop\\clucalc\\input\\CluCalcParser.g:222:6: else_part
        {
        pushFollow(FOLLOW_else_part_in_synpred61_CluCalcParser1374);
        else_part();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred61_CluCalcParser

    // Delegated rules

    public final boolean synpred55_CluCalcParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred55_CluCalcParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_CluCalcParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_CluCalcParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred61_CluCalcParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred61_CluCalcParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred53_CluCalcParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred53_CluCalcParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA4 dfa4 = new DFA4(this);
    protected DFA25 dfa25 = new DFA25(this);
    protected DFA28 dfa28 = new DFA28(this);
    protected DFA30 dfa30 = new DFA30(this);
    static final String DFA4_eotS =
        "\13\uffff";
    static final String DFA4_eofS =
        "\13\uffff";
    static final String DFA4_minS =
        "\1\4\10\0\2\uffff";
    static final String DFA4_maxS =
        "\1\65\10\0\2\uffff";
    static final String DFA4_acceptS =
        "\11\uffff\1\1\1\2";
    static final String DFA4_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\2\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\3\2\uffff\1\3\4\uffff\1\6\24\uffff\1\1\1\2\7\uffff\1\5\4"+
            "\uffff\1\4\3\uffff\1\7\1\uffff\1\10",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            ""
    };

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "64:1: expression : ( lvalue EQUALS expression -> ^( EQUALS lvalue expression ) | logical_or_expression );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA4_1 = input.LA(1);

                         
                        int index4_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_CluCalcParser()) ) {s = 9;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index4_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA4_2 = input.LA(1);

                         
                        int index4_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_CluCalcParser()) ) {s = 9;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index4_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA4_3 = input.LA(1);

                         
                        int index4_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_CluCalcParser()) ) {s = 9;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index4_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA4_4 = input.LA(1);

                         
                        int index4_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_CluCalcParser()) ) {s = 9;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index4_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA4_5 = input.LA(1);

                         
                        int index4_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_CluCalcParser()) ) {s = 9;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index4_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA4_6 = input.LA(1);

                         
                        int index4_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_CluCalcParser()) ) {s = 9;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index4_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA4_7 = input.LA(1);

                         
                        int index4_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_CluCalcParser()) ) {s = 9;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index4_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA4_8 = input.LA(1);

                         
                        int index4_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_CluCalcParser()) ) {s = 9;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index4_8);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 4, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA25_eotS =
        "\20\uffff";
    static final String DFA25_eofS =
        "\20\uffff";
    static final String DFA25_minS =
        "\1\4\1\uffff\1\4\1\14\3\uffff\1\10\4\uffff\1\4\3\uffff";
    static final String DFA25_maxS =
        "\1\72\1\uffff\1\65\1\102\3\uffff\1\120\4\uffff\1\65\3\uffff";
    static final String DFA25_acceptS =
        "\1\uffff\1\1\2\uffff\1\4\1\7\1\10\1\uffff\1\11\1\12\1\3\1\6\1\uffff"+
        "\1\13\1\2\1\5";
    static final String DFA25_specialS =
        "\20\uffff}>";
    static final String[] DFA25_transitionS = {
            "\1\1\2\uffff\1\1\4\uffff\1\1\2\uffff\1\6\1\uffff\1\10\1\11"+
            "\2\uffff\1\4\13\uffff\1\3\1\1\2\uffff\1\7\4\uffff\1\1\4\uffff"+
            "\1\1\1\uffff\1\5\1\uffff\1\1\1\uffff\2\1\2\uffff\1\1\1\2",
            "",
            "\1\1\2\uffff\1\1\4\uffff\1\1\2\13\5\uffff\1\12\1\uffff\11"+
            "\12\2\uffff\2\1\7\uffff\1\1\4\uffff\1\1\3\uffff\1\1\1\uffff"+
            "\1\1",
            "\1\1\32\uffff\1\14\1\uffff\4\1\2\uffff\1\1\6\uffff\3\1\2\uffff"+
            "\10\1",
            "",
            "",
            "",
            "\1\15\1\10\106\uffff\1\15",
            "",
            "",
            "",
            "",
            "\1\1\2\uffff\1\1\4\uffff\1\1\6\uffff\1\16\15\uffff\2\1\7\uffff"+
            "\1\1\4\uffff\1\1\1\uffff\1\17\1\uffff\1\1\1\uffff\1\1",
            "",
            "",
            ""
    };

    static final short[] DFA25_eot = DFA.unpackEncodedString(DFA25_eotS);
    static final short[] DFA25_eof = DFA.unpackEncodedString(DFA25_eofS);
    static final char[] DFA25_min = DFA.unpackEncodedStringToUnsignedChars(DFA25_minS);
    static final char[] DFA25_max = DFA.unpackEncodedStringToUnsignedChars(DFA25_maxS);
    static final short[] DFA25_accept = DFA.unpackEncodedString(DFA25_acceptS);
    static final short[] DFA25_special = DFA.unpackEncodedString(DFA25_specialS);
    static final short[][] DFA25_transition;

    static {
        int numStates = DFA25_transitionS.length;
        DFA25_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA25_transition[i] = DFA.unpackEncodedString(DFA25_transitionS[i]);
        }
    }

    class DFA25 extends DFA {

        public DFA25(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 25;
            this.eot = DFA25_eot;
            this.eof = DFA25_eof;
            this.min = DFA25_min;
            this.max = DFA25_max;
            this.accept = DFA25_accept;
            this.special = DFA25_special;
            this.transition = DFA25_transition;
        }
        public String getDescription() {
            return "169:1: statement : ( expression_statement | slider | color | bgcolor | macro_definition | draw_mode | block | if_statement | loop | BREAK | pragma );";
        }
    }
    static final String DFA28_eotS =
        "\23\uffff";
    static final String DFA28_eofS =
        "\23\uffff";
    static final String DFA28_minS =
        "\1\4\10\0\12\uffff";
    static final String DFA28_maxS =
        "\1\72\10\0\12\uffff";
    static final String DFA28_acceptS =
        "\11\uffff\1\2\1\1\10\uffff";
    static final String DFA28_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\12\uffff}>";
    static final String[] DFA28_transitionS = {
            "\1\3\2\uffff\1\3\4\uffff\1\6\2\uffff\1\12\1\uffff\2\12\2\uffff"+
            "\1\12\13\uffff\1\1\1\2\2\uffff\1\12\4\uffff\1\5\4\uffff\1\4"+
            "\1\uffff\1\12\1\11\1\7\1\uffff\1\10\1\12\2\uffff\2\12",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA28_eot = DFA.unpackEncodedString(DFA28_eotS);
    static final short[] DFA28_eof = DFA.unpackEncodedString(DFA28_eofS);
    static final char[] DFA28_min = DFA.unpackEncodedStringToUnsignedChars(DFA28_minS);
    static final char[] DFA28_max = DFA.unpackEncodedStringToUnsignedChars(DFA28_maxS);
    static final short[] DFA28_accept = DFA.unpackEncodedString(DFA28_acceptS);
    static final short[] DFA28_special = DFA.unpackEncodedString(DFA28_specialS);
    static final short[][] DFA28_transition;

    static {
        int numStates = DFA28_transitionS.length;
        DFA28_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA28_transition[i] = DFA.unpackEncodedString(DFA28_transitionS[i]);
        }
    }

    class DFA28 extends DFA {

        public DFA28(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 28;
            this.eot = DFA28_eot;
            this.eof = DFA28_eof;
            this.min = DFA28_min;
            this.max = DFA28_max;
            this.accept = DFA28_accept;
            this.special = DFA28_special;
            this.transition = DFA28_transition;
        }
        public String getDescription() {
            return "()* loopback of 197:36: ( statement )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA28_1 = input.LA(1);

                         
                        int index28_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred53_CluCalcParser()) ) {s = 10;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index28_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA28_2 = input.LA(1);

                         
                        int index28_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred53_CluCalcParser()) ) {s = 10;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index28_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA28_3 = input.LA(1);

                         
                        int index28_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred53_CluCalcParser()) ) {s = 10;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index28_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA28_4 = input.LA(1);

                         
                        int index28_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred53_CluCalcParser()) ) {s = 10;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index28_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA28_5 = input.LA(1);

                         
                        int index28_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred53_CluCalcParser()) ) {s = 10;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index28_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA28_6 = input.LA(1);

                         
                        int index28_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred53_CluCalcParser()) ) {s = 10;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index28_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA28_7 = input.LA(1);

                         
                        int index28_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred53_CluCalcParser()) ) {s = 10;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index28_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA28_8 = input.LA(1);

                         
                        int index28_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred53_CluCalcParser()) ) {s = 10;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index28_8);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 28, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA30_eotS =
        "\13\uffff";
    static final String DFA30_eofS =
        "\13\uffff";
    static final String DFA30_minS =
        "\1\4\10\0\2\uffff";
    static final String DFA30_maxS =
        "\1\65\10\0\2\uffff";
    static final String DFA30_acceptS =
        "\11\uffff\1\1\1\2";
    static final String DFA30_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\2\uffff}>";
    static final String[] DFA30_transitionS = {
            "\1\3\2\uffff\1\3\4\uffff\1\6\24\uffff\1\1\1\2\7\uffff\1\5\4"+
            "\uffff\1\4\3\uffff\1\7\1\uffff\1\10",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            ""
    };

    static final short[] DFA30_eot = DFA.unpackEncodedString(DFA30_eotS);
    static final short[] DFA30_eof = DFA.unpackEncodedString(DFA30_eofS);
    static final char[] DFA30_min = DFA.unpackEncodedStringToUnsignedChars(DFA30_minS);
    static final char[] DFA30_max = DFA.unpackEncodedStringToUnsignedChars(DFA30_maxS);
    static final short[] DFA30_accept = DFA.unpackEncodedString(DFA30_acceptS);
    static final short[] DFA30_special = DFA.unpackEncodedString(DFA30_specialS);
    static final short[][] DFA30_transition;

    static {
        int numStates = DFA30_transitionS.length;
        DFA30_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA30_transition[i] = DFA.unpackEncodedString(DFA30_transitionS[i]);
        }
    }

    class DFA30 extends DFA {

        public DFA30(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 30;
            this.eot = DFA30_eot;
            this.eof = DFA30_eof;
            this.min = DFA30_min;
            this.max = DFA30_max;
            this.accept = DFA30_accept;
            this.special = DFA30_special;
            this.transition = DFA30_transition;
        }
        public String getDescription() {
            return "200:1: return_value : (add= additive_expression -> ^( RETURN $add) | or= logical_or_expression -> ^( RETURN $or) );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA30_1 = input.LA(1);

                         
                        int index30_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred55_CluCalcParser()) ) {s = 9;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index30_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA30_2 = input.LA(1);

                         
                        int index30_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred55_CluCalcParser()) ) {s = 9;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index30_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA30_3 = input.LA(1);

                         
                        int index30_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred55_CluCalcParser()) ) {s = 9;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index30_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA30_4 = input.LA(1);

                         
                        int index30_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred55_CluCalcParser()) ) {s = 9;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index30_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA30_5 = input.LA(1);

                         
                        int index30_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred55_CluCalcParser()) ) {s = 9;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index30_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA30_6 = input.LA(1);

                         
                        int index30_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred55_CluCalcParser()) ) {s = 9;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index30_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA30_7 = input.LA(1);

                         
                        int index30_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred55_CluCalcParser()) ) {s = 9;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index30_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA30_8 = input.LA(1);

                         
                        int index30_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred55_CluCalcParser()) ) {s = 9;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index30_8);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 30, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_statement_in_script127 = new BitSet(new long[]{0x066A842600269090L});
    public static final BitSet FOLLOW_EOF_in_script130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_float_literal144 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_FLOATING_POINT_LITERAL_in_float_literal147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRAGMA_in_pragma162 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RANGE_LITERAL_in_pragma164 = new BitSet(new long[]{0x0000000000001080L});
    public static final BitSet FOLLOW_float_literal_in_pragma166 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_LESS_OR_EQUAL_in_pragma168 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_pragma170 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_LESS_OR_EQUAL_in_pragma172 = new BitSet(new long[]{0x0000000000001080L});
    public static final BitSet FOLLOW_float_literal_in_pragma174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRAGMA_in_pragma180 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_IGNORE_LITERAL_in_pragma182 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_pragma184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lvalue_in_expression199 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_EQUALS_in_expression201 = new BitSet(new long[]{0x0668840600001090L});
    public static final BitSet FOLLOW_expression_in_expression203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logical_or_expression_in_expression219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_argument_expression_list234 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_COMMA_in_argument_expression_list238 = new BitSet(new long[]{0x0668840600001090L});
    public static final BitSet FOLLOW_expression_in_argument_expression_list241 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_unary_expression_in_lvalue259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logical_and_expression_in_logical_or_expression272 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_DOUBLE_BAR_in_logical_or_expression275 = new BitSet(new long[]{0x0668840600001090L});
    public static final BitSet FOLLOW_logical_and_expression_in_logical_or_expression278 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_equality_expression_in_logical_and_expression293 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_AND_in_logical_and_expression296 = new BitSet(new long[]{0x0668840600001090L});
    public static final BitSet FOLLOW_equality_expression_in_logical_and_expression299 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_relational_expression_in_equality_expression314 = new BitSet(new long[]{0x6000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_EQUALS_in_equality_expression318 = new BitSet(new long[]{0x0668840600001090L});
    public static final BitSet FOLLOW_UNEQUAL_in_equality_expression323 = new BitSet(new long[]{0x0668840600001090L});
    public static final BitSet FOLLOW_relational_expression_in_equality_expression327 = new BitSet(new long[]{0x6000000000000002L});
    public static final BitSet FOLLOW_additive_expression_in_relational_expression342 = new BitSet(new long[]{0x8000000000000002L,0x0000000000000007L});
    public static final BitSet FOLLOW_LESS_in_relational_expression346 = new BitSet(new long[]{0x0668840600001090L});
    public static final BitSet FOLLOW_GREATER_in_relational_expression351 = new BitSet(new long[]{0x0668840600001090L});
    public static final BitSet FOLLOW_LESS_OR_EQUAL_in_relational_expression356 = new BitSet(new long[]{0x0668840600001090L});
    public static final BitSet FOLLOW_GREATER_OR_EQUAL_in_relational_expression361 = new BitSet(new long[]{0x0668840600001090L});
    public static final BitSet FOLLOW_additive_expression_in_relational_expression365 = new BitSet(new long[]{0x8000000000000002L,0x0000000000000007L});
    public static final BitSet FOLLOW_multiplicative_expression_in_additive_expression380 = new BitSet(new long[]{0x0000020000001002L});
    public static final BitSet FOLLOW_PLUS_in_additive_expression385 = new BitSet(new long[]{0x0668840600001090L});
    public static final BitSet FOLLOW_MINUS_in_additive_expression390 = new BitSet(new long[]{0x0668840600001090L});
    public static final BitSet FOLLOW_multiplicative_expression_in_additive_expression394 = new BitSet(new long[]{0x0000020000001002L});
    public static final BitSet FOLLOW_outer_product_expression_in_multiplicative_expression410 = new BitSet(new long[]{0x00000C0000000002L});
    public static final BitSet FOLLOW_STAR_in_multiplicative_expression415 = new BitSet(new long[]{0x0668840600001090L});
    public static final BitSet FOLLOW_SLASH_in_multiplicative_expression420 = new BitSet(new long[]{0x0668840600001090L});
    public static final BitSet FOLLOW_outer_product_expression_in_multiplicative_expression424 = new BitSet(new long[]{0x00000C0000000002L});
    public static final BitSet FOLLOW_inner_product_expression_in_outer_product_expression440 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_WEDGE_in_outer_product_expression444 = new BitSet(new long[]{0x0668840600001090L});
    public static final BitSet FOLLOW_inner_product_expression_in_outer_product_expression447 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_modulo_expression_in_inner_product_expression463 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_DOT_in_inner_product_expression467 = new BitSet(new long[]{0x0668840600001090L});
    public static final BitSet FOLLOW_modulo_expression_in_inner_product_expression470 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_unary_expression_in_modulo_expression486 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_MODULO_in_modulo_expression490 = new BitSet(new long[]{0x0028840600001090L});
    public static final BitSet FOLLOW_unary_expression_in_modulo_expression493 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_postfix_expression_in_unary_expression509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STAR_in_unary_expression515 = new BitSet(new long[]{0x0028840600001090L});
    public static final BitSet FOLLOW_unary_expression_in_unary_expression519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_unary_expression534 = new BitSet(new long[]{0x0028840600001090L});
    public static final BitSet FOLLOW_unary_expression_in_unary_expression538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REVERSE_in_unary_expression553 = new BitSet(new long[]{0x0028840600001090L});
    public static final BitSet FOLLOW_unary_expression_in_unary_expression557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_NOT_in_unary_expression572 = new BitSet(new long[]{0x0028840600001090L});
    public static final BitSet FOLLOW_unary_expression_in_unary_expression576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primary_expression_in_postfix_expression600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_call_in_postfix_expression606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_function_call622 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_LBRACKET_in_function_call624 = new BitSet(new long[]{0x0669840600001090L});
    public static final BitSet FOLLOW_argument_expression_list_in_function_call628 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_RBRACKET_in_function_call631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_primary_expression660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_argument_in_primary_expression666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constant_in_primary_expression673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACKET_in_primary_expression679 = new BitSet(new long[]{0x0668840600001090L});
    public static final BitSet FOLLOW_expression_in_primary_expression682 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_RBRACKET_in_primary_expression684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_constant0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLON_in_color732 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_COLOR_LITERAL_in_color734 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_LBRACKET_in_color736 = new BitSet(new long[]{0x0668840600001090L});
    public static final BitSet FOLLOW_argument_expression_list_in_color740 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_RBRACKET_in_color742 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_color744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLON_in_color760 = new BitSet(new long[]{0x000000007FC00000L});
    public static final BitSet FOLLOW_color_name_in_color764 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_color766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_color_name790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BGCOLOR_LITERAL_in_bgcolor839 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_EQUALS_in_bgcolor841 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_COLOR_LITERAL_in_bgcolor843 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_LBRACKET_in_bgcolor845 = new BitSet(new long[]{0x0668840600001090L});
    public static final BitSet FOLLOW_argument_expression_list_in_bgcolor849 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_RBRACKET_in_bgcolor851 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_bgcolor853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARGUMENT_PREFIX_in_function_argument879 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_DECIMAL_LITERAL_in_function_argument883 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_RBRACKET_in_function_argument885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_statement_list909 = new BitSet(new long[]{0x066A842600269092L});
    public static final BitSet FOLLOW_expression_statement_in_statement927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_slider_in_statement933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_color_in_statement939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bgcolor_in_statement945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_macro_definition_in_statement951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_draw_mode_in_statement957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_statement963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_statement_in_statement969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_loop_in_statement975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BREAK_in_statement981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pragma_in_statement987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_slider1005 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_EQUALS_in_slider1007 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_SLIDER_LITERAL_in_slider1009 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_LBRACKET_in_slider1011 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_slider_args_in_slider1013 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_RBRACKET_in_slider1015 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_slider1017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_slider_args1046 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_COMMA_in_slider_args1048 = new BitSet(new long[]{0x0000000000001090L});
    public static final BitSet FOLLOW_float_or_dec_in_slider_args1051 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_COMMA_in_slider_args1053 = new BitSet(new long[]{0x0000000000001090L});
    public static final BitSet FOLLOW_float_or_dec_in_slider_args1056 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_COMMA_in_slider_args1058 = new BitSet(new long[]{0x0000000000001090L});
    public static final BitSet FOLLOW_float_or_dec_in_slider_args1061 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_COMMA_in_slider_args1063 = new BitSet(new long[]{0x0000000000001090L});
    public static final BitSet FOLLOW_float_or_dec_in_slider_args1066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_float_or_dec1084 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_DECIMAL_LITERAL_in_float_or_dec1088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_float_literal_in_float_or_dec1094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_macro_definition1111 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_EQUALS_in_macro_definition1113 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_CLBRACKET_in_macro_definition1115 = new BitSet(new long[]{0x066E842600269090L});
    public static final BitSet FOLLOW_statement_in_macro_definition1117 = new BitSet(new long[]{0x066E842600269090L});
    public static final BitSet FOLLOW_return_value_in_macro_definition1122 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_CRBRACKET_in_macro_definition1125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_additive_expression_in_return_value1158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logical_or_expression_in_return_value1175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CLBRACKET_in_block1199 = new BitSet(new long[]{0x066E842600269090L});
    public static final BitSet FOLLOW_statement_in_block1201 = new BitSet(new long[]{0x066E842600269090L});
    public static final BitSet FOLLOW_CRBRACKET_in_block1204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLON_in_draw_mode1229 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_IPNS_in_draw_mode1231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLON_in_draw_mode1245 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_OPNS_in_draw_mode1247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMICOLON_in_expression_statement1271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUESTIONMARK_in_expression_statement1279 = new BitSet(new long[]{0x0668840600001090L});
    public static final BitSet FOLLOW_COLON_in_expression_statement1284 = new BitSet(new long[]{0x0668840600001090L});
    public static final BitSet FOLLOW_expression_in_expression_statement1289 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_expression_statement1291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_if_statement1308 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_LBRACKET_in_if_statement1310 = new BitSet(new long[]{0x0668840600001090L});
    public static final BitSet FOLLOW_logical_or_expression_in_if_statement1314 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_RBRACKET_in_if_statement1316 = new BitSet(new long[]{0x066A842600269090L});
    public static final BitSet FOLLOW_statement_in_if_statement1329 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_else_part_in_if_statement1374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_else_part1477 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_block_in_else_part1479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_else_part1493 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_if_statement_in_else_part1497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRAGMA_in_loop1522 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_UNROLL_LITERAL_in_loop1524 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_DECIMAL_LITERAL_in_loop1528 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_LOOP_in_loop1532 = new BitSet(new long[]{0x066A842600269090L});
    public static final BitSet FOLLOW_statement_in_loop1536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lvalue_in_synpred4_CluCalcParser199 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_EQUALS_in_synpred4_CluCalcParser201 = new BitSet(new long[]{0x0668840600001090L});
    public static final BitSet FOLLOW_expression_in_synpred4_CluCalcParser203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_synpred53_CluCalcParser1117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_additive_expression_in_synpred55_CluCalcParser1158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_else_part_in_synpred61_CluCalcParser1374 = new BitSet(new long[]{0x0000000000000002L});

}