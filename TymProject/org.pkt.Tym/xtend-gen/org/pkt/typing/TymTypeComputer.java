package org.pkt.typing;

import com.google.inject.Inject;
import com.google.inject.Provider;
import java.util.Arrays;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.util.IResourceScopeCache;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Pair;
import org.pkt.TymModelUtil;
import org.pkt.tym.And;
import org.pkt.tym.BoolConstant;
import org.pkt.tym.Comparison;
import org.pkt.tym.Equality;
import org.pkt.tym.Expression;
import org.pkt.tym.FunctionCall;
import org.pkt.tym.IntConstant;
import org.pkt.tym.Minus;
import org.pkt.tym.MulOrDiv;
import org.pkt.tym.Not;
import org.pkt.tym.Or;
import org.pkt.tym.Plus;
import org.pkt.tym.StringConstant;
import org.pkt.tym.Variable;
import org.pkt.tym.VariableRef;
import org.pkt.typing.BoolType;
import org.pkt.typing.IntType;
import org.pkt.typing.RefType;
import org.pkt.typing.StringType;
import org.pkt.typing.TymType;

@SuppressWarnings("all")
public class TymTypeComputer {
  public final static StringType STRING_TYPE = new StringType();
  
  public final static IntType INT_TYPE = new IntType();
  
  public final static BoolType BOOL_TYPE = new BoolType();
  
  public final static RefType REF_TYPE = new RefType();
  
  @Inject
  @Extension
  private TymModelUtil _tymModelUtil;
  
  @Inject
  private IResourceScopeCache cache;
  
  public boolean isStringType(final TymType type) {
    return (type == TymTypeComputer.STRING_TYPE);
  }
  
  public boolean isIntType(final TymType type) {
    return (type == TymTypeComputer.INT_TYPE);
  }
  
  public boolean isBoolType(final TymType type) {
    return (type == TymTypeComputer.BOOL_TYPE);
  }
  
  protected TymType _typeFor(final Expression e) {
    TymType _switchResult = null;
    boolean _matched = false;
    if (e instanceof StringConstant) {
      _matched=true;
      _switchResult = TymTypeComputer.STRING_TYPE;
    }
    if (!_matched) {
      if (e instanceof IntConstant) {
        _matched=true;
        _switchResult = TymTypeComputer.INT_TYPE;
      }
    }
    if (!_matched) {
      if (e instanceof BoolConstant) {
        _matched=true;
        _switchResult = TymTypeComputer.BOOL_TYPE;
      }
    }
    if (!_matched) {
      if (e instanceof Not) {
        _matched=true;
        _switchResult = TymTypeComputer.BOOL_TYPE;
      }
    }
    if (!_matched) {
      if (e instanceof MulOrDiv) {
        _matched=true;
        _switchResult = TymTypeComputer.INT_TYPE;
      }
    }
    if (!_matched) {
      if (e instanceof Minus) {
        _matched=true;
        _switchResult = TymTypeComputer.INT_TYPE;
      }
    }
    if (!_matched) {
      if (e instanceof Comparison) {
        _matched=true;
        _switchResult = TymTypeComputer.BOOL_TYPE;
      }
    }
    if (!_matched) {
      if (e instanceof Equality) {
        _matched=true;
        _switchResult = TymTypeComputer.BOOL_TYPE;
      }
    }
    if (!_matched) {
      if (e instanceof And) {
        _matched=true;
        _switchResult = TymTypeComputer.BOOL_TYPE;
      }
    }
    if (!_matched) {
      if (e instanceof Or) {
        _matched=true;
        _switchResult = TymTypeComputer.BOOL_TYPE;
      }
    }
    return _switchResult;
  }
  
  protected TymType _typeForFunctionCall(final FunctionCall e) {
    TymType _switchResult = null;
    String _return = e.getFuncname().getReturn();
    if (_return != null) {
      switch (_return) {
        case "number":
          _switchResult = TymTypeComputer.INT_TYPE;
          break;
        case "Bool":
          _switchResult = TymTypeComputer.BOOL_TYPE;
          break;
        case "word":
          _switchResult = TymTypeComputer.STRING_TYPE;
          break;
      }
    }
    return _switchResult;
  }
  
