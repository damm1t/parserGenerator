// Generated from /home/damm1t/IdeaProjects/parser_generator/src/NewGrammar.g4 by ANTLR 4.7.2

import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link NewGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface NewGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link NewGrammarParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(NewGrammarParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link NewGrammarParser#parseRules}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParseRules(NewGrammarParser.ParseRulesContext ctx);
	/**
	 * Visit a parse tree produced by {@link NewGrammarParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(NewGrammarParser.ArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link NewGrammarParser#returnsBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnsBlock(NewGrammarParser.ReturnsBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link NewGrammarParser#readArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadArgument(NewGrammarParser.ReadArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link NewGrammarParser#init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInit(NewGrammarParser.InitContext ctx);
	/**
	 * Visit a parse tree produced by {@link NewGrammarParser#nonTerminalName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonTerminalName(NewGrammarParser.NonTerminalNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link NewGrammarParser#terminalName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerminalName(NewGrammarParser.TerminalNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link NewGrammarParser#terminalDescription}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerminalDescription(NewGrammarParser.TerminalDescriptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link NewGrammarParser#parseAlternatives}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParseAlternatives(NewGrammarParser.ParseAlternativesContext ctx);
	/**
	 * Visit a parse tree produced by {@link NewGrammarParser#expressions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressions(NewGrammarParser.ExpressionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link NewGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(NewGrammarParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link NewGrammarParser#argsNames}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgsNames(NewGrammarParser.ArgsNamesContext ctx);
	/**
	 * Visit a parse tree produced by {@link NewGrammarParser#argName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgName(NewGrammarParser.ArgNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link NewGrammarParser#readTerminal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadTerminal(NewGrammarParser.ReadTerminalContext ctx);
}