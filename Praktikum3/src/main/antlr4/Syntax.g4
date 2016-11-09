grammar Syntax;

prog:stat+;

stat:  expr '\n'
       | ID '='expr '\n'
       | '\n';

expr: expr '^' <assoc=right> expr
      | expr ('*'|'/') expr
      | expr ('+'|'-') expr
      | '('expr')'
      | expr ('<'|'>') expr
      | INT
      | ID;
INT: [0-9]+;
ID: [a-zA-Z]+;
WS: [\t] -> skip;