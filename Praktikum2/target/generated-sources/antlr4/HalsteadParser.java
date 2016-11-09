// Generated from Halstead.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HalsteadParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IGNORE=1, OPERATOR=2, OPERAND=3, SPCSPEC=4, TYPE_QUAL=5, RESERVED=6, OPERATORS=7, 
		CONSTANT=8, TYPESPEC=9, IDENTIFIER=10, LOOPS=11, LINE_COMMENT=12, LOOP_NAMES=13, 
		FLOAT=14, INT=15, STRING=16, CHAR=17, SPECIAL=18, ESC=19, FIRSTLETTER=20, 
		COMMENT=21, RIGHT_BRACKET=22, DOUBLEPOINT=23, KEYWORD=24, HEADERS=25, 
		INCLUDE=26, WORD=27, WS=28;
	public static final int
		RULE_program = 0;
	public static final String[] ruleNames = {
		"program"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, "':'", 
		"'do'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "IGNORE", "OPERATOR", "OPERAND", "SPCSPEC", "TYPE_QUAL", "RESERVED", 
		"OPERATORS", "CONSTANT", "TYPESPEC", "IDENTIFIER", "LOOPS", "LINE_COMMENT", 
		"LOOP_NAMES", "FLOAT", "INT", "STRING", "CHAR", "SPECIAL", "ESC", "FIRSTLETTER", 
		"COMMENT", "RIGHT_BRACKET", "DOUBLEPOINT", "KEYWORD", "HEADERS", "INCLUDE", 
		"WORD", "WS"
	};
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
	public String getGrammarFileName() { return "Halstead.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public HalsteadParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HalsteadListener ) ((HalsteadListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HalsteadListener ) ((HalsteadListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\36\7\4\2\t\2\3\2"+
		"\3\2\3\2\2\2\3\2\2\2\5\2\4\3\2\2\2\4\5\3\2\2\2\5\3\3\2\2\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}