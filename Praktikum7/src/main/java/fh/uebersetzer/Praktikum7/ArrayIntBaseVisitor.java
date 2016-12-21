// Generated from fh/uebersetzer/Praktikum7/ArrayInt.g4 by ANTLR 4.5.3
package fh.uebersetzer.Praktikum7;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

/**
 * This class provides an empty implementation of {@link ArrayIntVisitor},
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public class ArrayIntBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements ArrayIntVisitor<T> {
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	public T visitInit(ArrayIntParser.InitContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	public T visitValue(ArrayIntParser.ValueContext ctx) { return visitChildren(ctx); }
}