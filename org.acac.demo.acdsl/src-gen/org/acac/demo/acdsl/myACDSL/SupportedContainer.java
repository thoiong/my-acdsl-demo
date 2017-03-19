/**
 * generated by Xtext 2.11.0
 */
package org.acac.demo.acdsl.myACDSL;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Supported Container</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.acac.demo.acdsl.myACDSL.MyACDSLPackage#getSupportedContainer()
 * @model
 * @generated
 */
public enum SupportedContainer implements Enumerator
{
  /**
   * The '<em><b>Web Sphere</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #WEB_SPHERE_VALUE
   * @generated
   * @ordered
   */
  WEB_SPHERE(0, "WebSphere", "WebSphere"),

  /**
   * The '<em><b>Tomcat</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #TOMCAT_VALUE
   * @generated
   * @ordered
   */
  TOMCAT(1, "Tomcat", "Tomcat");

  /**
   * The '<em><b>Web Sphere</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Web Sphere</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #WEB_SPHERE
   * @model name="WebSphere"
   * @generated
   * @ordered
   */
  public static final int WEB_SPHERE_VALUE = 0;

  /**
   * The '<em><b>Tomcat</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Tomcat</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #TOMCAT
   * @model name="Tomcat"
   * @generated
   * @ordered
   */
  public static final int TOMCAT_VALUE = 1;

  /**
   * An array of all the '<em><b>Supported Container</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final SupportedContainer[] VALUES_ARRAY =
    new SupportedContainer[]
    {
      WEB_SPHERE,
      TOMCAT,
    };

  /**
   * A public read-only list of all the '<em><b>Supported Container</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<SupportedContainer> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Supported Container</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static SupportedContainer get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      SupportedContainer result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Supported Container</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static SupportedContainer getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      SupportedContainer result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Supported Container</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static SupportedContainer get(int value)
  {
    switch (value)
    {
      case WEB_SPHERE_VALUE: return WEB_SPHERE;
      case TOMCAT_VALUE: return TOMCAT;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private SupportedContainer(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //SupportedContainer
