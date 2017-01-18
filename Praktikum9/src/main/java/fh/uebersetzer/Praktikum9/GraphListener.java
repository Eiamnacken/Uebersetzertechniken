package fh.uebersetzer.Praktikum9;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multimap;
import com.google.common.collect.Multiset;
import com.google.common.collect.SetMultimap;
import com.google.common.reflect.MutableTypeToInstanceMap;

import fh.uebersetzer.Praktikum9.Antlr.CymbolBaseListener;
import fh.uebersetzer.Praktikum9.Antlr.CymbolParser;
import fh.uebersetzer.Praktikum9.Antlr.CymbolParser.AddSubContext;
import fh.uebersetzer.Praktikum9.Antlr.CymbolParser.BiggerContext;
import fh.uebersetzer.Praktikum9.Antlr.CymbolParser.BlockContext;
import fh.uebersetzer.Praktikum9.Antlr.CymbolParser.BoolContext;
import fh.uebersetzer.Praktikum9.Antlr.CymbolParser.C_elseContext;
import fh.uebersetzer.Praktikum9.Antlr.CymbolParser.C_forContext;
import fh.uebersetzer.Praktikum9.Antlr.CymbolParser.C_ifContext;
import fh.uebersetzer.Praktikum9.Antlr.CymbolParser.CallContext;
import fh.uebersetzer.Praktikum9.Antlr.CymbolParser.EqualContext;
import fh.uebersetzer.Praktikum9.Antlr.CymbolParser.EqualNotContext;
import fh.uebersetzer.Praktikum9.Antlr.CymbolParser.ExprListContext;
import fh.uebersetzer.Praktikum9.Antlr.CymbolParser.FileContext;
import fh.uebersetzer.Praktikum9.Antlr.CymbolParser.FormalParameterContext;
import fh.uebersetzer.Praktikum9.Antlr.CymbolParser.FormalParametersContext;
import fh.uebersetzer.Praktikum9.Antlr.CymbolParser.FunctionDeclContext;
import fh.uebersetzer.Praktikum9.Antlr.CymbolParser.IndexContext;
import fh.uebersetzer.Praktikum9.Antlr.CymbolParser.IntContext;
import fh.uebersetzer.Praktikum9.Antlr.CymbolParser.MultContext;
import fh.uebersetzer.Praktikum9.Antlr.CymbolParser.NegateContext;
import fh.uebersetzer.Praktikum9.Antlr.CymbolParser.NotContext;
import fh.uebersetzer.Praktikum9.Antlr.CymbolParser.ParensContext;
import fh.uebersetzer.Praktikum9.Antlr.CymbolParser.SmallerContext;
import fh.uebersetzer.Praktikum9.Antlr.CymbolParser.SmallerEqualContext;
import fh.uebersetzer.Praktikum9.Antlr.CymbolParser.StatContext;
import fh.uebersetzer.Praktikum9.Antlr.CymbolParser.TypeContext;
import fh.uebersetzer.Praktikum9.Antlr.CymbolParser.VarContext;
import fh.uebersetzer.Praktikum9.Antlr.CymbolParser.VarDeclContext;

public class GraphListener extends CymbolBaseListener{
	
	int counter =0;
	Graph graph = new Graph();
	Stack<Node> ndoes = new Stack<>();
	Map<Integer, Integer> nodeMap= new HashMap<>();
	
	private void addNode(String node){
		graph.nodes.add(node);
	}
	
	
	private int getCounter(int node) {
		if(!nodeMap.containsKey(node)){
			nodeMap.put(node, 0);
			return 0;
		}
		return nodeMap.get(node);
	}
	
	private void incrCounter(int node) {
		nodeMap.put(node, (nodeMap.get(node)+1));
	}

	/* (non-Javadoc)
	 * @see fh.uebersetzer.Praktikum9.Antlr.CymbolBaseListener#enterC_else(fh.uebersetzer.Praktikum9.Antlr.CymbolParser.C_elseContext)
	 */
	@Override
	public void enterC_else(C_elseContext ctx) {
		Node node = new Node("else")
	}

	/* (non-Javadoc)
	 * @see fh.uebersetzer.Praktikum9.Antlr.CymbolBaseListener#exitC_else(fh.uebersetzer.Praktikum9.Antlr.CymbolParser.C_elseContext)
	 */
	@Override
	public void exitC_else(C_elseContext ctx) {
		
	}

