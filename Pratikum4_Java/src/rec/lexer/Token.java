package rec.lexer;

/**
 * Created by eiamnacken on 16.11.16.
 */
public class Token {

    private String token;

    private TokenType type;

    public Token(String token, TokenType type) {
        this.token = token;
        this.type = type;
    }

    public String getToken() {
        return token;
    }



    public TokenType getType() {
        return type;
    }


}
