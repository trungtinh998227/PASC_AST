// Generated from C:/Users/trung/Desktop/PASC_ParseTree\Expr.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Expr extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NEWLINE=1, WS=2, VAR=3, PRINT=4, AS=5, INT=6, DECIMAL=7, NUMBER=8, PLUS=9, 
		MINUS=10, ASTERISK=11, DIVISION=12, ASSIGN=13, LPAREN=14, RPAREN=15, ID=16;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"NEWLINE", "WS", "VAR", "PRINT", "AS", "INT", "DECIMAL", "NUMBER", "PLUS", 
			"MINUS", "ASTERISK", "DIVISION", "ASSIGN", "LPAREN", "RPAREN", "ID"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'var'", "'print'", "'as'", "'Int'", "'Decimal'", null, 
			"'+'", "'-'", "'*'", "'/'", "'='", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NEWLINE", "WS", "VAR", "PRINT", "AS", "INT", "DECIMAL", "NUMBER", 
			"PLUS", "MINUS", "ASTERISK", "DIVISION", "ASSIGN", "LPAREN", "RPAREN", 
			"ID"
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


	public Expr(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Expr.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\22m\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3"+
		"\2\5\2\'\n\2\3\3\6\3*\n\3\r\3\16\3+\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\t\3\t\3\t\7\tL\n\t\f\t\16\tO\13\t\5\tQ\n\t\3\n\3\n\3\13\3\13\3"+
		"\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\7\21b\n\21\f\21\16\21"+
		"e\13\21\3\21\3\21\7\21i\n\21\f\21\16\21l\13\21\2\2\22\3\3\5\4\7\5\t\6"+
		"\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22\3\2\t"+
		"\4\2\f\ftt\4\2\13\13\"\"\3\2\63;\3\2\62;\3\2aa\3\2c|\6\2\62;C\\aac|\2"+
		"r\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\3&\3\2"+
		"\2\2\5)\3\2\2\2\7/\3\2\2\2\t\63\3\2\2\2\139\3\2\2\2\r<\3\2\2\2\17@\3\2"+
		"\2\2\21P\3\2\2\2\23R\3\2\2\2\25T\3\2\2\2\27V\3\2\2\2\31X\3\2\2\2\33Z\3"+
		"\2\2\2\35\\\3\2\2\2\37^\3\2\2\2!c\3\2\2\2#$\7\17\2\2$\'\7\f\2\2%\'\t\2"+
		"\2\2&#\3\2\2\2&%\3\2\2\2\'\4\3\2\2\2(*\t\3\2\2)(\3\2\2\2*+\3\2\2\2+)\3"+
		"\2\2\2+,\3\2\2\2,-\3\2\2\2-.\b\3\2\2.\6\3\2\2\2/\60\7x\2\2\60\61\7c\2"+
		"\2\61\62\7t\2\2\62\b\3\2\2\2\63\64\7r\2\2\64\65\7t\2\2\65\66\7k\2\2\66"+
		"\67\7p\2\2\678\7v\2\28\n\3\2\2\29:\7c\2\2:;\7u\2\2;\f\3\2\2\2<=\7K\2\2"+
		"=>\7p\2\2>?\7v\2\2?\16\3\2\2\2@A\7F\2\2AB\7g\2\2BC\7e\2\2CD\7k\2\2DE\7"+
		"o\2\2EF\7c\2\2FG\7n\2\2G\20\3\2\2\2HQ\7\62\2\2IM\t\4\2\2JL\t\5\2\2KJ\3"+
		"\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3\2\2\2NQ\3\2\2\2OM\3\2\2\2PH\3\2\2\2PI\3"+
		"\2\2\2Q\22\3\2\2\2RS\7-\2\2S\24\3\2\2\2TU\7/\2\2U\26\3\2\2\2VW\7,\2\2"+
		"W\30\3\2\2\2XY\7\61\2\2Y\32\3\2\2\2Z[\7?\2\2[\34\3\2\2\2\\]\7*\2\2]\36"+
		"\3\2\2\2^_\7+\2\2_ \3\2\2\2`b\t\6\2\2a`\3\2\2\2be\3\2\2\2ca\3\2\2\2cd"+
		"\3\2\2\2df\3\2\2\2ec\3\2\2\2fj\t\7\2\2gi\t\b\2\2hg\3\2\2\2il\3\2\2\2j"+
		"h\3\2\2\2jk\3\2\2\2k\"\3\2\2\2lj\3\2\2\2\t\2&+MPcj\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}