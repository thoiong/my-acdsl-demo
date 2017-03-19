/**
 * generated by Xtext 2.11.0
 */
package org.acac.demo.acdsl.myACDSL.impl;

import org.acac.demo.acdsl.myACDSL.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MyACDSLFactoryImpl extends EFactoryImpl implements MyACDSLFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static MyACDSLFactory init()
  {
    try
    {
      MyACDSLFactory theMyACDSLFactory = (MyACDSLFactory)EPackage.Registry.INSTANCE.getEFactory(MyACDSLPackage.eNS_URI);
      if (theMyACDSLFactory != null)
      {
        return theMyACDSLFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new MyACDSLFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MyACDSLFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case MyACDSLPackage.MODEL: return createModel();
      case MyACDSLPackage.ABSTRACT_ELEMENT: return createAbstractElement();
      case MyACDSLPackage.CONFIGURATION: return createConfiguration();
      case MyACDSLPackage.DEPLOYMENT: return createDeployment();
      case MyACDSLPackage.OPERATION: return createOperation();
      case MyACDSLPackage.APP_SERVER_INFO: return createAppServerInfo();
      case MyACDSLPackage.COMMON_PARAM: return createCommonParam();
      case MyACDSLPackage.CONFIGURATION_TYPE: return createConfigurationType();
      case MyACDSLPackage.DATA_SOURCE: return createDataSource();
      case MyACDSLPackage.JDBC_PROVIDER: return createJdbcProvider();
      case MyACDSLPackage.JAAS_ALIAS: return createJAASAlias();
      case MyACDSLPackage.SERVER_JVM_SETTING: return createServerJvmSetting();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case MyACDSLPackage.SUPPORTED_CONTAINER:
        return createSupportedContainerFromString(eDataType, initialValue);
      case MyACDSLPackage.SUPPORTED_CONTAINER_OPERATIONS:
        return createSupportedContainerOperationsFromString(eDataType, initialValue);
      case MyACDSLPackage.SUPPORTED_OS:
        return createSupportedOsFromString(eDataType, initialValue);
      case MyACDSLPackage.DEPLOYMENT_OP:
        return createDeploymentOpFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case MyACDSLPackage.SUPPORTED_CONTAINER:
        return convertSupportedContainerToString(eDataType, instanceValue);
      case MyACDSLPackage.SUPPORTED_CONTAINER_OPERATIONS:
        return convertSupportedContainerOperationsToString(eDataType, instanceValue);
      case MyACDSLPackage.SUPPORTED_OS:
        return convertSupportedOsToString(eDataType, instanceValue);
      case MyACDSLPackage.DEPLOYMENT_OP:
        return convertDeploymentOpToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractElement createAbstractElement()
  {
    AbstractElementImpl abstractElement = new AbstractElementImpl();
    return abstractElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Configuration createConfiguration()
  {
    ConfigurationImpl configuration = new ConfigurationImpl();
    return configuration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Deployment createDeployment()
  {
    DeploymentImpl deployment = new DeploymentImpl();
    return deployment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Operation createOperation()
  {
    OperationImpl operation = new OperationImpl();
    return operation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AppServerInfo createAppServerInfo()
  {
    AppServerInfoImpl appServerInfo = new AppServerInfoImpl();
    return appServerInfo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CommonParam createCommonParam()
  {
    CommonParamImpl commonParam = new CommonParamImpl();
    return commonParam;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConfigurationType createConfigurationType()
  {
    ConfigurationTypeImpl configurationType = new ConfigurationTypeImpl();
    return configurationType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataSource createDataSource()
  {
    DataSourceImpl dataSource = new DataSourceImpl();
    return dataSource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JdbcProvider createJdbcProvider()
  {
    JdbcProviderImpl jdbcProvider = new JdbcProviderImpl();
    return jdbcProvider;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JAASAlias createJAASAlias()
  {
    JAASAliasImpl jaasAlias = new JAASAliasImpl();
    return jaasAlias;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ServerJvmSetting createServerJvmSetting()
  {
    ServerJvmSettingImpl serverJvmSetting = new ServerJvmSettingImpl();
    return serverJvmSetting;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SupportedContainer createSupportedContainerFromString(EDataType eDataType, String initialValue)
  {
    SupportedContainer result = SupportedContainer.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertSupportedContainerToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SupportedContainerOperations createSupportedContainerOperationsFromString(EDataType eDataType, String initialValue)
  {
    SupportedContainerOperations result = SupportedContainerOperations.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertSupportedContainerOperationsToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SupportedOs createSupportedOsFromString(EDataType eDataType, String initialValue)
  {
    SupportedOs result = SupportedOs.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertSupportedOsToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DeploymentOp createDeploymentOpFromString(EDataType eDataType, String initialValue)
  {
    DeploymentOp result = DeploymentOp.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertDeploymentOpToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MyACDSLPackage getMyACDSLPackage()
  {
    return (MyACDSLPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static MyACDSLPackage getPackage()
  {
    return MyACDSLPackage.eINSTANCE;
  }

} //MyACDSLFactoryImpl
