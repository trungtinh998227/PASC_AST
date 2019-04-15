grammar PASC;

program: PROGRAMnumber expr SEMInumber declare block;

expr :       expr operator expr
           | expr assign
           | paren
           | constvalue
           | expr COMMAnumber expr
           | declare
           | ifStatement
           | loopStatement
           | identifier
           | constnumber
           | string
           | forStatement
           | repeat
           ;

//Block
block: BEGINnumber expr+ ENDnumber;

//Loop-Statment
loopStatement:   WHILEnumber condition expr+ #while
               | LOOPnumber expr+ ENDLOOPnumber #loop ;

//If-Statement
ifStatement:  IFnumber condition THENnumber expr+ (ELSEnumber (block|expr+)) ENDIFnumber
             |IFnumber condition THENnumber expr+ ENDIFnumber;

//Condition
condition: expr compare=(EQnumber|LEnumber|GEnumber|NEnumber) expr
           | condition ANDnumber condition
           | condition ORnumber condition;

//Operator
operator: (PLUSnumber|MINUSnumber|TIMESnumber|DIVnumber);

//Assign
assign: COLEQnumber expr SEMInumber
      | expr COLEQnumber constnumber;

//Const-number
constnumber: ICONTSnumber;

//const-value
constvalue: CONSTnumber expr SEMInumber;

//Paren
paren: LPAREN expr RPAREN;

//Identifier
identifier: IDnumber;

//declare-value
declare: VARnumber expr SEMInumber;

//String
string: '(*' expr '*)';

//for
forStatement: FORnumber COLEQnumber expr TOnumber constnumber 'do' expr+
    | FORnumber COLEQnumber expr DOWNTOnumber constnumber 'do' expr+;

//repeat
repeat: REPEATnumber expr+ UNTILnumber condition SEMInumber;

// Whitespace
WS                 : [ \t\n\r]+ -> channel(HIDDEN) ;

// Keywords
VARnumber       : 'var' ;
ANDnumber       : 'and' ;
ARRAYnumber     : 'array' ;
BEGINnumber     : 'begin' ;
CONSTnumber     : 'const' ;
DIVnumber       : 'div' ;
DOWNTOnumber    : 'downto' ;
ELSEnumber      : 'else' ;
ELSIFnumber     : 'elsif' ;
ENDnumber       : 'end' ;
ENDIFnumber     : 'endif' ;
ENDLOOPnumber   : 'endloop' ;
ENDRECnumber    : 'endrec' ;
EXITnumber      : 'exit' ;
FORnumber       : 'for' ;
FORWARDnumber   : 'forward' ;
FUNCTIONnumber  : 'function' ;
IFnumber        : 'if' ;
ISnumber        : 'is' ;
LOOPnumber      : 'loop' ;
NOTnumber       : 'not' ;
OFnumber        : 'of' ;
ORnumber        : 'or' ;
PROCEDUREnumber : 'procedure' ;
PROGRAMnumber   : 'program' ;
RECORDnumber    : 'record' ;
REPEATnumber    : 'repeat' ;
RETURNnumber    : 'return' ;
THENnumber      : 'then' ;
TOnumber        : 'to' ;
TYPEnumber      : 'type' ;
UNTILnumber     : 'util' ;
WHILEnumber     : 'while' ;
// Literals
ICONTSnumber    : [0-9]+;
// Operators
PLUSnumber      : '+' ;
MINUSnumber     : '-' ;
TIMESnumber     : '*' ;
COLEQnumber     : ':=' ;
LPARENnumber    : '(' ;
RPARENnumber    : ')' ;
DOTnumber       : '.' ;
SEMInumber      : ';' ;
COLONnumber     : ':' ;
COMMAnumber     : ',' ;
LTnumber        : '<' ;
GTnumber        : '>' ;
EQnumber        : '==' ;
LEnumber        : '<=';
GEnumber        : '>=' ;
NEnumber        : '<>' ;
// Identifiers
IDnumber        : [A-Za-z0-9]+ ;
