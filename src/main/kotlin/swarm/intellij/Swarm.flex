package swarm.intellij.language;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static swarm.intellij.language.psi.SwarmTypes.*;

%%

%{
public _SwarmLexer() {
	this((java.io.Reader)null);
}
%}

%public
%class _SwarmLexer
%implements FlexLexer
%function advance
%type IElementType
%unicode

%state StringSQ
%state StringDQ
%state StringRL
%state Regex
%state RegexRange

EOL=\R
WHITE_SPACE=\s+

COMMENT_DOC=("///")[^\r\n]*
COMMENT_LINE=("//")[^\r\n]*
COMMENT_BLOCK=[/][*][^*]*[*]+([^/*][^*]*[*]+)*[/]
BOOLEAN=true|false
SYMBOL=[\p{XID_Start}_-][\p{XID_Continue}_-]*
BYTE=(0[bBoOxXfF][0-9A-Fa-f][0-9A-Fa-f_]*)
INTEGER=(0|[1-9][0-9_]*)
DECIMAL=([0-9]+\.[0-9]*([*][*][0-9]+)?)|(\.[0-9]+([Ee][0-9]+)?)
SIGN=[+-]
ESCAPE_SPECIAL = \\[^xuU]
ESCAPE_UNICODE = \\(x{HEX}{2}|u{HEX}{4}|U\{{HEX}+\})
HEX = [0-9a-fA-F]

KW_NAMESPACE = namespace|module|mod
KW_DEFINE    = define|def|function|fun|fn
KW_IMPORT    = import|using|use
KW_TASK      = task|pipeline

%%
<YYINITIAL> {
	{WHITE_SPACE}   { return WHITE_SPACE; }
	{COMMENT_DOC}   { return COMMENT_DOC; }
	{COMMENT_LINE}  { return COMMENT_LINE; }
	{COMMENT_BLOCK} { return COMMENT_BLOCK; }
}

<YYINITIAL> {
	{KW_NAMESPACE} { return KW_NAMESPACE; }
	{KW_TASK}      { return KW_TASK; }
	{KW_DEFINE}    { return KW_DEFINE; }
	{KW_IMPORT}    { return KW_IMPORT; }
    // {LINE_ARG}     { return LINE_ARG; }
}

<YYINITIAL> {
	//
	"("  { return PARENTHESIS_L; }
	")"  { return PARENTHESIS_R; }
	"["  { return BRACKET_L; }
	"]"  { return BRACKET_R; }
	"{"  { return BRACE_L; }
	"}"  { return BRACE_R; }
	"->" { return ARROW; }
	"<"  { return ANGLE_L; }
	">"  { return ANGLE_R; }
	//
	::   { return DOUBLE_COLON; }
	:    { return COLON; }
	;    { return SEMICOLON; }
	,    { return COMMA; }
	#    { return HASH; }
	\^   { return ACCENT; }
	\~   { return SOFT_CONNECT;}
	\|   { return CHOOSE;}
	\!   { return NOT;}
	\\   { return ESCAPE; }
	\$   { return DOLLAR; }
	\.   { return DOT; }

	\?   { return OPTIONAL;}
	\+   { return MANY1; }
	\-   { return HYPHEN; }
	\*   { return MANY; }
}
<YYINITIAL> [\^\]$@]*= {
	return EQ;
}
<YYINITIAL> {
	// literal
	{BOOLEAN}     { return BOOLEAN; }
	{SYMBOL}      { return SYMBOL; }
	{BYTE}        { return BYTE; }
	{INTEGER}     { return INTEGER; }
	{DECIMAL}     { return DECIMAL; }
	{SIGN}        { return SIGN; }
}
// String Mode =========================================================================================================
<YYINITIAL> {
	\' {yybegin(StringSQ);return STRING_SQ;}
	\" {yybegin(StringDQ);return STRING_DQ;}
	@{SYMBOL} {yybegin(StringRL);return SYMBOL;}
}
<StringSQ, StringDQ, YYINITIAL> {ESCAPE_SPECIAL} {
	return ESCAPE_SPECIAL;
}
<StringSQ, StringDQ, YYINITIAL> {ESCAPE_UNICODE} {
	return ESCAPE_UNICODE;
}
<StringRL> {
	[^\r\n] {return CHARACTER;}
	\r|\n {yybegin(YYINITIAL);return WHITE_SPACE;}
}
<StringSQ> {
	[^\\\'] {return CHARACTER;}
	\' {yybegin(YYINITIAL);return STRING_SQ;}
}
<StringDQ> {
	[^\\\"] {return CHARACTER;}
	\" {yybegin(YYINITIAL);return STRING_DQ;}
}
// Regex Mode ==========================================================================================================
//<YYINITIAL> \/ {
//	yybegin(Regex);
//	return REGEX_QUOTE;
//}
//<Regex> {
//	[^\\\/] {return CHARACTER;}
//	\/ {yybegin(YYINITIAL);return REGEX_QUOTE;}
//}
//<YYINITIAL> \[ {
//	yybegin(RegexRange);
//	return REGEX_RANGE_L;
//}
//<RegexRange> {
//	[^\\\[\]] {return REGEX_CHARACTER;}
//	\] {yybegin(YYINITIAL);return REGEX_RANGE_R;}
//}
// Otherwisw ===========================================================================================================
[^] { return BAD_CHARACTER; }