	/* (non-Javadoc)
	 * @see fh.uebersetzer.Praktikum9.Antlr.CymbolBaseListener#enterFile(fh.uebersetzer.Praktikum9.Antlr.CymbolParser.FileContext)
	 */
	@Override
	public void enterFile(FileContext ctx) {
		// TODO Auto-generated method stub
		super.enterFile(ctx);
	}

	/* (non-Javadoc)
	 * @see fh.uebersetzer.Praktikum9.Antlr.CymbolBaseListener#exitFile(fh.uebersetzer.Praktikum9.Antlr.CymbolParser.FileContext)
	 */
	@Override
	public void exitFile(FileContext ctx) {
		// TODO Auto-generated method stub
		super.exitFile(ctx);
	}

	/* (non-Javadoc)
	 * @see fh.uebersetzer.Praktikum9.Antlr.CymbolBaseListener#enterVarDecl(fh.uebersetzer.Praktikum9.Antlr.CymbolParser.VarDeclContext)
	 */
	@Override
	public void enterVarDecl(VarDeclContext ctx) {
		
	}

	/* (non-Javadoc)
	 * @see fh.uebersetzer.Praktikum9.Antlr.CymbolBaseListener#exitVarDecl(fh.uebersetzer.Praktikum9.Antlr.CymbolParser.VarDeclContext)
	 */
	@Override
	public void exitVarDecl(VarDeclContext ctx) {
		// TODO Auto-generated method stub
		super.exitVarDecl(ctx);
	}

	/* (non-Javadoc)
	 * @see fh.uebersetzer.Praktikum9.Antlr.CymbolBaseListener#enterType(fh.uebersetzer.Praktikum9.Antlr.CymbolParser.TypeContext)
	 */
	@Override
	public void enterType(TypeContext ctx) {
		// TODO Auto-generated method stub
		super.enterType(ctx);
	}

	/* (non-Javadoc)
	 * @see fh.uebersetzer.Praktikum9.Antlr.CymbolBaseListener#exitType(fh.uebersetzer.Praktikum9.Antlr.CymbolParser.TypeContext)
	 */
	@Override
	public void exitType(TypeContext ctx) {
		// TODO Auto-generated method stub
		super.exitType(ctx);
	}

	/* (non-Javadoc)
	 * @see fh.uebersetzer.Praktikum9.Antlr.CymbolBaseListener#enterFunctionDecl(fh.uebersetzer.Praktikum9.Antlr.CymbolParser.FunctionDeclContext)
	 */
	@Override
	public void enterFunctionDecl(FunctionDeclContext ctx) {
		// TODO Auto-generated method stub
		super.enterFunctionDecl(ctx);
	}

	/* (non-Javadoc)
	 * @see fh.uebersetzer.Praktikum9.Antlr.CymbolBaseListener#exitFunctionDecl(fh.uebersetzer.Praktikum9.Antlr.CymbolParser.FunctionDeclContext)
	 */
	@Override
	public void exitFunctionDecl(FunctionDeclContext ctx) {
		// TODO Auto-generated method stub
		super.exitFunctionDecl(ctx);
	}

	/* (non-Javadoc)
	 * @see fh.uebersetzer.Praktikum9.Antlr.CymbolBaseListener#enterFormalParameters(fh.uebersetzer.Praktikum9.Antlr.CymbolParser.FormalParametersContext)
	 */
	@Override
	public void enterFormalParameters(FormalParametersContext ctx) {
		// TODO Auto-generated method stub
		super.enterFormalParameters(ctx);
	}

	/* (non-Javadoc)
	 * @see fh.uebersetzer.Praktikum9.Antlr.CymbolBaseListener#exitFormalParameters(fh.uebersetzer.Praktikum9.Antlr.CymbolParser.FormalParametersContext)
	 */
	@Override
	public void exitFormalParameters(FormalParametersContext ctx) {
		// TODO Auto-generated method stub
		super.exitFormalParameters(ctx);
	}

	/* (non-Javadoc)
	 * @see fh.uebersetzer.Praktikum9.Antlr.CymbolBaseListener#enterFormalParameter(fh.uebersetzer.Praktikum9.Antlr.CymbolParser.FormalParameterContext)
	 */
	@Override
	public void enterFormalParameter(FormalParameterContext ctx) {
		// TODO Auto-generated method stub
		super.enterFormalParameter(ctx);
	}

