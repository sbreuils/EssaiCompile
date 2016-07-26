// $ANTLR 3.1.1 de\\gaalop\\clucalc\\input\\CluCalcTransformer.g 2016-07-22 23:31:07

	package de.gaalop.clucalc.input;

	import java.util.Collections;	
	import java.util.ArrayList;
	import de.gaalop.cfg.*;
	import de.gaalop.dfg.*;
	import static de.gaalop.dfg.ExpressionFactory.*;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class CluCalcTransformer extends TreeParser {
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


        public CluCalcTransformer(TreeNodeStream input) {
            this(input, new RecognizerSharedState());
        }
        public CluCalcTransformer(TreeNodeStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return CluCalcTransformer.tokenNames; }
    public String getGrammarFileName() { return "de\\gaalop\\clucalc\\input\\CluCalcTransformer.g"; }


    	private GraphBuilder graphBuilder;
    	private int inIfBlock = 0;
    	private boolean inMacro = false;
    	
    	private static final class ParserError extends Error {
        public ParserError(String message) {
          super("Parser error: " + message);
        }
      }

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



    // $ANTLR start "script"
    // de\\gaalop\\clucalc\\input\\CluCalcTransformer.g:41:1: script returns [ControlFlowGraph result] : ( statement )* ;
    public final ControlFlowGraph script() throws RecognitionException {
        ControlFlowGraph result = null;


        		graphBuilder = new GraphBuilder();
        		result = graphBuilder.getGraph();
        	
        try {
            // de\\gaalop\\clucalc\\input\\CluCalcTransformer.g:49:3: ( ( statement )* )
            // de\\gaalop\\clucalc\\input\\CluCalcTransformer.g:49:5: ( statement )*
            {
            // de\\gaalop\\clucalc\\input\\CluCalcTransformer.g:49:5: ( statement )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==DECIMAL_LITERAL||LA1_0==FLOATING_POINT_LITERAL||(LA1_0>=MINUS && LA1_0<=IF)||(LA1_0>=LOOP && LA1_0<=BREAK)||LA1_0==IDENTIFIER||LA1_0==PRAGMA||LA1_0==EQUALS||(LA1_0>=PLUS && LA1_0<=SLASH)||LA1_0==REVERSE||LA1_0==DOUBLE_NOT||(LA1_0>=WEDGE && LA1_0<=GREATER_OR_EQUAL)||(LA1_0>=FUNCTION && LA1_0<=BLOCK)||(LA1_0>=MACRO && LA1_0<=ARGUMENT)||LA1_0==SLIDER||(LA1_0>=COLOR && LA1_0<=BGCOLOR)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // de\\gaalop\\clucalc\\input\\CluCalcTransformer.g:49:5: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_script64);
            	    statement();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	  graphBuilder.finish();
            	
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return result;
    }
    // $ANTLR end "script"


    // $ANTLR start "statement"
    // de\\gaalop\\clucalc\\input\\CluCalcTransformer.g:51:1: statement returns [ArrayList<SequentialNode> nodes] : ( ^( QUESTIONMARK assignment ) | ^( QUESTIONMARK value= expression ) | IPNS | OPNS | ^( COLON assignment ) | ^( COLON id= variableOrConstant ) | assignment | block | if_statement | loop | BREAK | macro | pragma | slider | ^( COLOR arguments ) | ^( COLOR name= ( BLACK | BLUE | CYAN | GREEN | MAGENTA | ORANGE | RED | WHITE | YELLOW ) ) | ^( BGCOLOR arguments ) | expression );
    public final ArrayList<SequentialNode> statement() throws RecognitionException {
        ArrayList<SequentialNode> nodes = null;

        CommonTree name=null;
        Expression value = null;

        Expression id = null;

        CluCalcTransformer.assignment_return assignment1 = null;

        CluCalcTransformer.assignment_return assignment2 = null;

        CluCalcTransformer.assignment_return assignment3 = null;

        ArrayList<SequentialNode> block4 = null;

        IfThenElseNode if_statement5 = null;

        LoopNode loop6 = null;

        ArrayList<Expression> arguments7 = null;

        ArrayList<Expression> arguments8 = null;

        Expression expression9 = null;


         nodes = new ArrayList<SequentialNode>(); 
        try {
            // de\\gaalop\\clucalc\\input\\CluCalcTransformer.g:54:2: ( ^( QUESTIONMARK assignment ) | ^( QUESTIONMARK value= expression ) | IPNS | OPNS | ^( COLON assignment ) | ^( COLON id= variableOrConstant ) | assignment | block | if_statement | loop | BREAK | macro | pragma | slider | ^( COLOR arguments ) | ^( COLOR name= ( BLACK | BLUE | CYAN | GREEN | MAGENTA | ORANGE | RED | WHITE | YELLOW ) ) | ^( BGCOLOR arguments ) | expression )
            int alt2=18;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // de\\gaalop\\clucalc\\input\\CluCalcTransformer.g:54:4: ^( QUESTIONMARK assignment )
                    {
                    match(input,QUESTIONMARK,FOLLOW_QUESTIONMARK_in_statement87); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_assignment_in_statement89);
                    assignment1=assignment();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    		nodes.add(graphBuilder.handleAssignment((assignment1!=null?assignment1.variable:null), (assignment1!=null?assignment1.value:null)));
                    		nodes.add(graphBuilder.handlePrint((assignment1!=null?assignment1.variable:null).copy()));
                    	

                    }
                    break;
                case 2 :
                    // de\\gaalop\\clucalc\\input\\CluCalcTransformer.g:59:4: ^( QUESTIONMARK value= expression )
                    {
                    match(input,QUESTIONMARK,FOLLOW_QUESTIONMARK_in_statement101); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_statement105);
                    value=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     nodes.add(graphBuilder.handlePrint(value)); 

                    }
                    break;
                case 3 :
                    // de\\gaalop\\clucalc\\input\\CluCalcTransformer.g:61:4: IPNS
                    {
                    match(input,IPNS,FOLLOW_IPNS_in_statement115); 
                     graphBuilder.handleNullSpace(NullSpace.IPNS); 

                    }
                    break;
                case 4 :
                    // de\\gaalop\\clucalc\\input\\CluCalcTransformer.g:63:4: OPNS
                    {
                    match(input,OPNS,FOLLOW_OPNS_in_statement124); 
                     graphBuilder.handleNullSpace(NullSpace.OPNS); 

                    }
                    break;
                case 5 :
                    // de\\gaalop\\clucalc\\input\\CluCalcTransformer.g:66:4: ^( COLON assignment )
                    {
                    match(input,COLON,FOLLOW_COLON_in_statement136); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_assignment_in_statement138);
                    assignment2=assignment();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     nodes.add(graphBuilder.handleAssignment((assignment2!=null?assignment2.variable:null), (assignment2!=null?assignment2.value:null)));
                    		ExpressionStatement ex = graphBuilder.processExpressionStatement((assignment2!=null?assignment2.variable:null));
                    		nodes.add(ex);
                    		graphBuilder.addVisualizerExpression(ex);
                    	

                    }
                    break;
                case 6 :
                    // de\\gaalop\\clucalc\\input\\CluCalcTransformer.g:72:4: ^( COLON id= variableOrConstant )
                    {
                    match(input,COLON,FOLLOW_COLON_in_statement149); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_variableOrConstant_in_statement153);
                    id=variableOrConstant();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     
                                    ExpressionStatement ex = graphBuilder.processExpressionStatement(id);
                    		nodes.add(ex);
                    		graphBuilder.addVisualizerExpression(ex);            
                            

                    }
                    break;
                case 7 :
                    // de\\gaalop\\clucalc\\input\\CluCalcTransformer.g:79:4: assignment
                    {
                    pushFollow(FOLLOW_assignment_in_statement165);
                    assignment3=assignment();

                    state._fsp--;

                     nodes.add(graphBuilder.handleAssignment((assignment3!=null?assignment3.variable:null), (assignment3!=null?assignment3.value:null))); 

                    }
                    break;
                case 8 :
                    // de\\gaalop\\clucalc\\input\\CluCalcTransformer.g:81:4: block
                    {
                    pushFollow(FOLLOW_block_in_statement174);
                    block4=block();

                    state._fsp--;

                     nodes = block4; 

                    }
                    break;
                case 9 :
                    // de\\gaalop\\clucalc\\input\\CluCalcTransformer.g:83:4: if_statement
                    {
                    pushFollow(FOLLOW_if_statement_in_statement183);
                    if_statement5=if_statement();

                    state._fsp--;

                     nodes.add(if_statement5);

                    }
                    break;
                case 10 :
                    // de\\gaalop\\clucalc\\input\\CluCalcTransformer.g:85:4: loop
                    {
                    pushFollow(FOLLOW_loop_in_statement192);
                    loop6=loop();

                    state._fsp--;

                     nodes.add(loop6); 

                    }
                    break;
                case 11 :
                    // de\\gaalop\\clucalc\\input\\CluCalcTransformer.g:87:4: BREAK
                    {
                    match(input,BREAK,FOLLOW_BREAK_in_statement201); 

                    	  if (inIfBlock > 0) { 
                    	    nodes.add(graphBuilder.handleBreak());
                    	  } else {
                    	    throw new ParserError("A break command may only occur whithin a conditional statement.");
                    	  } 
                    	

                    }
                    break;
                case 12 :
                    // de\\gaalop\\clucalc\\input\\CluCalcTransformer.g:95:5: macro
                    {
                    pushFollow(FOLLOW_macro_in_statement210);
                    macro();

                    state._fsp--;


                    }
                    break;
                case 13 :
                    // de\\gaalop\\clucalc\\input\\CluCalcTransformer.g:97:5: pragma
                    {
                    pushFollow(FOLLOW_pragma_in_statement217);
                    pragma();

                    state._fsp--;


                    }
                    break;
                case 14 :
                    // de\\gaalop\\clucalc\\input\\CluCalcTransformer.g:99:5: slider
                    {
                    pushFollow(FOLLOW_slider_in_statement226);
                    slider();

                    state._fsp--;


                    }
                    break;
                case 15 :
                    // de\\gaalop\\clucalc\\input\\CluCalcTransformer.g:101:5: ^( COLOR arguments )
                    {
                    match(input,COLOR,FOLLOW_COLOR_in_statement236); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        pushFollow(FOLLOW_arguments_in_statement238);
                        arguments7=arguments();

                        state._fsp--;


                        match(input, Token.UP, null); 
                    }

                          nodes.add(graphBuilder.handleColor(arguments7));
                        

                    }
                    break;
                case 16 :
                    // de\\gaalop\\clucalc\\input\\CluCalcTransformer.g:105:5: ^( COLOR name= ( BLACK | BLUE | CYAN | GREEN | MAGENTA | ORANGE | RED | WHITE | YELLOW ) )
                    {
                    match(input,COLOR,FOLLOW_COLOR_in_statement253); 

                    match(input, Token.DOWN, null); 
                    name=(CommonTree)input.LT(1);
                    if ( (input.LA(1)>=BLACK && input.LA(1)<=YELLOW) ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    match(input, Token.UP, null); 

                          nodes.add(graphBuilder.handleColor((name!=null?name.getText():null)));  
                      

                    }
                    break;
                case 17 :
                    // de\\gaalop\\clucalc\\input\\CluCalcTransformer.g:109:5: ^( BGCOLOR arguments )
                    {
                    match(input,BGCOLOR,FOLLOW_BGCOLOR_in_statement306); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        pushFollow(FOLLOW_arguments_in_statement308);
                        arguments8=arguments();

                        state._fsp--;


                        match(input, Token.UP, null); 
                    }

                          graphBuilder.handleBGColor(arguments8);
                        

                    }
                    break;
                case 18 :
                    // de\\gaalop\\clucalc\\input\\CluCalcTransformer.g:114:4: expression
                    {
                    pushFollow(FOLLOW_expression_in_statement320);
                    expression9=expression();

                    state._fsp--;


                    	  Expression e = expression9;
                    	  if (e != null) { // null e.g. for procedure calls like DefVarsN3()
                    	    nodes.add(graphBuilder.processExpressionStatement(e)); 
                    	  } 	  
                    	

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return nodes;
    }
    // $ANTLR end "statement"


    // $ANTLR start "macro"
    // de\\gaalop\\clucalc\\input\\CluCalcTransformer.g:122:1: macro : ^( MACRO id= IDENTIFIER lst= statement_list (e= return_value )? ) ;
    public final void macro() throws RecognitionException {
        CommonTree id=null;
        ArrayList<SequentialNode> lst = null;

        Expression e = null;


         
            if (inMacro) {
              throw new ParserError("A macro may only be defined in global scope.");
            }
            graphBuilder.beginNewScope(); 
            inMacro = true;
          
        try {
            // de\\gaalop\\clucalc\\input\\CluCalcTransformer.g:134:3: ( ^( MACRO id= IDENTIFIER lst= statement_list (e= return_value )? ) )
            // de\\gaalop\\clucalc\\input\\CluCalcTransformer.g:134:5: ^( MACRO id= IDENTIFIER lst= statement_list (e= return_value )? )
            {
            match(input,MACRO,FOLLOW_MACRO_in_macro350); 

            match(input, Token.DOWN, null); 
            id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_macro354); 
             graphBuilder.addMacroName((id!=null?id.getText():null)); 
            pushFollow(FOLLOW_statement_list_in_macro360);
            lst=statement_list();

            state._fsp--;

            // de\\gaalop\\clucalc\\input\\CluCalcTransformer.g:134:88: (e= return_value )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RETURN) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // de\\gaalop\\clucalc\\input\\CluCalcTransformer.g:134:88: e= return_value
                    {
                    pushFollow(FOLLOW_return_value_in_macro364);
                    e=return_value();

                    state._fsp--;


                    }
                    break;

            }


            match(input, Token.UP, null); 

                graphBuilder.handleMacroDefinition((id!=null?id.getText():null), lst, e);
              

            }

             
                graphBuilder.endNewScope();
                inMacro = false;
              
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "macro"


    // $ANTLR start "return_value"
    // de\\gaalop\\clucalc\\input\\CluCalcTransformer.g:139:1: return_value returns [Expression result] : ^( RETURN exp= expression ) ;
    public final Expression return_value() throws RecognitionException {
        Expression result = null;

        Expression exp = null;


        try {
            // de\\gaalop\\clucalc\\input\\CluCalcTransformer.g:140:3: ( ^( RETURN exp= expression ) )
            // de\\gaalop\\clucalc\\input\\CluCalcTransformer.g:140:5: ^( RETURN exp= expression )
            {
            match(input,RETURN,FOLLOW_RETURN_in_return_value388); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_expression_in_return_value392);
            exp=expression();

            state._fsp--;


            match(input, Token.UP, null); 
             result = exp; 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return result;
    }
    // $ANTLR end "return_value"


    // $ANTLR start "pragma"
    // de\\gaalop\\clucalc\\input\\CluCalcTransformer.g:143:1: pragma : PRAGMA RANGE_LITERAL min= float_literal LESS_OR_EQUAL varname= IDENTIFIER LESS_OR_EQUAL max= float_literal ;
    public final void pragma() throws RecognitionException {
        CommonTree varname=null;
        String min = null;

        String max = null;


        try {
            // de\\gaalop\\clucalc\\input\\CluCalcTransformer.g:144:3: ( PRAGMA RANGE_LITERAL min= float_literal LESS_OR_EQUAL varname= IDENTIFIER LESS_OR_EQUAL max= float_literal )
            // de\\gaalop\\clucalc\\input\\CluCalcTransformer.g:144:6: PRAGMA RANGE_LITERAL min= float_literal LESS_OR_EQUAL varname= IDENTIFIER LESS_OR_EQUAL max= float_literal
            {
            match(input,PRAGMA,FOLLOW_PRAGMA_in_pragma409); 
            match(input,RANGE_LITERAL,FOLLOW_RANGE_LITERAL_in_pragma411); 
            pushFollow(FOLLOW_float_literal_in_pragma415);
            min=float_literal();

            state._fsp--;

            match(input,LESS_OR_EQUAL,FOLLOW_LESS_OR_EQUAL_in_pragma417); 
            varname=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_pragma421); 
            match(input,LESS_OR_EQUAL,FOLLOW_LESS_OR_EQUAL_in_pragma423); 
            pushFollow(FOLLOW_float_literal_in_pragma427);
            max=float_literal();

            state._fsp--;

              graphBuilder.addPragmaMinMaxValues((varname!=null?varname.getText():null), min, max);

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "pragma"

    public static class assignment_return extends TreeRuleReturnScope {
        public Variable variable;
        public Expression value;
    };

    // $ANTLR start "assignment"
    // de\\gaalop\\clucalc\\input\\CluCalcTransformer.g:148:1: assignment returns [Variable variable, Expression value] : ^( EQUALS l= variable r= expression ) ;
    public final CluCalcTransformer.assignment_return assignment() throws RecognitionException {
        CluCalcTransformer.assignment_return retval = new CluCalcTransformer.assignment_return();
        retval.start = input.LT(1);

        Variable l = null;

        Expression r = null;


        try {
            // de\\gaalop\\clucalc\\input\\CluCalcTransformer.g:149:2: ( ^( EQUALS l= variable r= expression ) )
            // de\\gaalop\\clucalc\\input\\CluCalcTransformer.g:149:4: ^( EQUALS l= variable r= expression )
            {
            match(input,EQUALS,FOLLOW_EQUALS_in_assignment451); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_variable_in_assignment455);
            l=variable();

            state._fsp--;

            pushFollow(FOLLOW_expression_in_assignment459);
            r=expression();

            state._fsp--;


            match(input, Token.UP, null); 

            			retval.variable = l;
            			retval.value = r;
            	

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "assignment"


    // $ANTLR start "variable"
    // de\\gaalop\\clucalc\\input\\CluCalcTransformer.g:156:1: variable returns [Variable result] : variableOrConstant ;
    public final Variable variable() throws RecognitionException {
        Variable result = null;

        Expression variableOrConstant10 = null;


        try {
            // de\\gaalop\\clucalc\\input\\CluCalcTransformer.g:157:2: ( variableOrConstant )
            // de\\gaalop\\clucalc\\input\\CluCalcTransformer.g:157:4: variableOrConstant
            {
            pushFollow(FOLLOW_variableOrConstant_in_variable478);
            variableOrConstant10=variableOrConstant();

            state._fsp--;


            		if ( !(variableOrConstant10 instanceof Variable) ) {
            			throw new RecognitionException(input);
            		}
            		result = (Variable)variableOrConstant10;
            	

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return result;
    }
    // $ANTLR end "variable"


    // $ANTLR start "if_statement"
    // de\\gaalop\\clucalc\\input\\CluCalcTransformer.g:165:1: if_statement returns [IfThenElseNode node] : ^( IF condition= expression then_part= statement (else_part= else_statement )? ) ;
    public final IfThenElseNode if_statement() throws RecognitionException {
        IfThenElseNode node = null;

        Expression condition = null;

        ArrayList<SequentialNode> then_part = null;

        ArrayList<SequentialNode> else_part = null;


         inIfBlock++; 
        try {
            // de\\gaalop\\clucalc\\input\\CluCalcTransformer.g:168:3: ( ^( IF condition= expression then_part= statement (else_part= else_statement )? ) )
            // de\\gaalop\\clucalc\\input\\CluCalcTransformer.g:168:5: ^( IF condition= expression then_part= statement (else_part= else_statement )? )
            {
            match(input,IF,FOLLOW_IF_in_if_statement512); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_expression_in_if_statement516);
            condition=expression();

            state._fsp--;

            pushFollow(FOLLOW_statement_in_if_statement520);
            then_part=statement();

            state._fsp--;

            // de\\gaalop\\clucalc\\input\\CluCalcTransformer.g:168:60: (else_part= else_statement )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==ELSE||LA4_0==ELSEIF) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // de\\gaalop\\clucalc\\input\\CluCalcTransformer.g:168:60: else_part= else_statement
                    {
                    pushFollow(FOLLOW_else_statement_in_if_statement524);
                    else_part=else_statement();

                    state._fsp--;


                    }
                    break;

            }


            match(input, Token.UP, null); 

                node = graphBuilder.handleIfStatement(condition, then_part, else_part);
              

            }

             inIfBlock--; 
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return node;
    }
    // $ANTLR end "if_statement"


    // $ANTLR start "else_statement"
    // de\\gaalop\\clucalc\\input\\CluCalcTransformer.g:173:1: else_statement returns [ArrayList<SequentialNode> nodes] : ( ^( ELSE block ) | ^( ELSEIF if_statement ) );
    public final ArrayList<SequentialNode> else_statement() throws RecognitionException {
        ArrayList<SequentialNode> nodes = null;

        ArrayList<SequentialNode> block11 = null;

        IfThenElseNode if_statement12 = null;


         
            graphBuilder.beginNewScope();
            nodes = new ArrayList<SequentialNode>(); 
          
        try {
            // de\\gaalop\\clucalc\\input\\CluCalcTransformer.g:179:3: ( ^( ELSE block ) | ^( ELSEIF if_statement ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==ELSE) ) {
                alt5=1;
            }
            else if ( (LA5_0==ELSEIF) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // de\\gaalop\\clucalc\\input\\CluCalcTransformer.g:179:5: ^( ELSE block )
                    {
                    match(input,ELSE,FOLLOW_ELSE_in_else_statement562); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_block_in_else_statement564);
                    block11=block();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     nodes = block11; 

                    }
                    break;
                case 2 :
                    // de\\gaalop\\clucalc\\input\\CluCalcTransformer.g:180:5: ^( ELSEIF if_statement )
                    {
                    match(input,ELSEIF,FOLLOW_ELSEIF_in_else_statement574); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_if_statement_in_else_statement576);
                    if_statement12=if_statement();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     
                        if_statement12.setElseIf(true);
                        nodes.add(if_statement12); 
                      

                    }
                    break;

            }
             graphBuilder.endNewScope(); 
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return nodes;
    }
    // $ANTLR end "else_statement"


    // $ANTLR start "loop"
    // de\\gaalop\\clucalc\\input\\CluCalcTransformer.g:186:1: loop returns [LoopNode node] : ^( LOOP stmt= statement (number= DECIMAL_LITERAL )? ) ;
    public final LoopNode loop() throws RecognitionException {
        LoopNode node = null;

        CommonTree number=null;
        ArrayList<SequentialNode> stmt = null;


        try {
            // de\\gaalop\\clucalc\\input\\CluCalcTransformer.g:187:3: ( ^( LOOP stmt= statement (number= DECIMAL_LITERAL )? ) )
            // de\\gaalop\\clucalc\\input\\CluCalcTransformer.g:187:5: ^( LOOP stmt= statement (number= DECIMAL_LITERAL )? )
            {
            match(input,LOOP,FOLLOW_LOOP_in_loop599); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_statement_in_loop603);
            stmt=statement();

            state._fsp--;

            // de\\gaalop\\clucalc\\input\\CluCalcTransformer.g:187:33: (number= DECIMAL_LITERAL )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==DECIMAL_LITERAL) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // de\\gaalop\\clucalc\\input\\CluCalcTransformer.g:187:33: number= DECIMAL_LITERAL
                    {
                    number=(CommonTree)match(input,DECIMAL_LITERAL,FOLLOW_DECIMAL_LITERAL_in_loop607); 

                    }
                    break;

            }


            match(input, Token.UP, null); 

                  node = graphBuilder.handleLoop(stmt, (number!=null?number.getText():null)); 
               

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return node;
    }
    // $ANTLR end "loop"


    // $ANTLR start "block"
    // de\\gaalop\\clucalc\\input\\CluCalcTransformer.g:192:1: block returns [ArrayList<SequentialNode> nodes] : ^( BLOCK stmts= statement_list ) ;
    public final ArrayList<SequentialNode> block() throws RecognitionException {
        ArrayList<SequentialNode> nodes = null;

        ArrayList<SequentialNode> stmts = null;


         
            graphBuilder.beginNewScope();
            nodes = new ArrayList<SequentialNode>(); 
          
        try {
            // de\\gaalop\\clucalc\\input\\CluCalcTransformer.g:198:3: ( ^( BLOCK stmts= statement_list ) )
            // de\\gaalop\\clucalc\\input\\CluCalcTransformer.g:198:5: ^( BLOCK stmts= statement_list )
            {
            match(input,BLOCK,FOLLOW_BLOCK_in_block645); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                pushFollow(FOLLOW_statement_list_in_block649);
                stmts=statement_list();

                state._fsp--;


                match(input, Token.UP, null); 
            }

                 nodes.addAll(stmts);
              

            }

             graphBuilder.endNewScope(); 
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return nodes;
    }
    // $ANTLR end "block"


    // $ANTLR start "statement_list"
    // de\\gaalop\\clucalc\\input\\CluCalcTransformer.g:203:1: statement_list returns [ArrayList<SequentialNode> args] : (arg= statement )* ;
    public final ArrayList<SequentialNode> statement_list() throws RecognitionException {
        ArrayList<SequentialNode> args = null;

        ArrayList<SequentialNode> arg = null;


         args = new ArrayList<SequentialNode>(); 
        try {
            // de\\gaalop\\clucalc\\input\\CluCalcTransformer.g:205:3: ( (arg= statement )* )
            // de\\gaalop\\clucalc\\input\\CluCalcTransformer.g:205:5: (arg= statement )*
            {
            // de\\gaalop\\clucalc\\input\\CluCalcTransformer.g:205:5: (arg= statement )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==DECIMAL_LITERAL||LA7_0==FLOATING_POINT_LITERAL||(LA7_0>=MINUS && LA7_0<=IF)||(LA7_0>=LOOP && LA7_0<=BREAK)||LA7_0==IDENTIFIER||LA7_0==PRAGMA||LA7_0==EQUALS||(LA7_0>=PLUS && LA7_0<=SLASH)||LA7_0==REVERSE||LA7_0==DOUBLE_NOT||(LA7_0>=WEDGE && LA7_0<=GREATER_OR_EQUAL)||(LA7_0>=FUNCTION && LA7_0<=BLOCK)||(LA7_0>=MACRO && LA7_0<=ARGUMENT)||LA7_0==SLIDER||(LA7_0>=COLOR && LA7_0<=BGCOLOR)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // de\\gaalop\\clucalc\\input\\CluCalcTransformer.g:205:6: arg= statement
            	    {
            	    pushFollow(FOLLOW_statement_in_statement_list682);
            	    arg=statement();

            	    state._fsp--;

            	     args.addAll(arg); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return args;
    }
    // $ANTLR end "statement_list"


    // $ANTLR start "slider"
    // de\\gaalop\\clucalc\\input\\CluCalcTransformer.g:208:1: slider : ^( SLIDER var= variable args= slider_args ) ;
    public final void slider() throws RecognitionException {
        Variable var = null;

        CluCalcTransformer.slider_args_return args = null;


        try {
            // de\\gaalop\\clucalc\\input\\CluCalcTransformer.g:209:3: ( ^( SLIDER var= variable args= slider_args ) )
            // de\\gaalop\\clucalc\\input\\CluCalcTransformer.g:209:5: ^( SLIDER var= variable args= slider_args )
            {
            match(input,SLIDER,FOLLOW_SLIDER_in_slider702); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_variable_in_slider706);
            var=variable();

            state._fsp--;

            pushFollow(FOLLOW_slider_args_in_slider710);
            args=slider_args();

            state._fsp--;


            match(input, Token.UP, null); 

                  graphBuilder.handleSlider(var, (args!=null?args.label:null), (args!=null?args.min:0.0), (args!=null?args.max:0.0), (args!=null?args.step:0.0), (args!=null?args.init:0.0));
              

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "slider"

    public static class slider_args_return extends TreeRuleReturnScope {
        public String label;
        public double min;
        public double max;
        public double step;
        public double init;
    };

    // $ANTLR start "slider_args"
    // de\\gaalop\\clucalc\\input\\CluCalcTransformer.g:214:10: fragment slider_args returns [String label, double min, double max, double step, double init] : id= STRING_LITERAL COMMA mi= constant COMMA ma= constant COMMA st= constant COMMA in= constant ;
    public final CluCalcTransformer.slider_args_return slider_args() throws RecognitionException {
        CluCalcTransformer.slider_args_return retval = new CluCalcTransformer.slider_args_return();
        retval.start = input.LT(1);

        CommonTree id=null;
        double mi = 0.0;

        double ma = 0.0;

        double st = 0.0;

        double in = 0.0;


        try {
            // de\\gaalop\\clucalc\\input\\CluCalcTransformer.g:215:3: (id= STRING_LITERAL COMMA mi= constant COMMA ma= constant COMMA st= constant COMMA in= constant )
            // de\\gaalop\\clucalc\\input\\CluCalcTransformer.g:215:5: id= STRING_LITERAL COMMA mi= constant COMMA ma= constant COMMA st= constant COMMA in= constant
            {
            id=(CommonTree)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_slider_args736); 
            match(input,COMMA,FOLLOW_COMMA_in_slider_args738); 
            pushFollow(FOLLOW_constant_in_slider_args742);
            mi=constant();

            state._fsp--;

            match(input,COMMA,FOLLOW_COMMA_in_slider_args744); 
            pushFollow(FOLLOW_constant_in_slider_args748);
            ma=constant();

            state._fsp--;

            match(input,COMMA,FOLLOW_COMMA_in_slider_args750); 
            pushFollow(FOLLOW_constant_in_slider_args754);
            st=constant();

            state._fsp--;

            match(input,COMMA,FOLLOW_COMMA_in_slider_args756); 
            pushFollow(FOLLOW_constant_in_slider_args760);
            in=constant();

            state._fsp--;


                  retval.label = (id!=null?id.getText():null).replaceAll("\"", "");
                  retval.min = mi;
                  retval.max = ma;
                  retval.step = st;
                  retval.init = in;
              

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "slider_args"


    // $ANTLR start "constant"
    // de\\gaalop\\clucalc\\input\\CluCalcTransformer.g:224:10: fragment constant returns [double value] : ( decimal_literal | float_literal );
    public final double constant() throws RecognitionException {
        double value = 0.0;

        String decimal_literal13 = null;

        String float_literal14 = null;


        try {
            // de\\gaalop\\clucalc\\input\\CluCalcTransformer.g:225:3: ( decimal_literal | float_literal )
            int alt8=2;
            switch ( input.LA(1) ) {
            case MINUS:
                {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==FLOATING_POINT_LITERAL) ) {
                    alt8=2;
                }
                else if ( (LA8_1==DECIMAL_LITERAL) ) {
                    alt8=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }
                }
                break;
            case DECIMAL_LITERAL:
                {
                alt8=1;
                }
                break;
            case FLOATING_POINT_LITERAL:
                {
                alt8=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // de\\gaalop\\clucalc\\input\\CluCalcTransformer.g:225:5: decimal_literal
                    {
                    pushFollow(FOLLOW_decimal_literal_in_constant783);
                    decimal_literal13=decimal_literal();

                    state._fsp--;

                     value = Double.parseDouble(decimal_literal13); 

                    }
                    break;
                case 2 :
                    // de\\gaalop\\clucalc\\input\\CluCalcTransformer.g:226:5: float_literal
                    {
                    pushFollow(FOLLOW_float_literal_in_constant791);
                    float_literal14=float_literal();

                    state._fsp--;

                     value = Double.parseDouble(float_literal14); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "constant"


    // $ANTLR start "expression"
    // de\\gaalop\\clucalc\\input\\CluCalcTransformer.g:229:1: expression returns [Expression result] : ( ^( PLUS l= expression r= expression ) | ^( MINUS l= expression r= expression ) | ^( STAR l= expression r= expression ) | ^( SLASH l= expression r= expression ) | ^( DOUBLE_BAR l= expression r= expression ) | ^( DOUBLE_AND l= expression r= expression ) | ^( DOUBLE_EQUALS l= expression r= expression ) | ^( UNEQUAL l= expression r= expression ) | ^( LESS l= expression r= expression ) | ^( GREATER l= expression r= expression ) | ^( LESS_OR_EQUAL l= expression r= expression ) | ^( GREATER_OR_EQUAL l= expression r= expression ) | ^( WEDGE l= expression r= expression ) | ^( DOT l= expression r= expression ) | ^( NEGATION op= expression ) | ^( DUAL op= expression ) | ^( REVERSE op= expression ) | ^( DOUBLE_NOT op= expression ) | ^( FUNCTION name= IDENTIFIER arguments ) | value= DECIMAL_LITERAL | value= FLOATING_POINT_LITERAL | ^( ARGUMENT index= DECIMAL_LITERAL ) | variableOrConstant );
    public final Expression expression() throws RecognitionException {
        Expression result = null;

        CommonTree name=null;
        CommonTree value=null;
        CommonTree index=null;
        Expression l = null;

        Expression r = null;

        Expression op = null;

        ArrayList<Expression> arguments15 = null;

        Expression variableOrConstant16 = null;


        try {
            // de\\gaalop\\clucalc\\input\\CluCalcTransformer.g:231:2: ( ^( PLUS l= expression r= expression ) | ^( MINUS l= expression r= expression ) | ^( STAR l= expression r= expression ) | ^( SLASH l= expression r= expression ) | ^( DOUBLE_BAR l= expression r= expression ) | ^( DOUBLE_AND l= expression r= expression ) | ^( DOUBLE_EQUALS l= expression r= expression ) | ^( UNEQUAL l= expression r= expression ) | ^( LESS l= expression r= expression ) | ^( GREATER l= expression r= expression ) | ^( LESS_OR_EQUAL l= expression r= expression ) | ^( GREATER_OR_EQUAL l= expression r= expression ) | ^( WEDGE l= expression r= expression ) | ^( DOT l= expression r= expression ) | ^( NEGATION op= expression ) | ^( DUAL op= expression ) | ^( REVERSE op= expression ) | ^( DOUBLE_NOT op= expression ) | ^( FUNCTION name= IDENTIFIER arguments ) | value= DECIMAL_LITERAL | value= FLOATING_POINT_LITERAL | ^( ARGUMENT index= DECIMAL_LITERAL ) | variableOrConstant )
            int alt9=23;
            switch ( input.LA(1) ) {
            case PLUS:
                {
                alt9=1;
                }
                break;
            case MINUS:
                {
                alt9=2;
                }
                break;
            case STAR:
                {
                alt9=3;
                }
                break;
            case SLASH:
                {
                alt9=4;
                }
                break;
            case DOUBLE_BAR:
                {
                alt9=5;
                }
                break;
            case DOUBLE_AND:
                {
                alt9=6;
                }
                break;
            case DOUBLE_EQUALS:
                {
                alt9=7;
                }
                break;
            case UNEQUAL:
                {
                alt9=8;
                }
                break;
            case LESS:
                {
                alt9=9;
                }
                break;
            case GREATER:
                {
                alt9=10;
                }
                break;
            case LESS_OR_EQUAL:
                {
                alt9=11;
                }
                break;
            case GREATER_OR_EQUAL:
                {
                alt9=12;
                }
                break;
            case WEDGE:
                {
                alt9=13;
                }
                break;
            case DOT:
                {
                alt9=14;
                }
                break;
            case NEGATION:
                {
                alt9=15;
                }
                break;
            case DUAL:
                {
                alt9=16;
                }
                break;
            case REVERSE:
                {
                alt9=17;
                }
                break;
            case DOUBLE_NOT:
                {
                alt9=18;
                }
                break;
            case FUNCTION:
                {
                alt9=19;
                }
                break;
            case DECIMAL_LITERAL:
                {
                alt9=20;
                }
                break;
            case FLOATING_POINT_LITERAL:
                {
                alt9=21;
                }
                break;
            case ARGUMENT:
                {
                alt9=22;
                }
                break;
            case IDENTIFIER:
                {
                alt9=23;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // de\\gaalop\\clucalc\\input\\CluCalcTransformer.g:231:4: ^( PLUS l= expression r= expression )
                    {
                    match(input,PLUS,FOLLOW_PLUS_in_expression814); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression818);
                    l=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression822);
                    r=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     result = new Addition(l, r); 

                    }
                    break;
                case 2 :
                    // de\\gaalop\\clucalc\\input\\CluCalcTransformer.g:233:4: ^( MINUS l= expression r= expression )
                    {
                    match(input,MINUS,FOLLOW_MINUS_in_expression833); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression837);
                    l=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression841);
                    r=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     result = new Subtraction(l, r); 

                    }
                    break;
                case 3 :
                    // de\\gaalop\\clucalc\\input\\CluCalcTransformer.g:235:4: ^( STAR l= expression r= expression )
                    {
                    match(input,STAR,FOLLOW_STAR_in_expression852); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression856);
                    l=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression860);
                    r=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     result = new Multiplication(l, r); 

                    }
                    break;
                case 4 :
                    // de\\gaalop\\clucalc\\input\\CluCalcTransformer.g:237:4: ^( SLASH l= expression r= expression )
                    {
                    match(input,SLASH,FOLLOW_SLASH_in_expression871); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression875);
                    l=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression879);
                    r=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     result = new Division(l, r); 

                    }
                    break;
                case 5 :
                    // de\\gaalop\\clucalc\\input\\CluCalcTransformer.g:239:5: ^( DOUBLE_BAR l= expression r= expression )
                    {
                    match(input,DOUBLE_BAR,FOLLOW_DOUBLE_BAR_in_expression891); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression895);
                    l=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression899);
                    r=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     result = new LogicalOr(l, r); 

                    }
                    break;
                case 6 :
                    // de\\gaalop\\clucalc\\input\\CluCalcTransformer.g:241:5: ^( DOUBLE_AND l= expression r= expression )
                    {
                    match(input,DOUBLE_AND,FOLLOW_DOUBLE_AND_in_expression912); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression916);
                    l=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression920);
                    r=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     result = new LogicalAnd(l, r); 

                    }
                    break;
                case 7 :
                    // de\\gaalop\\clucalc\\input\\CluCalcTransformer.g:243:5: ^( DOUBLE_EQUALS l= expression r= expression )
                    {
                    match(input,DOUBLE_EQUALS,FOLLOW_DOUBLE_EQUALS_in_expression932); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression936);
                    l=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression940);
                    r=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     result = new Equality(l, r); 

                    }
                    break;
                case 8 :
                    // de\\gaalop\\clucalc\\input\\CluCalcTransformer.g:245:5: ^( UNEQUAL l= expression r= expression )
                    {
                    match(input,UNEQUAL,FOLLOW_UNEQUAL_in_expression952); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression956);
                    l=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression960);
                    r=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     result = new Inequality(l, r); 

                    }
                    break;
                case 9 :
                    // de\\gaalop\\clucalc\\input\\CluCalcTransformer.g:247:5: ^( LESS l= expression r= expression )
                    {
                    match(input,LESS,FOLLOW_LESS_in_expression972); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression976);
                    l=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression980);
                    r=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     result = new Relation(l, r, Relation.Type.LESS); 

                    }
                    break;
                case 10 :
                    // de\\gaalop\\clucalc\\input\\CluCalcTransformer.g:249:5: ^( GREATER l= expression r= expression )
                    {
                    match(input,GREATER,FOLLOW_GREATER_in_expression992); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression996);
                    l=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression1000);
                    r=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     result = new Relation(l, r, Relation.Type.GREATER); 

                    }
                    break;
                case 11 :
                    // de\\gaalop\\clucalc\\input\\CluCalcTransformer.g:251:5: ^( LESS_OR_EQUAL l= expression r= expression )
                    {
                    match(input,LESS_OR_EQUAL,FOLLOW_LESS_OR_EQUAL_in_expression1013); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression1017);
                    l=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression1021);
                    r=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     result = new Relation(l, r, Relation.Type.LESS_OR_EQUAL); 

                    }
                    break;
                case 12 :
                    // de\\gaalop\\clucalc\\input\\CluCalcTransformer.g:253:5: ^( GREATER_OR_EQUAL l= expression r= expression )
                    {
                    match(input,GREATER_OR_EQUAL,FOLLOW_GREATER_OR_EQUAL_in_expression1033); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression1037);
                    l=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression1041);
                    r=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     result = new Relation(l, r, Relation.Type.GREATER_OR_EQUAL); 

                    }
                    break;
                case 13 :
                    // de\\gaalop\\clucalc\\input\\CluCalcTransformer.g:255:4: ^( WEDGE l= expression r= expression )
                    {
                    match(input,WEDGE,FOLLOW_WEDGE_in_expression1052); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression1056);
                    l=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression1060);
                    r=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     result = new OuterProduct(l, r); 

                    }
                    break;
                case 14 :
                    // de\\gaalop\\clucalc\\input\\CluCalcTransformer.g:257:4: ^( DOT l= expression r= expression )
                    {
                    match(input,DOT,FOLLOW_DOT_in_expression1071); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression1075);
                    l=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression1079);
                    r=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     result = new InnerProduct(l, r); 

                    }
                    break;
                case 15 :
                    // de\\gaalop\\clucalc\\input\\CluCalcTransformer.g:259:4: ^( NEGATION op= expression )
                    {
                    match(input,NEGATION,FOLLOW_NEGATION_in_expression1090); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression1094);
                    op=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     result = new Negation(op); 

                    }
                    break;
                case 16 :
                    // de\\gaalop\\clucalc\\input\\CluCalcTransformer.g:261:4: ^( DUAL op= expression )
                    {
                    match(input,DUAL,FOLLOW_DUAL_in_expression1105); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression1109);
                    op=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     result = graphBuilder.processFunction("*", Collections.singletonList(op)); 

                    }
                    break;
                case 17 :
                    // de\\gaalop\\clucalc\\input\\CluCalcTransformer.g:263:4: ^( REVERSE op= expression )
                    {
                    match(input,REVERSE,FOLLOW_REVERSE_in_expression1121); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression1125);
                    op=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     result = new Reverse(op); 

                    }
                    break;
                case 18 :
                    // de\\gaalop\\clucalc\\input\\CluCalcTransformer.g:265:4: ^( DOUBLE_NOT op= expression )
                    {
                    match(input,DOUBLE_NOT,FOLLOW_DOUBLE_NOT_in_expression1136); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression1140);
                    op=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     result = new LogicalNegation(op); 

                    }
                    break;
                case 19 :
                    // de\\gaalop\\clucalc\\input\\CluCalcTransformer.g:267:4: ^( FUNCTION name= IDENTIFIER arguments )
                    {
                    match(input,FUNCTION,FOLLOW_FUNCTION_in_expression1151); 

                    match(input, Token.DOWN, null); 
                    name=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_expression1155); 
                    pushFollow(FOLLOW_arguments_in_expression1157);
                    arguments15=arguments();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     result = graphBuilder.processFunction((name!=null?name.getText():null), arguments15); 

                    }
                    break;
                case 20 :
                    // de\\gaalop\\clucalc\\input\\CluCalcTransformer.g:269:4: value= DECIMAL_LITERAL
                    {
                    value=(CommonTree)match(input,DECIMAL_LITERAL,FOLLOW_DECIMAL_LITERAL_in_expression1169); 
                     result = new FloatConstant((value!=null?value.getText():null)); 

                    }
                    break;
                case 21 :
                    // de\\gaalop\\clucalc\\input\\CluCalcTransformer.g:271:4: value= FLOATING_POINT_LITERAL
                    {
                    value=(CommonTree)match(input,FLOATING_POINT_LITERAL,FOLLOW_FLOATING_POINT_LITERAL_in_expression1180); 
                     result = new FloatConstant((value!=null?value.getText():null)); 

                    }
                    break;
                case 22 :
                    // de\\gaalop\\clucalc\\input\\CluCalcTransformer.g:273:4: ^( ARGUMENT index= DECIMAL_LITERAL )
                    {
                    match(input,ARGUMENT,FOLLOW_ARGUMENT_in_expression1190); 

                    match(input, Token.DOWN, null); 
                    index=(CommonTree)match(input,DECIMAL_LITERAL,FOLLOW_DECIMAL_LITERAL_in_expression1194); 

                    match(input, Token.UP, null); 
                     result = new FunctionArgument(Integer.parseInt((index!=null?index.getText():null))); 

                    }
                    break;
                case 23 :
                    // de\\gaalop\\clucalc\\input\\CluCalcTransformer.g:275:4: variableOrConstant
                    {
                    pushFollow(FOLLOW_variableOrConstant_in_expression1204);
                    variableOrConstant16=variableOrConstant();

                    state._fsp--;

                     result = variableOrConstant16; 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return result;
    }
    // $ANTLR end "expression"


    // $ANTLR start "variableOrConstant"
    // de\\gaalop\\clucalc\\input\\CluCalcTransformer.g:278:1: variableOrConstant returns [Expression result] : name= IDENTIFIER ;
    public final Expression variableOrConstant() throws RecognitionException {
        Expression result = null;

        CommonTree name=null;

        try {
            // de\\gaalop\\clucalc\\input\\CluCalcTransformer.g:279:2: (name= IDENTIFIER )
            // de\\gaalop\\clucalc\\input\\CluCalcTransformer.g:279:4: name= IDENTIFIER
            {
            name=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_variableOrConstant1223); 
             result = graphBuilder.processIdentifier((name!=null?name.getText():null)); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return result;
    }
    // $ANTLR end "variableOrConstant"


    // $ANTLR start "arguments"
    // de\\gaalop\\clucalc\\input\\CluCalcTransformer.g:282:1: arguments returns [ArrayList<Expression> args] : (arg= expression )* ;
    public final ArrayList<Expression> arguments() throws RecognitionException {
        ArrayList<Expression> args = null;

        Expression arg = null;


         args = new ArrayList<Expression>(); 
        try {
            // de\\gaalop\\clucalc\\input\\CluCalcTransformer.g:284:2: ( (arg= expression )* )
            // de\\gaalop\\clucalc\\input\\CluCalcTransformer.g:284:4: (arg= expression )*
            {
            // de\\gaalop\\clucalc\\input\\CluCalcTransformer.g:284:4: (arg= expression )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==DECIMAL_LITERAL||LA10_0==FLOATING_POINT_LITERAL||LA10_0==MINUS||LA10_0==IDENTIFIER||(LA10_0>=PLUS && LA10_0<=SLASH)||LA10_0==REVERSE||LA10_0==DOUBLE_NOT||(LA10_0>=WEDGE && LA10_0<=DOT)||(LA10_0>=DOUBLE_BAR && LA10_0<=GREATER_OR_EQUAL)||(LA10_0>=FUNCTION && LA10_0<=DUAL)||LA10_0==ARGUMENT) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // de\\gaalop\\clucalc\\input\\CluCalcTransformer.g:284:5: arg= expression
            	    {
            	    pushFollow(FOLLOW_expression_in_arguments1250);
            	    arg=expression();

            	    state._fsp--;

            	     args.add(arg); 

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return args;
    }
    // $ANTLR end "arguments"


    // $ANTLR start "float_literal"
    // de\\gaalop\\clucalc\\input\\CluCalcTransformer.g:287:1: float_literal returns [String result] : (sign= MINUS )? val= FLOATING_POINT_LITERAL ;
    public final String float_literal() throws RecognitionException {
        String result = null;

        CommonTree sign=null;
        CommonTree val=null;

        try {
            // de\\gaalop\\clucalc\\input\\CluCalcTransformer.g:288:3: ( (sign= MINUS )? val= FLOATING_POINT_LITERAL )
            // de\\gaalop\\clucalc\\input\\CluCalcTransformer.g:288:5: (sign= MINUS )? val= FLOATING_POINT_LITERAL
            {
            // de\\gaalop\\clucalc\\input\\CluCalcTransformer.g:288:9: (sign= MINUS )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==MINUS) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // de\\gaalop\\clucalc\\input\\CluCalcTransformer.g:288:9: sign= MINUS
                    {
                    sign=(CommonTree)match(input,MINUS,FOLLOW_MINUS_in_float_literal1272); 

                    }
                    break;

            }

            val=(CommonTree)match(input,FLOATING_POINT_LITERAL,FOLLOW_FLOATING_POINT_LITERAL_in_float_literal1277); 
            result = new String((sign!=null?(sign!=null?sign.getText():null):"") + (val!=null?val.getText():null));

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return result;
    }
    // $ANTLR end "float_literal"


    // $ANTLR start "decimal_literal"
    // de\\gaalop\\clucalc\\input\\CluCalcTransformer.g:291:1: decimal_literal returns [String result] : (sign= MINUS )? val= DECIMAL_LITERAL ;
    public final String decimal_literal() throws RecognitionException {
        String result = null;

        CommonTree sign=null;
        CommonTree val=null;

        try {
            // de\\gaalop\\clucalc\\input\\CluCalcTransformer.g:292:3: ( (sign= MINUS )? val= DECIMAL_LITERAL )
            // de\\gaalop\\clucalc\\input\\CluCalcTransformer.g:292:5: (sign= MINUS )? val= DECIMAL_LITERAL
            {
            // de\\gaalop\\clucalc\\input\\CluCalcTransformer.g:292:9: (sign= MINUS )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==MINUS) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // de\\gaalop\\clucalc\\input\\CluCalcTransformer.g:292:9: sign= MINUS
                    {
                    sign=(CommonTree)match(input,MINUS,FOLLOW_MINUS_in_decimal_literal1299); 

                    }
                    break;

            }

            val=(CommonTree)match(input,DECIMAL_LITERAL,FOLLOW_DECIMAL_LITERAL_in_decimal_literal1304); 
            result = new String((sign!=null?(sign!=null?sign.getText():null):"") + (val!=null?val.getText():null));

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return result;
    }
    // $ANTLR end "decimal_literal"

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    static final String DFA2_eotS =
        "\31\uffff";
    static final String DFA2_eofS =
        "\31\uffff";
    static final String DFA2_minS =
        "\1\4\1\2\2\uffff\1\2\10\uffff\1\2\2\uffff\1\4\1\41\1\3\6\uffff";
    static final String DFA2_maxS =
        "\1\117\1\2\2\uffff\1\2\10\uffff\1\2\2\uffff\1\112\1\47\1\112\6"+
        "\uffff";
    static final String DFA2_acceptS =
        "\2\uffff\1\3\1\4\1\uffff\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16"+
        "\1\uffff\1\21\1\22\3\uffff\1\1\1\2\1\5\1\6\1\20\1\17";
    static final String DFA2_specialS =
        "\31\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\17\2\uffff\1\17\4\uffff\1\17\1\3\1\2\1\7\1\uffff\1\10\1"+
            "\11\16\uffff\1\17\3\uffff\1\13\1\uffff\1\5\1\uffff\3\17\7\uffff"+
            "\1\17\1\uffff\1\17\1\uffff\2\17\1\1\1\4\10\17\1\uffff\3\17\1"+
            "\6\1\uffff\1\12\1\17\1\uffff\1\14\1\uffff\1\15\1\16",
            "\1\20",
            "",
            "",
            "\1\21",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\22",
            "",
            "",
            "\1\24\2\uffff\1\24\4\uffff\1\24\24\uffff\1\24\5\uffff\1\23"+
            "\1\uffff\3\24\7\uffff\1\24\1\uffff\1\24\1\uffff\2\24\2\uffff"+
            "\10\24\1\uffff\3\24\3\uffff\1\24",
            "\1\26\5\uffff\1\25",
            "\2\30\2\uffff\1\30\4\uffff\1\30\11\uffff\11\27\2\uffff\1\30"+
            "\7\uffff\3\30\7\uffff\1\30\1\uffff\1\30\1\uffff\2\30\2\uffff"+
            "\10\30\1\uffff\3\30\3\uffff\1\30",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "51:1: statement returns [ArrayList<SequentialNode> nodes] : ( ^( QUESTIONMARK assignment ) | ^( QUESTIONMARK value= expression ) | IPNS | OPNS | ^( COLON assignment ) | ^( COLON id= variableOrConstant ) | assignment | block | if_statement | loop | BREAK | macro | pragma | slider | ^( COLOR arguments ) | ^( COLOR name= ( BLACK | BLUE | CYAN | GREEN | MAGENTA | ORANGE | RED | WHITE | YELLOW ) ) | ^( BGCOLOR arguments ) | expression );";
        }
    }
 

    public static final BitSet FOLLOW_statement_in_script64 = new BitSet(new long[]{0xFFA80EA20006F092L,0x000000000000D6F7L});
    public static final BitSet FOLLOW_QUESTIONMARK_in_statement87 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_assignment_in_statement89 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_QUESTIONMARK_in_statement101 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_statement105 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IPNS_in_statement115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPNS_in_statement124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLON_in_statement136 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_assignment_in_statement138 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_COLON_in_statement149 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_variableOrConstant_in_statement153 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_assignment_in_statement165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_statement174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_statement_in_statement183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_loop_in_statement192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BREAK_in_statement201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_macro_in_statement210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pragma_in_statement217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_slider_in_statement226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLOR_in_statement236 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_arguments_in_statement238 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_COLOR_in_statement253 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_set_in_statement257 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BGCOLOR_in_statement306 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_arguments_in_statement308 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_expression_in_statement320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MACRO_in_macro350 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_macro354 = new BitSet(new long[]{0xFFA80EA20006F090L,0x000000000000D6F7L});
    public static final BitSet FOLLOW_statement_list_in_macro360 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000800L});
    public static final BitSet FOLLOW_return_value_in_macro364 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_RETURN_in_return_value388 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_return_value392 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PRAGMA_in_pragma409 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RANGE_LITERAL_in_pragma411 = new BitSet(new long[]{0x0000000000001080L});
    public static final BitSet FOLLOW_float_literal_in_pragma415 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_LESS_OR_EQUAL_in_pragma417 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_pragma421 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_LESS_OR_EQUAL_in_pragma423 = new BitSet(new long[]{0x0000000000001080L});
    public static final BitSet FOLLOW_float_literal_in_pragma427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQUALS_in_assignment451 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_variable_in_assignment455 = new BitSet(new long[]{0xFFA80EA20006F098L,0x000000000000D6F7L});
    public static final BitSet FOLLOW_expression_in_assignment459 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_variableOrConstant_in_variable478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_if_statement512 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_if_statement516 = new BitSet(new long[]{0xFFA80EA20007F098L,0x000000000000D7F7L});
    public static final BitSet FOLLOW_statement_in_if_statement520 = new BitSet(new long[]{0x0000000000010008L,0x0000000000000100L});
    public static final BitSet FOLLOW_else_statement_in_if_statement524 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ELSE_in_else_statement562 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_block_in_else_statement564 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ELSEIF_in_else_statement574 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_if_statement_in_else_statement576 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LOOP_in_loop599 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_statement_in_loop603 = new BitSet(new long[]{0x0000000000000018L});
    public static final BitSet FOLLOW_DECIMAL_LITERAL_in_loop607 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BLOCK_in_block645 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_statement_list_in_block649 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_statement_in_statement_list682 = new BitSet(new long[]{0xFFA80EA20006F092L,0x000000000000D6F7L});
    public static final BitSet FOLLOW_SLIDER_in_slider702 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_variable_in_slider706 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_slider_args_in_slider710 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_slider_args736 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_COMMA_in_slider_args738 = new BitSet(new long[]{0x0000000000001090L});
    public static final BitSet FOLLOW_constant_in_slider_args742 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_COMMA_in_slider_args744 = new BitSet(new long[]{0x0000000000001090L});
    public static final BitSet FOLLOW_constant_in_slider_args748 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_COMMA_in_slider_args750 = new BitSet(new long[]{0x0000000000001090L});
    public static final BitSet FOLLOW_constant_in_slider_args754 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_COMMA_in_slider_args756 = new BitSet(new long[]{0x0000000000001090L});
    public static final BitSet FOLLOW_constant_in_slider_args760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_decimal_literal_in_constant783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_float_literal_in_constant791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUS_in_expression814 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression818 = new BitSet(new long[]{0xFFA80EA20006F098L,0x000000000000D6F7L});
    public static final BitSet FOLLOW_expression_in_expression822 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MINUS_in_expression833 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression837 = new BitSet(new long[]{0xFFA80EA20006F098L,0x000000000000D6F7L});
    public static final BitSet FOLLOW_expression_in_expression841 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STAR_in_expression852 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression856 = new BitSet(new long[]{0xFFA80EA20006F098L,0x000000000000D6F7L});
    public static final BitSet FOLLOW_expression_in_expression860 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SLASH_in_expression871 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression875 = new BitSet(new long[]{0xFFA80EA20006F098L,0x000000000000D6F7L});
    public static final BitSet FOLLOW_expression_in_expression879 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DOUBLE_BAR_in_expression891 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression895 = new BitSet(new long[]{0xFFA80EA20006F098L,0x000000000000D6F7L});
    public static final BitSet FOLLOW_expression_in_expression899 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DOUBLE_AND_in_expression912 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression916 = new BitSet(new long[]{0xFFA80EA20006F098L,0x000000000000D6F7L});
    public static final BitSet FOLLOW_expression_in_expression920 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DOUBLE_EQUALS_in_expression932 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression936 = new BitSet(new long[]{0xFFA80EA20006F098L,0x000000000000D6F7L});
    public static final BitSet FOLLOW_expression_in_expression940 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNEQUAL_in_expression952 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression956 = new BitSet(new long[]{0xFFA80EA20006F098L,0x000000000000D6F7L});
    public static final BitSet FOLLOW_expression_in_expression960 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LESS_in_expression972 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression976 = new BitSet(new long[]{0xFFA80EA20006F098L,0x000000000000D6F7L});
    public static final BitSet FOLLOW_expression_in_expression980 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GREATER_in_expression992 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression996 = new BitSet(new long[]{0xFFA80EA20006F098L,0x000000000000D6F7L});
    public static final BitSet FOLLOW_expression_in_expression1000 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LESS_OR_EQUAL_in_expression1013 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1017 = new BitSet(new long[]{0xFFA80EA20006F098L,0x000000000000D6F7L});
    public static final BitSet FOLLOW_expression_in_expression1021 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GREATER_OR_EQUAL_in_expression1033 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1037 = new BitSet(new long[]{0xFFA80EA20006F098L,0x000000000000D6F7L});
    public static final BitSet FOLLOW_expression_in_expression1041 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_WEDGE_in_expression1052 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1056 = new BitSet(new long[]{0xFFA80EA20006F098L,0x000000000000D6F7L});
    public static final BitSet FOLLOW_expression_in_expression1060 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DOT_in_expression1071 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1075 = new BitSet(new long[]{0xFFA80EA20006F098L,0x000000000000D6F7L});
    public static final BitSet FOLLOW_expression_in_expression1079 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NEGATION_in_expression1090 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1094 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DUAL_in_expression1105 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1109 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_REVERSE_in_expression1121 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1125 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DOUBLE_NOT_in_expression1136 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1140 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FUNCTION_in_expression1151 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_expression1155 = new BitSet(new long[]{0xFFA80EA20006F090L,0x000000000000D6F7L});
    public static final BitSet FOLLOW_arguments_in_expression1157 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DECIMAL_LITERAL_in_expression1169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOATING_POINT_LITERAL_in_expression1180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARGUMENT_in_expression1190 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DECIMAL_LITERAL_in_expression1194 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_variableOrConstant_in_expression1204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_variableOrConstant1223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_arguments1250 = new BitSet(new long[]{0xFFA80EA20006F092L,0x000000000000D6F7L});
    public static final BitSet FOLLOW_MINUS_in_float_literal1272 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_FLOATING_POINT_LITERAL_in_float_literal1277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_decimal_literal1299 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_DECIMAL_LITERAL_in_decimal_literal1304 = new BitSet(new long[]{0x0000000000000002L});

}