/** Simple statically-typed programming language with functions and variables
 *  taken from "Language Implementation Patterns" book.
 */
grammar Cymbol;

file:   (functionDecl | varDecl)+ ;

varDecl
    :   type ID ('=' expr)? ';'
    ;
type:   'float' | 'int' | 'void'| 'char' ; // user-defined types

functionDecl
    :   type ID '(' formalParameters? ')' block // "void f(int x) {...}"
    ;

formalParameters
    :   formalParameter (',' formalParameter)*
    ;
formalParameter
    :   type ID
    ;


c_for: 'for' '(' (ID '=' NUMBER )? ';' expr? ';' (('--'|'++')? ID ('++'|'--'))?')'block;

c_if: 'if''(' expr ')' block c_else?;
c_else: 'else' (block|c_if);

block:  '{' stat* '}' ;   // possibly empty statement block

stat:   c_for 
	|	c_if	
	|	block	
    |   varDecl	
    |   'return' expr? ';'  
    |   expr ASSIGN expr ';' 
    |   expr ';'          
    ;

/* expr below becomes the following non-left recursive rule:
expr[int _p]
    :   ( '-' expr[6]
        | '!' expr[5]
        | ID
        | INT
        | '(' expr ')'
        )
        ( {8 >= $_p}? '*' expr[9]
        | {7 >= $_p}? ('+'|'-') expr[8]
        | {4 >= $_p}? '==' expr[5]
        | {10 >= $_p}? '[' expr ']'
        | {9 >= $_p}? '(' exprList? ')'
        )*
    ;
*/

expr:   ID '(' exprList? ')'    # Call
    |   expr '[' expr ']'       # Index
    |   '-' expr                # Negate
    |   '!' expr                # Not
    |   expr '*' expr           # Mult
    |   expr ('+'|'-') expr     # AddSub
    |   expr '==' expr          # Equal
    |	expr SMALL expr			# Smaller
    |	expr BIG expr			# Bigger
    | 	expr SMALL ASSIGN expr	# SmallerEqual
    |	expr NOT ASSIGN expr	# EqualNot
    |   ID                      # Var
    |   INT                     # Int
    |   '(' expr ')'            # Parens
    ;


bool: (SMALL|BIG|(NOT ASSIGN)|(ASSIGN ASSIGN)|(SMALL ASSIGN)|(BIG ASSIGN));
exprList : expr (',' expr)* ;   // arg list
NUMBER: (INT|DOUBLE);
K_CHAR	: 'char'; 
K_FLOAT : 'float';
K_INT   : 'int';
K_VOID  : 'void';
ID  :   LETTER (LETTER | [0-9])* ;
fragment
LETTER : [a-zA-Z] ;
DOUBLE: INT?'.'INT;
INT :   [0-9]+ ;
SMALL: '<';
BIG: '>';
ASSIGN: '=';
NOT: '!';
WS  :   [ \t\n\r]+ -> skip ;

SL_COMMENT
    :   '//' .*? '\n' -> skip
    ;