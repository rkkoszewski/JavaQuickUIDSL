/**
 * generated by Xtext 2.11.0
 */
package com.robertkoszewski.dsl.quickUI;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enabled</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.robertkoszewski.dsl.quickUI.Enabled#getCondition <em>Condition</em>}</li>
 * </ul>
 *
 * @see com.robertkoszewski.dsl.quickUI.QuickUIPackage#getEnabled()
 * @model
 * @generated
 */
public interface Enabled extends Option
{
  /**
   * Returns the value of the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Condition</em>' containment reference.
   * @see #setCondition(ConditionDefinition)
   * @see com.robertkoszewski.dsl.quickUI.QuickUIPackage#getEnabled_Condition()
   * @model containment="true"
   * @generated
   */
  ConditionDefinition getCondition();

  /**
   * Sets the value of the '{@link com.robertkoszewski.dsl.quickUI.Enabled#getCondition <em>Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Condition</em>' containment reference.
   * @see #getCondition()
   * @generated
   */
  void setCondition(ConditionDefinition value);

} // Enabled
