import java.util.HashMap;
import java.util.Map;

/**
 * Created by eiamnacken on 15.11.16.
 */
public class EvalVisitor extends SyntaxBaseVisitor<Double>{

    Map<String,Double> memory = new HashMap<>();

    @Override
    public Double visitProg(SyntaxParser.ProgContext ctx) {
        return super.visitProg(ctx);
    }

    @Override
    public Double visitPrintExpr(SyntaxParser.PrintExprContext ctx) {
        double value = visit(ctx.expr());
        return value;
    }

    @Override
    public Double visitAssign(SyntaxParser.AssignContext ctx) {
        String id = ctx.ID().getText();
        double value = visit(ctx.expr());
        memory.put(id,value);
        return value;
    }

    @Override
    public Double visitBlank(SyntaxParser.BlankContext ctx) {
        return super.visitBlank(ctx);
    }



    @Override
    public Double visitParens(SyntaxParser.ParensContext ctx) {
        return visit(ctx.expr());
    }

    @Override
    public Double visitPot(SyntaxParser.PotContext ctx) {
        return super.visitPot(ctx);
    }

    @Override
    public Double visitMulDiv(SyntaxParser.MulDivContext ctx) {
        double left = visit(ctx.expr(0));
        double right = visit(ctx.expr(1));
        if(ctx.op.getType()==SyntaxParser.MUL) return left * right;
        return left/right;
    }

    @Override
    public Double visitAddSub(SyntaxParser.AddSubContext ctx) {
        double left = visit(ctx.expr(0));
        double right = visit(ctx.expr(1));
        if(ctx.op.getType()==SyntaxParser.ADD)return left+right;
        return left - right;
    }

    @Override
    public Double visitId(SyntaxParser.IdContext ctx) {
        String id = ctx.ID().getText();
        if(memory.containsKey(id)) return memory.get(id);
        return 0.0;
    }

    @Override
    public Double visitFloat(SyntaxParser.FloatContext ctx) {
        return Double.parseDouble(ctx.FLOAT().getText());

    }

    @Override
    public Double visitSmallerasBiggeras(SyntaxParser.SmallerasBiggerasContext ctx) {
        double left = visit(ctx.expr(0));
        double right = visit(ctx.expr(1));
        if(ctx.op.getType()==SyntaxParser.BIGGERAS) return left>right;
    }
}
