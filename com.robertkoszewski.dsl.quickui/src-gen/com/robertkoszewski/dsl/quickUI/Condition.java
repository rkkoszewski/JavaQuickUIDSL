/**
 * generated by Xtext 2.11.0
 */
package com.robertkoszewski.dsl.quickUI;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.robertkoszewski.dsl.quickUI.Condition#getElement <em>Element</em>}</li>
 *   <li>{@link com.robertkoszewski.dsl.quickUI.Condition#isNegation <em>Negation</em>}</li>
 *   <li>{@link com.robertkoszewski.dsl.quickUI.Condition#getCondition <em>Condition</em>}</li>
 * </ul>
 *
 * @see com.robertkoszewski.dsl.quickUI.QuickUIPackage#getCondition()
 * @model
 * @generated
 */
public interface Condition extends ConditionDefinition
{
  /**
   * Returns the value of the '<em><b>Element</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Element</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Element</em>' reference.
   * @see #setElement(Element)
   * @see com.robertkoszewski.dsl.quickUI.QuickUIPackage#getCondition_Element()
   * @model
   * @generated
   */
  Element getElement();

  /**
   * Sets the value of the '{@link com.robertkoszewski.dsl.quickUI.Condition#getElement <em>Element</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Element</em>' reference.
   * @see #getElement()
   * @generated
   */
  void setElement(Element value);

  /**
   * Returns the value of the '<em><b>Negation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Negation</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Negation</em>' attribute.
   * @see #setNegation(boolean)
   * @see com.robertkoszewski.dsl.quickUI.QuickUIPackage#getCondition_Negation()
   * @model
   * @generated
   */
  boolean isNegation();

  /**
   * Sets the value of the '{@link com.robertkoszewski.dsl.quickUI.Condition#isNegation <em>Negation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Negation</em>' attribute.
   * @see #isNegation()
   * @generated
   */
  void setNegation(boolean value);

  /**
   * Returns the value of the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Condition</em>' containment reference.
   * @see #setCondition(ConditionType)
   * @see com.robertkoszewski.dsl.quickUI.QuickUIPackage#getCondition_Condition()
   * @model containment="true"
   * @generated
   */
  ConditionType getCondition();

  /**
   * Sets the value of the '{@link com.robertkoszewski.dsl.quickUI.Condition#getCondition <em>Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Condition</em>' containment reference.
   * @see #getCondition()
   * @generated
   */
  void setCondition(ConditionType value);

} // Condition
