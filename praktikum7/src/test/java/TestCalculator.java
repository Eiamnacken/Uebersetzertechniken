import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by sven on 14.12.16.
 */
public class TestCalculator {

    @DisplayName("Teste Normal")
    @Test
    public void testCalculate(){
        CharStream input = new ANTLRInputStream("(2+2+2^(2*2))\n");
        CalculatorLexer lexer = new CalculatorLexer(input);
        CommonTokenStream stream = new CommonTokenStream(lexer);
        CalculatorParser parser = new CalculatorParser(stream);
        ParseTree tree = parser.prog();
        EvalVisitor visitor = new EvalVisitor();
        Double result = visitor.visit(tree);
        assertEquals(20.00,result.doubleValue());

    }
}
