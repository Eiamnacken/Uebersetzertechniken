// Generated from fh/uebersetzer/Praktikum7/ArrayInt.g4 by ANTLR 4.5.3
package fh.uebersetzer.Praktikum7;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ArrayIntParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ArrayIntVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ArrayIntParser#init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInit(ArrayIntParser.InitContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArrayIntParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(ArrayIntParser.ValueContext ctx);
}