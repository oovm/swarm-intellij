// This is a generated file. Not intended for manual editing.
package swarm.intellij.language.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import swarm.intellij.language.psi_node.*;

public interface SwarmTypes {

  IElementType ATOM = new SwarmElementType("ATOM");
  IElementType CHARSET = new SwarmElementType("CHARSET");
  IElementType CLASS_STATEMENT = new SwarmElementType("CLASS_STATEMENT");
  IElementType CMD_BLOCK = new SwarmElementType("CMD_BLOCK");
  IElementType CMD_PAIR = new SwarmElementType("CMD_PAIR");
  IElementType CMD_STATEMENT = new SwarmElementType("CMD_STATEMENT");
  IElementType CMD_STRING = new SwarmElementType("CMD_STRING");
  IElementType CMD_VALUE = new SwarmElementType("CMD_VALUE");
  IElementType DEFINE_PAIR = new SwarmElementType("DEFINE_PAIR");
  IElementType DEFINE_PARAMETERS = new SwarmElementType("DEFINE_PARAMETERS");
  IElementType DEFINE_STATEMENT = new SwarmElementType("DEFINE_STATEMENT");
  IElementType EXPR = new SwarmElementType("EXPR");
  IElementType FIELD_MARK = new SwarmElementType("FIELD_MARK");
  IElementType FIELD_RHS = new SwarmElementType("FIELD_RHS");
  IElementType FN_PAIR = new SwarmElementType("FN_PAIR");
  IElementType FN_STATEMENT = new SwarmElementType("FN_STATEMENT");
  IElementType FUNCTION_ARGS = new SwarmElementType("FUNCTION_ARGS");
  IElementType FUNCTION_CALL = new SwarmElementType("FUNCTION_CALL");
  IElementType IDENTIFIER = new SwarmElementType("IDENTIFIER");
  IElementType IMPORT_BODY = new SwarmElementType("IMPORT_BODY");
  IElementType IMPORT_STATEMENT = new SwarmElementType("IMPORT_STATEMENT");
  IElementType INFIX = new SwarmElementType("INFIX");
  IElementType KEY = new SwarmElementType("KEY");
  IElementType KEY_SYMBOL = new SwarmElementType("KEY_SYMBOL");
  IElementType MACRO_ARG = new SwarmElementType("MACRO_ARG");
  IElementType MACRO_CALL = new SwarmElementType("MACRO_CALL");
  IElementType MODIFIERS = new SwarmElementType("MODIFIERS");
  IElementType NAMESPACE = new SwarmElementType("NAMESPACE");
  IElementType NAMESPACE_STATEMENT = new SwarmElementType("NAMESPACE_STATEMENT");
  IElementType NUMBER_SUFFIX = new SwarmElementType("NUMBER_SUFFIX");
  IElementType OBJECT = new SwarmElementType("OBJECT");
  IElementType OBJECT_ITEM = new SwarmElementType("OBJECT_ITEM");
  IElementType OBJECT_KEY = new SwarmElementType("OBJECT_KEY");
  IElementType PAIR = new SwarmElementType("PAIR");
  IElementType PARENTHESIS = new SwarmElementType("PARENTHESIS");
  IElementType PREFIX = new SwarmElementType("PREFIX");
  IElementType RULE_ATOM = new SwarmElementType("RULE_ATOM");
  IElementType RULE_BODY = new SwarmElementType("RULE_BODY");
  IElementType RULE_EXPR = new SwarmElementType("RULE_EXPR");
  IElementType RULE_TERM = new SwarmElementType("RULE_TERM");
  IElementType RULE_TYPE = new SwarmElementType("RULE_TYPE");
  IElementType STRING_LITERAL = new SwarmElementType("STRING_LITERAL");
  IElementType SUFFIX = new SwarmElementType("SUFFIX");
  IElementType SYMBOL_PATH = new SwarmElementType("SYMBOL_PATH");
  IElementType TABLE = new SwarmElementType("TABLE");
  IElementType TERM = new SwarmElementType("TERM");
  IElementType TYPE_HINT = new SwarmElementType("TYPE_HINT");
  IElementType VALUE = new SwarmElementType("VALUE");