	/* (non-Javadoc)
	 * @see fh.uebersetzer.Praktikum9.Antlr.CymbolBaseListener#exitFormalParameter(fh.uebersetzer.Praktikum9.Antlr.CymbolParser.FormalParameterContext)
	 */
	@Override
	public void exitFormalParameter(FormalParameterContext ctx) {
		// TODO Auto-generated method stub
		super.exitFormalParameter(ctx);
	}

	/* (non-Javadoc)
	 * @see fh.uebersetzer.Praktikum9.Antlr.CymbolBaseListener#enterC_for(fh.uebersetzer.Praktikum9.Antlr.CymbolParser.C_forContext)
	 */
	@Override
	public void enterC_for(C_forContext ctx) {
		// TODO Auto-generated method stub
		super.enterC_for(ctx);
	}

	/* (non-Javadoc)
	 * @see fh.uebersetzer.Praktikum9.Antlr.CymbolBaseListener#exitC_for(fh.uebersetzer.Praktikum9.Antlr.CymbolParser.C_forContext)
	 */
	@Override
	public void exitC_for(C_forContext ctx) {
		// TODO Auto-generated method stub
		super.exitC_for(ctx);
	}

	/* (non-Javadoc)
	 * @see fh.uebersetzer.Praktikum9.Antlr.CymbolBaseListener#enterC_if(fh.uebersetzer.Praktikum9.Antlr.CymbolParser.C_ifContext)
	 */
	@Override
	public void enterC_if(C_ifContext ctx) {
		// TODO Auto-generated method stub
		super.enterC_if(ctx);
	}

	/* (non-Javadoc)
	 * @see fh.uebersetzer.Praktikum9.Antlr.CymbolBaseListener#exitC_if(fh.uebersetzer.Praktikum9.Antlr.CymbolParser.C_ifContext)
	 */
	@Override
	public void exitC_if(C_ifContext ctx) {
		// TODO Auto-generated method stub
		super.exitC_if(ctx);
	}

	/* (non-Javadoc)
	 * @see fh.uebersetzer.Praktikum9.Antlr.CymbolBaseListener#enterBlock(fh.uebersetzer.Praktikum9.Antlr.CymbolParser.BlockContext)
	 */
	@Override
	public void enterBlock(BlockContext ctx) {
		// TODO Auto-generated method stub
		super.enterBlock(ctx);
	}

	/* (non-Javadoc)
	 * @see fh.uebersetzer.Praktikum9.Antlr.CymbolBaseListener#exitBlock(fh.uebersetzer.Praktikum9.Antlr.CymbolParser.BlockContext)
	 */
	@Override
	public void exitBlock(BlockContext ctx) {
		// TODO Auto-generated method stub
		super.exitBlock(ctx);
	}

	/* (non-Javadoc)
	 * @see fh.uebersetzer.Praktikum9.Antlr.CymbolBaseListener#enterStat(fh.uebersetzer.Praktikum9.Antlr.CymbolParser.StatContext)
	 */
	@Override
	public void enterStat(StatContext ctx) {
		// TODO Auto-generated method stub
		super.enterStat(ctx);
	}

	/* (non-Javadoc)
	 * @see fh.uebersetzer.Praktikum9.Antlr.CymbolBaseListener#exitStat(fh.uebersetzer.Praktikum9.Antlr.CymbolParser.StatContext)
	 */
	@Override
	public void exitStat(StatContext ctx) {
		// TODO Auto-generated method stub
		super.exitStat(ctx);
	}

	/* (non-Javadoc)
	 * @see fh.uebersetzer.Praktikum9.Antlr.CymbolBaseListener#enterCall(fh.uebersetzer.Praktikum9.Antlr.CymbolParser.CallContext)
	 */
	@Override
	public void enterCall(CallContext ctx) {
		// TODO Auto-generated method stub
		super.enterCall(ctx);
	}

	/* (non-Javadoc)
	 * @see fh.uebersetzer.Praktikum9.Antlr.CymbolBaseListener#exitCall(fh.uebersetzer.Praktikum9.Antlr.CymbolParser.CallContext)
	 */
	@Override
	public void exitCall(CallContext ctx) {
		// TODO Auto-generated method stub
		super.exitCall(ctx);
	}

