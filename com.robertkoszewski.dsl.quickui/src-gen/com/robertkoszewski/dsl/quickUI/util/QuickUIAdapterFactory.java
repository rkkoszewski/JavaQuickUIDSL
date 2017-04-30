/**
 * generated by Xtext 2.11.0
 */
package com.robertkoszewski.dsl.quickUI.util;

import com.robertkoszewski.dsl.quickUI.Alias;
import com.robertkoszewski.dsl.quickUI.Checked;
import com.robertkoszewski.dsl.quickUI.Condition;
import com.robertkoszewski.dsl.quickUI.ConditionType;
import com.robertkoszewski.dsl.quickUI.Disabled;
import com.robertkoszewski.dsl.quickUI.Element;
import com.robertkoszewski.dsl.quickUI.Empty;
import com.robertkoszewski.dsl.quickUI.Filter;
import com.robertkoszewski.dsl.quickUI.JavaElement;
import com.robertkoszewski.dsl.quickUI.Label;
import com.robertkoszewski.dsl.quickUI.OnClick;
import com.robertkoszewski.dsl.quickUI.Option;
import com.robertkoszewski.dsl.quickUI.QuickUIPackage;
import com.robertkoszewski.dsl.quickUI.Row;
import com.robertkoszewski.dsl.quickUI.UIModel;
import com.robertkoszewski.dsl.quickUI.Window;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.robertkoszewski.dsl.quickUI.QuickUIPackage
 * @generated
 */
public class QuickUIAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static QuickUIPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QuickUIAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = QuickUIPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected QuickUISwitch<Adapter> modelSwitch =
    new QuickUISwitch<Adapter>()
    {
      @Override
      public Adapter caseUIModel(UIModel object)
      {
        return createUIModelAdapter();
      }
      @Override
      public Adapter caseAlias(Alias object)
      {
        return createAliasAdapter();
      }
      @Override
      public Adapter casePackage(com.robertkoszewski.dsl.quickUI.Package object)
      {
        return createPackageAdapter();
      }
      @Override
      public Adapter caseWindow(Window object)
      {
        return createWindowAdapter();
      }
      @Override
      public Adapter caseElement(Element object)
      {
        return createElementAdapter();
      }
      @Override
      public Adapter caseJavaElement(JavaElement object)
      {
        return createJavaElementAdapter();
      }
      @Override
      public Adapter caseRow(Row object)
      {
        return createRowAdapter();
      }
      @Override
      public Adapter caseOption(Option object)
      {
        return createOptionAdapter();
      }
      @Override
      public Adapter caseLabel(Label object)
      {
        return createLabelAdapter();
      }
      @Override
      public Adapter caseDisabled(Disabled object)
      {
        return createDisabledAdapter();
      }
      @Override
      public Adapter caseCondition(Condition object)
      {
        return createConditionAdapter();
      }
      @Override
      public Adapter caseConditionType(ConditionType object)
      {
        return createConditionTypeAdapter();
      }
      @Override
      public Adapter caseChecked(Checked object)
      {
        return createCheckedAdapter();
      }
      @Override
      public Adapter caseOnClick(OnClick object)
      {
        return createOnClickAdapter();
      }
      @Override
      public Adapter caseBoolean(com.robertkoszewski.dsl.quickUI.Boolean object)
      {
        return createBooleanAdapter();
      }
      @Override
      public Adapter caseFilter(Filter object)
      {
        return createFilterAdapter();
      }
      @Override
      public Adapter caseEmpty(Empty object)
      {
        return createEmptyAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link com.robertkoszewski.dsl.quickUI.UIModel <em>UI Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robertkoszewski.dsl.quickUI.UIModel
   * @generated
   */
  public Adapter createUIModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robertkoszewski.dsl.quickUI.Alias <em>Alias</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robertkoszewski.dsl.quickUI.Alias
   * @generated
   */
  public Adapter createAliasAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robertkoszewski.dsl.quickUI.Package <em>Package</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robertkoszewski.dsl.quickUI.Package
   * @generated
   */
  public Adapter createPackageAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robertkoszewski.dsl.quickUI.Window <em>Window</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robertkoszewski.dsl.quickUI.Window
   * @generated
   */
  public Adapter createWindowAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robertkoszewski.dsl.quickUI.Element <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robertkoszewski.dsl.quickUI.Element
   * @generated
   */
  public Adapter createElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robertkoszewski.dsl.quickUI.JavaElement <em>Java Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robertkoszewski.dsl.quickUI.JavaElement
   * @generated
   */
  public Adapter createJavaElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robertkoszewski.dsl.quickUI.Row <em>Row</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robertkoszewski.dsl.quickUI.Row
   * @generated
   */
  public Adapter createRowAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robertkoszewski.dsl.quickUI.Option <em>Option</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robertkoszewski.dsl.quickUI.Option
   * @generated
   */
  public Adapter createOptionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robertkoszewski.dsl.quickUI.Label <em>Label</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robertkoszewski.dsl.quickUI.Label
   * @generated
   */
  public Adapter createLabelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robertkoszewski.dsl.quickUI.Disabled <em>Disabled</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robertkoszewski.dsl.quickUI.Disabled
   * @generated
   */
  public Adapter createDisabledAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robertkoszewski.dsl.quickUI.Condition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robertkoszewski.dsl.quickUI.Condition
   * @generated
   */
  public Adapter createConditionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robertkoszewski.dsl.quickUI.ConditionType <em>Condition Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robertkoszewski.dsl.quickUI.ConditionType
   * @generated
   */
  public Adapter createConditionTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robertkoszewski.dsl.quickUI.Checked <em>Checked</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robertkoszewski.dsl.quickUI.Checked
   * @generated
   */
  public Adapter createCheckedAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robertkoszewski.dsl.quickUI.OnClick <em>On Click</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robertkoszewski.dsl.quickUI.OnClick
   * @generated
   */
  public Adapter createOnClickAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robertkoszewski.dsl.quickUI.Boolean <em>Boolean</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robertkoszewski.dsl.quickUI.Boolean
   * @generated
   */
  public Adapter createBooleanAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robertkoszewski.dsl.quickUI.Filter <em>Filter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robertkoszewski.dsl.quickUI.Filter
   * @generated
   */
  public Adapter createFilterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robertkoszewski.dsl.quickUI.Empty <em>Empty</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robertkoszewski.dsl.quickUI.Empty
   * @generated
   */
  public Adapter createEmptyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //QuickUIAdapterFactory
