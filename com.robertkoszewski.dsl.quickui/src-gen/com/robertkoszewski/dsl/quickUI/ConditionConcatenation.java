/**
 * generated by Xtext 2.11.0
 */
package com.robertkoszewski.dsl.quickUI;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition Concatenation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.robertkoszewski.dsl.quickUI.ConditionConcatenation#getLeft <em>Left</em>}</li>
 *   <li>{@link com.robertkoszewski.dsl.quickUI.ConditionConcatenation#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see com.robertkoszewski.dsl.quickUI.QuickUIPackage#getConditionConcatenation()
 * @model
 * @generated
 */
public interface ConditionConcatenation extends ConditionDefinition
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(ConditionDefinition)
   * @see com.robertkoszewski.dsl.quickUI.QuickUIPackage#getConditionConcatenation_Left()
   * @model containment="true"
   * @generated
   */
  ConditionDefinition getLeft();

  /**
   * Sets the value of the '{@link com.robertkoszewski.dsl.quickUI.ConditionConcatenation#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(ConditionDefinition value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(ConditionDefinition)
   * @see com.robertkoszewski.dsl.quickUI.QuickUIPackage#getConditionConcatenation_Right()
   * @model containment="true"
   * @generated
   */
  ConditionDefinition getRight();

  /**
   * Sets the value of the '{@link com.robertkoszewski.dsl.quickUI.ConditionConcatenation#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(ConditionDefinition value);

} // ConditionConcatenation
