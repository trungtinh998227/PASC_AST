// Generated from C:/Users/trung/Desktop/PASC_ParseTree\Expr.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExprParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, VARnumber=2, ANDnumber=3, ARRAYnumber=4, BEGINnumber=5, CONSTnumber=6, 
		DIVnumber=7, DOWNTOnumber=8, ELSEnumber=9, ELSIFnumber=10, ENDnumber=11, 
		ENDIFnumber=12, ENDLOOPnumber=13, ENDRECnumber=14, EXITnumber=15, FORnumber=16, 
		FORWARDnumber=17, FUNCTIONnumber=18, IFnumber=19, ISnumber=20, LOOPnumber=21, 
		NOTnumber=22, OFnumber=23, ORnumber=24, PROCEDUREnumber=25, PROGRAMnumber=26, 
		RECORDnumber=27, REPEATnumber=28, RETURNnumber=29, THENnumber=30, TOnumber=31, 
		TYPEnumber=32, UNTILnumber=33, WHILEnumber=34, ICONTSnumber=35, PLUSnumber=36, 
		MINUSnumber=37, TIMESnumber=38, COLEQnumber=39, LPARENnumber=40, RPARENnumber=41, 
		DOTnumber=42, SEMInumber=43, COLONnumber=44, COMMAnumber=45, LTnumber=46, 
		GTnumber=47, EQnumber=48, LEnumber=49, GEnumber=50, NEnumber=51, IDnumber=52, 
		NEWLINE=1, VAR=3, PRINT=4, AS=5, INT=6, ID=15, T__0=1, LPAREN=16, RPAREN=17, 
		MINUS=18, NUMBER=19, DIVISION=20, ASTERISK=21, PLUS=22;
	public static final int
		RULE_program = 0, RULE_expr = 1, RULE_block = 2, RULE_loopStatement = 3, 
		RULE_ifStatement = 4, RULE_condition = 5, RULE_operator = 6, RULE_assign = 7, 
		RULE_constnumber = 8, RULE_constvalue = 9, RULE_paren = 10, RULE_identifier = 11, 
		RULE_declare = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "expr", "block", "loopStatement", "ifStatement", "condition", 
			"operator", "assign", "constnumber", "constvalue", "paren", "identifier", 
			"declare"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'var'", "'and'", "'print'", "'as'", "'Int'", "'div'", "'downto'", 
			"'else'", "'elsif'", "'end'", "'endif'", "'endloop'", "'endrec'", "'exit'", 
			"'for'", "'forward'", "'function'", "'if'", "'is'", "'loop'", "'not'", 
			"'of'", "'or'", "'procedure'", "'program'", "'record'", "'repeat'", "'return'", 
			"'then'", "'to'", "'type'", "'util'", "'while'", null, "'+'", "'-'", 
			"'*'", "':='", "'('", "')'", "'.'", "';'", "':'", "','", "'<'", "'>'", 
			"'=='", "'<='", "'>='", "'<>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "VARnumber", "ANDnumber", "ARRAYnumber", "BEGINnumber", "CONSTnumber", 
			"DIVnumber", "DOWNTOnumber", "ELSEnumber", "ELSIFnumber", "ENDnumber", 
			"ENDIFnumber", "ENDLOOPnumber", "ENDRECnumber", "EXITnumber", "FORnumber", 
			"FORWARDnumber", "FUNCTIONnumber", "IFnumber", "ISnumber", "LOOPnumber", 
			"NOTnumber", "OFnumber", "ORnumber", "PROCEDUREnumber", "PROGRAMnumber", 
			"RECORDnumber", "REPEATnumber", "RETURNnumber", "THENnumber", "TOnumber", 
			"TYPEnumber", "UNTILnumber", "WHILEnumber", "ICONTSnumber", "PLUSnumber", 
			"MINUSnumber", "TIMESnumber", "COLEQnumber", "LPARENnumber", "RPARENnumber", 
			"DOTnumber", "SEMInumber", "COLONnumber", "COMMAnumber", "LTnumber", 
			"GTnumber", "EQnumber", "LEnumber", "GEnumber", "NEnumber", "IDnumber"
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
	public String getGrammarFileName() { return "Expr.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ExprParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode PROGRAMnumber() { return getToken(ExprParser.PROGRAMnumber, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMInumber() { return getToken(ExprParser.SEMInumber, 0); }
		public DeclareContext declare() {
			return getRuleContext(DeclareContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			match(PROGRAMnumber);
			setState(27);
			expr(0);
			setState(28);
			match(SEMInumber);
			setState(29);
			declare();
			setState(30);
			block();
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

	public static class ExprContext extends ParserRuleContext {
		public ParenContext paren() {
			return getRuleContext(ParenContext.class,0);
		}
		public ConstvalueContext constvalue() {
			return getRuleContext(ConstvalueContext.class,0);
		}
		public DeclareContext declare() {
			return getRuleContext(DeclareContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public LoopStatementContext loopStatement() {
			return getRuleContext(LoopStatementContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ConstnumberContext constnumber() {
			return getRuleContext(ConstnumberContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public TerminalNode COMMAnumber() { return getToken(ExprParser.COMMAnumber, 0); }
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FORnumber:
				{
				setState(33);
				paren();
				}
				break;
			case CONSTnumber:
				{
				setState(34);
				constvalue();
				}
				break;
			case VARnumber:
				{
				setState(35);
				declare();
				}
				break;
			case IFnumber:
				{
				setState(36);
				ifStatement();
				}
				break;
			case LOOPnumber:
			case WHILEnumber:
				{
				setState(37);
				loopStatement();
				}
				break;
			case IDnumber:
				{
				setState(38);
				identifier();
				}
				break;
			case ICONTSnumber:
				{
				setState(39);
				constnumber();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(53);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(51);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(42);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(43);
						operator();
						setState(44);
						expr(11);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(46);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(47);
						match(COMMAnumber);
						setState(48);
						expr(7);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(49);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(50);
						assign();
						}
						break;
					}
					} 
				}
				setState(55);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode BEGINnumber() { return getToken(ExprParser.BEGINnumber, 0); }
		public TerminalNode ENDnumber() { return getToken(ExprParser.ENDnumber, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(BEGINnumber);
			setState(58); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(57);
				expr(0);
				}
				}
				setState(60); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VARnumber) | (1L << CONSTnumber) | (1L << FORnumber) | (1L << IFnumber) | (1L << LOOPnumber) | (1L << WHILEnumber) | (1L << ICONTSnumber) | (1L << IDnumber))) != 0) );
			setState(62);
			match(ENDnumber);
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

	public static class LoopStatementContext extends ParserRuleContext {
		public LoopStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopStatement; }
	 
		public LoopStatementContext() { }
		public void copyFrom(LoopStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LoopContext extends LoopStatementContext {
		public TerminalNode LOOPnumber() { return getToken(ExprParser.LOOPnumber, 0); }
		public TerminalNode ENDLOOPnumber() { return getToken(ExprParser.ENDLOOPnumber, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public LoopContext(LoopStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitLoop(this);
		}
	}
	public static class WhileContext extends LoopStatementContext {
		public TerminalNode WHILEnumber() { return getToken(ExprParser.WHILEnumber, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public WhileContext(LoopStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitWhile(this);
		}
	}

	public final LoopStatementContext loopStatement() throws RecognitionException {
		LoopStatementContext _localctx = new LoopStatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_loopStatement);
		int _la;
		try {
			int _alt;
			setState(79);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHILEnumber:
				_localctx = new WhileContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(64);
				match(WHILEnumber);
				setState(65);
				condition();
				setState(67); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(66);
						expr(0);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(69); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case LOOPnumber:
				_localctx = new LoopContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(71);
				match(LOOPnumber);
				setState(73); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(72);
					expr(0);
					}
					}
					setState(75); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VARnumber) | (1L << CONSTnumber) | (1L << FORnumber) | (1L << IFnumber) | (1L << LOOPnumber) | (1L << WHILEnumber) | (1L << ICONTSnumber) | (1L << IDnumber))) != 0) );
				setState(77);
				match(ENDLOOPnumber);
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

	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode IFnumber() { return getToken(ExprParser.IFnumber, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode THENnumber() { return getToken(ExprParser.THENnumber, 0); }
		public TerminalNode ENDIFnumber() { return getToken(ExprParser.ENDIFnumber, 0); }
		public TerminalNode ELSEnumber() { return getToken(ExprParser.ELSEnumber, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitIfStatement(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_ifStatement);
		int _la;
		try {
			setState(110);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(81);
				match(IFnumber);
				setState(82);
				condition();
				setState(83);
				match(THENnumber);
				setState(85); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(84);
					expr(0);
					}
					}
					setState(87); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VARnumber) | (1L << CONSTnumber) | (1L << FORnumber) | (1L << IFnumber) | (1L << LOOPnumber) | (1L << WHILEnumber) | (1L << ICONTSnumber) | (1L << IDnumber))) != 0) );
				{
				setState(89);
				match(ELSEnumber);
				setState(96);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case BEGINnumber:
					{
					setState(90);
					block();
					}
					break;
				case VARnumber:
				case CONSTnumber:
				case FORnumber:
				case IFnumber:
				case LOOPnumber:
				case WHILEnumber:
				case ICONTSnumber:
				case IDnumber:
					{
					setState(92); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(91);
						expr(0);
						}
						}
						setState(94); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VARnumber) | (1L << CONSTnumber) | (1L << FORnumber) | (1L << IFnumber) | (1L << LOOPnumber) | (1L << WHILEnumber) | (1L << ICONTSnumber) | (1L << IDnumber))) != 0) );
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(98);
				match(ENDIFnumber);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(100);
				match(IFnumber);
				setState(101);
				condition();
				setState(102);
				match(THENnumber);
				setState(104); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(103);
					expr(0);
					}
					}
					setState(106); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VARnumber) | (1L << CONSTnumber) | (1L << FORnumber) | (1L << IFnumber) | (1L << LOOPnumber) | (1L << WHILEnumber) | (1L << ICONTSnumber) | (1L << IDnumber))) != 0) );
				setState(108);
				match(ENDIFnumber);
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

	public static class ConditionContext extends ParserRuleContext {
		public Token compare;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode EQnumber() { return getToken(ExprParser.EQnumber, 0); }
		public TerminalNode LEnumber() { return getToken(ExprParser.LEnumber, 0); }
		public TerminalNode GEnumber() { return getToken(ExprParser.GEnumber, 0); }
		public TerminalNode NEnumber() { return getToken(ExprParser.NEnumber, 0); }
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitCondition(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			expr(0);
			setState(113);
			((ConditionContext)_localctx).compare = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQnumber) | (1L << LEnumber) | (1L << GEnumber) | (1L << NEnumber))) != 0)) ) {
				((ConditionContext)_localctx).compare = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(114);
			expr(0);
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

	public static class OperatorContext extends ParserRuleContext {
		public TerminalNode PLUSnumber() { return getToken(ExprParser.PLUSnumber, 0); }
		public TerminalNode MINUSnumber() { return getToken(ExprParser.MINUSnumber, 0); }
		public TerminalNode TIMESnumber() { return getToken(ExprParser.TIMESnumber, 0); }
		public TerminalNode DIVnumber() { return getToken(ExprParser.DIVnumber, 0); }
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitOperator(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIVnumber) | (1L << PLUSnumber) | (1L << MINUSnumber) | (1L << TIMESnumber))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class AssignContext extends ParserRuleContext {
		public TerminalNode COLEQnumber() { return getToken(ExprParser.COLEQnumber, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMInumber() { return getToken(ExprParser.SEMInumber, 0); }
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitAssign(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(COLEQnumber);
			setState(119);
			expr(0);
			setState(120);
			match(SEMInumber);
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

	public static class ConstnumberContext extends ParserRuleContext {
		public TerminalNode ICONTSnumber() { return getToken(ExprParser.ICONTSnumber, 0); }
		public ConstnumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constnumber; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterConstnumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitConstnumber(this);
		}
	}

	public final ConstnumberContext constnumber() throws RecognitionException {
		ConstnumberContext _localctx = new ConstnumberContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_constnumber);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(ICONTSnumber);
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

	public static class ConstvalueContext extends ParserRuleContext {
		public TerminalNode CONSTnumber() { return getToken(ExprParser.CONSTnumber, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMInumber() { return getToken(ExprParser.SEMInumber, 0); }
		public ConstvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constvalue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterConstvalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitConstvalue(this);
		}
	}

	public final ConstvalueContext constvalue() throws RecognitionException {
		ConstvalueContext _localctx = new ConstvalueContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_constvalue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(CONSTnumber);
			setState(125);
			expr(0);
			setState(126);
			match(SEMInumber);
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

	public static class ParenContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(ExprParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ExprParser.RPAREN, 0); }
		public ParenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paren; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterParen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitParen(this);
		}
	}

	public final ParenContext paren() throws RecognitionException {
		ParenContext _localctx = new ParenContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_paren);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(FORnumber);
			setState(129);
			expr(0);
			setState(130);
			match(FORWARDnumber);
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

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode IDnumber() { return getToken(ExprParser.IDnumber, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitIdentifier(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(IDnumber);
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

	public static class DeclareContext extends ParserRuleContext {
		public TerminalNode VARnumber() { return getToken(ExprParser.VARnumber, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMInumber() { return getToken(ExprParser.SEMInumber, 0); }
		public DeclareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterDeclare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitDeclare(this);
		}
	}

	public final DeclareContext declare() throws RecognitionException {
		DeclareContext _localctx = new DeclareContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_declare);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(VARnumber);
			setState(135);
			expr(0);
			setState(136);
			match(SEMInumber);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 10);
		case 1:
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 9);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\66\u008d\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\5\3+\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3\66"+
		"\n\3\f\3\16\39\13\3\3\4\3\4\6\4=\n\4\r\4\16\4>\3\4\3\4\3\5\3\5\3\5\6\5"+
		"F\n\5\r\5\16\5G\3\5\3\5\6\5L\n\5\r\5\16\5M\3\5\3\5\5\5R\n\5\3\6\3\6\3"+
		"\6\3\6\6\6X\n\6\r\6\16\6Y\3\6\3\6\3\6\6\6_\n\6\r\6\16\6`\5\6c\n\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\6\6k\n\6\r\6\16\6l\3\6\3\6\5\6q\n\6\3\7\3\7\3\7\3"+
		"\7\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f"+
		"\3\r\3\r\3\16\3\16\3\16\3\16\3\16\2\3\4\17\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\2\4\3\2\62\65\4\2\t\t&(\2\u0091\2\34\3\2\2\2\4*\3\2\2\2\6:\3\2"+
		"\2\2\bQ\3\2\2\2\np\3\2\2\2\fr\3\2\2\2\16v\3\2\2\2\20x\3\2\2\2\22|\3\2"+
		"\2\2\24~\3\2\2\2\26\u0082\3\2\2\2\30\u0086\3\2\2\2\32\u0088\3\2\2\2\34"+
		"\35\7\34\2\2\35\36\5\4\3\2\36\37\7-\2\2\37 \5\32\16\2 !\5\6\4\2!\3\3\2"+
		"\2\2\"#\b\3\1\2#+\5\26\f\2$+\5\24\13\2%+\5\32\16\2&+\5\n\6\2\'+\5\b\5"+
		"\2(+\5\30\r\2)+\5\22\n\2*\"\3\2\2\2*$\3\2\2\2*%\3\2\2\2*&\3\2\2\2*\'\3"+
		"\2\2\2*(\3\2\2\2*)\3\2\2\2+\67\3\2\2\2,-\f\f\2\2-.\5\16\b\2./\5\4\3\r"+
		"/\66\3\2\2\2\60\61\f\b\2\2\61\62\7/\2\2\62\66\5\4\3\t\63\64\f\13\2\2\64"+
		"\66\5\20\t\2\65,\3\2\2\2\65\60\3\2\2\2\65\63\3\2\2\2\669\3\2\2\2\67\65"+
		"\3\2\2\2\678\3\2\2\28\5\3\2\2\29\67\3\2\2\2:<\7\7\2\2;=\5\4\3\2<;\3\2"+
		"\2\2=>\3\2\2\2><\3\2\2\2>?\3\2\2\2?@\3\2\2\2@A\7\r\2\2A\7\3\2\2\2BC\7"+
		"$\2\2CE\5\f\7\2DF\5\4\3\2ED\3\2\2\2FG\3\2\2\2GE\3\2\2\2GH\3\2\2\2HR\3"+
		"\2\2\2IK\7\27\2\2JL\5\4\3\2KJ\3\2\2\2LM\3\2\2\2MK\3\2\2\2MN\3\2\2\2NO"+
		"\3\2\2\2OP\7\17\2\2PR\3\2\2\2QB\3\2\2\2QI\3\2\2\2R\t\3\2\2\2ST\7\25\2"+
		"\2TU\5\f\7\2UW\7 \2\2VX\5\4\3\2WV\3\2\2\2XY\3\2\2\2YW\3\2\2\2YZ\3\2\2"+
		"\2Z[\3\2\2\2[b\7\13\2\2\\c\5\6\4\2]_\5\4\3\2^]\3\2\2\2_`\3\2\2\2`^\3\2"+
		"\2\2`a\3\2\2\2ac\3\2\2\2b\\\3\2\2\2b^\3\2\2\2cd\3\2\2\2de\7\16\2\2eq\3"+
		"\2\2\2fg\7\25\2\2gh\5\f\7\2hj\7 \2\2ik\5\4\3\2ji\3\2\2\2kl\3\2\2\2lj\3"+
		"\2\2\2lm\3\2\2\2mn\3\2\2\2no\7\16\2\2oq\3\2\2\2pS\3\2\2\2pf\3\2\2\2q\13"+
		"\3\2\2\2rs\5\4\3\2st\t\2\2\2tu\5\4\3\2u\r\3\2\2\2vw\t\3\2\2w\17\3\2\2"+
		"\2xy\7)\2\2yz\5\4\3\2z{\7-\2\2{\21\3\2\2\2|}\7%\2\2}\23\3\2\2\2~\177\7"+
		"\b\2\2\177\u0080\5\4\3\2\u0080\u0081\7-\2\2\u0081\25\3\2\2\2\u0082\u0083"+
		"\7\22\2\2\u0083\u0084\5\4\3\2\u0084\u0085\7\23\2\2\u0085\27\3\2\2\2\u0086"+
		"\u0087\7\66\2\2\u0087\31\3\2\2\2\u0088\u0089\7\4\2\2\u0089\u008a\5\4\3"+
		"\2\u008a\u008b\7-\2\2\u008b\33\3\2\2\2\16*\65\67>GMQY`blp";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}