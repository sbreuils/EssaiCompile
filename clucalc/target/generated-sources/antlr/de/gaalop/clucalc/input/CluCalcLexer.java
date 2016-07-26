// $ANTLR 3.1.1 de\\gaalop\\clucalc\\input\\CluCalcLexer.g 2016-07-22 23:31:07

	package de.gaalop.clucalc.input;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class CluCalcLexer extends Lexer {
    public static final int LETTER=31;
    public static final int UNROLL_LITERAL=9;
    public static final int LOOP=17;
    public static final int BGCOLOR_LITERAL=21;
    public static final int IPNS=14;
    public static final int MINUS=12;
    public static final int GREATER_OR_EQUAL=66;
    public static final int SEMICOLON=54;
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
    public static final int DOUBLE_NOT=53;
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
    public static final int COMMENT=36;
    public static final int RSBRACKET=46;
    public static final int QUESTIONMARK=57;
    public static final int REFERENCE_OPERATOR=67;
    public static final int IDENTIFIER=33;
    public static final int WS=35;
    public static final int EOF=-1;
    public static final int ORANGE=27;
    public static final int COMMA=40;
    public static final int WHITE=29;
    public static final int EQUALS=39;
    public static final int UNEQUAL=62;
    public static final int FLOATING_POINT_LITERAL=7;
    public static final int SLASH=43;
    public static final int GREATER=64;
    public static final int LBRACKET=47;
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
    public static final int EXPONENT=5;
    public static final int STRING_LITERAL=11;
    public static final int WEDGE=55;
    public static final int DECIMAL_LITERAL=4;

    // delegates
    // delegators

    public CluCalcLexer() {;} 
    public CluCalcLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public CluCalcLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "de\\gaalop\\clucalc\\input\\CluCalcLexer.g"; }

    // $ANTLR start "DECIMAL_LITERAL"
    public final void mDECIMAL_LITERAL() throws RecognitionException {
        try {
            int _type = DECIMAL_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:12:17: ( ( '0' .. '9' )+ )
            // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:12:19: ( '0' .. '9' )+
            {
            // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:12:19: ( '0' .. '9' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:12:20: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DECIMAL_LITERAL"

    // $ANTLR start "FLOATING_POINT_LITERAL"
    public final void mFLOATING_POINT_LITERAL() throws RecognitionException {
        try {
            int _type = FLOATING_POINT_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:15:5: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? ( FLOATTYPESUFFIX )? | '.' ( '0' .. '9' )+ ( EXPONENT )? ( FLOATTYPESUFFIX )? | ( '0' .. '9' )+ EXPONENT ( FLOATTYPESUFFIX )? | ( '0' .. '9' )+ FLOATTYPESUFFIX )
            int alt12=4;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:15:9: ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? ( FLOATTYPESUFFIX )?
                    {
                    // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:15:9: ( '0' .. '9' )+
                    int cnt2=0;
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:15:10: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt2 >= 1 ) break loop2;
                                EarlyExitException eee =
                                    new EarlyExitException(2, input);
                                throw eee;
                        }
                        cnt2++;
                    } while (true);

                    match('.'); 
                    // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:15:25: ( '0' .. '9' )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:15:26: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:15:37: ( EXPONENT )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0=='e') ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:15:37: EXPONENT
                            {
                            mEXPONENT(); 

                            }
                            break;

                    }

                    // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:15:47: ( FLOATTYPESUFFIX )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0=='d'||LA5_0=='f') ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:15:47: FLOATTYPESUFFIX
                            {
                            mFLOATTYPESUFFIX(); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:16:9: '.' ( '0' .. '9' )+ ( EXPONENT )? ( FLOATTYPESUFFIX )?
                    {
                    match('.'); 
                    // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:16:13: ( '0' .. '9' )+
                    int cnt6=0;
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:16:14: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt6 >= 1 ) break loop6;
                                EarlyExitException eee =
                                    new EarlyExitException(6, input);
                                throw eee;
                        }
                        cnt6++;
                    } while (true);

                    // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:16:25: ( EXPONENT )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0=='e') ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:16:25: EXPONENT
                            {
                            mEXPONENT(); 

                            }
                            break;

                    }

                    // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:16:35: ( FLOATTYPESUFFIX )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0=='d'||LA8_0=='f') ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:16:35: FLOATTYPESUFFIX
                            {
                            mFLOATTYPESUFFIX(); 

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:17:9: ( '0' .. '9' )+ EXPONENT ( FLOATTYPESUFFIX )?
                    {
                    // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:17:9: ( '0' .. '9' )+
                    int cnt9=0;
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( ((LA9_0>='0' && LA9_0<='9')) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:17:10: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt9 >= 1 ) break loop9;
                                EarlyExitException eee =
                                    new EarlyExitException(9, input);
                                throw eee;
                        }
                        cnt9++;
                    } while (true);

                    mEXPONENT(); 
                    // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:17:30: ( FLOATTYPESUFFIX )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='d'||LA10_0=='f') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:17:30: FLOATTYPESUFFIX
                            {
                            mFLOATTYPESUFFIX(); 

                            }
                            break;

                    }


                    }
                    break;
                case 4 :
                    // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:18:9: ( '0' .. '9' )+ FLOATTYPESUFFIX
                    {
                    // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:18:9: ( '0' .. '9' )+
                    int cnt11=0;
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( ((LA11_0>='0' && LA11_0<='9')) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:18:10: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt11 >= 1 ) break loop11;
                                EarlyExitException eee =
                                    new EarlyExitException(11, input);
                                throw eee;
                        }
                        cnt11++;
                    } while (true);

                    mFLOATTYPESUFFIX(); 

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FLOATING_POINT_LITERAL"

    // $ANTLR start "RANGE_LITERAL"
    public final void mRANGE_LITERAL() throws RecognitionException {
        try {
            int _type = RANGE_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:21:15: ( 'range' )
            // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:21:17: 'range'
            {
            match("range"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RANGE_LITERAL"

    // $ANTLR start "UNROLL_LITERAL"
    public final void mUNROLL_LITERAL() throws RecognitionException {
        try {
            int _type = UNROLL_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:23:15: ( 'unroll' )
            // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:23:17: 'unroll'
            {
            match("unroll"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "UNROLL_LITERAL"

    // $ANTLR start "COUNT_LITERAL"
    public final void mCOUNT_LITERAL() throws RecognitionException {
        try {
            int _type = COUNT_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:25:14: ( 'count' )
            // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:25:16: 'count'
            {
            match("count"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COUNT_LITERAL"

    // $ANTLR start "STRING_LITERAL"
    public final void mSTRING_LITERAL() throws RecognitionException {
        try {
            int _type = STRING_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:28:5: ( '\"' (~ ( '\\\\' | '\"' ) )* '\"' )
            // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:28:8: '\"' (~ ( '\\\\' | '\"' ) )* '\"'
            {
            match('\"'); 
            // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:28:12: (~ ( '\\\\' | '\"' ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\u0000' && LA13_0<='!')||(LA13_0>='#' && LA13_0<='[')||(LA13_0>=']' && LA13_0<='\uFFFF')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:28:14: ~ ( '\\\\' | '\"' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STRING_LITERAL"

    // $ANTLR start "EXPONENT"
    public final void mEXPONENT() throws RecognitionException {
        try {
            // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:33:2: ( 'e' ( MINUS )? ( '0' .. '9' )+ )
            // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:33:4: 'e' ( MINUS )? ( '0' .. '9' )+
            {
            match('e'); 
            // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:33:8: ( MINUS )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='-') ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:33:8: MINUS
                    {
                    mMINUS(); 

                    }
                    break;

            }

            // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:33:15: ( '0' .. '9' )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='0' && LA15_0<='9')) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:33:16: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "EXPONENT"

    // $ANTLR start "FLOATTYPESUFFIX"
    public final void mFLOATTYPESUFFIX() throws RecognitionException {
        try {
            // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:38:2: ( ( 'f' | 'd' ) )
            // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:38:4: ( 'f' | 'd' )
            {
            if ( input.LA(1)=='d'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "FLOATTYPESUFFIX"

    // $ANTLR start "OPNS"
    public final void mOPNS() throws RecognitionException {
        try {
            int _type = OPNS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:45:3: ( 'OPNS' )
            // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:45:5: 'OPNS'
            {
            match("OPNS"); 


            }

            state.type = _type;
            state.channel = _channel;

                throw new IllegalArgumentException("OPNS is currently not supported by the Maple backend. Please use the IPNS.");
                  }
        finally {
        }
    }
    // $ANTLR end "OPNS"

    // $ANTLR start "IPNS"
    public final void mIPNS() throws RecognitionException {
        try {
            int _type = IPNS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:48:6: ( 'IPNS' )
            // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:48:8: 'IPNS'
            {
            match("IPNS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IPNS"

    // $ANTLR start "IF"
    public final void mIF() throws RecognitionException {
        try {
            int _type = IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:51:5: ( 'if' )
            // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:51:7: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IF"

    // $ANTLR start "ELSE"
    public final void mELSE() throws RecognitionException {
        try {
            int _type = ELSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:54:6: ( 'else' )
            // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:54:8: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ELSE"

    // $ANTLR start "LOOP"
    public final void mLOOP() throws RecognitionException {
        try {
            int _type = LOOP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:57:7: ( 'loop' )
            // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:57:9: 'loop'
            {
            match("loop"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LOOP"

    // $ANTLR start "BREAK"
    public final void mBREAK() throws RecognitionException {
        try {
            int _type = BREAK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:60:7: ( 'break' )
            // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:60:9: 'break'
            {
            match("break"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BREAK"

    // $ANTLR start "SLIDER_LITERAL"
    public final void mSLIDER_LITERAL() throws RecognitionException {
        try {
            int _type = SLIDER_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:63:16: ( 'Slider' )
            // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:63:18: 'Slider'
            {
            match("Slider"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SLIDER_LITERAL"

    // $ANTLR start "COLOR_LITERAL"
    public final void mCOLOR_LITERAL() throws RecognitionException {
        try {
            int _type = COLOR_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:66:15: ( 'Color' )
            // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:66:18: 'Color'
            {
            match("Color"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COLOR_LITERAL"

    // $ANTLR start "BGCOLOR_LITERAL"
    public final void mBGCOLOR_LITERAL() throws RecognitionException {
        try {
            int _type = BGCOLOR_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:69:17: ( '_BGColor' )
            // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:69:19: '_BGColor'
            {
            match("_BGColor"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BGCOLOR_LITERAL"

    // $ANTLR start "BLACK"
    public final void mBLACK() throws RecognitionException {
        try {
            int _type = BLACK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:72:7: ( 'Black' )
            // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:72:9: 'Black'
            {
            match("Black"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BLACK"

    // $ANTLR start "BLUE"
    public final void mBLUE() throws RecognitionException {
        try {
            int _type = BLUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:73:6: ( 'Blue' )
            // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:73:8: 'Blue'
            {
            match("Blue"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BLUE"

    // $ANTLR start "CYAN"
    public final void mCYAN() throws RecognitionException {
        try {
            int _type = CYAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:74:6: ( 'Cyan' )
            // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:74:8: 'Cyan'
            {
            match("Cyan"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CYAN"

    // $ANTLR start "GREEN"
    public final void mGREEN() throws RecognitionException {
        try {
            int _type = GREEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:75:7: ( 'Green' )
            // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:75:9: 'Green'
            {
            match("Green"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GREEN"

    // $ANTLR start "MAGENTA"
    public final void mMAGENTA() throws RecognitionException {
        try {
            int _type = MAGENTA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:76:9: ( 'Magenta' )
            // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:76:11: 'Magenta'
            {
            match("Magenta"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MAGENTA"

    // $ANTLR start "ORANGE"
    public final void mORANGE() throws RecognitionException {
        try {
            int _type = ORANGE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:77:8: ( 'Orange' )
            // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:77:10: 'Orange'
            {
            match("Orange"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ORANGE"

    // $ANTLR start "RED"
    public final void mRED() throws RecognitionException {
        try {
            int _type = RED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:78:5: ( 'Red' )
            // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:78:7: 'Red'
            {
            match("Red"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RED"

    // $ANTLR start "WHITE"
    public final void mWHITE() throws RecognitionException {
        try {
            int _type = WHITE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:79:7: ( 'White' )
            // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:79:9: 'White'
            {
            match("White"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WHITE"

    // $ANTLR start "YELLOW"
    public final void mYELLOW() throws RecognitionException {
        try {
            int _type = YELLOW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:80:8: ( 'Yellow' )
            // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:80:10: 'Yellow'
            {
            match("Yellow"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "YELLOW"

    // $ANTLR start "IDENTIFIER"
    public final void mIDENTIFIER() throws RecognitionException {
        try {
            int _type = IDENTIFIER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:84:2: ( ( '::' )? LETTER ( LETTER | DIGIT )* )
            // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:84:4: ( '::' )? LETTER ( LETTER | DIGIT )*
            {
            // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:84:4: ( '::' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==':') ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:84:5: '::'
                    {
                    match("::"); 


                    }
                    break;

            }

            mLETTER(); 
            // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:84:19: ( LETTER | DIGIT )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0=='$'||(LA17_0>='0' && LA17_0<='9')||(LA17_0>='A' && LA17_0<='Z')||LA17_0=='_'||(LA17_0>='a' && LA17_0<='z')) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:
            	    {
            	    if ( input.LA(1)=='$'||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IDENTIFIER"

    // $ANTLR start "ARGUMENT_PREFIX"
    public final void mARGUMENT_PREFIX() throws RecognitionException {
        try {
            int _type = ARGUMENT_PREFIX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:88:3: ( '_P(' )
            // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:88:5: '_P('
            {
            match("_P("); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ARGUMENT_PREFIX"

    // $ANTLR start "LETTER"
    public final void mLETTER() throws RecognitionException {
        try {
            // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:93:2: ( 'A' .. 'Z' | 'a' .. 'z' | '_' | '$' )
            // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:
            {
            if ( input.LA(1)=='$'||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "LETTER"

    // $ANTLR start "DIGIT"
    public final void mDIGIT() throws RecognitionException {
        try {
            // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:100:7: ( '0' .. '9' )
            // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:100:9: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "DIGIT"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:103:5: ( ( ' ' | '\\r' | '\\t' | '\\u000C' | '\\n' ) )
            // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:103:8: ( ' ' | '\\r' | '\\t' | '\\u000C' | '\\n' )
            {
            if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||(input.LA(1)>='\f' && input.LA(1)<='\r')||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:107:5: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:107:9: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:107:14: ( options {greedy=false; } : . )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0=='*') ) {
                    int LA18_1 = input.LA(2);

                    if ( (LA18_1=='/') ) {
                        alt18=2;
                    }
                    else if ( ((LA18_1>='\u0000' && LA18_1<='.')||(LA18_1>='0' && LA18_1<='\uFFFF')) ) {
                        alt18=1;
                    }


                }
                else if ( ((LA18_0>='\u0000' && LA18_0<=')')||(LA18_0>='+' && LA18_0<='\uFFFF')) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:107:42: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            match("*/"); 

            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "PRAGMA"
    public final void mPRAGMA() throws RecognitionException {
        try {
            int _type = PRAGMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:113:5: ( '//#pragma' )
            // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:113:9: '//#pragma'
            {
            match("//#pragma"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PRAGMA"

    // $ANTLR start "LINE_COMMENT"
    public final void mLINE_COMMENT() throws RecognitionException {
        try {
            int _type = LINE_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:117:5: ( '//' ~ '#' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' )
            // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:117:7: '//' ~ '#' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
            {
            match("//"); 

            if ( (input.LA(1)>='\u0000' && input.LA(1)<='\"')||(input.LA(1)>='$' && input.LA(1)<='\uFFFF') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:117:17: (~ ( '\\n' | '\\r' ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>='\u0000' && LA19_0<='\t')||(LA19_0>='\u000B' && LA19_0<='\f')||(LA19_0>='\u000E' && LA19_0<='\uFFFF')) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:117:17: ~ ( '\\n' | '\\r' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:117:31: ( '\\r' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0=='\r') ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:117:31: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }

            match('\n'); 
            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LINE_COMMENT"

    // $ANTLR start "EQUALS"
    public final void mEQUALS() throws RecognitionException {
        try {
            int _type = EQUALS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:121:2: ( '=' )
            // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:121:4: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EQUALS"

    // $ANTLR start "COMMA"
    public final void mCOMMA() throws RecognitionException {
        try {
            int _type = COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:126:2: ( ',' )
            // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:126:4: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMA"

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:130:2: ( '+' )
            // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:130:4: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PLUS"

    // $ANTLR start "MINUS"
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:134:2: ( '-' )
            // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:134:4: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MINUS"

    // $ANTLR start "STAR"
    public final void mSTAR() throws RecognitionException {
        try {
            int _type = STAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:139:2: ( '*' )
            // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:139:4: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STAR"

    // $ANTLR start "SLASH"
    public final void mSLASH() throws RecognitionException {
        try {
            int _type = SLASH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:143:2: ( '/' )
            // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:143:4: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SLASH"

    // $ANTLR start "MODULO"
    public final void mMODULO() throws RecognitionException {
        try {
            int _type = MODULO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:147:2: ( '%' )
            // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:147:4: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MODULO"

    // $ANTLR start "LSBRACKET"
    public final void mLSBRACKET() throws RecognitionException {
        try {
            int _type = LSBRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:151:2: ( '[' )
            // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:151:4: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LSBRACKET"

    // $ANTLR start "RSBRACKET"
    public final void mRSBRACKET() throws RecognitionException {
        try {
            int _type = RSBRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:155:2: ( ']' )
            // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:155:4: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RSBRACKET"

    // $ANTLR start "LBRACKET"
    public final void mLBRACKET() throws RecognitionException {
        try {
            int _type = LBRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:159:2: ( '(' )
            // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:159:4: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LBRACKET"

    // $ANTLR start "RBRACKET"
    public final void mRBRACKET() throws RecognitionException {
        try {
            int _type = RBRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:163:2: ( ')' )
            // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:163:4: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RBRACKET"

    // $ANTLR start "CLBRACKET"
    public final void mCLBRACKET() throws RecognitionException {
        try {
            int _type = CLBRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:167:2: ( '{' )
            // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:167:4: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CLBRACKET"

    // $ANTLR start "CRBRACKET"
    public final void mCRBRACKET() throws RecognitionException {
        try {
            int _type = CRBRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:171:2: ( '}' )
            // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:171:4: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CRBRACKET"

    // $ANTLR start "REVERSE"
    public final void mREVERSE() throws RecognitionException {
        try {
            int _type = REVERSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:175:2: ( '~' )
            // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:175:4: '~'
            {
            match('~'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "REVERSE"

    // $ANTLR start "NOT"
    public final void mNOT() throws RecognitionException {
        try {
            int _type = NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:179:2: ( '!' )
            // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:179:4: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NOT"

    // $ANTLR start "DOUBLE_NOT"
    public final void mDOUBLE_NOT() throws RecognitionException {
        try {
            int _type = DOUBLE_NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:183:2: ( '!!' )
            // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:183:4: '!!'
            {
            match("!!"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DOUBLE_NOT"

    // $ANTLR start "SEMICOLON"
    public final void mSEMICOLON() throws RecognitionException {
        try {
            int _type = SEMICOLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:187:2: ( ';' )
            // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:187:4: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SEMICOLON"

    // $ANTLR start "WEDGE"
    public final void mWEDGE() throws RecognitionException {
        try {
            int _type = WEDGE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:190:7: ( '^' )
            // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:190:9: '^'
            {
            match('^'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WEDGE"

    // $ANTLR start "DOT"
    public final void mDOT() throws RecognitionException {
        try {
            int _type = DOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:193:5: ( '.' )
            // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:193:7: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DOT"

    // $ANTLR start "QUESTIONMARK"
    public final void mQUESTIONMARK() throws RecognitionException {
        try {
            int _type = QUESTIONMARK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:198:2: ( '?' )
            // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:198:4: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "QUESTIONMARK"

    // $ANTLR start "COLON"
    public final void mCOLON() throws RecognitionException {
        try {
            int _type = COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:202:2: ( ':' )
            // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:202:4: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COLON"

    // $ANTLR start "DOUBLE_BAR"
    public final void mDOUBLE_BAR() throws RecognitionException {
        try {
            int _type = DOUBLE_BAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:206:2: ( '||' )
            // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:206:5: '||'
            {
            match("||"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DOUBLE_BAR"

    // $ANTLR start "DOUBLE_AND"
    public final void mDOUBLE_AND() throws RecognitionException {
        try {
            int _type = DOUBLE_AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:210:2: ( '&&' )
            // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:210:4: '&&'
            {
            match("&&"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DOUBLE_AND"

    // $ANTLR start "DOUBLE_EQUALS"
    public final void mDOUBLE_EQUALS() throws RecognitionException {
        try {
            int _type = DOUBLE_EQUALS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:214:2: ( '==' )
            // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:214:4: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DOUBLE_EQUALS"

    // $ANTLR start "UNEQUAL"
    public final void mUNEQUAL() throws RecognitionException {
        try {
            int _type = UNEQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:218:2: ( '!=' )
            // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:218:4: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "UNEQUAL"

    // $ANTLR start "LESS"
    public final void mLESS() throws RecognitionException {
        try {
            int _type = LESS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:222:2: ( '<' )
            // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:222:4: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LESS"

    // $ANTLR start "GREATER"
    public final void mGREATER() throws RecognitionException {
        try {
            int _type = GREATER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:226:2: ( '>' )
            // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:226:5: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GREATER"

    // $ANTLR start "LESS_OR_EQUAL"
    public final void mLESS_OR_EQUAL() throws RecognitionException {
        try {
            int _type = LESS_OR_EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:230:2: ( '<=' )
            // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:230:4: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LESS_OR_EQUAL"

    // $ANTLR start "GREATER_OR_EQUAL"
    public final void mGREATER_OR_EQUAL() throws RecognitionException {
        try {
            int _type = GREATER_OR_EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:234:2: ( '>=' )
            // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:234:4: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GREATER_OR_EQUAL"

    // $ANTLR start "REFERENCE_OPERATOR"
    public final void mREFERENCE_OPERATOR() throws RecognitionException {
        try {
            int _type = REFERENCE_OPERATOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:241:3: ( '->' )
            // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:241:5: '->'
            {
            match("->"); 


            }

            state.type = _type;
            state.channel = _channel;
             
                throw new IllegalArgumentException("The reference operator (->) is not supported. Please use standard assignments instead."); 
                  }
        finally {
        }
    }
    // $ANTLR end "REFERENCE_OPERATOR"

    public void mTokens() throws RecognitionException {
        // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:1:8: ( DECIMAL_LITERAL | FLOATING_POINT_LITERAL | RANGE_LITERAL | UNROLL_LITERAL | COUNT_LITERAL | STRING_LITERAL | OPNS | IPNS | IF | ELSE | LOOP | BREAK | SLIDER_LITERAL | COLOR_LITERAL | BGCOLOR_LITERAL | BLACK | BLUE | CYAN | GREEN | MAGENTA | ORANGE | RED | WHITE | YELLOW | IDENTIFIER | ARGUMENT_PREFIX | WS | COMMENT | PRAGMA | LINE_COMMENT | EQUALS | COMMA | PLUS | MINUS | STAR | SLASH | MODULO | LSBRACKET | RSBRACKET | LBRACKET | RBRACKET | CLBRACKET | CRBRACKET | REVERSE | NOT | DOUBLE_NOT | SEMICOLON | WEDGE | DOT | QUESTIONMARK | COLON | DOUBLE_BAR | DOUBLE_AND | DOUBLE_EQUALS | UNEQUAL | LESS | GREATER | LESS_OR_EQUAL | GREATER_OR_EQUAL | REFERENCE_OPERATOR )
        int alt21=60;
        alt21 = dfa21.predict(input);
        switch (alt21) {
            case 1 :
                // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:1:10: DECIMAL_LITERAL
                {
                mDECIMAL_LITERAL(); 

                }
                break;
            case 2 :
                // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:1:26: FLOATING_POINT_LITERAL
                {
                mFLOATING_POINT_LITERAL(); 

                }
                break;
            case 3 :
                // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:1:49: RANGE_LITERAL
                {
                mRANGE_LITERAL(); 

                }
                break;
            case 4 :
                // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:1:63: UNROLL_LITERAL
                {
                mUNROLL_LITERAL(); 

                }
                break;
            case 5 :
                // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:1:78: COUNT_LITERAL
                {
                mCOUNT_LITERAL(); 

                }
                break;
            case 6 :
                // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:1:92: STRING_LITERAL
                {
                mSTRING_LITERAL(); 

                }
                break;
            case 7 :
                // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:1:107: OPNS
                {
                mOPNS(); 

                }
                break;
            case 8 :
                // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:1:112: IPNS
                {
                mIPNS(); 

                }
                break;
            case 9 :
                // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:1:117: IF
                {
                mIF(); 

                }
                break;
            case 10 :
                // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:1:120: ELSE
                {
                mELSE(); 

                }
                break;
            case 11 :
                // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:1:125: LOOP
                {
                mLOOP(); 

                }
                break;
            case 12 :
                // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:1:130: BREAK
                {
                mBREAK(); 

                }
                break;
            case 13 :
                // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:1:136: SLIDER_LITERAL
                {
                mSLIDER_LITERAL(); 

                }
                break;
            case 14 :
                // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:1:151: COLOR_LITERAL
                {
                mCOLOR_LITERAL(); 

                }
                break;
            case 15 :
                // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:1:165: BGCOLOR_LITERAL
                {
                mBGCOLOR_LITERAL(); 

                }
                break;
            case 16 :
                // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:1:181: BLACK
                {
                mBLACK(); 

                }
                break;
            case 17 :
                // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:1:187: BLUE
                {
                mBLUE(); 

                }
                break;
            case 18 :
                // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:1:192: CYAN
                {
                mCYAN(); 

                }
                break;
            case 19 :
                // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:1:197: GREEN
                {
                mGREEN(); 

                }
                break;
            case 20 :
                // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:1:203: MAGENTA
                {
                mMAGENTA(); 

                }
                break;
            case 21 :
                // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:1:211: ORANGE
                {
                mORANGE(); 

                }
                break;
            case 22 :
                // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:1:218: RED
                {
                mRED(); 

                }
                break;
            case 23 :
                // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:1:222: WHITE
                {
                mWHITE(); 

                }
                break;
            case 24 :
                // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:1:228: YELLOW
                {
                mYELLOW(); 

                }
                break;
            case 25 :
                // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:1:235: IDENTIFIER
                {
                mIDENTIFIER(); 

                }
                break;
            case 26 :
                // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:1:246: ARGUMENT_PREFIX
                {
                mARGUMENT_PREFIX(); 

                }
                break;
            case 27 :
                // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:1:262: WS
                {
                mWS(); 

                }
                break;
            case 28 :
                // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:1:265: COMMENT
                {
                mCOMMENT(); 

                }
                break;
            case 29 :
                // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:1:273: PRAGMA
                {
                mPRAGMA(); 

                }
                break;
            case 30 :
                // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:1:280: LINE_COMMENT
                {
                mLINE_COMMENT(); 

                }
                break;
            case 31 :
                // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:1:293: EQUALS
                {
                mEQUALS(); 

                }
                break;
            case 32 :
                // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:1:300: COMMA
                {
                mCOMMA(); 

                }
                break;
            case 33 :
                // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:1:306: PLUS
                {
                mPLUS(); 

                }
                break;
            case 34 :
                // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:1:311: MINUS
                {
                mMINUS(); 

                }
                break;
            case 35 :
                // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:1:317: STAR
                {
                mSTAR(); 

                }
                break;
            case 36 :
                // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:1:322: SLASH
                {
                mSLASH(); 

                }
                break;
            case 37 :
                // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:1:328: MODULO
                {
                mMODULO(); 

                }
                break;
            case 38 :
                // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:1:335: LSBRACKET
                {
                mLSBRACKET(); 

                }
                break;
            case 39 :
                // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:1:345: RSBRACKET
                {
                mRSBRACKET(); 

                }
                break;
            case 40 :
                // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:1:355: LBRACKET
                {
                mLBRACKET(); 

                }
                break;
            case 41 :
                // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:1:364: RBRACKET
                {
                mRBRACKET(); 

                }
                break;
            case 42 :
                // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:1:373: CLBRACKET
                {
                mCLBRACKET(); 

                }
                break;
            case 43 :
                // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:1:383: CRBRACKET
                {
                mCRBRACKET(); 

                }
                break;
            case 44 :
                // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:1:393: REVERSE
                {
                mREVERSE(); 

                }
                break;
            case 45 :
                // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:1:401: NOT
                {
                mNOT(); 

                }
                break;
            case 46 :
                // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:1:405: DOUBLE_NOT
                {
                mDOUBLE_NOT(); 

                }
                break;
            case 47 :
                // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:1:416: SEMICOLON
                {
                mSEMICOLON(); 

                }
                break;
            case 48 :
                // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:1:426: WEDGE
                {
                mWEDGE(); 

                }
                break;
            case 49 :
                // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:1:432: DOT
                {
                mDOT(); 

                }
                break;
            case 50 :
                // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:1:436: QUESTIONMARK
                {
                mQUESTIONMARK(); 

                }
                break;
            case 51 :
                // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:1:449: COLON
                {
                mCOLON(); 

                }
                break;
            case 52 :
                // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:1:455: DOUBLE_BAR
                {
                mDOUBLE_BAR(); 

                }
                break;
            case 53 :
                // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:1:466: DOUBLE_AND
                {
                mDOUBLE_AND(); 

                }
                break;
            case 54 :
                // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:1:477: DOUBLE_EQUALS
                {
                mDOUBLE_EQUALS(); 

                }
                break;
            case 55 :
                // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:1:491: UNEQUAL
                {
                mUNEQUAL(); 

                }
                break;
            case 56 :
                // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:1:499: LESS
                {
                mLESS(); 

                }
                break;
            case 57 :
                // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:1:504: GREATER
                {
                mGREATER(); 

                }
                break;
            case 58 :
                // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:1:512: LESS_OR_EQUAL
                {
                mLESS_OR_EQUAL(); 

                }
                break;
            case 59 :
                // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:1:526: GREATER_OR_EQUAL
                {
                mGREATER_OR_EQUAL(); 

                }
                break;
            case 60 :
                // de\\gaalop\\clucalc\\input\\CluCalcLexer.g:1:543: REFERENCE_OPERATOR
                {
                mREFERENCE_OPERATOR(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    protected DFA21 dfa21 = new DFA21(this);
    static final String DFA12_eotS =
        "\6\uffff";
    static final String DFA12_eofS =
        "\6\uffff";
    static final String DFA12_minS =
        "\2\56\4\uffff";
    static final String DFA12_maxS =
        "\1\71\1\146\4\uffff";
    static final String DFA12_acceptS =
        "\2\uffff\1\2\1\4\1\3\1\1";
    static final String DFA12_specialS =
        "\6\uffff}>";
    static final String[] DFA12_transitionS = {
            "\1\2\1\uffff\12\1",
            "\1\5\1\uffff\12\1\52\uffff\1\3\1\4\1\3",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "14:1: FLOATING_POINT_LITERAL : ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? ( FLOATTYPESUFFIX )? | '.' ( '0' .. '9' )+ ( EXPONENT )? ( FLOATTYPESUFFIX )? | ( '0' .. '9' )+ EXPONENT ( FLOATTYPESUFFIX )? | ( '0' .. '9' )+ FLOATTYPESUFFIX );";
        }
    }
    static final String DFA21_eotS =
        "\1\uffff\1\60\1\61\3\27\1\uffff\17\27\1\107\2\uffff\1\112\1\114"+
        "\2\uffff\1\116\11\uffff\1\121\5\uffff\1\123\1\125\3\uffff\6\27\1"+
        "\134\16\27\17\uffff\6\27\1\uffff\7\27\1\uffff\4\27\1\177\2\27\2"+
        "\uffff\3\27\1\u0085\1\27\1\u0087\1\u0088\1\u0089\3\27\1\u008d\2"+
        "\27\1\u0090\2\27\1\uffff\2\27\1\u0095\1\27\1\u0097\1\uffff\1\27"+
        "\3\uffff\1\u0099\1\27\1\u009b\1\uffff\1\27\1\u009d\1\uffff\1\u009e"+
        "\1\27\1\u00a0\1\27\1\uffff\1\u00a2\1\uffff\1\u00a3\1\uffff\1\u00a4"+
        "\1\uffff\1\27\2\uffff\1\27\1\uffff\1\u00a7\3\uffff\1\27\1\u00a9"+
        "\1\uffff\1\u00aa\2\uffff";
    static final String DFA21_eofS =
        "\u00ab\uffff";
    static final String DFA21_minS =
        "\1\11\1\56\1\60\1\141\1\156\1\157\1\uffff\2\120\1\146\1\154\1\157"+
        "\1\162\1\154\1\157\1\102\1\154\1\162\1\141\1\145\1\150\1\145\1\72"+
        "\2\uffff\1\52\1\75\2\uffff\1\76\11\uffff\1\41\5\uffff\2\75\3\uffff"+
        "\1\156\1\162\1\165\1\116\1\141\1\116\1\44\1\163\1\157\1\145\1\151"+
        "\1\154\1\141\1\107\1\50\1\141\1\145\1\147\1\144\1\151\1\154\2\uffff"+
        "\1\0\14\uffff\1\147\1\157\1\156\1\123\1\156\1\123\1\uffff\1\145"+
        "\1\160\1\141\1\144\1\157\1\156\1\103\1\uffff\1\143\3\145\1\44\1"+
        "\164\1\154\2\uffff\1\145\1\154\1\164\1\44\1\147\3\44\1\153\1\145"+
        "\1\162\1\44\1\157\1\153\1\44\2\156\1\uffff\1\145\1\157\1\44\1\154"+
        "\1\44\1\uffff\1\145\3\uffff\1\44\1\162\1\44\1\uffff\1\154\1\44\1"+
        "\uffff\1\44\1\164\1\44\1\167\1\uffff\1\44\1\uffff\1\44\1\uffff\1"+
        "\44\1\uffff\1\157\2\uffff\1\141\1\uffff\1\44\3\uffff\1\162\1\44"+
        "\1\uffff\1\44\2\uffff";
    static final String DFA21_maxS =
        "\1\176\1\146\1\71\1\141\1\156\1\157\1\uffff\1\162\1\120\1\146\1"+
        "\154\1\157\1\162\1\154\1\171\1\120\1\154\1\162\1\141\1\145\1\150"+
        "\1\145\1\72\2\uffff\1\57\1\75\2\uffff\1\76\11\uffff\1\75\5\uffff"+
        "\2\75\3\uffff\1\156\1\162\1\165\1\116\1\141\1\116\1\172\1\163\1"+
        "\157\1\145\1\151\1\154\1\141\1\107\1\50\1\165\1\145\1\147\1\144"+
        "\1\151\1\154\2\uffff\1\uffff\14\uffff\1\147\1\157\1\156\1\123\1"+
        "\156\1\123\1\uffff\1\145\1\160\1\141\1\144\1\157\1\156\1\103\1\uffff"+
        "\1\143\3\145\1\172\1\164\1\154\2\uffff\1\145\1\154\1\164\1\172\1"+
        "\147\3\172\1\153\1\145\1\162\1\172\1\157\1\153\1\172\2\156\1\uffff"+
        "\1\145\1\157\1\172\1\154\1\172\1\uffff\1\145\3\uffff\1\172\1\162"+
        "\1\172\1\uffff\1\154\1\172\1\uffff\1\172\1\164\1\172\1\167\1\uffff"+
        "\1\172\1\uffff\1\172\1\uffff\1\172\1\uffff\1\157\2\uffff\1\141\1"+
        "\uffff\1\172\3\uffff\1\162\1\172\1\uffff\1\172\2\uffff";
    static final String DFA21_acceptS =
        "\6\uffff\1\6\20\uffff\1\31\1\33\2\uffff\1\40\1\41\1\uffff\1\43"+
        "\1\45\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\uffff\1\57\1\60\1\62"+
        "\1\64\1\65\2\uffff\1\2\1\1\1\61\25\uffff\1\63\1\34\1\uffff\1\44"+
        "\1\66\1\37\1\74\1\42\1\56\1\67\1\55\1\72\1\70\1\73\1\71\6\uffff"+
        "\1\11\7\uffff\1\32\7\uffff\1\35\1\36\21\uffff\1\26\5\uffff\1\7\1"+
        "\uffff\1\10\1\12\1\13\3\uffff\1\22\2\uffff\1\21\4\uffff\1\3\1\uffff"+
        "\1\5\1\uffff\1\14\1\uffff\1\16\1\uffff\1\20\1\23\1\uffff\1\27\1"+
        "\uffff\1\4\1\25\1\15\2\uffff\1\30\1\uffff\1\24\1\17";
    static final String DFA21_specialS =
        "\111\uffff\1\0\141\uffff}>";
    static final String[] DFA21_transitionS = {
            "\2\30\1\uffff\2\30\22\uffff\1\30\1\47\1\6\1\uffff\1\27\1\37"+
            "\1\54\1\uffff\1\42\1\43\1\36\1\34\1\33\1\35\1\2\1\31\12\1\1"+
            "\26\1\50\1\55\1\32\1\56\1\52\1\uffff\1\27\1\20\1\16\3\27\1\21"+
            "\1\27\1\10\3\27\1\22\1\27\1\7\2\27\1\23\1\15\3\27\1\24\1\27"+
            "\1\25\1\27\1\40\1\uffff\1\41\1\51\1\17\1\uffff\1\27\1\14\1\5"+
            "\1\27\1\12\3\27\1\11\2\27\1\13\5\27\1\3\2\27\1\4\5\27\1\44\1"+
            "\53\1\45\1\46",
            "\1\57\1\uffff\12\1\52\uffff\3\57",
            "\12\57",
            "\1\62",
            "\1\63",
            "\1\64",
            "",
            "\1\65\41\uffff\1\66",
            "\1\67",
            "\1\70",
            "\1\71",
            "\1\72",
            "\1\73",
            "\1\74",
            "\1\75\11\uffff\1\76",
            "\1\77\15\uffff\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106",
            "\1\27",
            "",
            "",
            "\1\110\4\uffff\1\111",
            "\1\113",
            "",
            "",
            "\1\115",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\117\33\uffff\1\120",
            "",
            "",
            "",
            "",
            "",
            "\1\122",
            "\1\124",
            "",
            "",
            "",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\27\13\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32"+
            "\27",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145\23\uffff\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "",
            "",
            "\43\155\1\154\uffdc\155",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\27\13\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32"+
            "\27",
            "\1\u0080",
            "\1\u0081",
            "",
            "",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\27\13\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32"+
            "\27",
            "\1\u0086",
            "\1\27\13\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32"+
            "\27",
            "\1\27\13\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32"+
            "\27",
            "\1\27\13\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32"+
            "\27",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\27\13\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32"+
            "\27",
            "\1\u008e",
            "\1\u008f",
            "\1\27\13\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32"+
            "\27",
            "\1\u0091",
            "\1\u0092",
            "",
            "\1\u0093",
            "\1\u0094",
            "\1\27\13\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32"+
            "\27",
            "\1\u0096",
            "\1\27\13\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32"+
            "\27",
            "",
            "\1\u0098",
            "",
            "",
            "",
            "\1\27\13\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32"+
            "\27",
            "\1\u009a",
            "\1\27\13\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32"+
            "\27",
            "",
            "\1\u009c",
            "\1\27\13\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32"+
            "\27",
            "",
            "\1\27\13\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32"+
            "\27",
            "\1\u009f",
            "\1\27\13\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32"+
            "\27",
            "\1\u00a1",
            "",
            "\1\27\13\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32"+
            "\27",
            "",
            "\1\27\13\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32"+
            "\27",
            "",
            "\1\27\13\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32"+
            "\27",
            "",
            "\1\u00a5",
            "",
            "",
            "\1\u00a6",
            "",
            "\1\27\13\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32"+
            "\27",
            "",
            "",
            "",
            "\1\u00a8",
            "\1\27\13\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32"+
            "\27",
            "",
            "\1\27\13\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32"+
            "\27",
            "",
            ""
    };

    static final short[] DFA21_eot = DFA.unpackEncodedString(DFA21_eotS);
    static final short[] DFA21_eof = DFA.unpackEncodedString(DFA21_eofS);
    static final char[] DFA21_min = DFA.unpackEncodedStringToUnsignedChars(DFA21_minS);
    static final char[] DFA21_max = DFA.unpackEncodedStringToUnsignedChars(DFA21_maxS);
    static final short[] DFA21_accept = DFA.unpackEncodedString(DFA21_acceptS);
    static final short[] DFA21_special = DFA.unpackEncodedString(DFA21_specialS);
    static final short[][] DFA21_transition;

    static {
        int numStates = DFA21_transitionS.length;
        DFA21_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA21_transition[i] = DFA.unpackEncodedString(DFA21_transitionS[i]);
        }
    }

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = DFA21_eot;
            this.eof = DFA21_eof;
            this.min = DFA21_min;
            this.max = DFA21_max;
            this.accept = DFA21_accept;
            this.special = DFA21_special;
            this.transition = DFA21_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( DECIMAL_LITERAL | FLOATING_POINT_LITERAL | RANGE_LITERAL | UNROLL_LITERAL | COUNT_LITERAL | STRING_LITERAL | OPNS | IPNS | IF | ELSE | LOOP | BREAK | SLIDER_LITERAL | COLOR_LITERAL | BGCOLOR_LITERAL | BLACK | BLUE | CYAN | GREEN | MAGENTA | ORANGE | RED | WHITE | YELLOW | IDENTIFIER | ARGUMENT_PREFIX | WS | COMMENT | PRAGMA | LINE_COMMENT | EQUALS | COMMA | PLUS | MINUS | STAR | SLASH | MODULO | LSBRACKET | RSBRACKET | LBRACKET | RBRACKET | CLBRACKET | CRBRACKET | REVERSE | NOT | DOUBLE_NOT | SEMICOLON | WEDGE | DOT | QUESTIONMARK | COLON | DOUBLE_BAR | DOUBLE_AND | DOUBLE_EQUALS | UNEQUAL | LESS | GREATER | LESS_OR_EQUAL | GREATER_OR_EQUAL | REFERENCE_OPERATOR );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA21_73 = input.LA(1);

                        s = -1;
                        if ( (LA21_73=='#') ) {s = 108;}

                        else if ( ((LA21_73>='\u0000' && LA21_73<='\"')||(LA21_73>='$' && LA21_73<='\uFFFF')) ) {s = 109;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 21, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}