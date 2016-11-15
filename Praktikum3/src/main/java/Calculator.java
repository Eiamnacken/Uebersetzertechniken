
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;

/**
 * Created by eiamnacken on 15.11.16.
 */
public class Calculator {
    public double calculate(String numbers) throws IOException {
        InputStream inputStream = new ByteArrayInputStream(numbers.getBytes());
        ANTLRInputStream stream = new ANTLRInputStream(inputStream);
        SyntaxLexer lexer = new SyntaxLexer(stream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SyntaxParser parser = new SyntaxParser(tokens);
        ParseTree tree = parser.prog(); // parse; start at prog
        SyntaxVisitor eval = new SyntaxBaseVisitor();
        return (double) eval.visit(tree);
    }
}
