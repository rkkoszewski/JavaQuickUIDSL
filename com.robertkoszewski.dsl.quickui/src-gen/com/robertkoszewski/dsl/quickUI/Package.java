/**
 * generated by Xtext 2.11.0
 */
package com.robertkoszewski.dsl.quickUI;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.robertkoszewski.dsl.quickUI.Package#getPname <em>Pname</em>}</li>
 *   <li>{@link com.robertkoszewski.dsl.quickUI.Package#getSubp <em>Subp</em>}</li>
 * </ul>
 *
 * @see com.robertkoszewski.dsl.quickUI.QuickUIPackage#getPackage()
 * @model
 * @generated
 */
public interface Package extends EObject
{
  /**
   * Returns the value of the '<em><b>Pname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pname</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pname</em>' attribute.
   * @see #setPname(String)
   * @see com.robertkoszewski.dsl.quickUI.QuickUIPackage#getPackage_Pname()
   * @model
   * @generated
   */
  String getPname();

  /**
   * Sets the value of the '{@link com.robertkoszewski.dsl.quickUI.Package#getPname <em>Pname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pname</em>' attribute.
   * @see #getPname()
   * @generated
   */
  void setPname(String value);

  /**
   * Returns the value of the '<em><b>Subp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Subp</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Subp</em>' containment reference.
   * @see #setSubp(Package)
   * @see com.robertkoszewski.dsl.quickUI.QuickUIPackage#getPackage_Subp()
   * @model containment="true"
   * @generated
   */
  Package getSubp();

  /**
   * Sets the value of the '{@link com.robertkoszewski.dsl.quickUI.Package#getSubp <em>Subp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Subp</em>' containment reference.
   * @see #getSubp()
   * @generated
   */
  void setSubp(Package value);

} // Package
