grammar Syntax;

prog:stat+;

stat:  expr NEWLINE         #printExpr
       | ID '='expr NEWLINE #assign
       | NEWLINE           #blank
       ;

expr:  <assoc=right>expr '^' expr   #Pot
      | expr op=('*'|'/') expr      #MulDiv
      | expr op=('+'|'-') expr      #AddSub
      | '(' expr ')'                #parens
      | expr op=('<'|'>') expr         #SmallerasBiggeras
      | FLOAT                       #float
      | ID                          # id
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