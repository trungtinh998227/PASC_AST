// Generated from C:/Users/trung/Desktop/PASC_AST\PASC.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PASCParser}.
 */
public interface PASCListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PASCParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(PASCParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link PASCParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(PASCParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link PASCParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(PASCParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PASCParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(PASCParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PASCParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(PASCParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PASCParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(PASCParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code while}
	 * labeled alternative in {@link PASCParser#loopStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhile(PASCParser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code while}
	 * labeled alternative in {@link PASCParser#loopStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhile(PASCParser.WhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code loop}
	 * labeled alternative in {@link PASCParser#loopStatement}.
	 * @param ctx the parse tree
	 */
	void enterLoop(PASCParser.LoopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code loop}
	 * labeled alternative in {@link PASCParser#loopStatement}.
	 * @param ctx the parse tree
	 */
	void exitLoop(PASCParser.LoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link PASCParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(PASCParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PASCParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(PASCParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PASCParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(PASCParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PASCParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(PASCParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PASCParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(PASCParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PASCParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(PASCParser.OperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PASCParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(PASCParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link PASCParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(PASCParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link PASCParser#constnumber}.
	 * @param ctx the parse tree
	 */
	void enterConstnumber(PASCParser.ConstnumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link PASCParser#constnumber}.
	 * @param ctx the parse tree
	 */
	void exitConstnumber(PASCParser.ConstnumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link PASCParser#constvalue}.
	 * @param ctx the parse tree
	 */
	void enterConstvalue(PASCParser.ConstvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PASCParser#constvalue}.
	 * @param ctx the parse tree
	 */
	void exitConstvalue(PASCParser.ConstvalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link PASCParser#paren}.
	 * @param ctx the parse tree
	 */
	void enterParen(PASCParser.ParenContext ctx);
	/**
	 * Exit a parse tree produced by {@link PASCParser#paren}.
	 * @param ctx the parse tree
	 */
	void exitParen(PASCParser.ParenContext ctx);
	/**
	 * Enter a parse tree produced by {@link PASCParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(PASCParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PASCParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(PASCParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link PASCParser#declare}.
	 * @param ctx the parse tree
	 */
	void enterDeclare(PASCParser.DeclareContext ctx);
	/**
	 * Exit a parse tree produced by {@link PASCParser#declare}.
	 * @param ctx the parse tree
	 */
	void exitDeclare(PASCParser.DeclareContext ctx);
	/**
	 * Enter a parse tree produced by {@link PASCParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(PASCParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link PASCParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(PASCParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link PASCParser#char}.
	 * @param ctx the parse tree
	 */
	void enterChar(PASCParser.CharContext ctx);
	/**
	 * Exit a parse tree produced by {@link PASCParser#char}.
	 * @param ctx the parse tree
	 */
	void exitChar(PASCParser.CharContext ctx);
	/**
	 * Enter a parse tree produced by {@link PASCParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(PASCParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PASCParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(PASCParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PASCParser#repeat}.
	 * @param ctx the parse tree
	 */
	void enterRepeat(PASCParser.RepeatContext ctx);
	/**
	 * Exit a parse tree produced by {@link PASCParser#repeat}.
	 * @param ctx the parse tree
	 */
	void exitRepeat(PASCParser.RepeatContext ctx);
}