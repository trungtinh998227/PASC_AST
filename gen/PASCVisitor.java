// Generated from C:/Users/trung/Desktop/PASC_AST\PASC.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PASCParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PASCVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PASCParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(PASCParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link PASCParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(PASCParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PASCParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(PASCParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code while}
	 * labeled alternative in {@link PASCParser#loopStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(PASCParser.WhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code loop}
	 * labeled alternative in {@link PASCParser#loopStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop(PASCParser.LoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link PASCParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(PASCParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PASCParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(PASCParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PASCParser#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator(PASCParser.OperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PASCParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(PASCParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link PASCParser#constnumber}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstnumber(PASCParser.ConstnumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link PASCParser#constvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstvalue(PASCParser.ConstvalueContext ctx);
	/**
	 * Visit a parse tree produced by {@link PASCParser#paren}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParen(PASCParser.ParenContext ctx);
	/**
	 * Visit a parse tree produced by {@link PASCParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(PASCParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link PASCParser#declare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare(PASCParser.DeclareContext ctx);
	/**
	 * Visit a parse tree produced by {@link PASCParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(PASCParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by {@link PASCParser#char}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChar(PASCParser.CharContext ctx);
	/**
	 * Visit a parse tree produced by {@link PASCParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(PASCParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PASCParser#repeat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeat(PASCParser.RepeatContext ctx);
}