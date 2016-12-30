grammar Calculator;
prog: stat+;

stat: expr NEWLINE # printExpr
    | ID '=' expr NEWLINE #assign
    | CLEAR  # clear
    ;

expr: <assoc=right>expr '^' expr    # pow
    | expr op=('*'|'/') expr        # MulDiv
    | expr op=('+'|'-') expr        # AddSub
    | expr op=('<'|'>') expr        # SmallerBigger
    | (INT|DOUBLE)                  # int
    | ID                            # id
    | '(' expr ')'                  # parens
    ;
CLEAR:'#';
INT: [0-9]+;
NEWLINE: '\r'? '\n';
MUL: '*';
DIV: '/';
ADD: '+';
SUB: '-';
SMALLAS: '<';
BIGGERAS: '>';
DOUBLE: ID+'.'ID+;
ID: [a-z]+;
WS: [\t]+ -> skip;