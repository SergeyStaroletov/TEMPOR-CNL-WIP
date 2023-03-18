package iae.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTemporLexer extends Lexer {
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators

    public InternalTemporLexer() {;} 
    public InternalTemporLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalTemporLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalTempor.g"; }

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTempor.g:11:7: ( 'if' )
            // InternalTempor.g:11:9: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTempor.g:12:7: ( 'then' )
            // InternalTempor.g:12:9: 'then'
            {
            match("then"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTempor.g:13:7: ( 'immediately' )
            // InternalTempor.g:13:9: 'immediately'
            {
            match("immediately"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTempor.g:14:7: ( 'there' )
            // InternalTempor.g:14:9: 'there'
            {
            match("there"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTempor.g:15:7: ( 'will' )
            // InternalTempor.g:15:9: 'will'
            {
            match("will"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTempor.g:16:7: ( 'be' )
            // InternalTempor.g:16:9: 'be'
            {
            match("be"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTempor.g:17:7: ( 'and' )
            // InternalTempor.g:17:9: 'and'
            {
            match("and"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTempor.g:18:7: ( 'it' )
            // InternalTempor.g:18:9: 'it'
            {
            match("it"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTempor.g:19:7: ( 'or' )
            // InternalTempor.g:19:9: 'or'
            {
            match("or"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTempor.g:20:7: ( 'at' )
            // InternalTempor.g:20:9: 'at'
            {
            match("at"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTempor.g:21:7: ( 'the' )
            // InternalTempor.g:21:9: 'the'
            {
            match("the"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTempor.g:22:7: ( 'same' )
            // InternalTempor.g:22:9: 'same'
            {
            match("same"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTempor.g:23:7: ( 'time' )
            // InternalTempor.g:23:9: 'time'
            {
            match("time"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTempor.g:24:7: ( 'always' )
            // InternalTempor.g:24:9: 'always'
            {
            match("always"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTempor.g:25:7: ( 'until' )
            // InternalTempor.g:25:9: 'until'
            {
            match("until"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTempor.g:26:7: ( 'perhaps' )
            // InternalTempor.g:26:9: 'perhaps'
            {
            match("perhaps"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTempor.g:27:7: ( 'happens' )
            // InternalTempor.g:27:9: 'happens'
            {
            match("happens"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTempor.g:28:7: ( 'to' )
            // InternalTempor.g:28:9: 'to'
            {
            match("to"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTempor.g:29:7: ( 'keep' )
            // InternalTempor.g:29:9: 'keep'
            {
            match("keep"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTempor.g:30:7: ( 'for' )
            // InternalTempor.g:30:9: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTempor.g:31:7: ( 'now' )
            // InternalTempor.g:31:9: 'now'
            {
            match("now"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTempor.g:32:7: ( 'not' )
            // InternalTempor.g:32:9: 'not'
            {
            match("not"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTempor.g:33:7: ( 'happen' )
            // InternalTempor.g:33:9: 'happen'
            {
            match("happen"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTempor.g:34:7: ( 'along' )
            // InternalTempor.g:34:9: 'along'
            {
            match("along"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTempor.g:35:7: ( 'with' )
            // InternalTempor.g:35:9: 'with'
            {
            match("with"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTempor.g:36:7: ( 'an' )
            // InternalTempor.g:36:9: 'an'
            {
            match("an"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTempor.g:37:7: ( 'immediate' )
            // InternalTempor.g:37:9: 'immediate'
            {
            match("immediate"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTempor.g:38:7: ( 'probably' )
            // InternalTempor.g:38:9: 'probably'
            {
            match("probably"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTempor.g:39:7: ( 'from' )
            // InternalTempor.g:39:9: 'from'
            {
            match("from"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTempor.g:40:7: ( 'on' )
            // InternalTempor.g:40:9: 'on'
            {
            match("on"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTempor.g:41:7: ( 'that' )
            // InternalTempor.g:41:9: 'that'
            {
            match("that"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTempor.g:42:7: ( 'point' )
            // InternalTempor.g:42:9: 'point'
            {
            match("point"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTempor.g:43:7: ( 'occurs' )
            // InternalTempor.g:43:9: 'occurs'
            {
            match("occurs"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTempor.g:44:7: ( 'keeping' )
            // InternalTempor.g:44:9: 'keeping'
            {
            match("keeping"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTempor.g:45:7: ( 'saved' )
            // InternalTempor.g:45:9: 'saved'
            {
            match("saved"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTempor.g:46:7: ( 'is' )
            // InternalTempor.g:46:9: 'is'
            {
            match("is"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTempor.g:47:7: ( 'may' )
            // InternalTempor.g:47:9: 'may'
            {
            match("may"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTempor.g:48:7: ( 'preserved' )
            // InternalTempor.g:48:9: 'preserved'
            {
            match("preserved"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTempor.g:49:7: ( 'a' )
            // InternalTempor.g:49:9: 'a'
            {
            match('a'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTempor.g:50:7: ( 'either' )
            // InternalTempor.g:50:9: 'either'
            {
            match("either"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTempor.g:51:7: ( 'alternates' )
            // InternalTempor.g:51:9: 'alternates'
            {
            match("alternates"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTempor.g:52:7: ( 'maybe' )
            // InternalTempor.g:52:9: 'maybe'
            {
            match("maybe"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTempor.g:53:7: ( 'occasionally' )
            // InternalTempor.g:53:9: 'occasionally'
            {
            match("occasionally"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTempor.g:54:7: ( 'becomes' )
            // InternalTempor.g:54:9: 'becomes'
            {
            match("becomes"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTempor.g:55:7: ( 'does' )
            // InternalTempor.g:55:9: 'does'
            {
            match("does"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTempor.g:56:7: ( 'possibly' )
            // InternalTempor.g:56:9: 'possibly'
            {
            match("possibly"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTempor.g:57:7: ( 'comes' )
            // InternalTempor.g:57:9: 'comes'
            {
            match("comes"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTempor.g:58:7: ( 'whenever' )
            // InternalTempor.g:58:9: 'whenever'
            {
            match("whenever"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTempor.g:59:7: ( 'come' )
            // InternalTempor.g:59:9: 'come'
            {
            match("come"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTempor.g:60:7: ( 'moment' )
            // InternalTempor.g:60:9: 'moment'
            {
            match("moment"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTempor.g:61:7: ( 'remaining' )
            // InternalTempor.g:61:9: 'remaining'
            {
            match("remaining"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTempor.g:62:7: ( 'might' )
            // InternalTempor.g:62:9: 'might'
            {
            match("might"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTempor.g:63:7: ( ',' )
            // InternalTempor.g:63:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTempor.g:64:7: ( 'was' )
            // InternalTempor.g:64:9: 'was'
            {
            match("was"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTempor.g:9331:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalTempor.g:9331:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalTempor.g:9331:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalTempor.g:9331:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalTempor.g:9331:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalTempor.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTempor.g:9333:10: ( ( '0' .. '9' )+ )
            // InternalTempor.g:9333:12: ( '0' .. '9' )+
            {
            // InternalTempor.g:9333:12: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalTempor.g:9333:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTempor.g:9335:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalTempor.g:9335:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalTempor.g:9335:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\'') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalTempor.g:9335:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalTempor.g:9335:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFF')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalTempor.g:9335:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalTempor.g:9335:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop4;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalTempor.g:9335:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalTempor.g:9335:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalTempor.g:9335:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalTempor.g:9335:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTempor.g:9337:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalTempor.g:9337:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalTempor.g:9337:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFF')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalTempor.g:9337:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTempor.g:9339:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalTempor.g:9339:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalTempor.g:9339:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalTempor.g:9339:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop8;
                }
            } while (true);

            // InternalTempor.g:9339:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalTempor.g:9339:41: ( '\\r' )? '\\n'
                    {
                    // InternalTempor.g:9339:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalTempor.g:9339:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTempor.g:9341:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalTempor.g:9341:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalTempor.g:9341:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalTempor.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTempor.g:9343:16: ( . )
            // InternalTempor.g:9343:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalTempor.g:1:8: ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=61;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // InternalTempor.g:1:10: T__11
                {
                mT__11(); 

                }
                break;
            case 2 :
                // InternalTempor.g:1:16: T__12
                {
                mT__12(); 

                }
                break;
            case 3 :
                // InternalTempor.g:1:22: T__13
                {
                mT__13(); 

                }
                break;
            case 4 :
                // InternalTempor.g:1:28: T__14
                {
                mT__14(); 

                }
                break;
            case 5 :
                // InternalTempor.g:1:34: T__15
                {
                mT__15(); 

                }
                break;
            case 6 :
                // InternalTempor.g:1:40: T__16
                {
                mT__16(); 

                }
                break;
            case 7 :
                // InternalTempor.g:1:46: T__17
                {
                mT__17(); 

                }
                break;
            case 8 :
                // InternalTempor.g:1:52: T__18
                {
                mT__18(); 

                }
                break;
            case 9 :
                // InternalTempor.g:1:58: T__19
                {
                mT__19(); 

                }
                break;
            case 10 :
                // InternalTempor.g:1:64: T__20
                {
                mT__20(); 

                }
                break;
            case 11 :
                // InternalTempor.g:1:70: T__21
                {
                mT__21(); 

                }
                break;
            case 12 :
                // InternalTempor.g:1:76: T__22
                {
                mT__22(); 

                }
                break;
            case 13 :
                // InternalTempor.g:1:82: T__23
                {
                mT__23(); 

                }
                break;
            case 14 :
                // InternalTempor.g:1:88: T__24
                {
                mT__24(); 

                }
                break;
            case 15 :
                // InternalTempor.g:1:94: T__25
                {
                mT__25(); 

                }
                break;
            case 16 :
                // InternalTempor.g:1:100: T__26
                {
                mT__26(); 

                }
                break;
            case 17 :
                // InternalTempor.g:1:106: T__27
                {
                mT__27(); 

                }
                break;
            case 18 :
                // InternalTempor.g:1:112: T__28
                {
                mT__28(); 

                }
                break;
            case 19 :
                // InternalTempor.g:1:118: T__29
                {
                mT__29(); 

                }
                break;
            case 20 :
                // InternalTempor.g:1:124: T__30
                {
                mT__30(); 

                }
                break;
            case 21 :
                // InternalTempor.g:1:130: T__31
                {
                mT__31(); 

                }
                break;
            case 22 :
                // InternalTempor.g:1:136: T__32
                {
                mT__32(); 

                }
                break;
            case 23 :
                // InternalTempor.g:1:142: T__33
                {
                mT__33(); 

                }
                break;
            case 24 :
                // InternalTempor.g:1:148: T__34
                {
                mT__34(); 

                }
                break;
            case 25 :
                // InternalTempor.g:1:154: T__35
                {
                mT__35(); 

                }
                break;
            case 26 :
                // InternalTempor.g:1:160: T__36
                {
                mT__36(); 

                }
                break;
            case 27 :
                // InternalTempor.g:1:166: T__37
                {
                mT__37(); 

                }
                break;
            case 28 :
                // InternalTempor.g:1:172: T__38
                {
                mT__38(); 

                }
                break;
            case 29 :
                // InternalTempor.g:1:178: T__39
                {
                mT__39(); 

                }
                break;
            case 30 :
                // InternalTempor.g:1:184: T__40
                {
                mT__40(); 

                }
                break;
            case 31 :
                // InternalTempor.g:1:190: T__41
                {
                mT__41(); 

                }
                break;
            case 32 :
                // InternalTempor.g:1:196: T__42
                {
                mT__42(); 

                }
                break;
            case 33 :
                // InternalTempor.g:1:202: T__43
                {
                mT__43(); 

                }
                break;
            case 34 :
                // InternalTempor.g:1:208: T__44
                {
                mT__44(); 

                }
                break;
            case 35 :
                // InternalTempor.g:1:214: T__45
                {
                mT__45(); 

                }
                break;
            case 36 :
                // InternalTempor.g:1:220: T__46
                {
                mT__46(); 

                }
                break;
            case 37 :
                // InternalTempor.g:1:226: T__47
                {
                mT__47(); 

                }
                break;
            case 38 :
                // InternalTempor.g:1:232: T__48
                {
                mT__48(); 

                }
                break;
            case 39 :
                // InternalTempor.g:1:238: T__49
                {
                mT__49(); 

                }
                break;
            case 40 :
                // InternalTempor.g:1:244: T__50
                {
                mT__50(); 

                }
                break;
            case 41 :
                // InternalTempor.g:1:250: T__51
                {
                mT__51(); 

                }
                break;
            case 42 :
                // InternalTempor.g:1:256: T__52
                {
                mT__52(); 

                }
                break;
            case 43 :
                // InternalTempor.g:1:262: T__53
                {
                mT__53(); 

                }
                break;
            case 44 :
                // InternalTempor.g:1:268: T__54
                {
                mT__54(); 

                }
                break;
            case 45 :
                // InternalTempor.g:1:274: T__55
                {
                mT__55(); 

                }
                break;
            case 46 :
                // InternalTempor.g:1:280: T__56
                {
                mT__56(); 

                }
                break;
            case 47 :
                // InternalTempor.g:1:286: T__57
                {
                mT__57(); 

                }
                break;
            case 48 :
                // InternalTempor.g:1:292: T__58
                {
                mT__58(); 

                }
                break;
            case 49 :
                // InternalTempor.g:1:298: T__59
                {
                mT__59(); 

                }
                break;
            case 50 :
                // InternalTempor.g:1:304: T__60
                {
                mT__60(); 

                }
                break;
            case 51 :
                // InternalTempor.g:1:310: T__61
                {
                mT__61(); 

                }
                break;
            case 52 :
                // InternalTempor.g:1:316: T__62
                {
                mT__62(); 

                }
                break;
            case 53 :
                // InternalTempor.g:1:322: T__63
                {
                mT__63(); 

                }
                break;
            case 54 :
                // InternalTempor.g:1:328: T__64
                {
                mT__64(); 

                }
                break;
            case 55 :
                // InternalTempor.g:1:334: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 56 :
                // InternalTempor.g:1:342: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 57 :
                // InternalTempor.g:1:351: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 58 :
                // InternalTempor.g:1:363: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 59 :
                // InternalTempor.g:1:379: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 60 :
                // InternalTempor.g:1:395: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 61 :
                // InternalTempor.g:1:403: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\uffff\4\40\1\53\15\40\1\uffff\1\33\2\uffff\3\33\2\uffff\1\106\1\40\1\110\1\111\1\uffff\2\40\1\115\3\40\1\123\1\125\1\126\1\40\1\uffff\1\132\1\133\22\40\7\uffff\1\40\2\uffff\1\165\2\40\1\uffff\3\40\1\173\1\40\1\uffff\1\175\2\uffff\3\40\2\uffff\13\40\1\u008d\1\40\1\u008f\1\u0090\1\u0092\7\40\1\u009a\1\40\1\uffff\1\u009c\1\u009d\1\u009e\1\u009f\1\40\1\uffff\1\40\1\uffff\5\40\1\u00a7\10\40\1\u00b1\1\uffff\1\u00b2\2\uffff\1\40\1\uffff\3\40\1\u00b7\1\u00b9\2\40\1\uffff\1\u00bc\4\uffff\3\40\1\u00c0\3\40\1\uffff\1\u00c4\1\u00c5\3\40\1\u00c9\3\40\2\uffff\1\u00cd\1\40\1\u00cf\1\40\1\uffff\1\u00d1\1\uffff\2\40\1\uffff\2\40\1\u00d6\1\uffff\1\40\1\u00d8\1\40\2\uffff\3\40\1\uffff\1\40\1\u00df\1\40\1\uffff\1\u00e1\1\uffff\1\u00e2\1\uffff\3\40\1\u00e6\1\uffff\1\40\1\uffff\1\40\1\u00e9\3\40\1\u00ed\1\uffff\1\u00ee\2\uffff\2\40\1\u00f1\1\uffff\2\40\1\uffff\1\u00f4\1\40\1\u00f6\2\uffff\1\40\1\u00f9\1\uffff\2\40\1\uffff\1\u00fc\1\uffff\1\u00fd\1\40\1\uffff\1\u00ff\1\40\2\uffff\1\u0101\1\uffff\1\40\1\uffff\1\u0103\1\uffff";
    static final String DFA12_eofS =
        "\u0104\uffff";
    static final String DFA12_minS =
        "\1\0\1\146\1\150\1\141\1\145\1\60\1\143\1\141\1\156\1\145\1\141\1\145\2\157\1\141\1\151\2\157\1\145\1\uffff\1\101\2\uffff\2\0\1\52\2\uffff\1\60\1\155\2\60\1\uffff\1\141\1\155\1\60\1\154\1\145\1\163\3\60\1\157\1\uffff\2\60\1\143\1\155\1\164\1\162\1\145\1\151\1\160\1\145\1\162\1\157\1\164\1\171\1\155\1\147\1\164\1\145\2\155\7\uffff\1\145\2\uffff\1\60\1\164\1\145\1\uffff\1\154\1\150\1\156\1\60\1\157\1\uffff\1\60\2\uffff\1\141\1\156\1\145\2\uffff\1\141\2\145\1\151\1\150\1\142\1\163\1\156\1\163\2\160\1\60\1\155\3\60\1\145\2\150\1\163\1\145\1\141\1\144\1\60\1\145\1\uffff\4\60\1\145\1\uffff\1\155\1\uffff\1\171\1\147\2\162\1\163\1\60\1\144\1\154\2\141\1\145\1\164\1\151\1\145\1\60\1\uffff\1\60\2\uffff\1\145\1\uffff\1\156\1\164\1\145\2\60\2\151\1\uffff\1\60\4\uffff\1\166\1\145\1\163\1\60\1\156\1\163\1\151\1\uffff\2\60\1\160\1\142\1\162\1\60\1\142\2\156\2\uffff\1\60\1\164\1\60\1\162\1\uffff\1\60\1\uffff\1\156\1\141\1\uffff\1\145\1\163\1\60\1\uffff\1\141\1\60\1\157\2\uffff\1\163\1\154\1\166\1\uffff\1\154\1\60\1\147\1\uffff\1\60\1\uffff\1\60\1\uffff\1\151\1\164\1\162\1\60\1\uffff\1\164\1\uffff\1\156\1\60\1\171\1\145\1\171\1\60\1\uffff\1\60\2\uffff\1\156\1\145\1\60\1\uffff\1\145\1\141\1\uffff\1\60\1\144\1\60\2\uffff\1\147\1\60\1\uffff\1\163\1\154\1\uffff\1\60\1\uffff\1\60\1\171\1\uffff\1\60\1\154\2\uffff\1\60\1\uffff\1\171\1\uffff\1\60\1\uffff";
    static final String DFA12_maxS =
        "\1\uffff\1\164\1\157\1\151\1\145\1\172\1\162\1\141\1\156\1\162\1\141\1\145\1\162\2\157\1\151\2\157\1\145\1\uffff\1\172\2\uffff\2\uffff\1\57\2\uffff\1\172\1\155\2\172\1\uffff\1\145\1\155\1\172\1\164\1\145\1\163\3\172\1\167\1\uffff\2\172\1\143\1\166\1\164\1\162\1\157\1\163\1\160\1\145\1\162\1\157\1\167\1\171\1\155\1\147\1\164\1\145\2\155\7\uffff\1\145\2\uffff\1\172\1\164\1\145\1\uffff\1\154\1\150\1\156\1\172\1\157\1\uffff\1\172\2\uffff\1\141\1\156\1\145\2\uffff\1\165\2\145\1\151\1\150\1\142\1\163\1\156\1\163\2\160\1\172\1\155\3\172\1\145\2\150\1\163\1\145\1\141\1\144\1\172\1\145\1\uffff\4\172\1\145\1\uffff\1\155\1\uffff\1\171\1\147\2\162\1\163\1\172\1\144\1\154\2\141\1\145\1\164\1\151\1\145\1\172\1\uffff\1\172\2\uffff\1\145\1\uffff\1\156\1\164\1\145\2\172\2\151\1\uffff\1\172\4\uffff\1\166\1\145\1\163\1\172\1\156\1\163\1\151\1\uffff\2\172\1\160\1\142\1\162\1\172\1\142\2\156\2\uffff\1\172\1\164\1\172\1\162\1\uffff\1\172\1\uffff\1\156\1\141\1\uffff\1\145\1\163\1\172\1\uffff\1\141\1\172\1\157\2\uffff\1\163\1\154\1\166\1\uffff\1\154\1\172\1\147\1\uffff\1\172\1\uffff\1\172\1\uffff\1\151\1\164\1\162\1\172\1\uffff\1\164\1\uffff\1\156\1\172\1\171\1\145\1\171\1\172\1\uffff\1\172\2\uffff\1\156\1\145\1\172\1\uffff\1\145\1\141\1\uffff\1\172\1\144\1\172\2\uffff\1\147\1\172\1\uffff\1\163\1\154\1\uffff\1\172\1\uffff\1\172\1\171\1\uffff\1\172\1\154\2\uffff\1\172\1\uffff\1\171\1\uffff\1\172\1\uffff";
    static final String DFA12_acceptS =
        "\23\uffff\1\65\1\uffff\1\67\1\70\3\uffff\1\74\1\75\4\uffff\1\67\12\uffff\1\47\24\uffff\1\65\1\70\1\71\1\72\1\73\1\74\1\1\1\uffff\1\10\1\44\3\uffff\1\22\5\uffff\1\6\1\uffff\1\32\1\12\3\uffff\1\11\1\36\31\uffff\1\13\5\uffff\1\66\1\uffff\1\7\17\uffff\1\24\1\uffff\1\25\1\26\1\uffff\1\45\7\uffff\1\2\1\uffff\1\37\1\15\1\5\1\31\7\uffff\1\14\11\uffff\1\23\1\35\4\uffff\1\55\1\uffff\1\61\2\uffff\1\4\3\uffff\1\30\3\uffff\1\43\1\17\3\uffff\1\40\3\uffff\1\52\1\uffff\1\64\1\uffff\1\57\4\uffff\1\16\1\uffff\1\41\6\uffff\1\27\1\uffff\1\62\1\50\3\uffff\1\54\2\uffff\1\20\3\uffff\1\21\1\42\2\uffff\1\60\2\uffff\1\34\1\uffff\1\56\2\uffff\1\33\2\uffff\1\46\1\63\1\uffff\1\51\1\uffff\1\3\1\uffff\1\53";
    static final String DFA12_specialS =
        "\1\2\26\uffff\1\0\1\1\u00eb\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\33\2\32\2\33\1\32\22\33\1\32\1\33\1\27\4\33\1\30\4\33\1\23\2\33\1\31\12\26\7\33\32\25\3\33\1\24\1\25\1\33\1\5\1\4\1\21\1\20\1\17\1\14\1\25\1\12\1\1\1\25\1\13\1\25\1\16\1\15\1\6\1\11\1\25\1\22\1\7\1\2\1\10\1\25\1\3\3\25\uff85\33",
            "\1\34\6\uffff\1\35\5\uffff\1\37\1\36",
            "\1\41\1\42\5\uffff\1\43",
            "\1\46\6\uffff\1\45\1\44",
            "\1\47",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\13\40\1\52\1\40\1\50\5\40\1\51\6\40",
            "\1\56\12\uffff\1\55\3\uffff\1\54",
            "\1\57",
            "\1\60",
            "\1\61\11\uffff\1\63\2\uffff\1\62",
            "\1\64",
            "\1\65",
            "\1\66\2\uffff\1\67",
            "\1\70",
            "\1\71\7\uffff\1\73\5\uffff\1\72",
            "\1\74",
            "\1\75",
            "\1\76",
            "\1\77",
            "",
            "\32\40\4\uffff\1\40\1\uffff\32\40",
            "",
            "",
            "\0\102",
            "\0\102",
            "\1\103\4\uffff\1\104",
            "",
            "",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\107",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "",
            "\1\113\3\uffff\1\112",
            "\1\114",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\116\7\uffff\1\117",
            "\1\120",
            "\1\121",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\2\40\1\122\27\40",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\3\40\1\124\26\40",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\130\4\uffff\1\131\2\uffff\1\127",
            "",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\134",
            "\1\135\10\uffff\1\136",
            "\1\137",
            "\1\140",
            "\1\142\11\uffff\1\141",
            "\1\143\11\uffff\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\152\2\uffff\1\151",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\162",
            "",
            "",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\15\40\1\163\3\40\1\164\10\40",
            "\1\166",
            "\1\167",
            "",
            "\1\170",
            "\1\171",
            "\1\172",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\174",
            "",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "",
            "",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "",
            "",
            "\1\u0082\23\uffff\1\u0081",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\u008e",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\1\40\1\u0091\30\40",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\u009b",
            "",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\u00a0",
            "",
            "\1\u00a1",
            "",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\10\40\1\u00b0\21\40",
            "",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "",
            "",
            "\1\u00b3",
            "",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\22\40\1\u00b8\7\40",
            "\1\u00ba",
            "\1\u00bb",
            "",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "",
            "",
            "",
            "",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\u00c6",
            "\1\u00c7",
            "\1\u00c8",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "",
            "",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\u00ce",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\u00d0",
            "",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "",
            "\1\u00d2",
            "\1\u00d3",
            "",
            "\1\u00d4",
            "\1\u00d5",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "",
            "\1\u00d7",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\u00d9",
            "",
            "",
            "\1\u00da",
            "\1\u00db",
            "\1\u00dc",
            "",
            "\1\u00dd",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\22\40\1\u00de\7\40",
            "\1\u00e0",
            "",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "",
            "\1\u00e3",
            "\1\u00e4",
            "\1\u00e5",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "",
            "\1\u00e7",
            "",
            "\1\u00e8",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\u00ea",
            "\1\u00eb",
            "\1\u00ec",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "",
            "",
            "\1\u00ef",
            "\1\u00f0",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "",
            "\1\u00f2",
            "\1\u00f3",
            "",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\u00f5",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "",
            "",
            "\1\u00f7",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\13\40\1\u00f8\16\40",
            "",
            "\1\u00fa",
            "\1\u00fb",
            "",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\u00fe",
            "",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\u0100",
            "",
            "",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "",
            "\1\u0102",
            "",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
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
            return "1:1: Tokens : ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_23 = input.LA(1);

                        s = -1;
                        if ( ((LA12_23>='\u0000' && LA12_23<='\uFFFF')) ) {s = 66;}

                        else s = 27;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_24 = input.LA(1);

                        s = -1;
                        if ( ((LA12_24>='\u0000' && LA12_24<='\uFFFF')) ) {s = 66;}

                        else s = 27;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='i') ) {s = 1;}

                        else if ( (LA12_0=='t') ) {s = 2;}

                        else if ( (LA12_0=='w') ) {s = 3;}

                        else if ( (LA12_0=='b') ) {s = 4;}

                        else if ( (LA12_0=='a') ) {s = 5;}

                        else if ( (LA12_0=='o') ) {s = 6;}

                        else if ( (LA12_0=='s') ) {s = 7;}

                        else if ( (LA12_0=='u') ) {s = 8;}

                        else if ( (LA12_0=='p') ) {s = 9;}

                        else if ( (LA12_0=='h') ) {s = 10;}

                        else if ( (LA12_0=='k') ) {s = 11;}

                        else if ( (LA12_0=='f') ) {s = 12;}

                        else if ( (LA12_0=='n') ) {s = 13;}

                        else if ( (LA12_0=='m') ) {s = 14;}

                        else if ( (LA12_0=='e') ) {s = 15;}

                        else if ( (LA12_0=='d') ) {s = 16;}

                        else if ( (LA12_0=='c') ) {s = 17;}

                        else if ( (LA12_0=='r') ) {s = 18;}

                        else if ( (LA12_0==',') ) {s = 19;}

                        else if ( (LA12_0=='^') ) {s = 20;}

                        else if ( ((LA12_0>='A' && LA12_0<='Z')||LA12_0=='_'||LA12_0=='g'||LA12_0=='j'||LA12_0=='l'||LA12_0=='q'||LA12_0=='v'||(LA12_0>='x' && LA12_0<='z')) ) {s = 21;}

                        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {s = 22;}

                        else if ( (LA12_0=='\"') ) {s = 23;}

                        else if ( (LA12_0=='\'') ) {s = 24;}

                        else if ( (LA12_0=='/') ) {s = 25;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 26;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='#' && LA12_0<='&')||(LA12_0>='(' && LA12_0<='+')||(LA12_0>='-' && LA12_0<='.')||(LA12_0>=':' && LA12_0<='@')||(LA12_0>='[' && LA12_0<=']')||LA12_0=='`'||(LA12_0>='{' && LA12_0<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}