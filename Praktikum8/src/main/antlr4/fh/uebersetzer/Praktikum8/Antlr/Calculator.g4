grammar Calculator;
prog: stat;

stat: expr NEWLINE # printExpr
    | ID '=' expr NEWLINE #assign
    | CLEAR  # clear
    ;

expr: <assoc=right>expr POW expr    # Pow
    | expr MUL expr        # Mul
    | expr DIV expr		 # Div
    | expr ADD expr        # Add
    | expr SUB expr		 # Sub
    | expr SMALLAS expr        # Smaller
    | expr BIGGERAS expr 		 # Bigger
    | DOUBLE			 # Int
    | ID                 # Id
    | '(' expr ')'       # Parens
    ;
POW:'^';
CLEAR:'#';
DOUBLE: INT+'.'INT+;
INT: [0-9]+;
NEWLINE: '\r'? '\n';
MUL: '*';
DIV: '/';
ADD: '+';
SUB: '-';
SMALLAS: '<';
BIGGERAS: '>';
ID: [a-z]+;
WS: [\t]+ -> skip;