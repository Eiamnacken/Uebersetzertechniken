import java.util.HashMap;
import java.util.Map;

/**
 * Created by sven on 13.12.16.
 */
public class EvalVisitor extends CalculatorBaseVisitor<Double>{

    private Map<String,Double> memory = new HashMap<>();

    @Override
    public Double visitPrintExpr(CalculatorParser.PrintExprContext ctx) {
        Double value = visit(ctx.expr());
        return value;
    }

    @Override
    public Double visitParens(CalculatorParser.ParensContext ctx) {
        return visit(ctx.expr());
    }

    @Override
    public Double visitMulDiv(CalculatorParser.MulDivContext ctx) {
        Double left = visit(ctx.expr(0));
        Double right = visit(ctx.expr(1));
        Double result;
        if(ctx.op.getType()==CalculatorParser.MUL){
            result=left*right;
        }else{
            if(right.compareTo(0.00)==0) result=Double.POSITIVE_INFINITY;
            else result = left/right;
        }
        return result;
    }

    @Override
    public Double visitAddSub(CalculatorParser.AddSubContext ctx) {
        Double left = visit(ctx.expr(0));
        Double right = visit(ctx.expr(1));
        Double result;
        if(ctx.op.getType()==CalculatorParser.ADD) result=Double.sum(left,right);
        else result = left-right;
        return result;
    }

    @Override
    public Double visitInt(CalculatorParser.IntContext ctx) {
        return new Double(ctx.INT().getText());
    }

    @Override
    public Double visitAssign(CalculatorParser.AssignContext ctx) {
        String id = ctx.ID().getText();
        Double value = visit(ctx.expr());
        memory.put(id,value);
        return value;
    }

    @Override
    public Double visitClear(CalculatorParser.ClearContext ctx) {
        memory.clear();
        return 0.00;
    }

    @Override
    public Double visitPow(CalculatorParser.PowContext ctx) {
        Double left = visit(ctx.expr(0));
        Double right = visit(ctx.expr(1));
        Double result=0.00;
        result=Math.pow(left,right);
        return result;
    }

    @Override
    public Double visitId(CalculatorParser.IdContext ctx) {
        return memory.get(ctx.ID().getText());
    }

    @Override
    public Double visitSmallerBigger(CalculatorParser.SmallerBiggerContext ctx) {
        Double left = visit(ctx.expr(0));
        Double right = visit(ctx.expr(1));
        byte result=0;
        if(ctx.op.getType()==CalculatorParser.BIGGERAS){
            if(left.compareTo(right)==1){
                result=1;
            }
        }else if(left.compareTo(right)==-1){
            result=1;
        }
        return (double) result;
    }
}
