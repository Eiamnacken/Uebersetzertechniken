package fh.uebersetzer.Praktikum8;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

import fh.uebersetzer.Praktikum8.Antlr.CalculatorBaseListener;
import fh.uebersetzer.Praktikum8.Antlr.CalculatorParser.AddContext;
import fh.uebersetzer.Praktikum8.Antlr.CalculatorParser.AssignContext;
import fh.uebersetzer.Praktikum8.Antlr.CalculatorParser.BiggerContext;
import fh.uebersetzer.Praktikum8.Antlr.CalculatorParser.ClearContext;
import fh.uebersetzer.Praktikum8.Antlr.CalculatorParser.DivContext;
import fh.uebersetzer.Praktikum8.Antlr.CalculatorParser.IdContext;
import fh.uebersetzer.Praktikum8.Antlr.CalculatorParser.IntContext;
import fh.uebersetzer.Praktikum8.Antlr.CalculatorParser.MulContext;
import fh.uebersetzer.Praktikum8.Antlr.CalculatorParser.ParensContext;
import fh.uebersetzer.Praktikum8.Antlr.CalculatorParser.PowContext;
import fh.uebersetzer.Praktikum8.Antlr.CalculatorParser.PrintExprContext;
import fh.uebersetzer.Praktikum8.Antlr.CalculatorParser.ProgContext;
import fh.uebersetzer.Praktikum8.Antlr.CalculatorParser.SmallerContext;
import fh.uebersetzer.Praktikum8.Antlr.CalculatorParser.SubContext;

public class EvaluatorWithProps extends CalculatorBaseListener{
	
	ParseTreeProperty<Double> values = new ParseTreeProperty<>();
	

	

	
	
	/* (non-Javadoc)
	 * @see fh.uebersetzer.Praktikum8.Antlr.CalculatorBaseListener#exitProg(fh.uebersetzer.Praktikum8.Antlr.CalculatorParser.ProgContext)
	 */
	@Override
	public void exitProg(ProgContext ctx) {
		setValue(ctx, getValue(ctx.stat()));
	}

	/* (non-Javadoc)
	 * @see fh.uebersetzer.Praktikum8.Antlr.CalculatorBaseListener#exitPrintExpr(fh.uebersetzer.Praktikum8.Antlr.CalculatorParser.PrintExprContext)
	 */
	@Override
	public void exitPrintExpr(PrintExprContext ctx) {
		setValue(ctx, getValue(ctx.expr()));
	}

	/* (non-Javadoc)
	 * @see fh.uebersetzer.Praktikum8.Antlr.CalculatorBaseListener#exitAssign(fh.uebersetzer.Praktikum8.Antlr.CalculatorParser.AssignContext)
	 */
	@Override
	public void exitAssign(AssignContext ctx) {
		setValue(ctx.ID(), getValue(ctx.expr()));
	}

	/* (non-Javadoc)
	 * @see fh.uebersetzer.Praktikum8.Antlr.CalculatorBaseListener#exitClear(fh.uebersetzer.Praktikum8.Antlr.CalculatorParser.ClearContext)
	 */
	@Override
	public void exitClear(ClearContext ctx) {
		clearMemory();
	}

	/* (non-Javadoc)
	 * @see fh.uebersetzer.Praktikum8.Antlr.CalculatorBaseListener#exitDiv(fh.uebersetzer.Praktikum8.Antlr.CalculatorParser.DivContext)
	 */
	@Override
	public void exitDiv(DivContext ctx) {
		double left = getValue(ctx.expr(0));
		double right = getValue(ctx.expr(1));
		setValue(ctx, left/right);
	}

	/* (non-Javadoc)
	 * @see fh.uebersetzer.Praktikum8.Antlr.CalculatorBaseListener#exitSub(fh.uebersetzer.Praktikum8.Antlr.CalculatorParser.SubContext)
	 */
	@Override
	public void exitSub(SubContext ctx) {
		double left = getValue(ctx.expr(0));
		double right = getValue(ctx.expr(1));
		setValue(ctx, left-right);
	}

	/* (non-Javadoc)
	 * @see fh.uebersetzer.Praktikum8.Antlr.CalculatorBaseListener#exitBigger(fh.uebersetzer.Praktikum8.Antlr.CalculatorParser.BiggerContext)
	 */
	@Override
	public void exitBigger(BiggerContext ctx) {
		double left = getValue(ctx.expr(0));
		double right = getValue(ctx.expr(1));
		setValue(ctx, left>right?1:0);
	}

	/* (non-Javadoc)
	 * @see fh.uebersetzer.Praktikum8.Antlr.CalculatorBaseListener#exitMul(fh.uebersetzer.Praktikum8.Antlr.CalculatorParser.MulContext)
	 */
	@Override
	public void exitMul(MulContext ctx) {
		double left = getValue(ctx.expr(0));
		double right = getValue(ctx.expr(1));
		setValue(ctx, left*right);
	}

	/* (non-Javadoc)
	 * @see fh.uebersetzer.Praktikum8.Antlr.CalculatorBaseListener#exitAdd(fh.uebersetzer.Praktikum8.Antlr.CalculatorParser.AddContext)
	 */
	@Override
	public void exitAdd(AddContext ctx) {
		double left = getValue(ctx.expr(0));
		double right = getValue(ctx.expr(1));
		setValue(ctx, left+right);
	}

	/* (non-Javadoc)
	 * @see fh.uebersetzer.Praktikum8.Antlr.CalculatorBaseListener#exitParens(fh.uebersetzer.Praktikum8.Antlr.CalculatorParser.ParensContext)
	 */
	@Override
	public void exitParens(ParensContext ctx) {
		setValue(ctx, getValue(ctx.expr()));
	}

	/* (non-Javadoc)
	 * @see fh.uebersetzer.Praktikum8.Antlr.CalculatorBaseListener#exitPow(fh.uebersetzer.Praktikum8.Antlr.CalculatorParser.PowContext)
	 */
	@Override
	public void exitPow(PowContext ctx) {
		double left = getValue(ctx.expr(0));
		double right = getValue(ctx.expr(1));
		setValue(ctx, Math.pow(left, right));
	}

	/* (non-Javadoc)
	 * @see fh.uebersetzer.Praktikum8.Antlr.CalculatorBaseListener#exitId(fh.uebersetzer.Praktikum8.Antlr.CalculatorParser.IdContext)
	 */
	@Override
	public void exitId(IdContext ctx) {
		setValue(ctx.ID(), 0);
	}

	/* (non-Javadoc)
	 * @see fh.uebersetzer.Praktikum8.Antlr.CalculatorBaseListener#exitSmaller(fh.uebersetzer.Praktikum8.Antlr.CalculatorParser.SmallerContext)
	 */
	@Override
	public void exitSmaller(SmallerContext ctx) {
		double left = getValue(ctx.expr(0));
		double right = getValue(ctx.expr(1));
		setValue(ctx, left<right?1:0);
	}

	/* (non-Javadoc)
	 * @see fh.uebersetzer.Praktikum8.Antlr.CalculatorBaseListener#exitInt(fh.uebersetzer.Praktikum8.Antlr.CalculatorParser.IntContext)
	 */
	@Override
	public void exitInt(IntContext ctx) {
		String doubleText = ctx.DOUBLE().getText();
		setValue(ctx, Double.parseDouble(doubleText));
	}

	public void setValue(ParseTree node, double value){
		values.put(node, value);
	}
	
	public double getValue(ParseTree node){
		return values.get(node);
	}
	
	public void clearMemory() {
		values = new ParseTreeProperty<>();
	}
}
