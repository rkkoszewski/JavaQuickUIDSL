/**
 * generated by Xtext 2.11.0
 */
package com.robertkoszewski.dsl.quickUI.impl;

import com.robertkoszewski.dsl.quickUI.Element;
import com.robertkoszewski.dsl.quickUI.QuickUIPackage;
import com.robertkoszewski.dsl.quickUI.Window;

import java.lang.Boolean;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Window</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.robertkoszewski.dsl.quickUI.impl.WindowImpl#isMain <em>Main</em>}</li>
 *   <li>{@link com.robertkoszewski.dsl.quickUI.impl.WindowImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.robertkoszewski.dsl.quickUI.impl.WindowImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link com.robertkoszewski.dsl.quickUI.impl.WindowImpl#getMenu_elements <em>Menu elements</em>}</li>
 *   <li>{@link com.robertkoszewski.dsl.quickUI.impl.WindowImpl#getContent_elements <em>Content elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WindowImpl extends MinimalEObjectImpl.Container implements Window
{
  /**
   * The default value of the '{@link #isMain() <em>Main</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isMain()
   * @generated
   * @ordered
   */
  protected static final boolean MAIN_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isMain() <em>Main</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isMain()
   * @generated
   * @ordered
   */
  protected boolean main = MAIN_EDEFAULT;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTitle()
   * @generated
   * @ordered
   */
  protected static final String TITLE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTitle()
   * @generated
   * @ordered
   */
  protected String title = TITLE_EDEFAULT;

  /**
   * The cached value of the '{@link #getMenu_elements() <em>Menu elements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMenu_elements()
   * @generated
   * @ordered
   */
  protected EList<Element> menu_elements;

  /**
   * The cached value of the '{@link #getContent_elements() <em>Content elements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContent_elements()
   * @generated
   * @ordered
   */
  protected EList<Element> content_elements;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected WindowImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return QuickUIPackage.Literals.WINDOW;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isMain()
  {
    return main;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMain(boolean newMain)
  {
    boolean oldMain = main;
    main = newMain;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QuickUIPackage.WINDOW__MAIN, oldMain, main));
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
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QuickUIPackage.WINDOW__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTitle()
  {
    return title;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTitle(String newTitle)
  {
    String oldTitle = title;
    title = newTitle;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QuickUIPackage.WINDOW__TITLE, oldTitle, title));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Element> getMenu_elements()
  {
    if (menu_elements == null)
    {
      menu_elements = new EObjectContainmentEList<Element>(Element.class, this, QuickUIPackage.WINDOW__MENU_ELEMENTS);
    }
    return menu_elements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Element> getContent_elements()
  {
    if (content_elements == null)
    {
      content_elements = new EObjectContainmentEList<Element>(Element.class, this, QuickUIPackage.WINDOW__CONTENT_ELEMENTS);
    }
    return content_elements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case QuickUIPackage.WINDOW__MENU_ELEMENTS:
        return ((InternalEList<?>)getMenu_elements()).basicRemove(otherEnd, msgs);
      case QuickUIPackage.WINDOW__CONTENT_ELEMENTS:
        return ((InternalEList<?>)getContent_elements()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case QuickUIPackage.WINDOW__MAIN:
        return isMain();
      case QuickUIPackage.WINDOW__NAME:
        return getName();
      case QuickUIPackage.WINDOW__TITLE:
        return getTitle();
      case QuickUIPackage.WINDOW__MENU_ELEMENTS:
        return getMenu_elements();
      case QuickUIPackage.WINDOW__CONTENT_ELEMENTS:
        return getContent_elements();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case QuickUIPackage.WINDOW__MAIN:
        setMain((Boolean)newValue);
        return;
      case QuickUIPackage.WINDOW__NAME:
        setName((String)newValue);
        return;
      case QuickUIPackage.WINDOW__TITLE:
        setTitle((String)newValue);
        return;
      case QuickUIPackage.WINDOW__MENU_ELEMENTS:
        getMenu_elements().clear();
        getMenu_elements().addAll((Collection<? extends Element>)newValue);
        return;
      case QuickUIPackage.WINDOW__CONTENT_ELEMENTS:
        getContent_elements().clear();
        getContent_elements().addAll((Collection<? extends Element>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case QuickUIPackage.WINDOW__MAIN:
        setMain(MAIN_EDEFAULT);
        return;
      case QuickUIPackage.WINDOW__NAME:
        setName(NAME_EDEFAULT);
        return;
      case QuickUIPackage.WINDOW__TITLE:
        setTitle(TITLE_EDEFAULT);
        return;
      case QuickUIPackage.WINDOW__MENU_ELEMENTS:
        getMenu_elements().clear();
        return;
      case QuickUIPackage.WINDOW__CONTENT_ELEMENTS:
        getContent_elements().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case QuickUIPackage.WINDOW__MAIN:
        return main != MAIN_EDEFAULT;
      case QuickUIPackage.WINDOW__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case QuickUIPackage.WINDOW__TITLE:
        return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
      case QuickUIPackage.WINDOW__MENU_ELEMENTS:
        return menu_elements != null && !menu_elements.isEmpty();
      case QuickUIPackage.WINDOW__CONTENT_ELEMENTS:
        return content_elements != null && !content_elements.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (main: ");
    result.append(main);
    result.append(", name: ");
    result.append(name);
    result.append(", title: ");
    result.append(title);
    result.append(')');
    return result.toString();
  }

} //WindowImpl