  IElementType ACCENT = new SwarmElementType("^");
  IElementType ANGLE_L = new SwarmElementType("<");
  IElementType ANGLE_R = new SwarmElementType(">");
  IElementType ARROW = new SwarmElementType("ARROW");
  IElementType AS = new SwarmElementType("as");
  IElementType AT = new SwarmElementType("@");
  IElementType BOOLEAN = new SwarmElementType("BOOLEAN");
  IElementType BRACE_L = new SwarmElementType("{");
  IElementType BRACE_R = new SwarmElementType("}");
  IElementType BRACKET_L = new SwarmElementType("[");
  IElementType BRACKET_R = new SwarmElementType("]");
  IElementType BRANCH_MARK = new SwarmElementType("branch_mark");
  IElementType BYTE = new SwarmElementType("BYTE");
  IElementType CHARACTER = new SwarmElementType("CHARACTER");
  IElementType CHOOSE = new SwarmElementType("|");
  IElementType COLON = new SwarmElementType(":");
  IElementType COMMA = new SwarmElementType(",");
  IElementType COMMENT_BLOCK = new SwarmElementType("COMMENT_BLOCK");
  IElementType COMMENT_DOC = new SwarmElementType("COMMENT_DOC");
  IElementType COMMENT_LINE = new SwarmElementType("COMMENT_LINE");
  IElementType DECIMAL = new SwarmElementType("DECIMAL");
  IElementType DOLLAR = new SwarmElementType("$");
  IElementType DOT = new SwarmElementType(".");
  IElementType DOUBLE_COLON = new SwarmElementType("DOUBLE_COLON");
  IElementType EQ = new SwarmElementType("=");
  IElementType ESCAPE = new SwarmElementType("\\");
  IElementType ESCAPE_SPECIAL = new SwarmElementType("ESCAPE_SPECIAL");
  IElementType ESCAPE_UNICODE = new SwarmElementType("ESCAPE_UNICODE");
  IElementType HASH = new SwarmElementType("HASH");
  IElementType HYPHEN = new SwarmElementType("-");
  IElementType INTEGER = new SwarmElementType("INTEGER");
  IElementType KW_CLASS = new SwarmElementType("KW_CLASS");
  IElementType KW_DEFINE = new SwarmElementType("KW_DEFINE");
  IElementType KW_IMPORT = new SwarmElementType("KW_IMPORT");
  IElementType KW_NAMESPACE = new SwarmElementType("KW_NAMESPACE");
  IElementType LINE_ARG = new SwarmElementType("LINE_ARG");
  IElementType MANY = new SwarmElementType("*");
  IElementType MANY1 = new SwarmElementType("+");
  IElementType NOT = new SwarmElementType("!");
  IElementType OPTIONAL = new SwarmElementType("?");
  IElementType PARENTHESIS_L = new SwarmElementType("(");
  IElementType PARENTHESIS_R = new SwarmElementType(")");
  IElementType QUOTATION = new SwarmElementType("\"");
  IElementType RANGE = new SwarmElementType("range");
  IElementType REGEX_RANGE = new SwarmElementType("REGEX_RANGE");
  IElementType SEMICOLON = new SwarmElementType(";");
  IElementType SIGN = new SwarmElementType("SIGN");
  IElementType SOFT_CONNECT = new SwarmElementType("~");
  IElementType STRING_DQ = new SwarmElementType("STRING_DQ");
  IElementType STRING_SQ = new SwarmElementType("STRING_SQ");
  IElementType SYMBOL = new SwarmElementType("SYMBOL");
  IElementType TAGGED = new SwarmElementType("<-");
  IElementType TO = new SwarmElementType("->");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == ATOM) {
        return new SwarmAtomNode(node);
      }
      else if (type == CHARSET) {
        return new SwarmCharsetNode(node);
      }
      else if (type == CLASS_STATEMENT) {
        return new SwarmClassStatementNode(node);
      }
      else if (type == CMD_BLOCK) {
        return new SwarmCmdBlockNode(node);
      }
      else if (type == CMD_PAIR) {
        return new SwarmCmdPairNode(node);
      }
      else if (type == CMD_STATEMENT) {
        return new SwarmCmdStatementNode(node);
      }
      else if (type == CMD_STRING) {
        return new SwarmCmdStringNode(node);
      }
      else if (type == CMD_VALUE) {
        return new SwarmCmdValueNode(node);
      }
      else if (type == DEFINE_PAIR) {
        return new SwarmDefinePairNode(node);
      }
      else if (type == DEFINE_PARAMETERS) {
        return new SwarmDefineParametersNode(node);
      }
      else if (type == DEFINE_STATEMENT) {
        return new SwarmDefineStatementNode(node);
      }
      else if (type == EXPR) {
        return new SwarmExprNode(node);
      }
      else if (type == FIELD_MARK) {
        return new SwarmFieldMarkNode(node);
      }
      else if (type == FIELD_RHS) {
        return new SwarmFieldRhsNode(node);
      }
      else if (type == FN_PAIR) {
        return new SwarmFnPairNode(node);
      }
      else if (type == FN_STATEMENT) {
        return new SwarmFnStatementNode(node);
      }
      else if (type == FUNCTION_ARGS) {
        return new SwarmFunctionArgsNode(node);
      }
      else if (type == FUNCTION_CALL) {
        return new SwarmFunctionCallNode(node);
      }
      else if (type == IDENTIFIER) {
        return new SwarmIdentifierNode(node);
      }
      else if (type == IMPORT_BODY) {
        return new SwarmImportBodyNode(node);
      }
      else if (type == IMPORT_STATEMENT) {
        return new SwarmImportStatementNode(node);
      }
      else if (type == INFIX) {
        return new SwarmInfixNode(node);
      }
      else if (type == KEY) {
        return new SwarmKeyNode(node);
      }
      else if (type == KEY_SYMBOL) {
        return new SwarmKeySymbolNode(node);
      }
      else if (type == MACRO_ARG) {
        return new SwarmMacroArgNode(node);
      }
      else if (type == MACRO_CALL) {
        return new SwarmMacroCallNode(node);
      }
      else if (type == MODIFIERS) {
        return new SwarmModifiersNode(node);
      }
      else if (type == NAMESPACE) {
        return new SwarmNamespaceNode(node);
      }
      else if (type == NAMESPACE_STATEMENT) {
        return new SwarmNamespaceStatementNode(node);
      }
      else if (type == NUMBER_SUFFIX) {
        return new SwarmNumberSuffixNode(node);
      }
      else if (type == OBJECT) {
        return new SwarmObjectNode(node);
      }
      else if (type == OBJECT_ITEM) {
        return new SwarmObjectItemNode(node);
      }
      else if (type == OBJECT_KEY) {
        return new SwarmObjectKeyNode(node);
      }
      else if (type == PAIR) {
        return new SwarmPairNode(node);
      }
      else if (type == PARENTHESIS) {
        return new SwarmParenthesisNode(node);
      }
      else if (type == PREFIX) {
        return new SwarmPrefixNode(node);
      }
      else if (type == RULE_ATOM) {
        return new SwarmRuleAtomNode(node);
      }
      else if (type == RULE_BODY) {
        return new SwarmRuleBodyNode(node);
      }
      else if (type == RULE_EXPR) {
        return new SwarmRuleExprNode(node);
      }
      else if (type == RULE_TERM) {
        return new SwarmRuleTermNode(node);
      }
      else if (type == RULE_TYPE) {
        return new SwarmRuleTypeNode(node);
      }
      else if (type == STRING_LITERAL) {
        return new SwarmStringLiteralNode(node);
      }
      else if (type == SUFFIX) {
        return new SwarmSuffixNode(node);
      }
      else if (type == SYMBOL_PATH) {
        return new SwarmSymbolPathNode(node);
      }
      else if (type == TABLE) {
        return new SwarmTableNode(node);
      }
      else if (type == TERM) {
        return new SwarmTermNode(node);
      }
      else if (type == TYPE_HINT) {
        return new SwarmTypeHintNode(node);
      }
      else if (type == VALUE) {
        return new SwarmValueNode(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
