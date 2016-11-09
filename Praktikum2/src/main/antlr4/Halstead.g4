grammar Halstead;


program: ;

IGNORE: (LINE_COMMENT|COMMENT|RIGHT_BRACKET|DOUBLEPOINT|KEYWORD|(INCLUDE HEADERS)) -> skip;
OPERATOR: SPCSPEC|TYPE_QUAL|RESERVED|OPERATORS;
OPERAND: CONSTANT|TYPESPEC|IDENTIFIER;
SPCSPEC:'auto'|'extern'|'inline'|'register'|'static'|'typedef'|'virtual'|'mtubale';
TYPE_QUAL:'const'|'friend'|'volatile';
RESERVED: 'asm'|'break'|'case'|'class'|'continue'|'default'|'delete'|'else'|'enum'|'goto'|'new'|'operator'|'private'|'protected'|'public'|'return'|'sizeof'|'struct'|'this'|'union'|'namespace'|'using'|'try'|'catch'|'throw'|'const_cast'|'static_cast'|'dynamic_cast'|'reiznterpet_cast'|'typeid'|'template'|'explicit'|'true'|'false'|'typename'|LOOPS;
OPERATORS: '!'|'!='|'%'|'%='|'&'|'&&'|'&='|'('|'*'|'*='|'+'|'++'|'+='|'|'|'-'|'--'|'-='|'->'|'...'|'/'|'/='|'::'|'<'|'<<'|'<<='|'<='|'=='|'>'|'>='|'>>'|'>>='|'?'|'['|'^'|'^='|'{'|'||'|'='|'~'|';';
CONSTANT: STRING|CHAR|INT|FLOAT;
TYPESPEC: 'bool'|'char'|'double'|'float'|'int'|'long'|'short'|'signed'|'unsigned'|'void';
IDENTIFIER: FIRSTLETTER(WORD|INT)*;
LOOPS: LOOP_NAMES '(';
LINE_COMMENT: '//' .*? '\r'? '\n';
LOOP_NAMES:'while'|'for'|'switch';
FLOAT: INT '.' INT|'.' INT;
INT:DIGIT+;
fragment DIGIT: [0-9];
STRING: '"' (ESC| . )*? '"';
CHAR :  '\'' LETTERS?SPECIAL? '\'';
SPECIAL: '/'|'-'|'+'|'*'|'\\';
ESC : '\\' | '\\\\'; //String with escape character
fragment LETTERS: [a-zA-Z];
FIRSTLETTER:[a-zA-Z_];
COMMENT: '/*' .*? '*/';
RIGHT_BRACKET: [)|}|'\]'];
DOUBLEPOINT: ':' ;
KEYWORD: 'do';
HEADERS: '<' .*? '.h>';
INCLUDE: ('#inlcude'|'#INCLUDE');
WORD:LETTERS+;
WS: [\s,\t,\r,\n,' '] -> skip;
