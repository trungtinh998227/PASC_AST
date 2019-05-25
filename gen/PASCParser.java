// Generated from C:/Users/trung/Desktop/PASC_AST\PASC.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PASCParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, WS=5, VARnumber=6, ANDnumber=7, ARRAYnumber=8, 
		BEGINnumber=9, CONSTnumber=10, DIVnumber=11, DOWNTOnumber=12, ELSEnumber=13, 
		ELSIFnumber=14, ENDnumber=15, ENDIFnumber=16, ENDLOOPnumber=17, ENDRECnumber=18, 
		EXITnumber=19, FORnumber=20, FORWARDnumber=21, FUNCTIONnumber=22, IFnumber=23, 
		ISnumber=24, LOOPnumber=25, NOTnumber=26, OFnumber=27, ORnumber=28, PROCEDUREnumber=29, 
		PROGRAMnumber=30, RECORDnumber=31, REPEATnumber=32, RETURNnumber=33, THENnumber=34, 
		TOnumber=35, TYPEnumber=36, UNTILnumber=37, WHILEnumber=38, ICONTSnumber=39, 
		PLUSnumber=40, MINUSnumber=41, TIMESnumber=42, COLEQnumber=43, LPARENnumber=44, 
		RPARENnumber=45, DOTnumber=46, SEMInumber=47, COLONnumber=48, COMMAnumber=49, 
		LTnumber=50, GTnumber=51, EQnumber=52, LEnumber=53, GEnumber=54, NEnumber=55, 
		IDnumber=56, LPAREN=57, RPAREN=58;
	public static final int
		RULE_program = 0, RULE_expr = 1, RULE_block = 2, RULE_loopStatement = 3, 
		RULE_ifStatement = 4, RULE_condition = 5, RULE_operator = 6, RULE_assign = 7, 
		RULE_constnumber = 8, RULE_constvalue = 9, RULE_paren = 10, RULE_identifier = 11, 
		RULE_declare = 12, RULE_string = 13, RULE_char = 14, RULE_forStatement = 15, 
		RULE_repeat = 16;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "expr", "block", "loopStatement", "ifStatement", "condition", 
			"operator", "assign", "constnumber", "constvalue", "paren", "identifier", 
			"declare", "string", "char", "forStatement", "repeat"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'(*'", "'*)'", "'''", "'do'", null, "'var'", "'and'", "'array'", 
			"'begin'", "'const'", "'div'", "'downto'", "'else'", "'elsif'", "'end'", 
			"'endif'", "'endloop'", "'endrec'", "'exit'", "'for'", "'forward'", "'function'", 
			"'if'", "'is'", "'loop'", "'not'", "'of'", "'or'", "'procedure'", "'program'", 
			"'record'", "'repeat'", "'return'", "'then'", "'to'", "'type'", "'util'", 
			"'while'", null, "'+'", "'-'", "'*'", "':='", "'('", "')'", "'.'", "';'", 
			"':'", "','", "'<'", "'>'", "'=='", "'<='", "'>='", "'<>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "WS", "VARnumber", "ANDnumber", "ARRAYnumber", 
			"BEGINnumber", "CONSTnumber", "DIVnumber", "DOWNTOnumber", "ELSEnumber", 
			"ELSIFnumber", "ENDnumber", "ENDIFnumber", "ENDLOOPnumber", "ENDRECnumber", 
			"EXITnumber", "FORnumber", "FORWARDnumber", "FUNCTIONnumber", "IFnumber", 
			"ISnumber", "LOOPnumber", "NOTnumber", "OFnumber", "ORnumber", "PROCEDUREnumber", 
			"PROGRAMnumber", "RECORDnumber", "REPEATnumber", "RETURNnumber", "THENnumber", 
			"TOnumber", "TYPEnumber", "UNTILnumber", "WHILEnumber", "ICONTSnumber", 
			"PLUSnumber", "MINUSnumber", "TIMESnumber", "COLEQnumber", "LPARENnumber", 
			"RPARENnumber", "DOTnumber", "SEMInumber", "COLONnumber", "COMMAnumber", 
			"LTnumber", "GTnumber", "EQnumber", "LEnumber", "GEnumber", "NEnumber", 
			"IDnumber", "LPAREN", "RPAREN"
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
	public String getGrammarFileName() { return "PASC.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PASCParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode PROGRAMnumber() { return getToken(PASCParser.PROGRAMnumber, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMInumber() { return getToken(PASCParser.SEMInumber, 0); }
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
			if ( listener instanceof PASCListener ) ((PASCListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PASCListener ) ((PASCListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PASCVisitor ) return ((PASCVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			match(PROGRAMnumber);
			setState(35);
			expr(0);
			setState(36);
			match(SEMInumber);
			setState(37);
			declare();
			setState(38);
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
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public CharContext char() {
			return getRuleContext(CharContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public RepeatContext repeat() {
			return getRuleContext(RepeatContext.class,0);
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
		public TerminalNode COMMAnumber() { return getToken(PASCParser.COMMAnumber, 0); }
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PASCListener ) ((PASCListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PASCListener ) ((PASCListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PASCVisitor ) return ((PASCVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
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
			setState(52);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(41);
				paren();
				}
				break;
			case 2:
				{
				setState(42);
				constvalue();
				}
				break;
			case 3:
				{
				setState(43);
				declare();
				}
				break;
			case 4:
				{
				setState(44);
				ifStatement();
				}
				break;
			case 5:
				{
				setState(45);
				loopStatement();
				}
				break;
			case 6:
				{
				setState(46);
				identifier();
				}
				break;
			case 7:
				{
				setState(47);
				constnumber();
				}
				break;
			case 8:
				{
				setState(48);
				string();
				}
				break;
			case 9:
				{
				setState(49);
				char();
				}
				break;
			case 10:
				{
				setState(50);
				forStatement();
				}
				break;
			case 11:
				{
				setState(51);
				repeat();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(65);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(63);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(54);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(55);
						operator();
						setState(56);
						expr(15);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(58);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(59);
						match(COMMAnumber);
						setState(60);
						expr(11);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(61);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(62);
						assign();
						}
						break;
					}
					} 
				}
				setState(67);
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
		public TerminalNode BEGINnumber() { return getToken(PASCParser.BEGINnumber, 0); }
		public TerminalNode ENDnumber() { return getToken(PASCParser.ENDnumber, 0); }
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
			if ( listener instanceof PASCListener ) ((PASCListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PASCListener ) ((PASCListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PASCVisitor ) return ((PASCVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(BEGINnumber);
			setState(70); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(69);
				expr(0);
				}
				}
				setState(72); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << VARnumber) | (1L << CONSTnumber) | (1L << FORnumber) | (1L << IFnumber) | (1L << LOOPnumber) | (1L << REPEATnumber) | (1L << WHILEnumber) | (1L << ICONTSnumber) | (1L << IDnumber) | (1L << LPAREN))) != 0) );
			setState(74);
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
		public TerminalNode LOOPnumber() { return getToken(PASCParser.LOOPnumber, 0); }
		public TerminalNode ENDLOOPnumber() { return getToken(PASCParser.ENDLOOPnumber, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public LoopContext(LoopStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PASCListener ) ((PASCListener)listener).enterLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PASCListener ) ((PASCListener)listener).exitLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PASCVisitor ) return ((PASCVisitor<? extends T>)visitor).visitLoop(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WhileContext extends LoopStatementContext {
		public TerminalNode WHILEnumber() { return getToken(PASCParser.WHILEnumber, 0); }
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
			if ( listener instanceof PASCListener ) ((PASCListener)listener).enterWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PASCListener ) ((PASCListener)listener).exitWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PASCVisitor ) return ((PASCVisitor<? extends T>)visitor).visitWhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopStatementContext loopStatement() throws RecognitionException {
		LoopStatementContext _localctx = new LoopStatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_loopStatement);
		int _la;
		try {
			int _alt;
			setState(91);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHILEnumber:
				_localctx = new WhileContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(76);
				match(WHILEnumber);
				setState(77);
				condition(0);
				setState(79); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(78);
						expr(0);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(81); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case LOOPnumber:
				_localctx = new LoopContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(83);
				match(LOOPnumber);
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
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << VARnumber) | (1L << CONSTnumber) | (1L << FORnumber) | (1L << IFnumber) | (1L << LOOPnumber) | (1L << REPEATnumber) | (1L << WHILEnumber) | (1L << ICONTSnumber) | (1L << IDnumber) | (1L << LPAREN))) != 0) );
				setState(89);
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
		public TerminalNode IFnumber() { return getToken(PASCParser.IFnumber, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode THENnumber() { return getToken(PASCParser.THENnumber, 0); }
		public TerminalNode ELSEnumber() { return getToken(PASCParser.ELSEnumber, 0); }
		public TerminalNode ENDIFnumber() { return getToken(PASCParser.ENDIFnumber, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PASCListener ) ((PASCListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PASCListener ) ((PASCListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PASCVisitor ) return ((PASCVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_ifStatement);
		int _la;
		try {
			setState(122);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(93);
				match(IFnumber);
				setState(94);
				condition(0);
				setState(95);
				match(THENnumber);
				setState(97); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(96);
					expr(0);
					}
					}
					setState(99); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << VARnumber) | (1L << CONSTnumber) | (1L << FORnumber) | (1L << IFnumber) | (1L << LOOPnumber) | (1L << REPEATnumber) | (1L << WHILEnumber) | (1L << ICONTSnumber) | (1L << IDnumber) | (1L << LPAREN))) != 0) );
				setState(101);
				match(ELSEnumber);
				setState(108);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case BEGINnumber:
					{
					setState(102);
					block();
					}
					break;
				case T__0:
				case T__2:
				case VARnumber:
				case CONSTnumber:
				case FORnumber:
				case IFnumber:
				case LOOPnumber:
				case REPEATnumber:
				case WHILEnumber:
				case ICONTSnumber:
				case IDnumber:
				case LPAREN:
					{
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
					} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << VARnumber) | (1L << CONSTnumber) | (1L << FORnumber) | (1L << IFnumber) | (1L << LOOPnumber) | (1L << REPEATnumber) | (1L << WHILEnumber) | (1L << ICONTSnumber) | (1L << IDnumber) | (1L << LPAREN))) != 0) );
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(110);
				match(ENDIFnumber);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(112);
				match(IFnumber);
				setState(113);
				condition(0);
				setState(114);
				match(THENnumber);
				setState(116); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(115);
					expr(0);
					}
					}
					setState(118); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << VARnumber) | (1L << CONSTnumber) | (1L << FORnumber) | (1L << IFnumber) | (1L << LOOPnumber) | (1L << REPEATnumber) | (1L << WHILEnumber) | (1L << ICONTSnumber) | (1L << IDnumber) | (1L << LPAREN))) != 0) );
				setState(120);
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
		public TerminalNode EQnumber() { return getToken(PASCParser.EQnumber, 0); }
		public TerminalNode LEnumber() { return getToken(PASCParser.LEnumber, 0); }
		public TerminalNode GEnumber() { return getToken(PASCParser.GEnumber, 0); }
		public TerminalNode NEnumber() { return getToken(PASCParser.NEnumber, 0); }
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public TerminalNode ANDnumber() { return getToken(PASCParser.ANDnumber, 0); }
		public TerminalNode ORnumber() { return getToken(PASCParser.ORnumber, 0); }
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PASCListener ) ((PASCListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PASCListener ) ((PASCListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PASCVisitor ) return ((PASCVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		return condition(0);
	}

	private ConditionContext condition(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConditionContext _localctx = new ConditionContext(_ctx, _parentState);
		ConditionContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_condition, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(125);
			expr(0);
			setState(126);
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
			setState(127);
			expr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(137);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(135);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new ConditionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(129);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(130);
						match(ANDnumber);
						setState(131);
						condition(3);
						}
						break;
					case 2:
						{
						_localctx = new ConditionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(132);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(133);
						match(ORnumber);
						setState(134);
						condition(2);
						}
						break;
					}
					} 
				}
				setState(139);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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

	public static class OperatorContext extends ParserRuleContext {
		public TerminalNode PLUSnumber() { return getToken(PASCParser.PLUSnumber, 0); }
		public TerminalNode MINUSnumber() { return getToken(PASCParser.MINUSnumber, 0); }
		public TerminalNode TIMESnumber() { return getToken(PASCParser.TIMESnumber, 0); }
		public TerminalNode DIVnumber() { return getToken(PASCParser.DIVnumber, 0); }
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PASCListener ) ((PASCListener)listener).enterOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PASCListener ) ((PASCListener)listener).exitOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PASCVisitor ) return ((PASCVisitor<? extends T>)visitor).visitOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
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
		public TerminalNode COLEQnumber() { return getToken(PASCParser.COLEQnumber, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMInumber() { return getToken(PASCParser.SEMInumber, 0); }
		public ConstnumberContext constnumber() {
			return getRuleContext(ConstnumberContext.class,0);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PASCListener ) ((PASCListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PASCListener ) ((PASCListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PASCVisitor ) return ((PASCVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_assign);
		try {
			setState(150);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COLEQnumber:
				enterOuterAlt(_localctx, 1);
				{
				setState(142);
				match(COLEQnumber);
				setState(143);
				expr(0);
				setState(144);
				match(SEMInumber);
				}
				break;
			case T__0:
			case T__2:
			case VARnumber:
			case CONSTnumber:
			case FORnumber:
			case IFnumber:
			case LOOPnumber:
			case REPEATnumber:
			case WHILEnumber:
			case ICONTSnumber:
			case IDnumber:
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(146);
				expr(0);
				setState(147);
				match(COLEQnumber);
				setState(148);
				constnumber();
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

	public static class ConstnumberContext extends ParserRuleContext {
		public TerminalNode ICONTSnumber() { return getToken(PASCParser.ICONTSnumber, 0); }
		public ConstnumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constnumber; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PASCListener ) ((PASCListener)listener).enterConstnumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PASCListener ) ((PASCListener)listener).exitConstnumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PASCVisitor ) return ((PASCVisitor<? extends T>)visitor).visitConstnumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstnumberContext constnumber() throws RecognitionException {
		ConstnumberContext _localctx = new ConstnumberContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_constnumber);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
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
		public TerminalNode CONSTnumber() { return getToken(PASCParser.CONSTnumber, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMInumber() { return getToken(PASCParser.SEMInumber, 0); }
		public ConstvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constvalue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PASCListener ) ((PASCListener)listener).enterConstvalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PASCListener ) ((PASCListener)listener).exitConstvalue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PASCVisitor ) return ((PASCVisitor<? extends T>)visitor).visitConstvalue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstvalueContext constvalue() throws RecognitionException {
		ConstvalueContext _localctx = new ConstvalueContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_constvalue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(CONSTnumber);
			setState(155);
			expr(0);
			setState(156);
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
		public TerminalNode LPAREN() { return getToken(PASCParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PASCParser.RPAREN, 0); }
		public ParenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paren; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PASCListener ) ((PASCListener)listener).enterParen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PASCListener ) ((PASCListener)listener).exitParen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PASCVisitor ) return ((PASCVisitor<? extends T>)visitor).visitParen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParenContext paren() throws RecognitionException {
		ParenContext _localctx = new ParenContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_paren);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(LPAREN);
			setState(159);
			expr(0);
			setState(160);
			match(RPAREN);
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
		public TerminalNode IDnumber() { return getToken(PASCParser.IDnumber, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PASCListener ) ((PASCListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PASCListener ) ((PASCListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PASCVisitor ) return ((PASCVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
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
		public TerminalNode VARnumber() { return getToken(PASCParser.VARnumber, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMInumber() { return getToken(PASCParser.SEMInumber, 0); }
		public DeclareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PASCListener ) ((PASCListener)listener).enterDeclare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PASCListener ) ((PASCListener)listener).exitDeclare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PASCVisitor ) return ((PASCVisitor<? extends T>)visitor).visitDeclare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclareContext declare() throws RecognitionException {
		DeclareContext _localctx = new DeclareContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_declare);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(VARnumber);
			setState(165);
			expr(0);
			setState(166);
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

	public static class StringContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PASCListener ) ((PASCListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PASCListener ) ((PASCListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PASCVisitor ) return ((PASCVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_string);
		int _la;
		try {
			int _alt;
			setState(184);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(168);
				match(T__0);
				setState(170); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(169);
					expr(0);
					}
					}
					setState(172); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << VARnumber) | (1L << CONSTnumber) | (1L << FORnumber) | (1L << IFnumber) | (1L << LOOPnumber) | (1L << REPEATnumber) | (1L << WHILEnumber) | (1L << ICONTSnumber) | (1L << IDnumber) | (1L << LPAREN))) != 0) );
				setState(174);
				match(T__1);
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(176);
				match(T__2);
				setState(178); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(177);
						expr(0);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(180); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(182);
				match(T__2);
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

	public static class CharContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public CharContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_char; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PASCListener ) ((PASCListener)listener).enterChar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PASCListener ) ((PASCListener)listener).exitChar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PASCVisitor ) return ((PASCVisitor<? extends T>)visitor).visitChar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CharContext char() throws RecognitionException {
		CharContext _localctx = new CharContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_char);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(T__2);
			setState(187);
			expr(0);
			setState(188);
			match(T__2);
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

	public static class ForStatementContext extends ParserRuleContext {
		public TerminalNode FORnumber() { return getToken(PASCParser.FORnumber, 0); }
		public TerminalNode COLEQnumber() { return getToken(PASCParser.COLEQnumber, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode TOnumber() { return getToken(PASCParser.TOnumber, 0); }
		public ConstnumberContext constnumber() {
			return getRuleContext(ConstnumberContext.class,0);
		}
		public TerminalNode DOWNTOnumber() { return getToken(PASCParser.DOWNTOnumber, 0); }
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PASCListener ) ((PASCListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PASCListener ) ((PASCListener)listener).exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PASCVisitor ) return ((PASCVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_forStatement);
		try {
			int _alt;
			setState(212);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(190);
				match(FORnumber);
				setState(191);
				match(COLEQnumber);
				setState(192);
				expr(0);
				setState(193);
				match(TOnumber);
				setState(194);
				constnumber();
				setState(195);
				match(T__3);
				setState(197); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(196);
						expr(0);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(199); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(201);
				match(FORnumber);
				setState(202);
				match(COLEQnumber);
				setState(203);
				expr(0);
				setState(204);
				match(DOWNTOnumber);
				setState(205);
				constnumber();
				setState(206);
				match(T__3);
				setState(208); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(207);
						expr(0);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(210); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class RepeatContext extends ParserRuleContext {
		public TerminalNode REPEATnumber() { return getToken(PASCParser.REPEATnumber, 0); }
		public TerminalNode UNTILnumber() { return getToken(PASCParser.UNTILnumber, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode SEMInumber() { return getToken(PASCParser.SEMInumber, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public RepeatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PASCListener ) ((PASCListener)listener).enterRepeat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PASCListener ) ((PASCListener)listener).exitRepeat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PASCVisitor ) return ((PASCVisitor<? extends T>)visitor).visitRepeat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RepeatContext repeat() throws RecognitionException {
		RepeatContext _localctx = new RepeatContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_repeat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			match(REPEATnumber);
			setState(216); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(215);
				expr(0);
				}
				}
				setState(218); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << VARnumber) | (1L << CONSTnumber) | (1L << FORnumber) | (1L << IFnumber) | (1L << LOOPnumber) | (1L << REPEATnumber) | (1L << WHILEnumber) | (1L << ICONTSnumber) | (1L << IDnumber) | (1L << LPAREN))) != 0) );
			setState(220);
			match(UNTILnumber);
			setState(221);
			condition(0);
			setState(222);
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
		case 5:
			return condition_sempred((ConditionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 14);
		case 1:
			return precpred(_ctx, 10);
		case 2:
			return precpred(_ctx, 13);
		}
		return true;
	}
	private boolean condition_sempred(ConditionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 2);
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3<\u00e3\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\5\3\67\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3B\n\3\f\3\16\3E\13"+
		"\3\3\4\3\4\6\4I\n\4\r\4\16\4J\3\4\3\4\3\5\3\5\3\5\6\5R\n\5\r\5\16\5S\3"+
		"\5\3\5\6\5X\n\5\r\5\16\5Y\3\5\3\5\5\5^\n\5\3\6\3\6\3\6\3\6\6\6d\n\6\r"+
		"\6\16\6e\3\6\3\6\3\6\6\6k\n\6\r\6\16\6l\5\6o\n\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\6\6w\n\6\r\6\16\6x\3\6\3\6\5\6}\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\7\7\u008a\n\7\f\7\16\7\u008d\13\7\3\b\3\b\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\5\t\u0099\n\t\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f"+
		"\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\6\17\u00ad\n\17\r\17\16\17"+
		"\u00ae\3\17\3\17\3\17\3\17\6\17\u00b5\n\17\r\17\16\17\u00b6\3\17\3\17"+
		"\5\17\u00bb\n\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\6\21\u00c8\n\21\r\21\16\21\u00c9\3\21\3\21\3\21\3\21\3\21\3\21\3\21\6"+
		"\21\u00d3\n\21\r\21\16\21\u00d4\5\21\u00d7\n\21\3\22\3\22\6\22\u00db\n"+
		"\22\r\22\16\22\u00dc\3\22\3\22\3\22\3\22\3\22\2\4\4\f\23\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"\2\4\3\2\669\4\2\r\r*,\2\u00f1\2$\3\2\2\2\4"+
		"\66\3\2\2\2\6F\3\2\2\2\b]\3\2\2\2\n|\3\2\2\2\f~\3\2\2\2\16\u008e\3\2\2"+
		"\2\20\u0098\3\2\2\2\22\u009a\3\2\2\2\24\u009c\3\2\2\2\26\u00a0\3\2\2\2"+
		"\30\u00a4\3\2\2\2\32\u00a6\3\2\2\2\34\u00ba\3\2\2\2\36\u00bc\3\2\2\2 "+
		"\u00d6\3\2\2\2\"\u00d8\3\2\2\2$%\7 \2\2%&\5\4\3\2&\'\7\61\2\2\'(\5\32"+
		"\16\2()\5\6\4\2)\3\3\2\2\2*+\b\3\1\2+\67\5\26\f\2,\67\5\24\13\2-\67\5"+
		"\32\16\2.\67\5\n\6\2/\67\5\b\5\2\60\67\5\30\r\2\61\67\5\22\n\2\62\67\5"+
		"\34\17\2\63\67\5\36\20\2\64\67\5 \21\2\65\67\5\"\22\2\66*\3\2\2\2\66,"+
		"\3\2\2\2\66-\3\2\2\2\66.\3\2\2\2\66/\3\2\2\2\66\60\3\2\2\2\66\61\3\2\2"+
		"\2\66\62\3\2\2\2\66\63\3\2\2\2\66\64\3\2\2\2\66\65\3\2\2\2\67C\3\2\2\2"+
		"89\f\20\2\29:\5\16\b\2:;\5\4\3\21;B\3\2\2\2<=\f\f\2\2=>\7\63\2\2>B\5\4"+
		"\3\r?@\f\17\2\2@B\5\20\t\2A8\3\2\2\2A<\3\2\2\2A?\3\2\2\2BE\3\2\2\2CA\3"+
		"\2\2\2CD\3\2\2\2D\5\3\2\2\2EC\3\2\2\2FH\7\13\2\2GI\5\4\3\2HG\3\2\2\2I"+
		"J\3\2\2\2JH\3\2\2\2JK\3\2\2\2KL\3\2\2\2LM\7\21\2\2M\7\3\2\2\2NO\7(\2\2"+
		"OQ\5\f\7\2PR\5\4\3\2QP\3\2\2\2RS\3\2\2\2SQ\3\2\2\2ST\3\2\2\2T^\3\2\2\2"+
		"UW\7\33\2\2VX\5\4\3\2WV\3\2\2\2XY\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z[\3\2\2"+
		"\2[\\\7\23\2\2\\^\3\2\2\2]N\3\2\2\2]U\3\2\2\2^\t\3\2\2\2_`\7\31\2\2`a"+
		"\5\f\7\2ac\7$\2\2bd\5\4\3\2cb\3\2\2\2de\3\2\2\2ec\3\2\2\2ef\3\2\2\2fg"+
		"\3\2\2\2gn\7\17\2\2ho\5\6\4\2ik\5\4\3\2ji\3\2\2\2kl\3\2\2\2lj\3\2\2\2"+
		"lm\3\2\2\2mo\3\2\2\2nh\3\2\2\2nj\3\2\2\2op\3\2\2\2pq\7\22\2\2q}\3\2\2"+
		"\2rs\7\31\2\2st\5\f\7\2tv\7$\2\2uw\5\4\3\2vu\3\2\2\2wx\3\2\2\2xv\3\2\2"+
		"\2xy\3\2\2\2yz\3\2\2\2z{\7\22\2\2{}\3\2\2\2|_\3\2\2\2|r\3\2\2\2}\13\3"+
		"\2\2\2~\177\b\7\1\2\177\u0080\5\4\3\2\u0080\u0081\t\2\2\2\u0081\u0082"+
		"\5\4\3\2\u0082\u008b\3\2\2\2\u0083\u0084\f\4\2\2\u0084\u0085\7\t\2\2\u0085"+
		"\u008a\5\f\7\5\u0086\u0087\f\3\2\2\u0087\u0088\7\36\2\2\u0088\u008a\5"+
		"\f\7\4\u0089\u0083\3\2\2\2\u0089\u0086\3\2\2\2\u008a\u008d\3\2\2\2\u008b"+
		"\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\r\3\2\2\2\u008d\u008b\3\2\2\2"+
		"\u008e\u008f\t\3\2\2\u008f\17\3\2\2\2\u0090\u0091\7-\2\2\u0091\u0092\5"+
		"\4\3\2\u0092\u0093\7\61\2\2\u0093\u0099\3\2\2\2\u0094\u0095\5\4\3\2\u0095"+
		"\u0096\7-\2\2\u0096\u0097\5\22\n\2\u0097\u0099\3\2\2\2\u0098\u0090\3\2"+
		"\2\2\u0098\u0094\3\2\2\2\u0099\21\3\2\2\2\u009a\u009b\7)\2\2\u009b\23"+
		"\3\2\2\2\u009c\u009d\7\f\2\2\u009d\u009e\5\4\3\2\u009e\u009f\7\61\2\2"+
		"\u009f\25\3\2\2\2\u00a0\u00a1\7;\2\2\u00a1\u00a2\5\4\3\2\u00a2\u00a3\7"+
		"<\2\2\u00a3\27\3\2\2\2\u00a4\u00a5\7:\2\2\u00a5\31\3\2\2\2\u00a6\u00a7"+
		"\7\b\2\2\u00a7\u00a8\5\4\3\2\u00a8\u00a9\7\61\2\2\u00a9\33\3\2\2\2\u00aa"+
		"\u00ac\7\3\2\2\u00ab\u00ad\5\4\3\2\u00ac\u00ab\3\2\2\2\u00ad\u00ae\3\2"+
		"\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0"+
		"\u00b1\7\4\2\2\u00b1\u00bb\3\2\2\2\u00b2\u00b4\7\5\2\2\u00b3\u00b5\5\4"+
		"\3\2\u00b4\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6"+
		"\u00b7\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b9\7\5\2\2\u00b9\u00bb\3\2"+
		"\2\2\u00ba\u00aa\3\2\2\2\u00ba\u00b2\3\2\2\2\u00bb\35\3\2\2\2\u00bc\u00bd"+
		"\7\5\2\2\u00bd\u00be\5\4\3\2\u00be\u00bf\7\5\2\2\u00bf\37\3\2\2\2\u00c0"+
		"\u00c1\7\26\2\2\u00c1\u00c2\7-\2\2\u00c2\u00c3\5\4\3\2\u00c3\u00c4\7%"+
		"\2\2\u00c4\u00c5\5\22\n\2\u00c5\u00c7\7\6\2\2\u00c6\u00c8\5\4\3\2\u00c7"+
		"\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2"+
		"\2\2\u00ca\u00d7\3\2\2\2\u00cb\u00cc\7\26\2\2\u00cc\u00cd\7-\2\2\u00cd"+
		"\u00ce\5\4\3\2\u00ce\u00cf\7\16\2\2\u00cf\u00d0\5\22\n\2\u00d0\u00d2\7"+
		"\6\2\2\u00d1\u00d3\5\4\3\2\u00d2\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4"+
		"\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d7\3\2\2\2\u00d6\u00c0\3\2"+
		"\2\2\u00d6\u00cb\3\2\2\2\u00d7!\3\2\2\2\u00d8\u00da\7\"\2\2\u00d9\u00db"+
		"\5\4\3\2\u00da\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc"+
		"\u00dd\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00df\7\'\2\2\u00df\u00e0\5\f"+
		"\7\2\u00e0\u00e1\7\61\2\2\u00e1#\3\2\2\2\30\66ACJSY]elnx|\u0089\u008b"+
		"\u0098\u00ae\u00b6\u00ba\u00c9\u00d4\u00d6\u00dc";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}