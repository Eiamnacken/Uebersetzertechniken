import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by sven on 08.11.16.
 */
public class Main
{
    public static void main(String[] args) throws Exception {
        CharStream input = null;
        // Pick an input stream (filename from commandline or stdin)
        double programmLength=0;
        double allOperators=0;
        double allOPerands=0;
        double voc=0;
        List<String> countOperators= new LinkedList<>();
        List<String> countOperands= new LinkedList<>();
        int volume=0;
        if ( args.length>0 ) input = new ANTLRFileStream(args[0]);
        else input = new ANTLRInputStream(System.in);
        HalsteadLexer lex = new HalsteadLexer(input);
        CommonTokenStream stream = new CommonTokenStream(lex);
        //HalsteadParser parser = new HalsteadParser(stream);
        //HalsteadParser.IgnoreContext ignoreContext = parser.ignore();
        //HalsteadParser.OperandContext operandContext = parser.operand();
        //HalsteadParser.OperatorContext operatorContext = parser.operator();
        lex = new HalsteadLexer(input);
        Token t = lex.nextToken();
        while ( t.getType()!= HalsteadLexer.EOF ) {//Token.EOF works as well
            System.out.printf("%2d:%2d Typ-Code: %2d Lexem: %s\n",
                    t.getLine(),
                    t.getCharPositionInLine(),
                    t.getType(),
                    t.getText());
            t = lex.nextToken();
            if(t.getType()==3){
                allOPerands++;
                if(!countOperands.contains(t.getText())) countOperands.add(t.getText());
            }else if(t.getType()==2) {
                allOperators++;
                if (!countOperators.contains(t.getText())) countOperators.add(t.getText());
            }
        }
        System.out.println("Operands: "+allOPerands);
        System.out.println("Operators: "+allOperators);
        System.out.println("Programmlänge: "+(allOPerands+allOperators));
        System.out.println("Vokabulargröße: "+(countOperands.size()+countOperators.size()));
        System.out.println("Volumen: "+((allOPerands+allOperators)*Math.log(countOperands.size()+countOperators.size())));

    }
}
