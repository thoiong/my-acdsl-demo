/**
 * generated by Xtext 2.11.0
 */
package org.acac.demo.acdsl.myACDSL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.acac.demo.acdsl.myACDSL.Operation#getServerOp <em>Server Op</em>}</li>
 * </ul>
 *
 * @see org.acac.demo.acdsl.myACDSL.MyACDSLPackage#getOperation()
 * @model
 * @generated
 */
public interface Operation extends AbstractElement
{
  /**
   * Returns the value of the '<em><b>Server Op</b></em>' attribute list.
   * The list contents are of type {@link org.acac.demo.acdsl.myACDSL.SupportedContainerOperations}.
   * The literals are from the enumeration {@link org.acac.demo.acdsl.myACDSL.SupportedContainerOperations}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Server Op</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Server Op</em>' attribute list.
   * @see org.acac.demo.acdsl.myACDSL.SupportedContainerOperations
   * @see org.acac.demo.acdsl.myACDSL.MyACDSLPackage#getOperation_ServerOp()
   * @model unique="false"
   * @generated
   */
  EList<SupportedContainerOperations> getServerOp();

} // Operation
