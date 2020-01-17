// Generated from /home/damm1t/IdeaProjects/parser_generator/src/NewGrammar.g4 by ANTLR 4.7.2

import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class NewGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, VBAR=2, COLON=3, SEMICOLON=4, OPAREN=5, CPAREN=6, LBrack=7, RBrack=8, 
		QUESTION=9, PLUS=10, ASTERISK=11, Comma=12, RETURNS=13, HEADER=14, MEMBERS=15, 
		INIT=16, RULE=17, TOKEN=18, ANY=19, CODE=20, REGEXP=21, WS=22;
	public static final int
		RULE_start = 0, RULE_parseRules = 1, RULE_arguments = 2, RULE_returnsBlock = 3, 
		RULE_readArgument = 4, RULE_init = 5, RULE_nonTerminalName = 6, RULE_terminalName = 7, 
		RULE_terminalDescription = 8, RULE_parseAlternatives = 9, RULE_expressions = 10, 
		RULE_expression = 11, RULE_argsNames = 12, RULE_argName = 13, RULE_readTerminal = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "parseRules", "arguments", "returnsBlock", "readArgument", "init", 
			"nonTerminalName", "terminalName", "terminalDescription", "parseAlternatives", 
			"expressions", "expression", "argsNames", "argName", "readTerminal"
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

	@Override
	public String getGrammarFileName() { return "NewGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	int cnt = 0;
	String termName = "TERM";
	NonTerminal start;
	Map<String, Terminal> terminals = new HashMap<>();
	Map<String, NonTerminal> nonTerminals = new HashMap<>();

	String removeBraces(String input) {
	    return input.substring(1, input.length() - 1).trim();
	}

	public NewGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public String title;
		public String header;
		public String members;
		public Token grammarName;
		public Token h;
		public Token m;
		public ParseRulesContext parseRules() {
			return getRuleContext(ParseRulesContext.class,0);
		}
		public TerminalNode HEADER() { return getToken(NewGrammarParser.HEADER, 0); }
		public TerminalNode MEMBERS() { return getToken(NewGrammarParser.MEMBERS, 0); }
		public TerminalNode TOKEN() { return getToken(NewGrammarParser.TOKEN, 0); }
		public List<TerminalNode> CODE() { return getTokens(NewGrammarParser.CODE); }
		public TerminalNode CODE(int i) {
			return getToken(NewGrammarParser.CODE, i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NewGrammarListener ) ((NewGrammarListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NewGrammarListener ) ((NewGrammarListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NewGrammarVisitor ) return ((NewGrammarVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(30);
				match(T__0);
				setState(31);
				((StartContext)_localctx).grammarName = match(TOKEN);
				}
			}

			setState(36);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HEADER) {
				{
				setState(34);
				match(HEADER);
				setState(35);
				((StartContext)_localctx).h = match(CODE);
				}
			}

			setState(40);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MEMBERS) {
				{
				setState(38);
				match(MEMBERS);
				setState(39);
				((StartContext)_localctx).m = match(CODE);
				}
			}

			setState(42);
			parseRules();

			        ((StartContext)_localctx).title =  ((((StartContext)_localctx).grammarName!=null?((StartContext)_localctx).grammarName.getText():null) == null) ? "" : (((StartContext)_localctx).grammarName!=null?((StartContext)_localctx).grammarName.getText():null);
			        ((StartContext)_localctx).header =  ((((StartContext)_localctx).h!=null?((StartContext)_localctx).h.getText():null) == null) ? "" : removeBraces((((StartContext)_localctx).h!=null?((StartContext)_localctx).h.getText():null));
			        ((StartContext)_localctx).members =  ((((StartContext)_localctx).m!=null?((StartContext)_localctx).m.getText():null) == null) ? "" : removeBraces((((StartContext)_localctx).m!=null?((StartContext)_localctx).m.getText():null));
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParseRulesContext extends ParserRuleContext {
		public NonTerminalNameContext nt;
		public TerminalNameContext t;
		public TerminalNode COLON() { return getToken(NewGrammarParser.COLON, 0); }
		public ParseAlternativesContext parseAlternatives() {
			return getRuleContext(ParseAlternativesContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(NewGrammarParser.SEMICOLON, 0); }
		public ParseRulesContext parseRules() {
			return getRuleContext(ParseRulesContext.class,0);
		}
		public NonTerminalNameContext nonTerminalName() {
			return getRuleContext(NonTerminalNameContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TerminalNode RETURNS() { return getToken(NewGrammarParser.RETURNS, 0); }
		public ReturnsBlockContext returnsBlock() {
			return getRuleContext(ReturnsBlockContext.class,0);
		}
		public InitContext init() {
			return getRuleContext(InitContext.class,0);
		}
		public TerminalDescriptionContext terminalDescription() {
			return getRuleContext(TerminalDescriptionContext.class,0);
		}
		public TerminalNameContext terminalName() {
			return getRuleContext(TerminalNameContext.class,0);
		}
		public TerminalNode EOF() { return getToken(NewGrammarParser.EOF, 0); }
		public ParseRulesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parseRules; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NewGrammarListener ) ((NewGrammarListener)listener).enterParseRules(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NewGrammarListener ) ((NewGrammarListener)listener).exitParseRules(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NewGrammarVisitor ) return ((NewGrammarVisitor<? extends T>)visitor).visitParseRules(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParseRulesContext parseRules() throws RecognitionException {
		ParseRulesContext _localctx = new ParseRulesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_parseRules);
		int _la;
		try {
			setState(68);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RULE:
				enterOuterAlt(_localctx, 1);
				{
				setState(45);
				((ParseRulesContext)_localctx).nt = nonTerminalName();
				setState(47);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBrack) {
					{
					setState(46);
					arguments(((ParseRulesContext)_localctx).nt.elem);
					}
				}

				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RETURNS) {
					{
					setState(49);
					match(RETURNS);
					setState(50);
					returnsBlock(((ParseRulesContext)_localctx).nt.elem);
					}
				}

				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INIT) {
					{
					setState(53);
					init(((ParseRulesContext)_localctx).nt.elem);
					}
				}

				setState(56);
				match(COLON);
				setState(57);
				parseAlternatives(((ParseRulesContext)_localctx).nt.elem);
				setState(58);
				match(SEMICOLON);
				setState(59);
				parseRules();
				}
				break;
			case TOKEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(61);
				((ParseRulesContext)_localctx).t = terminalName();
				setState(62);
				match(COLON);
				setState(63);
				terminalDescription(((ParseRulesContext)_localctx).t.elem);
				setState(64);
				match(SEMICOLON);
				setState(65);
				parseRules();
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 3);
				{
				setState(67);
				match(EOF);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentsContext extends ParserRuleContext {
		public Element elem;
		public ReadArgumentContext v;
		public TerminalNode LBrack() { return getToken(NewGrammarParser.LBrack, 0); }
		public TerminalNode RBrack() { return getToken(NewGrammarParser.RBrack, 0); }
		public List<ReadArgumentContext> readArgument() {
			return getRuleContexts(ReadArgumentContext.class);
		}
		public ReadArgumentContext readArgument(int i) {
			return getRuleContext(ReadArgumentContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(NewGrammarParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(NewGrammarParser.Comma, i);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ArgumentsContext(ParserRuleContext parent, int invokingState, Element elem) {
			super(parent, invokingState);
			this.elem = elem;
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NewGrammarListener ) ((NewGrammarListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NewGrammarListener ) ((NewGrammarListener)listener).exitArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NewGrammarVisitor ) return ((NewGrammarVisitor<? extends T>)visitor).visitArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsContext arguments(Element elem) throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState(), elem);
		enterRule(_localctx, 4, RULE_arguments);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(LBrack);
			setState(71);
			((ArgumentsContext)_localctx).v = readArgument();

			            _localctx.elem.addArgument(((ArgumentsContext)_localctx).v.type, ((ArgumentsContext)_localctx).v.name);
			        
			setState(79);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(73);
					match(Comma);
					setState(74);
					((ArgumentsContext)_localctx).v = readArgument();
					 _localctx.elem.addArgument(((ArgumentsContext)_localctx).v.type, ((ArgumentsContext)_localctx).v.name); 
					}
					} 
				}
				setState(81);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			setState(82);
			match(RBrack);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnsBlockContext extends ParserRuleContext {
		public Element elem;
		public ReadArgumentContext v;
		public TerminalNode LBrack() { return getToken(NewGrammarParser.LBrack, 0); }
		public TerminalNode RBrack() { return getToken(NewGrammarParser.RBrack, 0); }
		public ReadArgumentContext readArgument() {
			return getRuleContext(ReadArgumentContext.class,0);
		}
		public ReturnsBlockContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ReturnsBlockContext(ParserRuleContext parent, int invokingState, Element elem) {
			super(parent, invokingState);
			this.elem = elem;
		}
		@Override public int getRuleIndex() { return RULE_returnsBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NewGrammarListener ) ((NewGrammarListener)listener).enterReturnsBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NewGrammarListener ) ((NewGrammarListener)listener).exitReturnsBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NewGrammarVisitor ) return ((NewGrammarVisitor<? extends T>)visitor).visitReturnsBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnsBlockContext returnsBlock(Element elem) throws RecognitionException {
		ReturnsBlockContext _localctx = new ReturnsBlockContext(_ctx, getState(), elem);
		enterRule(_localctx, 6, RULE_returnsBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(LBrack);
			setState(85);
			((ReturnsBlockContext)_localctx).v = readArgument();
			 _localctx.elem.setReturnAttr(((ReturnsBlockContext)_localctx).v.type, ((ReturnsBlockContext)_localctx).v.name); 
			setState(87);
			match(RBrack);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReadArgumentContext extends ParserRuleContext {
		public String type;
		public String name;
		public Token t;
		public Token n;
		public List<TerminalNode> TOKEN() { return getTokens(NewGrammarParser.TOKEN); }
		public TerminalNode TOKEN(int i) {
			return getToken(NewGrammarParser.TOKEN, i);
		}
		public List<TerminalNode> RULE() { return getTokens(NewGrammarParser.RULE); }
		public TerminalNode RULE(int i) {
			return getToken(NewGrammarParser.RULE, i);
		}
		public ReadArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_readArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NewGrammarListener ) ((NewGrammarListener)listener).enterReadArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NewGrammarListener ) ((NewGrammarListener)listener).exitReadArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NewGrammarVisitor ) return ((NewGrammarVisitor<? extends T>)visitor).visitReadArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReadArgumentContext readArgument() throws RecognitionException {
		ReadArgumentContext _localctx = new ReadArgumentContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_readArgument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			((ReadArgumentContext)_localctx).t = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==RULE || _la==TOKEN) ) {
				((ReadArgumentContext)_localctx).t = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(90);
			((ReadArgumentContext)_localctx).n = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==RULE || _la==TOKEN) ) {
				((ReadArgumentContext)_localctx).n = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}

			        ((ReadArgumentContext)_localctx).type =  (((ReadArgumentContext)_localctx).t!=null?((ReadArgumentContext)_localctx).t.getText():null);
			        ((ReadArgumentContext)_localctx).name =  (((ReadArgumentContext)_localctx).n!=null?((ReadArgumentContext)_localctx).n.getText():null);
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitContext extends ParserRuleContext {
		public NonTerminal nt;
		public Token i;
		public TerminalNode INIT() { return getToken(NewGrammarParser.INIT, 0); }
		public TerminalNode CODE() { return getToken(NewGrammarParser.CODE, 0); }
		public InitContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public InitContext(ParserRuleContext parent, int invokingState, NonTerminal nt) {
			super(parent, invokingState);
			this.nt = nt;
		}
		@Override public int getRuleIndex() { return RULE_init; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NewGrammarListener ) ((NewGrammarListener)listener).enterInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NewGrammarListener ) ((NewGrammarListener)listener).exitInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NewGrammarVisitor ) return ((NewGrammarVisitor<? extends T>)visitor).visitInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitContext init(NonTerminal nt) throws RecognitionException {
		InitContext _localctx = new InitContext(_ctx, getState(), nt);
		enterRule(_localctx, 10, RULE_init);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(INIT);
			setState(94);
			((InitContext)_localctx).i = match(CODE);

			        _localctx.nt.setInit(((((InitContext)_localctx).i!=null?((InitContext)_localctx).i.getText():null) == null) ? "" : removeBraces((((InitContext)_localctx).i!=null?((InitContext)_localctx).i.getText():null)));
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NonTerminalNameContext extends ParserRuleContext {
		public NonTerminal elem;
		public Token r;
		public TerminalNode RULE() { return getToken(NewGrammarParser.RULE, 0); }
		public NonTerminalNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonTerminalName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NewGrammarListener ) ((NewGrammarListener)listener).enterNonTerminalName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NewGrammarListener ) ((NewGrammarListener)listener).exitNonTerminalName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NewGrammarVisitor ) return ((NewGrammarVisitor<? extends T>)visitor).visitNonTerminalName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NonTerminalNameContext nonTerminalName() throws RecognitionException {
		NonTerminalNameContext _localctx = new NonTerminalNameContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_nonTerminalName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			((NonTerminalNameContext)_localctx).r = match(RULE);

			        String name = (((NonTerminalNameContext)_localctx).r!=null?((NonTerminalNameContext)_localctx).r.getText():null);
			        if (nonTerminals.containsKey(name)) {
			            ((NonTerminalNameContext)_localctx).elem =  nonTerminals.get(name);
			        } else {
			            ((NonTerminalNameContext)_localctx).elem =  new NonTerminal(name);
			            if (nonTerminals.isEmpty()) {
			                start = _localctx.elem;
			            }
			            nonTerminals.put(name, _localctx.elem);
			        }
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TerminalNameContext extends ParserRuleContext {
		public Terminal elem;
		public Token t;
		public TerminalNode TOKEN() { return getToken(NewGrammarParser.TOKEN, 0); }
		public TerminalNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_terminalName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NewGrammarListener ) ((NewGrammarListener)listener).enterTerminalName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NewGrammarListener ) ((NewGrammarListener)listener).exitTerminalName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NewGrammarVisitor ) return ((NewGrammarVisitor<? extends T>)visitor).visitTerminalName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TerminalNameContext terminalName() throws RecognitionException {
		TerminalNameContext _localctx = new TerminalNameContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_terminalName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			((TerminalNameContext)_localctx).t = match(TOKEN);

			        String name = (((TerminalNameContext)_localctx).t!=null?((TerminalNameContext)_localctx).t.getText():null);
			        if (terminals.containsKey(name)) {
			            ((TerminalNameContext)_localctx).elem =  terminals.get(name);
			        } else {
			            ((TerminalNameContext)_localctx).elem =  new Terminal(name);
			            terminals.put(name, _localctx.elem);
			        }
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TerminalDescriptionContext extends ParserRuleContext {
		public Terminal elem;
		public Token es;
		public TerminalDescriptionContext ds;
		public TerminalNode ANY() { return getToken(NewGrammarParser.ANY, 0); }
		public TerminalNode VBAR() { return getToken(NewGrammarParser.VBAR, 0); }
		public TerminalDescriptionContext terminalDescription() {
			return getRuleContext(TerminalDescriptionContext.class,0);
		}
		public TerminalNode REGEXP() { return getToken(NewGrammarParser.REGEXP, 0); }
		public TerminalNode TOKEN() { return getToken(NewGrammarParser.TOKEN, 0); }
		public TerminalDescriptionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public TerminalDescriptionContext(ParserRuleContext parent, int invokingState, Terminal elem) {
			super(parent, invokingState);
			this.elem = elem;
		}
		@Override public int getRuleIndex() { return RULE_terminalDescription; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NewGrammarListener ) ((NewGrammarListener)listener).enterTerminalDescription(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NewGrammarListener ) ((NewGrammarListener)listener).exitTerminalDescription(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NewGrammarVisitor ) return ((NewGrammarVisitor<? extends T>)visitor).visitTerminalDescription(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TerminalDescriptionContext terminalDescription(Terminal elem) throws RecognitionException {
		TerminalDescriptionContext _localctx = new TerminalDescriptionContext(_ctx, getState(), elem);
		enterRule(_localctx, 16, RULE_terminalDescription);
		int _la;
		try {
			setState(121);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ANY:
				enterOuterAlt(_localctx, 1);
				{
				setState(103);
				((TerminalDescriptionContext)_localctx).es = match(ANY);
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VBAR) {
					{
					setState(104);
					match(VBAR);
					setState(105);
					((TerminalDescriptionContext)_localctx).ds = terminalDescription(_localctx.elem);
					}
				}


				        _localctx.elem.addString(removeBraces((((TerminalDescriptionContext)_localctx).es!=null?((TerminalDescriptionContext)_localctx).es.getText():null)));
				    
				}
				break;
			case REGEXP:
				enterOuterAlt(_localctx, 2);
				{
				setState(109);
				((TerminalDescriptionContext)_localctx).es = match(REGEXP);
				setState(112);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VBAR) {
					{
					setState(110);
					match(VBAR);
					setState(111);
					((TerminalDescriptionContext)_localctx).ds = terminalDescription(_localctx.elem);
					}
				}


				        _localctx.elem.addRegex((((TerminalDescriptionContext)_localctx).es!=null?((TerminalDescriptionContext)_localctx).es.getText():null));
				    
				}
				break;
			case TOKEN:
				enterOuterAlt(_localctx, 3);
				{
				setState(115);
				((TerminalDescriptionContext)_localctx).es = match(TOKEN);
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VBAR) {
					{
					setState(116);
					match(VBAR);
					setState(117);
					((TerminalDescriptionContext)_localctx).ds = terminalDescription(_localctx.elem);
					}
				}


				        if (terminals.containsKey((((TerminalDescriptionContext)_localctx).es!=null?((TerminalDescriptionContext)_localctx).es.getText():null))) {
				            Terminal t = terminals.get((((TerminalDescriptionContext)_localctx).es!=null?((TerminalDescriptionContext)_localctx).es.getText():null));
				            _localctx.elem.addStrings(t.strings);
				            _localctx.elem.addAllRegex(t.regex);
				        }
				    
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParseAlternativesContext extends ParserRuleContext {
		public NonTerminal elem;
		public ExpressionsContext expressions() {
			return getRuleContext(ExpressionsContext.class,0);
		}
		public TerminalNode VBAR() { return getToken(NewGrammarParser.VBAR, 0); }
		public ParseAlternativesContext parseAlternatives() {
			return getRuleContext(ParseAlternativesContext.class,0);
		}
		public ParseAlternativesContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ParseAlternativesContext(ParserRuleContext parent, int invokingState, NonTerminal elem) {
			super(parent, invokingState);
			this.elem = elem;
		}
		@Override public int getRuleIndex() { return RULE_parseAlternatives; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NewGrammarListener ) ((NewGrammarListener)listener).enterParseAlternatives(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NewGrammarListener ) ((NewGrammarListener)listener).exitParseAlternatives(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NewGrammarVisitor ) return ((NewGrammarVisitor<? extends T>)visitor).visitParseAlternatives(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParseAlternativesContext parseAlternatives(NonTerminal elem) throws RecognitionException {
		ParseAlternativesContext _localctx = new ParseAlternativesContext(_ctx, getState(), elem);
		enterRule(_localctx, 18, RULE_parseAlternatives);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			expressions(_localctx.elem, new Rule());
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VBAR) {
				{
				setState(124);
				match(VBAR);
				setState(125);
				parseAlternatives(_localctx.elem);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionsContext extends ParserRuleContext {
		public NonTerminal elem;
		public Rule rule;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionsContext expressions() {
			return getRuleContext(ExpressionsContext.class,0);
		}
		public ExpressionsContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ExpressionsContext(ParserRuleContext parent, int invokingState, NonTerminal elem, Rule rule) {
			super(parent, invokingState);
			this.elem = elem;
			this.rule = rule;
		}
		@Override public int getRuleIndex() { return RULE_expressions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NewGrammarListener ) ((NewGrammarListener)listener).enterExpressions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NewGrammarListener ) ((NewGrammarListener)listener).exitExpressions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NewGrammarVisitor ) return ((NewGrammarVisitor<? extends T>)visitor).visitExpressions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionsContext expressions(NonTerminal elem,Rule rule) throws RecognitionException {
		ExpressionsContext _localctx = new ExpressionsContext(_ctx, getState(), elem, rule);
		enterRule(_localctx, 20, RULE_expressions);
		try {
			setState(134);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				expression(rule);
				setState(129);
				expressions(_localctx.elem, _localctx.rule);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(131);
				expression(rule);

				        _localctx.elem.addRule(rule);
				    
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public Rule rule;
		public NonTerminalNameContext nt;
		public ArgsNamesContext vs;
		public Token c;
		public ReadTerminalContext t;
		public TerminalNode LBrack() { return getToken(NewGrammarParser.LBrack, 0); }
		public TerminalNode RBrack() { return getToken(NewGrammarParser.RBrack, 0); }
		public NonTerminalNameContext nonTerminalName() {
			return getRuleContext(NonTerminalNameContext.class,0);
		}
		public ArgsNamesContext argsNames() {
			return getRuleContext(ArgsNamesContext.class,0);
		}
		public TerminalNode CODE() { return getToken(NewGrammarParser.CODE, 0); }
		public ReadTerminalContext readTerminal() {
			return getRuleContext(ReadTerminalContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ExpressionContext(ParserRuleContext parent, int invokingState, Rule rule) {
			super(parent, invokingState);
			this.rule = rule;
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NewGrammarListener ) ((NewGrammarListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NewGrammarListener ) ((NewGrammarListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NewGrammarVisitor ) return ((NewGrammarVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression(Rule rule) throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState(), rule);
		enterRule(_localctx, 22, RULE_expression);
		int _la;
		try {
			setState(157);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(136);
				((ExpressionContext)_localctx).nt = nonTerminalName();
				setState(137);
				match(LBrack);
				setState(138);
				((ExpressionContext)_localctx).vs = argsNames();
				setState(139);
				match(RBrack);
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CODE) {
					{
					setState(140);
					((ExpressionContext)_localctx).c = match(CODE);
					}
				}


				        _localctx.rule.add(((ExpressionContext)_localctx).nt.elem, ((ExpressionContext)_localctx).vs.args, (((ExpressionContext)_localctx).c!=null?((ExpressionContext)_localctx).c.getText():null) == null ? null : removeBraces((((ExpressionContext)_localctx).c!=null?((ExpressionContext)_localctx).c.getText():null)));
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(145);
				((ExpressionContext)_localctx).nt = nonTerminalName();
				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CODE) {
					{
					setState(146);
					((ExpressionContext)_localctx).c = match(CODE);
					}
				}


				        _localctx.rule.add(((ExpressionContext)_localctx).nt.elem, null, (((ExpressionContext)_localctx).c!=null?((ExpressionContext)_localctx).c.getText():null) == null ? null : removeBraces((((ExpressionContext)_localctx).c!=null?((ExpressionContext)_localctx).c.getText():null)));
				    
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(151);
				((ExpressionContext)_localctx).t = readTerminal();
				setState(153);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CODE) {
					{
					setState(152);
					((ExpressionContext)_localctx).c = match(CODE);
					}
				}


				        _localctx.rule.add(((ExpressionContext)_localctx).t.elem, null, (((ExpressionContext)_localctx).c!=null?((ExpressionContext)_localctx).c.getText():null) == null ? null : removeBraces((((ExpressionContext)_localctx).c!=null?((ExpressionContext)_localctx).c.getText():null)));
				    
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgsNamesContext extends ParserRuleContext {
		public List<String> args;
		public ArgNameContext v;
		public ArgsNamesContext vs;
		public TerminalNode Comma() { return getToken(NewGrammarParser.Comma, 0); }
		public ArgNameContext argName() {
			return getRuleContext(ArgNameContext.class,0);
		}
		public ArgsNamesContext argsNames() {
			return getRuleContext(ArgsNamesContext.class,0);
		}
		public ArgsNamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argsNames; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NewGrammarListener ) ((NewGrammarListener)listener).enterArgsNames(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NewGrammarListener ) ((NewGrammarListener)listener).exitArgsNames(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NewGrammarVisitor ) return ((NewGrammarVisitor<? extends T>)visitor).visitArgsNames(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgsNamesContext argsNames() throws RecognitionException {
		ArgsNamesContext _localctx = new ArgsNamesContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_argsNames);

		        ((ArgsNamesContext)_localctx).args =  new ArrayList<>();
		    
		try {
			setState(167);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(159);
				((ArgsNamesContext)_localctx).v = argName();
				setState(160);
				match(Comma);
				setState(161);
				((ArgsNamesContext)_localctx).vs = argsNames();

				        _localctx.args.add(((ArgsNamesContext)_localctx).v.name);
				        _localctx.args.addAll(((ArgsNamesContext)_localctx).vs.args);
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(164);
				((ArgsNamesContext)_localctx).v = argName();

				        _localctx.args.add(((ArgsNamesContext)_localctx).v.name);
				    
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgNameContext extends ParserRuleContext {
		public String name;
		public Token n;
		public TerminalNode TOKEN() { return getToken(NewGrammarParser.TOKEN, 0); }
		public TerminalNode RULE() { return getToken(NewGrammarParser.RULE, 0); }
		public TerminalNode CODE() { return getToken(NewGrammarParser.CODE, 0); }
		public ArgNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NewGrammarListener ) ((NewGrammarListener)listener).enterArgName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NewGrammarListener ) ((NewGrammarListener)listener).exitArgName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NewGrammarVisitor ) return ((NewGrammarVisitor<? extends T>)visitor).visitArgName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgNameContext argName() throws RecognitionException {
		ArgNameContext _localctx = new ArgNameContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_argName);
		int _la;
		try {
			setState(173);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RULE:
			case TOKEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(169);
				((ArgNameContext)_localctx).n = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==RULE || _la==TOKEN) ) {
					((ArgNameContext)_localctx).n = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}

				        ((ArgNameContext)_localctx).name = (((ArgNameContext)_localctx).n!=null?((ArgNameContext)_localctx).n.getText():null);
				    
				}
				break;
			case CODE:
				enterOuterAlt(_localctx, 2);
				{
				setState(171);
				((ArgNameContext)_localctx).n = match(CODE);

				        ((ArgNameContext)_localctx).name =  removeBraces((((ArgNameContext)_localctx).n!=null?((ArgNameContext)_localctx).n.getText():null));
				    
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReadTerminalContext extends ParserRuleContext {
		public Terminal elem;
		public TerminalNameContext name;
		public Token t;
		public TerminalNameContext terminalName() {
			return getRuleContext(TerminalNameContext.class,0);
		}
		public TerminalNode REGEXP() { return getToken(NewGrammarParser.REGEXP, 0); }
		public TerminalNode ANY() { return getToken(NewGrammarParser.ANY, 0); }
		public ReadTerminalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_readTerminal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NewGrammarListener ) ((NewGrammarListener)listener).enterReadTerminal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NewGrammarListener ) ((NewGrammarListener)listener).exitReadTerminal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NewGrammarVisitor ) return ((NewGrammarVisitor<? extends T>)visitor).visitReadTerminal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReadTerminalContext readTerminal() throws RecognitionException {
		ReadTerminalContext _localctx = new ReadTerminalContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_readTerminal);
		try {
			setState(182);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TOKEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(175);
				((ReadTerminalContext)_localctx).name = terminalName();

				        ((ReadTerminalContext)_localctx).elem =  ((ReadTerminalContext)_localctx).name.elem;
				    
				}
				break;
			case REGEXP:
				enterOuterAlt(_localctx, 2);
				{
				setState(178);
				((ReadTerminalContext)_localctx).t = match(REGEXP);

				        String name = termName.concat(Integer.toString(cnt++));
				        ((ReadTerminalContext)_localctx).elem =  new Terminal(name);
				        _localctx.elem.addRegex((((ReadTerminalContext)_localctx).t!=null?((ReadTerminalContext)_localctx).t.getText():null));
				        terminals.put(name, _localctx.elem);
				    
				}
				break;
			case ANY:
				enterOuterAlt(_localctx, 3);
				{
				setState(180);
				((ReadTerminalContext)_localctx).t = match(ANY);

				        String name = termName.concat(Integer.toString(cnt++));
				        ((ReadTerminalContext)_localctx).elem =  new Terminal(name);
				        _localctx.elem.addString(removeBraces((((ReadTerminalContext)_localctx).t!=null?((ReadTerminalContext)_localctx).t.getText():null)));
				        terminals.put(name, _localctx.elem);
				    
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\30\u00bb\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\5\2#\n\2\3"+
		"\2\3\2\5\2\'\n\2\3\2\3\2\5\2+\n\2\3\2\3\2\3\2\3\3\3\3\5\3\62\n\3\3\3\3"+
		"\3\5\3\66\n\3\3\3\5\39\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\5\3G\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4P\n\4\f\4\16\4S\13\4\3\4"+
		"\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3"+
		"\t\3\t\3\t\3\n\3\n\3\n\5\nm\n\n\3\n\3\n\3\n\3\n\5\ns\n\n\3\n\3\n\3\n\3"+
		"\n\5\ny\n\n\3\n\5\n|\n\n\3\13\3\13\3\13\5\13\u0081\n\13\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\5\f\u0089\n\f\3\r\3\r\3\r\3\r\3\r\5\r\u0090\n\r\3\r\3\r\3\r"+
		"\3\r\5\r\u0096\n\r\3\r\3\r\3\r\3\r\5\r\u009c\n\r\3\r\3\r\5\r\u00a0\n\r"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00aa\n\16\3\17\3\17\3\17"+
		"\3\17\5\17\u00b0\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00b9\n"+
		"\20\3\20\3Q\2\21\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36\2\3\3\2\23\24"+
		"\2\u00c4\2\"\3\2\2\2\4F\3\2\2\2\6H\3\2\2\2\bV\3\2\2\2\n[\3\2\2\2\f_\3"+
		"\2\2\2\16c\3\2\2\2\20f\3\2\2\2\22{\3\2\2\2\24}\3\2\2\2\26\u0088\3\2\2"+
		"\2\30\u009f\3\2\2\2\32\u00a9\3\2\2\2\34\u00af\3\2\2\2\36\u00b8\3\2\2\2"+
		" !\7\3\2\2!#\7\24\2\2\" \3\2\2\2\"#\3\2\2\2#&\3\2\2\2$%\7\20\2\2%\'\7"+
		"\26\2\2&$\3\2\2\2&\'\3\2\2\2\'*\3\2\2\2()\7\21\2\2)+\7\26\2\2*(\3\2\2"+
		"\2*+\3\2\2\2+,\3\2\2\2,-\5\4\3\2-.\b\2\1\2.\3\3\2\2\2/\61\5\16\b\2\60"+
		"\62\5\6\4\2\61\60\3\2\2\2\61\62\3\2\2\2\62\65\3\2\2\2\63\64\7\17\2\2\64"+
		"\66\5\b\5\2\65\63\3\2\2\2\65\66\3\2\2\2\668\3\2\2\2\679\5\f\7\28\67\3"+
		"\2\2\289\3\2\2\29:\3\2\2\2:;\7\5\2\2;<\5\24\13\2<=\7\6\2\2=>\5\4\3\2>"+
		"G\3\2\2\2?@\5\20\t\2@A\7\5\2\2AB\5\22\n\2BC\7\6\2\2CD\5\4\3\2DG\3\2\2"+
		"\2EG\7\2\2\3F/\3\2\2\2F?\3\2\2\2FE\3\2\2\2G\5\3\2\2\2HI\7\t\2\2IJ\5\n"+
		"\6\2JQ\b\4\1\2KL\7\16\2\2LM\5\n\6\2MN\b\4\1\2NP\3\2\2\2OK\3\2\2\2PS\3"+
		"\2\2\2QR\3\2\2\2QO\3\2\2\2RT\3\2\2\2SQ\3\2\2\2TU\7\n\2\2U\7\3\2\2\2VW"+
		"\7\t\2\2WX\5\n\6\2XY\b\5\1\2YZ\7\n\2\2Z\t\3\2\2\2[\\\t\2\2\2\\]\t\2\2"+
		"\2]^\b\6\1\2^\13\3\2\2\2_`\7\22\2\2`a\7\26\2\2ab\b\7\1\2b\r\3\2\2\2cd"+
		"\7\23\2\2de\b\b\1\2e\17\3\2\2\2fg\7\24\2\2gh\b\t\1\2h\21\3\2\2\2il\7\25"+
		"\2\2jk\7\4\2\2km\5\22\n\2lj\3\2\2\2lm\3\2\2\2mn\3\2\2\2n|\b\n\1\2or\7"+
		"\27\2\2pq\7\4\2\2qs\5\22\n\2rp\3\2\2\2rs\3\2\2\2st\3\2\2\2t|\b\n\1\2u"+
		"x\7\24\2\2vw\7\4\2\2wy\5\22\n\2xv\3\2\2\2xy\3\2\2\2yz\3\2\2\2z|\b\n\1"+
		"\2{i\3\2\2\2{o\3\2\2\2{u\3\2\2\2|\23\3\2\2\2}\u0080\5\26\f\2~\177\7\4"+
		"\2\2\177\u0081\5\24\13\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\25\3"+
		"\2\2\2\u0082\u0083\5\30\r\2\u0083\u0084\5\26\f\2\u0084\u0089\3\2\2\2\u0085"+
		"\u0086\5\30\r\2\u0086\u0087\b\f\1\2\u0087\u0089\3\2\2\2\u0088\u0082\3"+
		"\2\2\2\u0088\u0085\3\2\2\2\u0089\27\3\2\2\2\u008a\u008b\5\16\b\2\u008b"+
		"\u008c\7\t\2\2\u008c\u008d\5\32\16\2\u008d\u008f\7\n\2\2\u008e\u0090\7"+
		"\26\2\2\u008f\u008e\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0091\3\2\2\2\u0091"+
		"\u0092\b\r\1\2\u0092\u00a0\3\2\2\2\u0093\u0095\5\16\b\2\u0094\u0096\7"+
		"\26\2\2\u0095\u0094\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0097\3\2\2\2\u0097"+
		"\u0098\b\r\1\2\u0098\u00a0\3\2\2\2\u0099\u009b\5\36\20\2\u009a\u009c\7"+
		"\26\2\2\u009b\u009a\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009d\3\2\2\2\u009d"+
		"\u009e\b\r\1\2\u009e\u00a0\3\2\2\2\u009f\u008a\3\2\2\2\u009f\u0093\3\2"+
		"\2\2\u009f\u0099\3\2\2\2\u00a0\31\3\2\2\2\u00a1\u00a2\5\34\17\2\u00a2"+
		"\u00a3\7\16\2\2\u00a3\u00a4\5\32\16\2\u00a4\u00a5\b\16\1\2\u00a5\u00aa"+
		"\3\2\2\2\u00a6\u00a7\5\34\17\2\u00a7\u00a8\b\16\1\2\u00a8\u00aa\3\2\2"+
		"\2\u00a9\u00a1\3\2\2\2\u00a9\u00a6\3\2\2\2\u00aa\33\3\2\2\2\u00ab\u00ac"+
		"\t\2\2\2\u00ac\u00b0\b\17\1\2\u00ad\u00ae\7\26\2\2\u00ae\u00b0\b\17\1"+
		"\2\u00af\u00ab\3\2\2\2\u00af\u00ad\3\2\2\2\u00b0\35\3\2\2\2\u00b1\u00b2"+
		"\5\20\t\2\u00b2\u00b3\b\20\1\2\u00b3\u00b9\3\2\2\2\u00b4\u00b5\7\27\2"+
		"\2\u00b5\u00b9\b\20\1\2\u00b6\u00b7\7\25\2\2\u00b7\u00b9\b\20\1\2\u00b8"+
		"\u00b1\3\2\2\2\u00b8\u00b4\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b9\37\3\2\2"+
		"\2\27\"&*\61\658FQlrx{\u0080\u0088\u008f\u0095\u009b\u009f\u00a9\u00af"+
		"\u00b8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}