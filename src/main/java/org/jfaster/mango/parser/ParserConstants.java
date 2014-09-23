/* Generated By:JJTree&JavaCC: Do not edit this line. ParserConstants.java */
package org.jfaster.mango.parser;


/**
 * Token literal values and constants.
 * Generated by org.javacc.parser.OtherFilesGen#start()
 */
public interface ParserConstants {

  /** End of File. */
  int EOF = 0;
  /** RegularExpression Id. */
  int COLON = 1;
  /** RegularExpression Id. */
  int NUMBER = 2;
  /** RegularExpression Id. */
  int DOT = 3;
  /** RegularExpression Id. */
  int FIELD = 4;
  /** RegularExpression Id. */
  int WHITESPACE = 5;
  /** RegularExpression Id. */
  int BLANK = 6;
  /** RegularExpression Id. */
  int JDBC_ITERABLE_PARAMETER = 7;
  /** RegularExpression Id. */
  int GLOBAL_TABLE = 8;
  /** RegularExpression Id. */
  int JOIN_PARAMETER = 9;
  /** RegularExpression Id. */
  int IF_DIRECTIVE = 10;
  /** RegularExpression Id. */
  int ELSEIF_DIRECTIVE = 11;
  /** RegularExpression Id. */
  int ELSE_DIRECTIVE = 12;
  /** RegularExpression Id. */
  int END = 13;
  /** RegularExpression Id. */
  int TEXT = 14;
  /** RegularExpression Id. */
  int LOGICAL_AND = 16;
  /** RegularExpression Id. */
  int LOGICAL_OR = 17;
  /** RegularExpression Id. */
  int LOGICAL_LT = 18;
  /** RegularExpression Id. */
  int LOGICAL_LE = 19;
  /** RegularExpression Id. */
  int LOGICAL_GT = 20;
  /** RegularExpression Id. */
  int LOGICAL_GE = 21;
  /** RegularExpression Id. */
  int LOGICAL_EQ = 22;
  /** RegularExpression Id. */
  int LOGICAL_NE = 23;
  /** RegularExpression Id. */
  int LOGICAL_NOT = 24;
  /** RegularExpression Id. */
  int INTEGER_LITERAL = 25;
  /** RegularExpression Id. */
  int TRUE = 26;
  /** RegularExpression Id. */
  int FALSE = 27;
  /** RegularExpression Id. */
  int NULL = 28;
  /** RegularExpression Id. */
  int LPAREN = 29;
  /** RegularExpression Id. */
  int RPAREN = 30;
  /** RegularExpression Id. */
  int PARAMETER = 31;

  /** Lexical state. */
  int DEFAULT = 0;
  /** Lexical state. */
  int EXPRESSION = 1;

  /** Literal token values. */
  String[] tokenImage = {
    "<EOF>",
    "\":\"",
    "<NUMBER>",
    "\".\"",
    "<FIELD>",
    "<WHITESPACE>",
    "<BLANK>",
    "<JDBC_ITERABLE_PARAMETER>",
    "\"#table\"",
    "<JOIN_PARAMETER>",
    "\"#if\"",
    "\"#elseif\"",
    "\"#else\"",
    "\"#end\"",
    "<TEXT>",
    "\" \"",
    "<LOGICAL_AND>",
    "<LOGICAL_OR>",
    "<LOGICAL_LT>",
    "<LOGICAL_LE>",
    "<LOGICAL_GT>",
    "<LOGICAL_GE>",
    "<LOGICAL_EQ>",
    "<LOGICAL_NE>",
    "<LOGICAL_NOT>",
    "<INTEGER_LITERAL>",
    "\"true\"",
    "\"false\"",
    "\"null\"",
    "\"(\"",
    "\")\"",
    "<PARAMETER>",
  };

}