  protected TymType _typeForEcho(final Expression e) {
    TymType _switchResult = null;
    boolean _matched = false;
    if (e instanceof StringConstant) {
      _matched=true;
      _switchResult = TymTypeComputer.STRING_TYPE;
    }
    if (!_matched) {
      if (e instanceof IntConstant) {
        _matched=true;
        _switchResult = TymTypeComputer.INT_TYPE;
      }
    }
    if (!_matched) {
      if (e instanceof BoolConstant) {
        _matched=true;
        _switchResult = TymTypeComputer.BOOL_TYPE;
      }
    }
    if (!_matched) {
      if (e instanceof Not) {
        _matched=true;
        _switchResult = TymTypeComputer.BOOL_TYPE;
      }
    }
    if (!_matched) {
      if (e instanceof MulOrDiv) {
        _matched=true;
        _switchResult = TymTypeComputer.INT_TYPE;
      }
    }
    if (!_matched) {
      if (e instanceof Minus) {
        _matched=true;
        _switchResult = TymTypeComputer.INT_TYPE;
      }
    }
    if (!_matched) {
      if (e instanceof Comparison) {
        _matched=true;
        _switchResult = TymTypeComputer.BOOL_TYPE;
      }
    }
    if (!_matched) {
      if (e instanceof Equality) {
        _matched=true;
        _switchResult = TymTypeComputer.BOOL_TYPE;
      }
    }
    if (!_matched) {
      if (e instanceof And) {
        _matched=true;
        _switchResult = TymTypeComputer.BOOL_TYPE;
      }
    }
    if (!_matched) {
      if (e instanceof Or) {
        _matched=true;
        _switchResult = TymTypeComputer.BOOL_TYPE;
      }
    }
    if (!_matched) {
      if (e instanceof VariableRef) {
        _matched=true;
        _switchResult = TymTypeComputer.REF_TYPE;
      }
    }
    return _switchResult;
  }
  
  protected TymType _typeFor(final Plus e) {
    TymType _xblockexpression = null;
    {
      final TymType leftType = this.typeFor(e.getLeft());
      Expression _right = e.getRight();
      TymType _typeFor = null;
      if (_right!=null) {
        _typeFor=this.typeFor(_right);
      }
      final TymType rightType = _typeFor;
      TymType _xifexpression = null;
      if ((this.isStringType(leftType) || this.isStringType(rightType))) {
        _xifexpression = TymTypeComputer.STRING_TYPE;
      } else {
        _xifexpression = TymTypeComputer.INT_TYPE;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  protected TymType _typeFor(final VariableRef varRef) {
    final Variable variable = varRef.getVariable();
    EObject _expression = variable.getExpression();
    if ((_expression instanceof Expression)) {
      EObject _expression_1 = variable.getExpression();
      final Expression varExp = ((Expression) _expression_1);
      Pair<String, Variable> _mappedTo = Pair.<String, Variable>of("type", variable);
      final Provider<TymType> _function = () -> {
        return this.typeFor(varExp);
      };
      return this.cache.<TymType>get(_mappedTo, variable.eResource(), _function);
    } else {
      EObject _expression_2 = variable.getExpression();
      final FunctionCall varExp_1 = ((FunctionCall) _expression_2);
      Pair<String, Variable> _mappedTo_1 = Pair.<String, Variable>of("type", variable);
      final Provider<TymType> _function_1 = () -> {
        return this.typeForFunctionCall(varExp_1);
      };
      return this.cache.<TymType>get(_mappedTo_1, variable.eResource(), _function_1);
    }
  }
  
  public TymType typeFor(final Expression e) {
    if (e instanceof Plus) {
      return _typeFor((Plus)e);
    } else if (e instanceof VariableRef) {
      return _typeFor((VariableRef)e);
    } else if (e != null) {
      return _typeFor(e);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(e).toString());
    }
  }
  
  public TymType typeForFunctionCall(final FunctionCall e) {
    return _typeForFunctionCall(e);
  }
  
  public TymType typeForEcho(final Expression e) {
    return _typeForEcho(e);
  }
}
