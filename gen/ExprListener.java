// Generated from C:/Users/trung/Desktop/PASC_ParseTree\Expr.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExprParser}.
 */
public interface ExprListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExprParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(ExprParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(ExprParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(ExprParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(ExprParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(ExprParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(ExprParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code while}
	 * labeled alternative in {@link ExprParser#loopStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhile(ExprParser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code while}
	 * labeled alternative in {@link ExprParser#loopStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhile(ExprParser.WhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code loop}
	 * labeled alternative in {@link ExprParser#loopStatement}.
	 * @param ctx the parse tree
	 */
	void enterLoop(ExprParser.LoopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code loop}
	 * labeled alternative in {@link ExprParser#loopStatement}.
	 * @param ctx the parse tree
	 */
	void exitLoop(ExprParser.LoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(ExprParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(ExprParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(ExprParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(ExprParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(ExprParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(ExprParser.OperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(ExprParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(ExprParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#constnumber}.
	 * @param ctx the parse tree
	 */
	void enterConstnumber(ExprParser.ConstnumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#constnumber}.
	 * @param ctx the parse tree
	 */
	void exitConstnumber(ExprParser.ConstnumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#constvalue}.
	 * @param ctx the parse tree
	 */
	void enterConstvalue(ExprParser.ConstvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#constvalue}.
	 * @param ctx the parse tree
	 */
	void exitConstvalue(ExprParser.ConstvalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#paren}.
	 * @param ctx the parse tree
	 */
	void enterParen(ExprParser.ParenContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#paren}.
	 * @param ctx the parse tree
	 */
	void exitParen(ExprParser.ParenContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(ExprParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(ExprParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#declare}.
	 * @param ctx the parse tree
	 */
	void enterDeclare(ExprParser.DeclareContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#declare}.
	 * @param ctx the parse tree
	 */
	void exitDeclare(ExprParser.DeclareContext ctx);
}