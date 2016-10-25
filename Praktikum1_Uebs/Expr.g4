
grammar Expr;
stat :INT(ID|WS)*;

ID : [PLUS|MINUS|UMINUS|MUL|DIV|POW|SQRT|NL] ;

PLUS: '+';
MINUS: '-';
UMINUS: '#';
MUL: '*';
DIV:':';
POW:'^';
SQRT:'~';
NL:'\n';
INT: [0-9]+;

WS : [\t\r]+ -> skip ; // skip spaces, tabs,
