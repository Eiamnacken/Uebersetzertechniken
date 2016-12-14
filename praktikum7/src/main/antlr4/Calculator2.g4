grammar Calculator2;

@header {
import java.util.*;
}

@parser::members {
    /** "memory" for our calculator; variable/value pairs go here */
    Map<String, Integer> memory = new HashMap<String, Integer>();
    int eval(int left, int op, int right) {
        switch ( op ) {
            case MUL : return (left * right);
            case DIV : return left / right;
            case ADD : return (left + right);
            case SUB : return left - right;
            case BIGGERAS : if (left > right){return 1; } else {return 0;}
            case SMALLERAS : if (right > left){return 1; } else {return 0;}
            case POW : return (int)Math.pow(left,right);
        }
        return 0;
    }


    int visitClear(){
		memory.clear();
		return 0;
	}
}
prog: stat+;

stat: e NEWLINE  {System.out.println($e.v);}
    | ID '=' e NEWLINE  {memory.put($ID.text, $e.v);}
    | clear
    ;
clear : '#' {visitVClear();};

e returns [double v]
 : <assoc=right>l=e '^' r=e   {$v= eval($l.v,$op.type,$r.v);}
    | l=e op=('*'|'/') r=e {$v= eval($l.v,$op.type,$r.v);}
    | l=e op=('+'|'-') r=e {$v= eval($l.v,$op.type,$r.v);}
    | l=e op=('<'|'>') r=e {$v= eval($l.v,$op.type,$r.v);}
    | (INT|DOUBLE)          {$v= $DOUBLE.int;}
    | ID
    {
          String id = $ID.text;
          $v = memory.containsKey(id) ? memory.get(id) : 0;
          }
    | '(' a=e ')'           {$v=$a.v;}
    ;

INT: [0-9]+;
NEWLINE: '\r'? '\n';
MUL: '*';
DIV: '/';
ADD: '+';
SUB: '-';
SMALLAS: '<';
BIGGERAS: '>';
DOUBLE: ID+'.'ID+;
CLEAR:'#';
ID: [a-z]+;
WS: [\t]+ -> skip;