	/* (non-Javadoc)
	 * @see fh.uebersetzer.Praktikum9.Antlr.CymbolBaseListener#enterBigger(fh.uebersetzer.Praktikum9.Antlr.CymbolParser.BiggerContext)
	 */
	@Override
	public void enterBigger(BiggerContext ctx) {
		// TODO Auto-generated method stub
		super.enterBigger(ctx);
	}

	/* (non-Javadoc)
	 * @see fh.uebersetzer.Praktikum9.Antlr.CymbolBaseListener#exitBigger(fh.uebersetzer.Praktikum9.Antlr.CymbolParser.BiggerContext)
	 */
	@Override
	public void exitBigger(BiggerContext ctx) {
		// TODO Auto-generated method stub
		super.exitBigger(ctx);
	}

	/* (non-Javadoc)
	 * @see fh.uebersetzer.Praktikum9.Antlr.CymbolBaseListener#enterAddSub(fh.uebersetzer.Praktikum9.Antlr.CymbolParser.AddSubContext)
	 */
	@Override
	public void enterAddSub(AddSubContext ctx) {
		// TODO Auto-generated method stub
		super.enterAddSub(ctx);
	}

	/* (non-Javadoc)
	 * @see fh.uebersetzer.Praktikum9.Antlr.CymbolBaseListener#exitAddSub(fh.uebersetzer.Praktikum9.Antlr.CymbolParser.AddSubContext)
	 */
	@Override
	public void exitAddSub(AddSubContext ctx) {
		// TODO Auto-generated method stub
		super.exitAddSub(ctx);
	}

	/* (non-Javadoc)
	 * @see fh.uebersetzer.Praktikum9.Antlr.CymbolBaseListener#enterVar(fh.uebersetzer.Praktikum9.Antlr.CymbolParser.VarContext)
	 */
	@Override
	public void enterVar(VarContext ctx) {
		// TODO Auto-generated method stub
		super.enterVar(ctx);
	}

	/* (non-Javadoc)
	 * @see fh.uebersetzer.Praktikum9.Antlr.CymbolBaseListener#exitVar(fh.uebersetzer.Praktikum9.Antlr.CymbolParser.VarContext)
	 */
	@Override
	public void exitVar(VarContext ctx) {
		// TODO Auto-generated method stub
		super.exitVar(ctx);
	}

	/* (non-Javadoc)
	 * @see fh.uebersetzer.Praktikum9.Antlr.CymbolBaseListener#enterParens(fh.uebersetzer.Praktikum9.Antlr.CymbolParser.ParensContext)
	 */
	@Override
	public void enterParens(ParensContext ctx) {
		// TODO Auto-generated method stub
		super.enterParens(ctx);
	}

	/* (non-Javadoc)
	 * @see fh.uebersetzer.Praktikum9.Antlr.CymbolBaseListener#exitParens(fh.uebersetzer.Praktikum9.Antlr.CymbolParser.ParensContext)
	 */
	@Override
	public void exitParens(ParensContext ctx) {
		// TODO Auto-generated method stub
		super.exitParens(ctx);
	}

	/* (non-Javadoc)
	 * @see fh.uebersetzer.Praktikum9.Antlr.CymbolBaseListener#enterSmallerEqual(fh.uebersetzer.Praktikum9.Antlr.CymbolParser.SmallerEqualContext)
	 */
	@Override
	public void enterSmallerEqual(SmallerEqualContext ctx) {
		// TODO Auto-generated method stub
		super.enterSmallerEqual(ctx);
	}

	/* (non-Javadoc)
	 * @see fh.uebersetzer.Praktikum9.Antlr.CymbolBaseListener#exitSmallerEqual(fh.uebersetzer.Praktikum9.Antlr.CymbolParser.SmallerEqualContext)
	 */
	@Override
	public void exitSmallerEqual(SmallerEqualContext ctx) {
		// TODO Auto-generated method stub
		super.exitSmallerEqual(ctx);
	}

	/* (non-Javadoc)
	 * @see fh.uebersetzer.Praktikum9.Antlr.CymbolBaseListener#enterIndex(fh.uebersetzer.Praktikum9.Antlr.CymbolParser.IndexContext)
	 */
	@Override
	public void enterIndex(IndexContext ctx) {
		// TODO Auto-generated method stub
		super.enterIndex(ctx);
	}

