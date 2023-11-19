// Generated from /workspaces/parquetql/parquetql/grammar/parquetql.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link parquetqlParser}.
 */
public interface parquetqlListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link parquetqlParser#pocket}.
	 * @param ctx the parse tree
	 */
	void enterPocket(parquetqlParser.PocketContext ctx);
	/**
	 * Exit a parse tree produced by {@link parquetqlParser#pocket}.
	 * @param ctx the parse tree
	 */
	void exitPocket(parquetqlParser.PocketContext ctx);
	/**
	 * Enter a parse tree produced by {@link parquetqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(parquetqlParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link parquetqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(parquetqlParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link parquetqlParser#create}.
	 * @param ctx the parse tree
	 */
	void enterCreate(parquetqlParser.CreateContext ctx);
	/**
	 * Exit a parse tree produced by {@link parquetqlParser#create}.
	 * @param ctx the parse tree
	 */
	void exitCreate(parquetqlParser.CreateContext ctx);
	/**
	 * Enter a parse tree produced by {@link parquetqlParser#insert}.
	 * @param ctx the parse tree
	 */
	void enterInsert(parquetqlParser.InsertContext ctx);
	/**
	 * Exit a parse tree produced by {@link parquetqlParser#insert}.
	 * @param ctx the parse tree
	 */
	void exitInsert(parquetqlParser.InsertContext ctx);
	/**
	 * Enter a parse tree produced by {@link parquetqlParser#delete}.
	 * @param ctx the parse tree
	 */
	void enterDelete(parquetqlParser.DeleteContext ctx);
	/**
	 * Exit a parse tree produced by {@link parquetqlParser#delete}.
	 * @param ctx the parse tree
	 */
	void exitDelete(parquetqlParser.DeleteContext ctx);
	/**
	 * Enter a parse tree produced by {@link parquetqlParser#select}.
	 * @param ctx the parse tree
	 */
	void enterSelect(parquetqlParser.SelectContext ctx);
	/**
	 * Exit a parse tree produced by {@link parquetqlParser#select}.
	 * @param ctx the parse tree
	 */
	void exitSelect(parquetqlParser.SelectContext ctx);
	/**
	 * Enter a parse tree produced by {@link parquetqlParser#columnNames}.
	 * @param ctx the parse tree
	 */
	void enterColumnNames(parquetqlParser.ColumnNamesContext ctx);
	/**
	 * Exit a parse tree produced by {@link parquetqlParser#columnNames}.
	 * @param ctx the parse tree
	 */
	void exitColumnNames(parquetqlParser.ColumnNamesContext ctx);
	/**
	 * Enter a parse tree produced by {@link parquetqlParser#values}.
	 * @param ctx the parse tree
	 */
	void enterValues(parquetqlParser.ValuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link parquetqlParser#values}.
	 * @param ctx the parse tree
	 */
	void exitValues(parquetqlParser.ValuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link parquetqlParser#constants}.
	 * @param ctx the parse tree
	 */
	void enterConstants(parquetqlParser.ConstantsContext ctx);
	/**
	 * Exit a parse tree produced by {@link parquetqlParser#constants}.
	 * @param ctx the parse tree
	 */
	void exitConstants(parquetqlParser.ConstantsContext ctx);
	/**
	 * Enter a parse tree produced by {@link parquetqlParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(parquetqlParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link parquetqlParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(parquetqlParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link parquetqlParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterBooleanExpression(parquetqlParser.BooleanExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link parquetqlParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitBooleanExpression(parquetqlParser.BooleanExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link parquetqlParser#compare}.
	 * @param ctx the parse tree
	 */
	void enterCompare(parquetqlParser.CompareContext ctx);
	/**
	 * Exit a parse tree produced by {@link parquetqlParser#compare}.
	 * @param ctx the parse tree
	 */
	void exitCompare(parquetqlParser.CompareContext ctx);
	/**
	 * Enter a parse tree produced by {@link parquetqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(parquetqlParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link parquetqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(parquetqlParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link parquetqlParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(parquetqlParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link parquetqlParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(parquetqlParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link parquetqlParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(parquetqlParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link parquetqlParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(parquetqlParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link parquetqlParser#fileIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterFileIdentifier(parquetqlParser.FileIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link parquetqlParser#fileIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitFileIdentifier(parquetqlParser.FileIdentifierContext ctx);
}