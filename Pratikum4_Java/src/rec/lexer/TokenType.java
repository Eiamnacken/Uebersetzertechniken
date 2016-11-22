package rec.lexer;

/**
 * Created by eiamnacken on 16.11.16.
 */
public enum TokenType {

    NL(1),MIN(2),ADD(3),MUL(4),DIV(5),RBRACKET(6),LBRACKET(7),INT(8),INVALIDTYPE(9),EOF(10);

    private int number;

    TokenType(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public static TokenType parseCharacter(String character){
        TokenType returnValue;
        if(character.matches("[0-9]+")){
            returnValue = INT;
            return returnValue;
        }

        switch(character){
            case "*":
                returnValue=MUL;
                break;
            case "+":
                returnValue=ADD;
                break;
            case "\n":
                returnValue=NL;
                break;
            case "/":
                returnValue=DIV;
                break;
            case "-":
                returnValue=MIN;
                break;
            case ")":
                returnValue=RBRACKET;
                break;
            case "(":
                returnValue=LBRACKET;
                break;
            default:
                returnValue=INVALIDTYPE;
                break;
        }
        return returnValue;
    }
}
