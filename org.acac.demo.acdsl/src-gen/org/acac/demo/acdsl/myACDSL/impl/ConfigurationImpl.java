/**
 * generated by Xtext 2.11.0
 */
package org.acac.demo.acdsl.myACDSL.impl;

import java.util.Collection;

import org.acac.demo.acdsl.myACDSL.AppServerInfo;
import org.acac.demo.acdsl.myACDSL.CommonParam;
import org.acac.demo.acdsl.myACDSL.Configuration;
import org.acac.demo.acdsl.myACDSL.ConfigurationType;
import org.acac.demo.acdsl.myACDSL.MyACDSLPackage;
import org.acac.demo.acdsl.myACDSL.SupportedOs;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.acac.demo.acdsl.myACDSL.impl.ConfigurationImpl#getAppName <em>App Name</em>}</li>
 *   <li>{@link org.acac.demo.acdsl.myACDSL.impl.ConfigurationImpl#getOs <em>Os</em>}</li>
 *   <li>{@link org.acac.demo.acdsl.myACDSL.impl.ConfigurationImpl#getAppServer <em>App Server</em>}</li>
 *   <li>{@link org.acac.demo.acdsl.myACDSL.impl.ConfigurationImpl#getCommonParams <em>Common Params</em>}</li>
 *   <li>{@link org.acac.demo.acdsl.myACDSL.impl.ConfigurationImpl#getConfigurations <em>Configurations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConfigurationImpl extends AbstractElementImpl implements Configuration
{
  /**
   * The default value of the '{@link #getAppName() <em>App Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAppName()
   * @generated
   * @ordered
   */
  protected static final String APP_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAppName() <em>App Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAppName()
   * @generated
   * @ordered
   */
  protected String appName = APP_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getOs() <em>Os</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOs()
   * @generated
   * @ordered
   */
  protected static final SupportedOs OS_EDEFAULT = SupportedOs.LINUX;

  /**
   * The cached value of the '{@link #getOs() <em>Os</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOs()
   * @generated
   * @ordered
   */
  protected SupportedOs os = OS_EDEFAULT;

  /**
   * The cached value of the '{@link #getAppServer() <em>App Server</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAppServer()
   * @generated
   * @ordered
   */
  protected AppServerInfo appServer;

  /**
   * The cached value of the '{@link #getCommonParams() <em>Common Params</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCommonParams()
   * @generated
   * @ordered
   */
  protected EList<CommonParam> commonParams;

  /**
   * The cached value of the '{@link #getConfigurations() <em>Configurations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConfigurations()
   * @generated
   * @ordered
   */
  protected EList<ConfigurationType> configurations;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConfigurationImpl()
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
    return MyACDSLPackage.Literals.CONFIGURATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAppName()
  {
    return appName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAppName(String newAppName)
  {
    String oldAppName = appName;
    appName = newAppName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyACDSLPackage.CONFIGURATION__APP_NAME, oldAppName, appName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SupportedOs getOs()
  {
    return os;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOs(SupportedOs newOs)
  {
    SupportedOs oldOs = os;
    os = newOs == null ? OS_EDEFAULT : newOs;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyACDSLPackage.CONFIGURATION__OS, oldOs, os));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AppServerInfo getAppServer()
  {
    return appServer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAppServer(AppServerInfo newAppServer, NotificationChain msgs)
  {
    AppServerInfo oldAppServer = appServer;
    appServer = newAppServer;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyACDSLPackage.CONFIGURATION__APP_SERVER, oldAppServer, newAppServer);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAppServer(AppServerInfo newAppServer)
  {
    if (newAppServer != appServer)
    {
      NotificationChain msgs = null;
      if (appServer != null)
        msgs = ((InternalEObject)appServer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyACDSLPackage.CONFIGURATION__APP_SERVER, null, msgs);
      if (newAppServer != null)
        msgs = ((InternalEObject)newAppServer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyACDSLPackage.CONFIGURATION__APP_SERVER, null, msgs);
      msgs = basicSetAppServer(newAppServer, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyACDSLPackage.CONFIGURATION__APP_SERVER, newAppServer, newAppServer));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<CommonParam> getCommonParams()
  {
    if (commonParams == null)
    {
      commonParams = new EObjectContainmentEList<CommonParam>(CommonParam.class, this, MyACDSLPackage.CONFIGURATION__COMMON_PARAMS);
    }
    return commonParams;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ConfigurationType> getConfigurations()
  {
    if (configurations == null)
    {
      configurations = new EObjectContainmentEList<ConfigurationType>(ConfigurationType.class, this, MyACDSLPackage.CONFIGURATION__CONFIGURATIONS);
    }
    return configurations;
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
      case MyACDSLPackage.CONFIGURATION__APP_SERVER:
        return basicSetAppServer(null, msgs);
      case MyACDSLPackage.CONFIGURATION__COMMON_PARAMS:
        return ((InternalEList<?>)getCommonParams()).basicRemove(otherEnd, msgs);
      case MyACDSLPackage.CONFIGURATION__CONFIGURATIONS:
        return ((InternalEList<?>)getConfigurations()).basicRemove(otherEnd, msgs);
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
      case MyACDSLPackage.CONFIGURATION__APP_NAME:
        return getAppName();
      case MyACDSLPackage.CONFIGURATION__OS:
        return getOs();
      case MyACDSLPackage.CONFIGURATION__APP_SERVER:
        return getAppServer();
      case MyACDSLPackage.CONFIGURATION__COMMON_PARAMS:
        return getCommonParams();
      case MyACDSLPackage.CONFIGURATION__CONFIGURATIONS:
        return getConfigurations();
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
      case MyACDSLPackage.CONFIGURATION__APP_NAME:
        setAppName((String)newValue);
        return;
      case MyACDSLPackage.CONFIGURATION__OS:
        setOs((SupportedOs)newValue);
        return;
      case MyACDSLPackage.CONFIGURATION__APP_SERVER:
        setAppServer((AppServerInfo)newValue);
        return;
      case MyACDSLPackage.CONFIGURATION__COMMON_PARAMS:
        getCommonParams().clear();
        getCommonParams().addAll((Collection<? extends CommonParam>)newValue);
        return;
      case MyACDSLPackage.CONFIGURATION__CONFIGURATIONS:
        getConfigurations().clear();
        getConfigurations().addAll((Collection<? extends ConfigurationType>)newValue);
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
      case MyACDSLPackage.CONFIGURATION__APP_NAME:
        setAppName(APP_NAME_EDEFAULT);
        return;
      case MyACDSLPackage.CONFIGURATION__OS:
        setOs(OS_EDEFAULT);
        return;
      case MyACDSLPackage.CONFIGURATION__APP_SERVER:
        setAppServer((AppServerInfo)null);
        return;
      case MyACDSLPackage.CONFIGURATION__COMMON_PARAMS:
        getCommonParams().clear();
        return;
      case MyACDSLPackage.CONFIGURATION__CONFIGURATIONS:
        getConfigurations().clear();
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
      case MyACDSLPackage.CONFIGURATION__APP_NAME:
        return APP_NAME_EDEFAULT == null ? appName != null : !APP_NAME_EDEFAULT.equals(appName);
      case MyACDSLPackage.CONFIGURATION__OS:
        return os != OS_EDEFAULT;
      case MyACDSLPackage.CONFIGURATION__APP_SERVER:
        return appServer != null;
      case MyACDSLPackage.CONFIGURATION__COMMON_PARAMS:
        return commonParams != null && !commonParams.isEmpty();
      case MyACDSLPackage.CONFIGURATION__CONFIGURATIONS:
        return configurations != null && !configurations.isEmpty();
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
    result.append(" (appName: ");
    result.append(appName);
    result.append(", os: ");
    result.append(os);
    result.append(')');
    return result.toString();
  }

} //ConfigurationImpl
