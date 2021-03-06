/**
 * generated by Xtext 2.11.0
 */
package com.robertkoszewski.dsl.quickUI.impl;

import com.robertkoszewski.dsl.quickUI.OnClick;
import com.robertkoszewski.dsl.quickUI.QuickUIPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>On Click</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.robertkoszewski.dsl.quickUI.impl.OnClickImpl#getCallback <em>Callback</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OnClickImpl extends OptionImpl implements OnClick
{
  /**
   * The default value of the '{@link #getCallback() <em>Callback</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCallback()
   * @generated
   * @ordered
   */
  protected static final String CALLBACK_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCallback() <em>Callback</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCallback()
   * @generated
   * @ordered
   */
  protected String callback = CALLBACK_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OnClickImpl()
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
    return QuickUIPackage.Literals.ON_CLICK;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getCallback()
  {
    return callback;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCallback(String newCallback)
  {
    String oldCallback = callback;
    callback = newCallback;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QuickUIPackage.ON_CLICK__CALLBACK, oldCallback, callback));
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
      case QuickUIPackage.ON_CLICK__CALLBACK:
        return getCallback();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case QuickUIPackage.ON_CLICK__CALLBACK:
        setCallback((String)newValue);
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
      case QuickUIPackage.ON_CLICK__CALLBACK:
        setCallback(CALLBACK_EDEFAULT);
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
      case QuickUIPackage.ON_CLICK__CALLBACK:
        return CALLBACK_EDEFAULT == null ? callback != null : !CALLBACK_EDEFAULT.equals(callback);
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
    result.append(" (callback: ");
    result.append(callback);
    result.append(')');
    return result.toString();
  }

} //OnClickImpl
