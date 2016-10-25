package Uebersetzertechniken.Sven.Praktikum1;

import java.io.IOException;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;

import antlr4.ExprLexer;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws IOException {
		CharStream input = null;
		// Pick an input stream (filename from commandline or stdin)
		if (args.length > 0)
			input = new ANTLRFileStream(args[0]);
		else
			input = new ANTLRInputStream(System.in);
		ExprLexer lex = new ExprLexer(input);
		Token t = lex.nextToken();
		while (t.getType() != Token.EOF) {// ExprLexer.EOF works as well
			System.out.printf("%2d:%2d Typ-Code: %2d Lexem: %s\n", t.getLine(), t.getCharPositionInLine(), t.getType(),
					t.getText());
			t = lex.nextToken();
		}
	}
}
