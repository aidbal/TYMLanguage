package org.pkt.generator;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.pkt.interpreter.TymInterpreter;
import org.pkt.tym.AbstractElement;
import org.pkt.tym.Block;
import org.pkt.tym.Expression;
import org.pkt.tym.Function;
import org.pkt.tym.FunctionBlock;
import org.pkt.tym.FunctionCall;
import org.pkt.tym.LoopStatement;
import org.pkt.tym.PrintStatement;
import org.pkt.tym.Return;
import org.pkt.tym.TestStatement;
import org.pkt.tym.Variable;
import org.pkt.typing.TymType;
import org.pkt.typing.TymTypeComputer;

@SuppressWarnings("all")
public class TymGenerator extends AbstractGenerator {
  @Inject
  @Extension
  private TymTypeComputer _tymTypeComputer;
  
  @Inject
  @Extension
  private TymInterpreter _tymInterpreter;
  
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("tym.java");
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("public class Tym {");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.newLine();
    {
      Iterable<Function> _filter = Iterables.<Function>filter(IteratorExtensions.<EObject>toIterable(resource.getAllContents()), Function.class);
      for(final Function s : _filter) {
        _builder_1.append("\t");
        CharSequence _interpretFunction = this.interpretFunction(s);
        _builder_1.append(_interpretFunction, "\t");
        _builder_1.newLineIfNotEmpty();
      }
    }
    _builder_1.append("\t");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("public static void main(String[] args) {");
    _builder_1.newLine();
    {
      Iterable<AbstractElement> _filter_1 = Iterables.<AbstractElement>filter(IteratorExtensions.<EObject>toIterable(resource.getAllContents()), AbstractElement.class);
      for(final AbstractElement s_1 : _filter_1) {
        {
          if (((((!(s_1.eContainer() instanceof Block)) && (!(s_1.eContainer() instanceof LoopStatement))) && (!(s_1.eContainer() instanceof FunctionBlock))) && (!(s_1.eContainer() instanceof Function)))) {
            _builder_1.append("\t\t");
            CharSequence _interpretStatement = this.interpretStatement(s_1);
            _builder_1.append(_interpretStatement, "\t\t");
            _builder_1.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder_1.append("\t");
    _builder_1.append("}");
    _builder_1.newLine();
    _builder_1.append("}");
    _builder_1.newLine();
    fsa.generateFile(_builder.toString(), _builder_1);
  }
  
  public CharSequence interpretFunction(final Function f) {
    CharSequence _xblockexpression = null;
    {
      final int paramsCount = f.getParams().size();
      int paramI = 0;
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("public static ");
      {
        String _return = f.getReturn();
        boolean _equals = Objects.equal(_return, null);
        if (_equals) {
          _builder.append("void");
        }
      }
      {
        String _return_1 = f.getReturn();
        boolean _equals_1 = Objects.equal(_return_1, "number");
        if (_equals_1) {
          _builder.append("int");
        }
      }
      {
        String _return_2 = f.getReturn();
        boolean _equals_2 = Objects.equal(_return_2, "word");
        if (_equals_2) {
          _builder.append("String");
        }
      }
      {
        String _return_3 = f.getReturn();
        boolean _equals_3 = Objects.equal(_return_3, "Bool");
        if (_equals_3) {
          _builder.append("Boolen");
        }
      }
      _builder.append(" ");
      String _name = f.getName();
      _builder.append(_name);
      _builder.append("(");
      {
        final Function1<Variable, String> _function = (Variable it) -> {
          return it.getVartype();
        };
        String _join = IterableExtensions.join(ListExtensions.<Variable, String>map(f.getParams(), _function), ", ");
        boolean _equals_4 = Objects.equal(_join, "number");
        if (_equals_4) {
          _builder.append("int");
        }
      }
      {
        final Function1<Variable, String> _function_1 = (Variable it) -> {
          return it.getVartype();
        };
        String _join_1 = IterableExtensions.join(ListExtensions.<Variable, String>map(f.getParams(), _function_1), ", ");
        boolean _equals_5 = Objects.equal(_join_1, "Bool");
        if (_equals_5) {
          _builder.append("boolean");
        }
      }
      {
        final Function1<Variable, String> _function_2 = (Variable it) -> {
          return it.getVartype();
        };
        String _join_2 = IterableExtensions.join(ListExtensions.<Variable, String>map(f.getParams(), _function_2), ", ");
        boolean _equals_6 = Objects.equal(_join_2, "word");
        if (_equals_6) {
          _builder.append("String");
        }
      }
      final Function1<Variable, String> _function_3 = (Variable it) -> {
        return it.getName();
      };
      String _join_3 = IterableExtensions.join(ListExtensions.<Variable, String>map(f.getParams(), _function_3), ", ");
      String _plus = (" " + _join_3);
      _builder.append(_plus);
      _builder.append(") {");
      _builder.newLineIfNotEmpty();
      {
        Iterable<AbstractElement> _filter = Iterables.<AbstractElement>filter(f.getBody().getElements(), AbstractElement.class);
        for(final AbstractElement s : _filter) {
          CharSequence _interpretStatement = this.interpretStatement(s);
          _builder.append(_interpretStatement);
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.append("}");
      _builder.newLine();
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  public String getType(final Function f) {
    final Function1<Variable, String> _function = (Variable it) -> {
      return it.getVartype();
    };
    final String a = IterableExtensions.join(ListExtensions.<Variable, String>map(f.getParams(), _function), ", ");
    return a;
  }
  
  public CharSequence interpretStatement(final AbstractElement s) {
    CharSequence _switchResult = null;
    boolean _matched = false;
    if (s instanceof Variable) {
      _matched=true;
      CharSequence _xifexpression = null;
      EObject _expression = ((Variable)s).getExpression();
      if ((_expression instanceof Expression)) {
        String _switchResult_1 = null;
        String _vartype = ((Variable)s).getVartype();
        if (_vartype != null) {
          switch (_vartype) {
            case "number":
              String _name = ((Variable)s).getName();
              String _plus = ("int " + _name);
              String _plus_1 = (_plus + " = ");
              String _text = NodeModelUtils.getNode(((Variable)s).getExpression()).getText();
              String _plus_2 = (_plus_1 + _text);
              _switchResult_1 = (_plus_2 + ";");
              break;
            case "word":
              String _name_1 = ((Variable)s).getName();
              String _plus_3 = ("String " + _name_1);
              String _plus_4 = (_plus_3 + " = ");
              String _text_1 = NodeModelUtils.getNode(((Variable)s).getExpression()).getText();
              String _plus_5 = (_plus_4 + _text_1);
              _switchResult_1 = (_plus_5 + ";");
              break;
            case "Bool":
              String _name_2 = ((Variable)s).getName();
              String _plus_6 = ("boolean " + _name_2);
              String _plus_7 = (_plus_6 + " = ");
              String _text_2 = NodeModelUtils.getNode(((Variable)s).getExpression()).getText();
              String _plus_8 = (_plus_7 + _text_2);
              _switchResult_1 = (_plus_8 + ";");
              break;
            default:
              String _name_3 = ((Variable)s).getVariable().getName();
              String _plus_9 = (_name_3 + " = ");
              String _text_3 = NodeModelUtils.getNode(((Variable)s).getExpression()).getText();
              String _plus_10 = (_plus_9 + _text_3);
              _switchResult_1 = (_plus_10 + ";");
              break;
          }
        } else {
          String _name_3 = ((Variable)s).getVariable().getName();
          String _plus_9 = (_name_3 + " = ");
          String _text_3 = NodeModelUtils.getNode(((Variable)s).getExpression()).getText();
          String _plus_10 = (_plus_9 + _text_3);
          _switchResult_1 = (_plus_10 + ";");
        }
        _xifexpression = _switchResult_1;
      } else {
        CharSequence _xblockexpression = null;
        {
          EObject _expression_1 = ((Variable)s).getExpression();
          final FunctionCall func = ((FunctionCall) _expression_1);
          CharSequence _switchResult_2 = null;
          String _vartype_1 = ((Variable)s).getVartype();
          if (_vartype_1 != null) {
            switch (_vartype_1) {
              case "number":
                StringConcatenation _builder = new StringConcatenation();
                _builder.append("int ");
                String _name_4 = ((Variable)s).getName();
                _builder.append(_name_4);
                _builder.append(" = Tym.");
                String _name_5 = func.getFuncname().getName();
                _builder.append(_name_5);
                _builder.append("(");
                final Function1<Expression, String> _function = (Expression it) -> {
                  return NodeModelUtils.getNode(it).getText();
                };
                String _join = IterableExtensions.join(ListExtensions.<Expression, String>map(func.getParams(), _function), ", ");
                _builder.append(_join);
                _builder.append(");");
                _switchResult_2 = _builder;
                break;
              case "word":
                StringConcatenation _builder_1 = new StringConcatenation();
                _builder_1.append("String ");
                String _name_6 = ((Variable)s).getName();
                _builder_1.append(_name_6);
                _builder_1.append(" = Tym.");
                String _name_7 = func.getFuncname().getName();
                _builder_1.append(_name_7);
                _builder_1.append("(");
                final Function1<Expression, String> _function_1 = (Expression it) -> {
                  return NodeModelUtils.getNode(it).getText();
                };
                String _join_1 = IterableExtensions.join(ListExtensions.<Expression, String>map(func.getParams(), _function_1), ", ");
                _builder_1.append(_join_1);
                _builder_1.append(");");
                _switchResult_2 = _builder_1;
                break;
              case "Bool":
                StringConcatenation _builder_2 = new StringConcatenation();
                _builder_2.append("boolean ");
                String _name_8 = ((Variable)s).getName();
                _builder_2.append(_name_8);
                _builder_2.append(" = Tym.");
                String _name_9 = func.getFuncname().getName();
                _builder_2.append(_name_9);
                _builder_2.append("(");
                final Function1<Expression, String> _function_2 = (Expression it) -> {
                  return NodeModelUtils.getNode(it).getText();
                };
                String _join_2 = IterableExtensions.join(ListExtensions.<Expression, String>map(func.getParams(), _function_2), ", ");
                _builder_2.append(_join_2);
                _builder_2.append(");");
                _switchResult_2 = _builder_2;
                break;
              default:
                StringConcatenation _builder_3 = new StringConcatenation();
                String _name_10 = ((Variable)s).getVariable().getName();
                _builder_3.append(_name_10);
                _builder_3.append(" = Tym.");
                String _name_11 = func.getFuncname().getName();
                _builder_3.append(_name_11);
                _builder_3.append("(");
                final Function1<Expression, String> _function_3 = (Expression it) -> {
                  return NodeModelUtils.getNode(it).getText();
                };
                String _join_3 = IterableExtensions.join(ListExtensions.<Expression, String>map(func.getParams(), _function_3), ", ");
                _builder_3.append(_join_3);
                _builder_3.append(");");
                _switchResult_2 = _builder_3;
                break;
            }
          } else {
            StringConcatenation _builder_3 = new StringConcatenation();
            String _name_10 = ((Variable)s).getVariable().getName();
            _builder_3.append(_name_10);
            _builder_3.append(" = Tym.");
            String _name_11 = func.getFuncname().getName();
            _builder_3.append(_name_11);
            _builder_3.append("(");
            final Function1<Expression, String> _function_3 = (Expression it) -> {
              return NodeModelUtils.getNode(it).getText();
            };
            String _join_3 = IterableExtensions.join(ListExtensions.<Expression, String>map(func.getParams(), _function_3), ", ");
            _builder_3.append(_join_3);
            _builder_3.append(");");
            _switchResult_2 = _builder_3;
          }
          _xblockexpression = _switchResult_2;
        }
        _xifexpression = _xblockexpression;
      }
      _switchResult = _xifexpression;
    }
    if (!_matched) {
      if (s instanceof PrintStatement) {
        _matched=true;
        CharSequence _xifexpression = null;
        EObject _expression = ((PrintStatement)s).getExpression();
        if ((_expression instanceof Expression)) {
          String _text = NodeModelUtils.getNode(((PrintStatement)s).getExpression()).getText();
          String _plus = ("System.out.println(" + _text);
          _xifexpression = (_plus + ");");
        } else {
          CharSequence _xblockexpression = null;
          {
            EObject _expression_1 = ((PrintStatement)s).getExpression();
            final FunctionCall func = ((FunctionCall) _expression_1);
            StringConcatenation _builder = new StringConcatenation();
            _builder.append("System.out.println(Tym.");
            String _name = func.getFuncname().getName();
            _builder.append(_name);
            _builder.append("(");
            final Function1<Expression, String> _function = (Expression it) -> {
              return NodeModelUtils.getNode(it).getText();
            };
            String _join = IterableExtensions.join(ListExtensions.<Expression, String>map(func.getParams(), _function), ", ");
            _builder.append(_join);
            _builder.append("));");
            _xblockexpression = _builder;
          }
          _xifexpression = _xblockexpression;
        }
        _switchResult = _xifexpression;
      }
    }
    if (!_matched) {
      if (s instanceof Return) {
        _matched=true;
        String _text = NodeModelUtils.getNode(((Return)s).getExpression()).getText();
        String _plus = ("return " + _text);
        _switchResult = (_plus + ";");
      }
    }
    if (!_matched) {
      if (s instanceof FunctionCall) {
        _matched=true;
        CharSequence _xifexpression = null;
        if (((!(((FunctionCall)s).eContainer() instanceof PrintStatement)) && (!(((FunctionCall)s).eContainer() instanceof Variable)))) {
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("tym.");
          String _name = ((FunctionCall)s).getFuncname().getName();
          _builder.append(_name);
          _builder.append("(");
          final Function1<Expression, String> _function = (Expression it) -> {
            return NodeModelUtils.getNode(it).getText();
          };
          String _join = IterableExtensions.join(ListExtensions.<Expression, String>map(((FunctionCall)s).getParams(), _function), ", ");
          _builder.append(_join);
          _builder.append(");");
          _xifexpression = _builder;
        }
        _switchResult = _xifexpression;
      }
    }
    if (!_matched) {
      if (s instanceof TestStatement) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("if(");
        String _text = NodeModelUtils.getNode(((TestStatement)s).getExpression()).getText();
        _builder.append(_text);
        _builder.append("){");
        _builder.newLineIfNotEmpty();
        {
          EList<AbstractElement> _elements = ((TestStatement)s).getThenBlock().getElements();
          for(final AbstractElement s1 : _elements) {
            _builder.append("\t\t\t");
            Object _interpretStatement = this.interpretStatement(s1);
            _builder.append(_interpretStatement, "\t\t\t");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("\t\t\t");
        _builder.append("}");
        {
          Block _elseBlock = ((TestStatement)s).getElseBlock();
          boolean _notEquals = (!Objects.equal(_elseBlock, null));
          if (_notEquals) {
            _builder.append("else{");
            _builder.newLineIfNotEmpty();
            {
              EList<AbstractElement> _elements_1 = ((TestStatement)s).getElseBlock().getElements();
              for(final AbstractElement s2 : _elements_1) {
                _builder.append("\t\t\t");
                _builder.append("\t");
                Object _interpretStatement_1 = this.interpretStatement(s2);
                _builder.append(_interpretStatement_1, "\t\t\t\t");
                _builder.newLineIfNotEmpty();
              }
            }
            _builder.append("\t\t\t");
            _builder.append("}");
          }
        }
        _switchResult = _builder;
      }
    }
    if (!_matched) {
      if (s instanceof LoopStatement) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("while(");
        String _text = NodeModelUtils.getNode(((LoopStatement)s).getExpression()).getText();
        _builder.append(_text);
        _builder.append("){");
        _builder.newLineIfNotEmpty();
        {
          EList<AbstractElement> _elements = ((LoopStatement)s).getBody().getElements();
          for(final AbstractElement s1 : _elements) {
            _builder.append("\t\t\t");
            Object _interpretStatement = this.interpretStatement(s1);
            _builder.append(_interpretStatement, "\t\t\t");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("\t\t\t");
        _builder.append("}");
        _switchResult = _builder;
      }
    }
    return _switchResult;
  }
  
  private boolean checkExpectedType(final Expression exp, final TymType expectedType) {
    final TymType actualType = this.getType(exp);
    boolean _notEquals = (!Objects.equal(actualType, expectedType));
    if (_notEquals) {
      return false;
    }
    return true;
  }
  
  private TymType getType(final Expression exp) {
    TymType _typeFor = null;
    if (exp!=null) {
      _typeFor=this._tymTypeComputer.typeFor(exp);
    }
    final TymType type = _typeFor;
    return type;
  }
}
