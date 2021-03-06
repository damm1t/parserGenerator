// Generated from /home/damm1t/IdeaProjects/parser_generator/src/NewGrammar.g4 by ANTLR 4.7.2

import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class NewGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, VBAR=2, COLON=3, SEMICOLON=4, OPAREN=5, CPAREN=6, LBrack=7, RBrack=8, 
		QUESTION=9, PLUS=10, ASTERISK=11, Comma=12, RETURNS=13, HEADER=14, MEMBERS=15, 
		INIT=16, RULE=17, TOKEN=18, ANY=19, CODE=20, REGEXP=21, WS=22;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "VBAR", "COLON", "SEMICOLON", "OPAREN", "CPAREN", "LBrack", "RBrack", 
			"QUESTION", "PLUS", "ASTERISK", "Comma", "RETURNS", "HEADER", "MEMBERS", 
			"INIT", "RULE", "TOKEN", "ANY", "CODE", "REGEXP", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'grammar'", "'|'", "':'", "';'", "'('", "')'", "'['", "']'", "'?'", 
			"'+'", "'*'", "','", "'returns'", "'@header'", "'@members'", "'@init'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "VBAR", "COLON", "SEMICOLON", "OPAREN", "CPAREN", "LBrack", 
			"RBrack", "QUESTION", "PLUS", "ASTERISK", "Comma", "RETURNS", "HEADER", 
			"MEMBERS", "INIT", "RULE", "TOKEN", "ANY", "CODE", "REGEXP", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	int cnt = 0;
	String termName = "TERM";
	NonTerminal start;
	Map<String, Terminal> terminals = new HashMap<>();
	Map<String, NonTerminal> nonTerminals = new HashMap<>();

	String removeBraces(String input) {
	    return input.substring(1, input.length() - 1).trim();
	}


	public NewGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "NewGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\30\u0099\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t"+
		"\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\7\22o"+
		"\n\22\f\22\16\22r\13\22\3\23\3\23\7\23v\n\23\f\23\16\23y\13\23\3\24\3"+
		"\24\6\24}\n\24\r\24\16\24~\3\24\3\24\3\25\3\25\6\25\u0085\n\25\r\25\16"+
		"\25\u0086\3\25\3\25\3\26\3\26\6\26\u008d\n\26\r\26\16\26\u008e\3\26\3"+
		"\26\3\27\6\27\u0094\n\27\r\27\16\27\u0095\3\27\3\27\5~\u0086\u008e\2\30"+
		"\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
		"\37\21!\22#\23%\24\'\25)\26+\27-\30\3\2\6\4\2aac|\6\2\62;C\\aac|\3\2C"+
		"\\\5\2\13\f\17\17\"\"\2\u009e\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t"+
		"\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2"+
		"\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2"+
		"\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2"+
		"+\3\2\2\2\2-\3\2\2\2\3/\3\2\2\2\5\67\3\2\2\2\79\3\2\2\2\t;\3\2\2\2\13"+
		"=\3\2\2\2\r?\3\2\2\2\17A\3\2\2\2\21C\3\2\2\2\23E\3\2\2\2\25G\3\2\2\2\27"+
		"I\3\2\2\2\31K\3\2\2\2\33M\3\2\2\2\35U\3\2\2\2\37]\3\2\2\2!f\3\2\2\2#l"+
		"\3\2\2\2%s\3\2\2\2\'z\3\2\2\2)\u0082\3\2\2\2+\u008a\3\2\2\2-\u0093\3\2"+
		"\2\2/\60\7i\2\2\60\61\7t\2\2\61\62\7c\2\2\62\63\7o\2\2\63\64\7o\2\2\64"+
		"\65\7c\2\2\65\66\7t\2\2\66\4\3\2\2\2\678\7~\2\28\6\3\2\2\29:\7<\2\2:\b"+
		"\3\2\2\2;<\7=\2\2<\n\3\2\2\2=>\7*\2\2>\f\3\2\2\2?@\7+\2\2@\16\3\2\2\2"+
		"AB\7]\2\2B\20\3\2\2\2CD\7_\2\2D\22\3\2\2\2EF\7A\2\2F\24\3\2\2\2GH\7-\2"+
		"\2H\26\3\2\2\2IJ\7,\2\2J\30\3\2\2\2KL\7.\2\2L\32\3\2\2\2MN\7t\2\2NO\7"+
		"g\2\2OP\7v\2\2PQ\7w\2\2QR\7t\2\2RS\7p\2\2ST\7u\2\2T\34\3\2\2\2UV\7B\2"+
		"\2VW\7j\2\2WX\7g\2\2XY\7c\2\2YZ\7f\2\2Z[\7g\2\2[\\\7t\2\2\\\36\3\2\2\2"+
		"]^\7B\2\2^_\7o\2\2_`\7g\2\2`a\7o\2\2ab\7d\2\2bc\7g\2\2cd\7t\2\2de\7u\2"+
		"\2e \3\2\2\2fg\7B\2\2gh\7k\2\2hi\7p\2\2ij\7k\2\2jk\7v\2\2k\"\3\2\2\2l"+
		"p\t\2\2\2mo\t\3\2\2nm\3\2\2\2or\3\2\2\2pn\3\2\2\2pq\3\2\2\2q$\3\2\2\2"+
		"rp\3\2\2\2sw\t\4\2\2tv\t\3\2\2ut\3\2\2\2vy\3\2\2\2wu\3\2\2\2wx\3\2\2\2"+
		"x&\3\2\2\2yw\3\2\2\2z|\7)\2\2{}\13\2\2\2|{\3\2\2\2}~\3\2\2\2~\177\3\2"+
		"\2\2~|\3\2\2\2\177\u0080\3\2\2\2\u0080\u0081\7)\2\2\u0081(\3\2\2\2\u0082"+
		"\u0084\7}\2\2\u0083\u0085\13\2\2\2\u0084\u0083\3\2\2\2\u0085\u0086\3\2"+
		"\2\2\u0086\u0087\3\2\2\2\u0086\u0084\3\2\2\2\u0087\u0088\3\2\2\2\u0088"+
		"\u0089\7\177\2\2\u0089*\3\2\2\2\u008a\u008c\7\61\2\2\u008b\u008d\13\2"+
		"\2\2\u008c\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008f\3\2\2\2\u008e"+
		"\u008c\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0091\7\61\2\2\u0091,\3\2\2\2"+
		"\u0092\u0094\t\5\2\2\u0093\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0093"+
		"\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0098\b\27\2\2"+
		"\u0098.\3\2\2\2\t\2pw~\u0086\u008e\u0095\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}