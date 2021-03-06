// Generated from C:/Users/trung/Desktop/PASC_AST\PASC.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PASCLexer extends Lexer {
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
		IDnumber=56;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "WS", "VARnumber", "ANDnumber", "ARRAYnumber", 
			"BEGINnumber", "CONSTnumber", "DIVnumber", "DOWNTOnumber", "ELSEnumber", 
			"ELSIFnumber", "ENDnumber", "ENDIFnumber", "ENDLOOPnumber", "ENDRECnumber", 
			"EXITnumber", "FORnumber", "FORWARDnumber", "FUNCTIONnumber", "IFnumber", 
			"ISnumber", "LOOPnumber", "NOTnumber", "OFnumber", "ORnumber", "PROCEDUREnumber", 
			"PROGRAMnumber", "RECORDnumber", "REPEATnumber", "RETURNnumber", "THENnumber", 
			"TOnumber", "TYPEnumber", "UNTILnumber", "WHILEnumber", "ICONTSnumber", 
			"PLUSnumber", "MINUSnumber", "TIMESnumber", "COLEQnumber", "LPARENnumber", 
			"RPARENnumber", "DOTnumber", "SEMInumber", "COLONnumber", "COMMAnumber", 
			"LTnumber", "GTnumber", "EQnumber", "LEnumber", "GEnumber", "NEnumber", 
			"IDnumber"
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
			"IDnumber"
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


	public PASCLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "PASC.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2:\u016b\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\3\2\3\2\3\2\3\3\3\3\3\3"+
		"\3\4\3\4\3\5\3\5\3\5\3\6\6\6\u0080\n\6\r\6\16\6\u0081\3\6\3\6\3\7\3\7"+
		"\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20"+
		"\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24"+
		"\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\32"+
		"\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3\"\3\""+
		"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\3$\3%\3%\3%\3%\3%\3&\3&\3&\3"+
		"&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3(\6(\u013e\n(\r(\16(\u013f\3)\3)\3*\3*\3"+
		"+\3+\3,\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63"+
		"\3\64\3\64\3\65\3\65\3\65\3\66\3\66\3\66\3\67\3\67\3\67\38\38\38\39\6"+
		"9\u0168\n9\r9\169\u0169\2\2:\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61"+
		"\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61"+
		"a\62c\63e\64g\65i\66k\67m8o9q:\3\2\5\5\2\13\f\17\17\"\"\3\2\62;\5\2\62"+
		";C\\c|\2\u016d\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3"+
		"\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2"+
		"\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\2"+
		"9\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3"+
		"\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2"+
		"\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2"+
		"_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3"+
		"\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\3s\3\2\2\2\5v\3\2\2\2\7y\3\2\2"+
		"\2\t{\3\2\2\2\13\177\3\2\2\2\r\u0085\3\2\2\2\17\u0089\3\2\2\2\21\u008d"+
		"\3\2\2\2\23\u0093\3\2\2\2\25\u0099\3\2\2\2\27\u009f\3\2\2\2\31\u00a3\3"+
		"\2\2\2\33\u00aa\3\2\2\2\35\u00af\3\2\2\2\37\u00b5\3\2\2\2!\u00b9\3\2\2"+
		"\2#\u00bf\3\2\2\2%\u00c7\3\2\2\2\'\u00ce\3\2\2\2)\u00d3\3\2\2\2+\u00d7"+
		"\3\2\2\2-\u00df\3\2\2\2/\u00e8\3\2\2\2\61\u00eb\3\2\2\2\63\u00ee\3\2\2"+
		"\2\65\u00f3\3\2\2\2\67\u00f7\3\2\2\29\u00fa\3\2\2\2;\u00fd\3\2\2\2=\u0107"+
		"\3\2\2\2?\u010f\3\2\2\2A\u0116\3\2\2\2C\u011d\3\2\2\2E\u0124\3\2\2\2G"+
		"\u0129\3\2\2\2I\u012c\3\2\2\2K\u0131\3\2\2\2M\u0136\3\2\2\2O\u013d\3\2"+
		"\2\2Q\u0141\3\2\2\2S\u0143\3\2\2\2U\u0145\3\2\2\2W\u0147\3\2\2\2Y\u014a"+
		"\3\2\2\2[\u014c\3\2\2\2]\u014e\3\2\2\2_\u0150\3\2\2\2a\u0152\3\2\2\2c"+
		"\u0154\3\2\2\2e\u0156\3\2\2\2g\u0158\3\2\2\2i\u015a\3\2\2\2k\u015d\3\2"+
		"\2\2m\u0160\3\2\2\2o\u0163\3\2\2\2q\u0167\3\2\2\2st\7*\2\2tu\7,\2\2u\4"+
		"\3\2\2\2vw\7,\2\2wx\7+\2\2x\6\3\2\2\2yz\7)\2\2z\b\3\2\2\2{|\7f\2\2|}\7"+
		"q\2\2}\n\3\2\2\2~\u0080\t\2\2\2\177~\3\2\2\2\u0080\u0081\3\2\2\2\u0081"+
		"\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0084\b\6\2"+
		"\2\u0084\f\3\2\2\2\u0085\u0086\7x\2\2\u0086\u0087\7c\2\2\u0087\u0088\7"+
		"t\2\2\u0088\16\3\2\2\2\u0089\u008a\7c\2\2\u008a\u008b\7p\2\2\u008b\u008c"+
		"\7f\2\2\u008c\20\3\2\2\2\u008d\u008e\7c\2\2\u008e\u008f\7t\2\2\u008f\u0090"+
		"\7t\2\2\u0090\u0091\7c\2\2\u0091\u0092\7{\2\2\u0092\22\3\2\2\2\u0093\u0094"+
		"\7d\2\2\u0094\u0095\7g\2\2\u0095\u0096\7i\2\2\u0096\u0097\7k\2\2\u0097"+
		"\u0098\7p\2\2\u0098\24\3\2\2\2\u0099\u009a\7e\2\2\u009a\u009b\7q\2\2\u009b"+
		"\u009c\7p\2\2\u009c\u009d\7u\2\2\u009d\u009e\7v\2\2\u009e\26\3\2\2\2\u009f"+
		"\u00a0\7f\2\2\u00a0\u00a1\7k\2\2\u00a1\u00a2\7x\2\2\u00a2\30\3\2\2\2\u00a3"+
		"\u00a4\7f\2\2\u00a4\u00a5\7q\2\2\u00a5\u00a6\7y\2\2\u00a6\u00a7\7p\2\2"+
		"\u00a7\u00a8\7v\2\2\u00a8\u00a9\7q\2\2\u00a9\32\3\2\2\2\u00aa\u00ab\7"+
		"g\2\2\u00ab\u00ac\7n\2\2\u00ac\u00ad\7u\2\2\u00ad\u00ae\7g\2\2\u00ae\34"+
		"\3\2\2\2\u00af\u00b0\7g\2\2\u00b0\u00b1\7n\2\2\u00b1\u00b2\7u\2\2\u00b2"+
		"\u00b3\7k\2\2\u00b3\u00b4\7h\2\2\u00b4\36\3\2\2\2\u00b5\u00b6\7g\2\2\u00b6"+
		"\u00b7\7p\2\2\u00b7\u00b8\7f\2\2\u00b8 \3\2\2\2\u00b9\u00ba\7g\2\2\u00ba"+
		"\u00bb\7p\2\2\u00bb\u00bc\7f\2\2\u00bc\u00bd\7k\2\2\u00bd\u00be\7h\2\2"+
		"\u00be\"\3\2\2\2\u00bf\u00c0\7g\2\2\u00c0\u00c1\7p\2\2\u00c1\u00c2\7f"+
		"\2\2\u00c2\u00c3\7n\2\2\u00c3\u00c4\7q\2\2\u00c4\u00c5\7q\2\2\u00c5\u00c6"+
		"\7r\2\2\u00c6$\3\2\2\2\u00c7\u00c8\7g\2\2\u00c8\u00c9\7p\2\2\u00c9\u00ca"+
		"\7f\2\2\u00ca\u00cb\7t\2\2\u00cb\u00cc\7g\2\2\u00cc\u00cd\7e\2\2\u00cd"+
		"&\3\2\2\2\u00ce\u00cf\7g\2\2\u00cf\u00d0\7z\2\2\u00d0\u00d1\7k\2\2\u00d1"+
		"\u00d2\7v\2\2\u00d2(\3\2\2\2\u00d3\u00d4\7h\2\2\u00d4\u00d5\7q\2\2\u00d5"+
		"\u00d6\7t\2\2\u00d6*\3\2\2\2\u00d7\u00d8\7h\2\2\u00d8\u00d9\7q\2\2\u00d9"+
		"\u00da\7t\2\2\u00da\u00db\7y\2\2\u00db\u00dc\7c\2\2\u00dc\u00dd\7t\2\2"+
		"\u00dd\u00de\7f\2\2\u00de,\3\2\2\2\u00df\u00e0\7h\2\2\u00e0\u00e1\7w\2"+
		"\2\u00e1\u00e2\7p\2\2\u00e2\u00e3\7e\2\2\u00e3\u00e4\7v\2\2\u00e4\u00e5"+
		"\7k\2\2\u00e5\u00e6\7q\2\2\u00e6\u00e7\7p\2\2\u00e7.\3\2\2\2\u00e8\u00e9"+
		"\7k\2\2\u00e9\u00ea\7h\2\2\u00ea\60\3\2\2\2\u00eb\u00ec\7k\2\2\u00ec\u00ed"+
		"\7u\2\2\u00ed\62\3\2\2\2\u00ee\u00ef\7n\2\2\u00ef\u00f0\7q\2\2\u00f0\u00f1"+
		"\7q\2\2\u00f1\u00f2\7r\2\2\u00f2\64\3\2\2\2\u00f3\u00f4\7p\2\2\u00f4\u00f5"+
		"\7q\2\2\u00f5\u00f6\7v\2\2\u00f6\66\3\2\2\2\u00f7\u00f8\7q\2\2\u00f8\u00f9"+
		"\7h\2\2\u00f98\3\2\2\2\u00fa\u00fb\7q\2\2\u00fb\u00fc\7t\2\2\u00fc:\3"+
		"\2\2\2\u00fd\u00fe\7r\2\2\u00fe\u00ff\7t\2\2\u00ff\u0100\7q\2\2\u0100"+
		"\u0101\7e\2\2\u0101\u0102\7g\2\2\u0102\u0103\7f\2\2\u0103\u0104\7w\2\2"+
		"\u0104\u0105\7t\2\2\u0105\u0106\7g\2\2\u0106<\3\2\2\2\u0107\u0108\7r\2"+
		"\2\u0108\u0109\7t\2\2\u0109\u010a\7q\2\2\u010a\u010b\7i\2\2\u010b\u010c"+
		"\7t\2\2\u010c\u010d\7c\2\2\u010d\u010e\7o\2\2\u010e>\3\2\2\2\u010f\u0110"+
		"\7t\2\2\u0110\u0111\7g\2\2\u0111\u0112\7e\2\2\u0112\u0113\7q\2\2\u0113"+
		"\u0114\7t\2\2\u0114\u0115\7f\2\2\u0115@\3\2\2\2\u0116\u0117\7t\2\2\u0117"+
		"\u0118\7g\2\2\u0118\u0119\7r\2\2\u0119\u011a\7g\2\2\u011a\u011b\7c\2\2"+
		"\u011b\u011c\7v\2\2\u011cB\3\2\2\2\u011d\u011e\7t\2\2\u011e\u011f\7g\2"+
		"\2\u011f\u0120\7v\2\2\u0120\u0121\7w\2\2\u0121\u0122\7t\2\2\u0122\u0123"+
		"\7p\2\2\u0123D\3\2\2\2\u0124\u0125\7v\2\2\u0125\u0126\7j\2\2\u0126\u0127"+
		"\7g\2\2\u0127\u0128\7p\2\2\u0128F\3\2\2\2\u0129\u012a\7v\2\2\u012a\u012b"+
		"\7q\2\2\u012bH\3\2\2\2\u012c\u012d\7v\2\2\u012d\u012e\7{\2\2\u012e\u012f"+
		"\7r\2\2\u012f\u0130\7g\2\2\u0130J\3\2\2\2\u0131\u0132\7w\2\2\u0132\u0133"+
		"\7v\2\2\u0133\u0134\7k\2\2\u0134\u0135\7n\2\2\u0135L\3\2\2\2\u0136\u0137"+
		"\7y\2\2\u0137\u0138\7j\2\2\u0138\u0139\7k\2\2\u0139\u013a\7n\2\2\u013a"+
		"\u013b\7g\2\2\u013bN\3\2\2\2\u013c\u013e\t\3\2\2\u013d\u013c\3\2\2\2\u013e"+
		"\u013f\3\2\2\2\u013f\u013d\3\2\2\2\u013f\u0140\3\2\2\2\u0140P\3\2\2\2"+
		"\u0141\u0142\7-\2\2\u0142R\3\2\2\2\u0143\u0144\7/\2\2\u0144T\3\2\2\2\u0145"+
		"\u0146\7,\2\2\u0146V\3\2\2\2\u0147\u0148\7<\2\2\u0148\u0149\7?\2\2\u0149"+
		"X\3\2\2\2\u014a\u014b\7*\2\2\u014bZ\3\2\2\2\u014c\u014d\7+\2\2\u014d\\"+
		"\3\2\2\2\u014e\u014f\7\60\2\2\u014f^\3\2\2\2\u0150\u0151\7=\2\2\u0151"+
		"`\3\2\2\2\u0152\u0153\7<\2\2\u0153b\3\2\2\2\u0154\u0155\7.\2\2\u0155d"+
		"\3\2\2\2\u0156\u0157\7>\2\2\u0157f\3\2\2\2\u0158\u0159\7@\2\2\u0159h\3"+
		"\2\2\2\u015a\u015b\7?\2\2\u015b\u015c\7?\2\2\u015cj\3\2\2\2\u015d\u015e"+
		"\7>\2\2\u015e\u015f\7?\2\2\u015fl\3\2\2\2\u0160\u0161\7@\2\2\u0161\u0162"+
		"\7?\2\2\u0162n\3\2\2\2\u0163\u0164\7>\2\2\u0164\u0165\7@\2\2\u0165p\3"+
		"\2\2\2\u0166\u0168\t\4\2\2\u0167\u0166\3\2\2\2\u0168\u0169\3\2\2\2\u0169"+
		"\u0167\3\2\2\2\u0169\u016a\3\2\2\2\u016ar\3\2\2\2\6\2\u0081\u013f\u0169"+
		"\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}