	/* (non-Javadoc)
	 * @see fh.uebersetzer.Praktikum9.Antlr.CymbolBaseListener#exitIndex(fh.uebersetzer.Praktikum9.Antlr.CymbolParser.IndexContext)
	 */
	@Override
	public void exitIndex(IndexContext ctx) {
		// TODO Auto-generated method stub
		super.exitIndex(ctx);
	}

	/* (non-Javadoc)
	 * @see fh.uebersetzer.Praktikum9.Antlr.CymbolBaseListener#enterInt(fh.uebersetzer.Praktikum9.Antlr.CymbolParser.IntContext)
	 */
	@Override
	public void enterInt(IntContext ctx) {
		// TODO Auto-generated method stub
		super.enterInt(ctx);
	}

	/* (non-Javadoc)
	 * @see fh.uebersetzer.Praktikum9.Antlr.CymbolBaseListener#exitInt(fh.uebersetzer.Praktikum9.Antlr.CymbolParser.IntContext)
	 */
	@Override
	public void exitInt(IntContext ctx) {
		// TODO Auto-generated method stub
		super.exitInt(ctx);
	}

	/* (non-Javadoc)
	 * @see fh.uebersetzer.Praktikum9.Antlr.CymbolBaseListener#enterNot(fh.uebersetzer.Praktikum9.Antlr.CymbolParser.NotContext)
	 */
	@Override
	public void enterNot(NotContext ctx) {
		// TODO Auto-generated method stub
		super.enterNot(ctx);
	}

	/* (non-Javadoc)
	 * @see fh.uebersetzer.Praktikum9.Antlr.CymbolBaseListener#exitNot(fh.uebersetzer.Praktikum9.Antlr.CymbolParser.NotContext)
	 */
	@Override
	public void exitNot(NotContext ctx) {
		// TODO Auto-generated method stub
		super.exitNot(ctx);
	}

	/* (non-Javadoc)
	 * @see fh.uebersetzer.Praktikum9.Antlr.CymbolBaseListener#enterMult(fh.uebersetzer.Praktikum9.Antlr.CymbolParser.MultContext)
	 */
	@Override
	public void enterMult(MultContext ctx) {
		// TODO Auto-generated method stub
		super.enterMult(ctx);
	}

	/* (non-Javadoc)
	 * @see fh.uebersetzer.Praktikum9.Antlr.CymbolBaseListener#exitMult(fh.uebersetzer.Praktikum9.Antlr.CymbolParser.MultContext)
	 */
	@Override
	public void exitMult(MultContext ctx) {
		// TODO Auto-generated method stub
		super.exitMult(ctx);
	}

	/* (non-Javadoc)
	 * @see fh.uebersetzer.Praktikum9.Antlr.CymbolBaseListener#enterEqual(fh.uebersetzer.Praktikum9.Antlr.CymbolParser.EqualContext)
	 */
	@Override
	public void enterEqual(EqualContext ctx) {
		// TODO Auto-generated method stub
		super.enterEqual(ctx);
	}

	/* (non-Javadoc)
	 * @see fh.uebersetzer.Praktikum9.Antlr.CymbolBaseListener#exitEqual(fh.uebersetzer.Praktikum9.Antlr.CymbolParser.EqualContext)
	 */
	@Override
	public void exitEqual(EqualContext ctx) {
		// TODO Auto-generated method stub
		super.exitEqual(ctx);
	}

	/* (non-Javadoc)
	 * @see fh.uebersetzer.Praktikum9.Antlr.CymbolBaseListener#enterNegate(fh.uebersetzer.Praktikum9.Antlr.CymbolParser.NegateContext)
	 */
	@Override
	public void enterNegate(NegateContext ctx) {
		// TODO Auto-generated method stub
		super.enterNegate(ctx);
	}

	/* (non-Javadoc)
	 * @see fh.uebersetzer.Praktikum9.Antlr.CymbolBaseListener#exitNegate(fh.uebersetzer.Praktikum9.Antlr.CymbolParser.NegateContext)
	 */
	@Override
	public void exitNegate(NegateContext ctx) {
		// TODO Auto-generated method stub
		super.exitNegate(ctx);
	}

	/* (non-Javadoc)
	 * @see fh.uebersetzer.Praktikum9.Antlr.CymbolBaseListener#enterSmaller(fh.uebersetzer.Praktikum9.Antlr.CymbolParser.SmallerContext)
	 */
	@Override
	public void enterSmaller(SmallerContext ctx) {
		// TODO Auto-generated method stub
		super.enterSmaller(ctx);
	}

