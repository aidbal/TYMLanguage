package org.pkt.typing

import com.google.inject.Inject
import org.eclipse.xtext.util.IResourceScopeCache
import org.pkt.tym.Expression
import org.pkt.tym.StringConstant
import org.pkt.tym.IntConstant
import org.pkt.tym.BoolConstant
import org.pkt.tym.Not
import org.pkt.tym.MulOrDiv
import org.pkt.tym.Minus
import org.pkt.tym.Comparison 
import org.pkt.tym.Equality
import org.pkt.tym.And
import org.pkt.tym.Or
import org.pkt.tym.Plus
import org.pkt.tym.VariableRef
import org.pkt.tym.FunctionCall
import org.pkt.TymModelUtil

class TymTypeComputer {
	public static val STRING_TYPE = new StringType
	public static val INT_TYPE = new IntType
	public static val BOOL_TYPE = new BoolType
	public static val REF_TYPE = new RefType

	@Inject extension TymModelUtil

	@Inject IResourceScopeCache cache

	def isStringType(TymType type) {
		type === STRING_TYPE
	}

	def isIntType(TymType type) {
		type === INT_TYPE
	}

	def isBoolType(TymType type) {
		type === BOOL_TYPE
	}

	def dispatch TymType typeFor(Expression e) {
		switch (e) {
			StringConstant: STRING_TYPE
			IntConstant: INT_TYPE
			BoolConstant: BOOL_TYPE
			Not: BOOL_TYPE
			MulOrDiv: INT_TYPE
			Minus: INT_TYPE
			Comparison: BOOL_TYPE
			Equality: BOOL_TYPE
			And: BOOL_TYPE
			Or: BOOL_TYPE
		} 
	}
	
	def dispatch TymType typeForFunctionCall(FunctionCall e) {
		switch (e.funcname.getReturn()) {
			case "number": INT_TYPE
			case "Bool": BOOL_TYPE
			case "word": STRING_TYPE
		} 
	}	
	
	def dispatch TymType typeForEcho(Expression e) {
		switch (e) {
			StringConstant: STRING_TYPE
			IntConstant: INT_TYPE
			BoolConstant: BOOL_TYPE
			Not: BOOL_TYPE
			MulOrDiv: INT_TYPE
			Minus: INT_TYPE
			Comparison: BOOL_TYPE
			Equality: BOOL_TYPE
			And: BOOL_TYPE
			Or: BOOL_TYPE
			VariableRef: REF_TYPE
		}
	}	

	def dispatch TymType typeFor(Plus e) {
		val leftType = e.left.typeFor
		val rightType = e.right?.typeFor
		if (leftType.isStringType || rightType.isStringType)
			STRING_TYPE
		else
			INT_TYPE
	}

	def dispatch TymType typeFor(VariableRef varRef) {
		val variable = varRef.variable

		if(variable.expression instanceof Expression) {
		    val varExp = variable.expression as Expression;
		    return cache.get("type" -> variable, variable.eResource) [
				varExp.typeFor
			]
		}else{
			val varExp = variable.expression as FunctionCall;
		    return cache.get("type" -> variable, variable.eResource) [
				varExp.typeForFunctionCall
			]
		}
		
		// use a pair as the key, not to conflict with the
		// use of cache we make in ExpressionsModelUtil

		 
	}
}
