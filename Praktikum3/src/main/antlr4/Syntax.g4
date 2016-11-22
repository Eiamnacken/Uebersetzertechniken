grammar Syntax;

prog:stat+;

stat:  expr NEWLINE
       | ID '='expr NEWLINE
       | NEWLINE
       ;

expr:  <assoc=right>expr '^' expr
      | expr op=('*'|'/') expr
      | expr op=('+'|'-') expr
      | '(' expr ')'
      | expr op=('<'|'>') expr
      | FLOAT
      | ID
      ;
FLOAT: INT?'.'INT;
INT: [0-9]+;
ID: [a-zA-Z]+;
WS: [\t] -> skip;
NEWLINE:'\r'? '\n' ;
MUL :   '*' ;
DIV :   '/' ;
ADD :   '+' ;
SUB :   '-' ;
SMALLERAS: '<';
BIGGERAS: '>';