/**
 * generated by Xtext 2.11.0
 */
package org.acac.demo.acdsl.myACDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>App Server Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.acac.demo.acdsl.myACDSL.AppServerInfo#getName <em>Name</em>}</li>
 *   <li>{@link org.acac.demo.acdsl.myACDSL.AppServerInfo#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @see org.acac.demo.acdsl.myACDSL.MyACDSLPackage#getAppServerInfo()
 * @model
 * @generated
 */
public interface AppServerInfo extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * The literals are from the enumeration {@link org.acac.demo.acdsl.myACDSL.SupportedContainer}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see org.acac.demo.acdsl.myACDSL.SupportedContainer
   * @see #setName(SupportedContainer)
   * @see org.acac.demo.acdsl.myACDSL.MyACDSLPackage#getAppServerInfo_Name()
   * @model
   * @generated
   */
  SupportedContainer getName();

  /**
   * Sets the value of the '{@link org.acac.demo.acdsl.myACDSL.AppServerInfo#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see org.acac.demo.acdsl.myACDSL.SupportedContainer
   * @see #getName()
   * @generated
   */
  void setName(SupportedContainer value);

  /**
   * Returns the value of the '<em><b>Version</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Version</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Version</em>' attribute.
   * @see #setVersion(String)
   * @see org.acac.demo.acdsl.myACDSL.MyACDSLPackage#getAppServerInfo_Version()
   * @model
   * @generated
   */
  String getVersion();

  /**
   * Sets the value of the '{@link org.acac.demo.acdsl.myACDSL.AppServerInfo#getVersion <em>Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Version</em>' attribute.
   * @see #getVersion()
   * @generated
   */
  void setVersion(String value);

} // AppServerInfo
