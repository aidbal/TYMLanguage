/**
 * generated by Xtext 2.12.0
 */
package org.pkt.tym;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.pkt.tym.FunctionBlock#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see org.pkt.tym.TymPackage#getFunctionBlock()
 * @model
 * @generated
 */
public interface FunctionBlock extends EObject
{
  /**
   * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
   * The list contents are of type {@link org.pkt.tym.AbstractElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' containment reference list.
   * @see org.pkt.tym.TymPackage#getFunctionBlock_Elements()
   * @model containment="true"
   * @generated
   */
  EList<AbstractElement> getElements();

} // FunctionBlock
