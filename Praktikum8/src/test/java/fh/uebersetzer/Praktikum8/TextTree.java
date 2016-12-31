package fh.uebersetzer.Praktikum8;

import java.io.IOException;
import java.io.StringReader;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.junit.Before;
import org.junit.Test;

import fh.uebersetzer.Praktikum8.Antlr.CalculatorLexer;
import fh.uebersetzer.Praktikum8.Antlr.CalculatorParser;

public class TextTree {
	
	private ANTLRInputStream inputStream;
	private CalculatorLexer lexer;
	private CommonTokenStream stream;
	private CalculatorParser parser;
	private ParseTreeWalker walker;
	private EvaluatorWithProps props;
	
	@Before
	public void prepare() {
		inputStream= new ANTLRInputStream();
		lexer = new CalculatorLexer(inputStream);
		stream = new CommonTokenStream(lexer);
		walker = new ParseTreeWalker();
		props = new EvaluatorWithProps();
		parser = new CalculatorParser(stream);
		parser.setBuildParseTree(true);
	}
	
	
	@Test
	public void testAdd() {
		String normal = "2.0+2.0\n";
		try {
			inputStream = new ANTLRInputStream(new StringReader(normal));
			lexer.setInputStream(inputStream);
			stream.setTokenSource(lexer);
			parser.setInputStream(stream);
			ParseTree tree = parser.prog();
			System.out.println(tree.toStringTree());
			walker.walk(props, tree);
			System.out.println(props.getValue(tree));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
