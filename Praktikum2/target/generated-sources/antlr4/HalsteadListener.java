// Generated from Halstead.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HalsteadParser}.
 */
public interface HalsteadListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HalsteadParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(HalsteadParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link HalsteadParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(HalsteadParser.ProgramContext ctx);
}