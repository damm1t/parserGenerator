// Generated from /home/damm1t/IdeaProjects/parser_generator/src/NewGrammar.g4 by ANTLR 4.7.2

import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link NewGrammarParser}.
 */
public interface NewGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link NewGrammarParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(NewGrammarParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link NewGrammarParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(NewGrammarParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link NewGrammarParser#parseRules}.
	 * @param ctx the parse tree
	 */
	void enterParseRules(NewGrammarParser.ParseRulesContext ctx);
	/**
	 * Exit a parse tree produced by {@link NewGrammarParser#parseRules}.
	 * @param ctx the parse tree
	 */
	void exitParseRules(NewGrammarParser.ParseRulesContext ctx);
	/**
	 * Enter a parse tree produced by {@link NewGrammarParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(NewGrammarParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link NewGrammarParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(NewGrammarParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link NewGrammarParser#returnsBlock}.
	 * @param ctx the parse tree
	 */
	void enterReturnsBlock(NewGrammarParser.ReturnsBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link NewGrammarParser#returnsBlock}.
	 * @param ctx the parse tree
	 */
	void exitReturnsBlock(NewGrammarParser.ReturnsBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link NewGrammarParser#readArgument}.
	 * @param ctx the parse tree
	 */
	void enterReadArgument(NewGrammarParser.ReadArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link NewGrammarParser#readArgument}.
	 * @param ctx the parse tree
	 */
	void exitReadArgument(NewGrammarParser.ReadArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link NewGrammarParser#init}.
	 * @param ctx the parse tree
	 */
	void enterInit(NewGrammarParser.InitContext ctx);
	/**
	 * Exit a parse tree produced by {@link NewGrammarParser#init}.
	 * @param ctx the parse tree
	 */
	void exitInit(NewGrammarParser.InitContext ctx);
	/**
	 * Enter a parse tree produced by {@link NewGrammarParser#nonTerminalName}.
	 * @param ctx the parse tree
	 */
	void enterNonTerminalName(NewGrammarParser.NonTerminalNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link NewGrammarParser#nonTerminalName}.
	 * @param ctx the parse tree
	 */
	void exitNonTerminalName(NewGrammarParser.NonTerminalNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link NewGrammarParser#terminalName}.
	 * @param ctx the parse tree
	 */
	void enterTerminalName(NewGrammarParser.TerminalNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link NewGrammarParser#terminalName}.
	 * @param ctx the parse tree
	 */
	void exitTerminalName(NewGrammarParser.TerminalNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link NewGrammarParser#terminalDescription}.
	 * @param ctx the parse tree
	 */
	void enterTerminalDescription(NewGrammarParser.TerminalDescriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NewGrammarParser#terminalDescription}.
	 * @param ctx the parse tree
	 */
	void exitTerminalDescription(NewGrammarParser.TerminalDescriptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NewGrammarParser#parseAlternatives}.
	 * @param ctx the parse tree
	 */
	void enterParseAlternatives(NewGrammarParser.ParseAlternativesContext ctx);
	/**
	 * Exit a parse tree produced by {@link NewGrammarParser#parseAlternatives}.
	 * @param ctx the parse tree
	 */
	void exitParseAlternatives(NewGrammarParser.ParseAlternativesContext ctx);
	/**
	 * Enter a parse tree produced by {@link NewGrammarParser#expressions}.
	 * @param ctx the parse tree
	 */
	void enterExpressions(NewGrammarParser.ExpressionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link NewGrammarParser#expressions}.
	 * @param ctx the parse tree
	 */
	void exitExpressions(NewGrammarParser.ExpressionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link NewGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(NewGrammarParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NewGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(NewGrammarParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NewGrammarParser#argsNames}.
	 * @param ctx the parse tree
	 */
	void enterArgsNames(NewGrammarParser.ArgsNamesContext ctx);
	/**
	 * Exit a parse tree produced by {@link NewGrammarParser#argsNames}.
	 * @param ctx the parse tree
	 */
	void exitArgsNames(NewGrammarParser.ArgsNamesContext ctx);
	/**
	 * Enter a parse tree produced by {@link NewGrammarParser#argName}.
	 * @param ctx the parse tree
	 */
	void enterArgName(NewGrammarParser.ArgNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link NewGrammarParser#argName}.
	 * @param ctx the parse tree
	 */
	void exitArgName(NewGrammarParser.ArgNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link NewGrammarParser#readTerminal}.
	 * @param ctx the parse tree
	 */
	void enterReadTerminal(NewGrammarParser.ReadTerminalContext ctx);
	/**
	 * Exit a parse tree produced by {@link NewGrammarParser#readTerminal}.
	 * @param ctx the parse tree
	 */
	void exitReadTerminal(NewGrammarParser.ReadTerminalContext ctx);
}