package antlr4;

// Generated from Expr.g4 by ANTLR 4.4
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
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ID=1, PLUS=2, MINUS=3, UMINUS=4, MUL=5, DIV=6, POW=7, SQRT=8, NL=9, INT=10, 
		WS=11;
	public static final String[] tokenNames = {
		"<INVALID>", "ID", "'+'", "'-'", "'#'", "'*'", "':'", "'^'", "'~'", "'\n'", 
		"INT", "WS"
	};
	public static final int
		RULE_stat = 0;
	public static final String[] ruleNames = {
		"stat"
	};

	@Override
	public String getGrammarFileName() { return "Expr.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

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
	public static class StatContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(ExprParser.ID); }
		public TerminalNode WS(int i) {
			return getToken(ExprParser.WS, i);
		}
		public List<TerminalNode> WS() { return getTokens(ExprParser.WS); }
		public TerminalNode ID(int i) {
			return getToken(ExprParser.ID, i);
		}
		public TerminalNode INT() { return getToken(ExprParser.INT, 0); }
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_stat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2); match(INT);
			setState(6);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID || _la==WS) {
				{
				{
				setState(3);
				_la = _input.LA(1);
				if ( !(_la==ID || _la==WS) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				setState(8);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\r\f\4\2\t\2\3\2\3"+
		"\2\7\2\7\n\2\f\2\16\2\n\13\2\3\2\2\2\3\2\2\3\4\2\3\3\r\r\13\2\4\3\2\2"+
		"\2\4\b\7\f\2\2\5\7\t\2\2\2\6\5\3\2\2\2\7\n\3\2\2\2\b\6\3\2\2\2\b\t\3\2"+
		"\2\2\t\3\3\2\2\2\n\b\3\2\2\2\3\b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}