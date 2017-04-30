/**
 * generated by Xtext 2.11.0
 */
package com.robertkoszewski.dsl.quickUI.util;

import com.robertkoszewski.dsl.quickUI.Alias;
import com.robertkoszewski.dsl.quickUI.Checked;
import com.robertkoszewski.dsl.quickUI.Condition;
import com.robertkoszewski.dsl.quickUI.ConditionType;
import com.robertkoszewski.dsl.quickUI.Element;
import com.robertkoszewski.dsl.quickUI.Empty;
import com.robertkoszewski.dsl.quickUI.Enabled;
import com.robertkoszewski.dsl.quickUI.Filter;
import com.robertkoszewski.dsl.quickUI.JavaElement;
import com.robertkoszewski.dsl.quickUI.Label;
import com.robertkoszewski.dsl.quickUI.OnClick;
import com.robertkoszewski.dsl.quickUI.Option;
import com.robertkoszewski.dsl.quickUI.QuickUIPackage;
import com.robertkoszewski.dsl.quickUI.Row;
import com.robertkoszewski.dsl.quickUI.UIModel;
import com.robertkoszewski.dsl.quickUI.Window;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see com.robertkoszewski.dsl.quickUI.QuickUIPackage
 * @generated
 */
public class QuickUISwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static QuickUIPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QuickUISwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = QuickUIPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case QuickUIPackage.UI_MODEL:
      {
        UIModel uiModel = (UIModel)theEObject;
        T result = caseUIModel(uiModel);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case QuickUIPackage.ALIAS:
      {
        Alias alias = (Alias)theEObject;
        T result = caseAlias(alias);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case QuickUIPackage.PACKAGE:
      {
        com.robertkoszewski.dsl.quickUI.Package package_ = (com.robertkoszewski.dsl.quickUI.Package)theEObject;
        T result = casePackage(package_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case QuickUIPackage.WINDOW:
      {
        Window window = (Window)theEObject;
        T result = caseWindow(window);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case QuickUIPackage.ELEMENT:
      {
        Element element = (Element)theEObject;
        T result = caseElement(element);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case QuickUIPackage.JAVA_ELEMENT:
      {
        JavaElement javaElement = (JavaElement)theEObject;
        T result = caseJavaElement(javaElement);
        if (result == null) result = caseElement(javaElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case QuickUIPackage.ROW:
      {
        Row row = (Row)theEObject;
        T result = caseRow(row);
        if (result == null) result = caseElement(row);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case QuickUIPackage.OPTION:
      {
        Option option = (Option)theEObject;
        T result = caseOption(option);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case QuickUIPackage.LABEL:
      {
        Label label = (Label)theEObject;
        T result = caseLabel(label);
        if (result == null) result = caseOption(label);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case QuickUIPackage.ENABLED:
      {
        Enabled enabled = (Enabled)theEObject;
        T result = caseEnabled(enabled);
        if (result == null) result = caseOption(enabled);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case QuickUIPackage.CONDITION:
      {
        Condition condition = (Condition)theEObject;
        T result = caseCondition(condition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case QuickUIPackage.CONDITION_TYPE:
      {
        ConditionType conditionType = (ConditionType)theEObject;
        T result = caseConditionType(conditionType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case QuickUIPackage.CHECKED:
      {
        Checked checked = (Checked)theEObject;
        T result = caseChecked(checked);
        if (result == null) result = caseOption(checked);
        if (result == null) result = caseConditionType(checked);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case QuickUIPackage.ON_CLICK:
      {
        OnClick onClick = (OnClick)theEObject;
        T result = caseOnClick(onClick);
        if (result == null) result = caseOption(onClick);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case QuickUIPackage.BOOLEAN:
      {
        com.robertkoszewski.dsl.quickUI.Boolean boolean_ = (com.robertkoszewski.dsl.quickUI.Boolean)theEObject;
        T result = caseBoolean(boolean_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case QuickUIPackage.FILTER:
      {
        Filter filter = (Filter)theEObject;
        T result = caseFilter(filter);
        if (result == null) result = caseOption(filter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case QuickUIPackage.EMPTY:
      {
        Empty empty = (Empty)theEObject;
        T result = caseEmpty(empty);
        if (result == null) result = caseConditionType(empty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>UI Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>UI Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUIModel(UIModel object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Alias</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Alias</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAlias(Alias object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Package</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Package</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePackage(com.robertkoszewski.dsl.quickUI.Package object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Window</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Window</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWindow(Window object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseElement(Element object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Java Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Java Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseJavaElement(JavaElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Row</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Row</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRow(Row object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Option</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Option</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOption(Option object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Label</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Label</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLabel(Label object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Enabled</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Enabled</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEnabled(Enabled object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Condition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Condition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCondition(Condition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Condition Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Condition Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConditionType(ConditionType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Checked</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Checked</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseChecked(Checked object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>On Click</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>On Click</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOnClick(OnClick object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Boolean</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Boolean</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBoolean(com.robertkoszewski.dsl.quickUI.Boolean object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Filter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Filter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFilter(Filter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Empty</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Empty</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEmpty(Empty object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //QuickUISwitch