	/* (non-Javadoc)
	 * @see fh.uebersetzer.Praktikum9.Antlr.CymbolBaseListener#exitSmaller(fh.uebersetzer.Praktikum9.Antlr.CymbolParser.SmallerContext)
	 */
	@Override
	public void exitSmaller(SmallerContext ctx) {
		// TODO Auto-generated method stub
		super.exitSmaller(ctx);
	}

	/* (non-Javadoc)
	 * @see fh.uebersetzer.Praktikum9.Antlr.CymbolBaseListener#enterEqualNot(fh.uebersetzer.Praktikum9.Antlr.CymbolParser.EqualNotContext)
	 */
	@Override
	public void enterEqualNot(EqualNotContext ctx) {
		// TODO Auto-generated method stub
		super.enterEqualNot(ctx);
	}

	/* (non-Javadoc)
	 * @see fh.uebersetzer.Praktikum9.Antlr.CymbolBaseListener#exitEqualNot(fh.uebersetzer.Praktikum9.Antlr.CymbolParser.EqualNotContext)
	 */
	@Override
	public void exitEqualNot(EqualNotContext ctx) {
		// TODO Auto-generated method stub
		super.exitEqualNot(ctx);
	}

	/* (non-Javadoc)
	 * @see fh.uebersetzer.Praktikum9.Antlr.CymbolBaseListener#enterBool(fh.uebersetzer.Praktikum9.Antlr.CymbolParser.BoolContext)
	 */
	@Override
	public void enterBool(BoolContext ctx) {
		// TODO Auto-generated method stub
		super.enterBool(ctx);
	}

	/* (non-Javadoc)
	 * @see fh.uebersetzer.Praktikum9.Antlr.CymbolBaseListener#exitBool(fh.uebersetzer.Praktikum9.Antlr.CymbolParser.BoolContext)
	 */
	@Override
	public void exitBool(BoolContext ctx) {
		// TODO Auto-generated method stub
		super.exitBool(ctx);
	}

	/* (non-Javadoc)
	 * @see fh.uebersetzer.Praktikum9.Antlr.CymbolBaseListener#enterExprList(fh.uebersetzer.Praktikum9.Antlr.CymbolParser.ExprListContext)
	 */
	@Override
	public void enterExprList(ExprListContext ctx) {
		// TODO Auto-generated method stub
		super.enterExprList(ctx);
	}

	/* (non-Javadoc)
	 * @see fh.uebersetzer.Praktikum9.Antlr.CymbolBaseListener#exitExprList(fh.uebersetzer.Praktikum9.Antlr.CymbolParser.ExprListContext)
	 */
	@Override
	public void exitExprList(ExprListContext ctx) {
		// TODO Auto-generated method stub
		super.exitExprList(ctx);
	}

	/* (non-Javadoc)
	 * @see fh.uebersetzer.Praktikum9.Antlr.CymbolBaseListener#enterEveryRule(org.antlr.v4.runtime.ParserRuleContext)
	 */
	@Override
	public void enterEveryRule(ParserRuleContext ctx) {
		// TODO Auto-generated method stub
		super.enterEveryRule(ctx);
	}

	/* (non-Javadoc)
	 * @see fh.uebersetzer.Praktikum9.Antlr.CymbolBaseListener#exitEveryRule(org.antlr.v4.runtime.ParserRuleContext)
	 */
	@Override
	public void exitEveryRule(ParserRuleContext ctx) {
		// TODO Auto-generated method stub
		super.exitEveryRule(ctx);
	}

	/* (non-Javadoc)
	 * @see fh.uebersetzer.Praktikum9.Antlr.CymbolBaseListener#visitTerminal(org.antlr.v4.runtime.tree.TerminalNode)
	 */
	@Override
	public void visitTerminal(TerminalNode node) {
		// TODO Auto-generated method stub
		super.visitTerminal(node);
	}

	/* (non-Javadoc)
	 * @see fh.uebersetzer.Praktikum9.Antlr.CymbolBaseListener#visitErrorNode(org.antlr.v4.runtime.tree.ErrorNode)
	 */
	@Override
	public void visitErrorNode(ErrorNode node) {
		// TODO Auto-generated method stub
		super.visitErrorNode(node);
	}
	
	

}
