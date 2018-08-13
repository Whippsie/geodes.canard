/**
 */
package canard;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see canard.CanardFactory
 * @model kind="package"
 * @generated
 */
public interface CanardPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "canard";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://iro.umontreal.ca/canard";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "canard";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CanardPackage eINSTANCE = canard.impl.CanardPackageImpl.init();

	/**
	 * The meta object id for the '{@link canard.impl.CanardModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see canard.impl.CanardModelImpl
	 * @see canard.impl.CanardPackageImpl#getCanardModel()
	 * @generated
	 */
	int CANARD_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANARD_MODEL__LINKS = 0;

	/**
	 * The feature id for the '<em><b>Blocks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANARD_MODEL__BLOCKS = 1;

	/**
	 * The feature id for the '<em><b>Flags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANARD_MODEL__FLAGS = 2;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANARD_MODEL__CONSTRAINTS = 3;

	/**
	 * The feature id for the '<em><b>Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANARD_MODEL__CONFIGURATIONS = 4;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANARD_MODEL_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link canard.impl.TopicImpl <em>Topic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see canard.impl.TopicImpl
	 * @see canard.impl.CanardPackageImpl#getTopic()
	 * @generated
	 */
	int TOPIC = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC__NAME = 0;

	/**
	 * The feature id for the '<em><b>Unique ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC__UNIQUE_ID = 1;

	/**
	 * The number of structural features of the '<em>Topic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link canard.impl.FlagImpl <em>Flag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see canard.impl.FlagImpl
	 * @see canard.impl.CanardPackageImpl#getFlag()
	 * @generated
	 */
	int FLAG = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLAG__NAME = 0;

	/**
	 * The feature id for the '<em><b>Child</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLAG__CHILD = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLAG__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLAG__IS_ABSTRACT = 3;

	/**
	 * The number of structural features of the '<em>Flag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLAG_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link canard.impl.BlockImpl <em>Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see canard.impl.BlockImpl
	 * @see canard.impl.CanardPackageImpl#getBlock()
	 * @generated
	 */
	int BLOCK = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__NAME = 0;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__ATTRIBUTES = 1;

	/**
	 * The feature id for the '<em><b>Topics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__TOPICS = 2;

	/**
	 * The number of structural features of the '<em>Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link canard.impl.RelImpl <em>Rel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see canard.impl.RelImpl
	 * @see canard.impl.CanardPackageImpl#getRel()
	 * @generated
	 */
	int REL = 4;

	/**
	 * The feature id for the '<em><b>Src</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REL__SRC = 0;

	/**
	 * The feature id for the '<em><b>Tgt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REL__TGT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REL__NAME = 2;

	/**
	 * The number of structural features of the '<em>Rel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REL_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link canard.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see canard.impl.AttributeImpl
	 * @see canard.impl.CanardPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link canard.impl.ConfigurationImpl <em>Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see canard.impl.ConfigurationImpl
	 * @see canard.impl.CanardPackageImpl#getConfiguration()
	 * @generated
	 */
	int CONFIGURATION = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Configflags</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__CONFIGFLAGS = 1;

	/**
	 * The number of structural features of the '<em>Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link canard.impl.ConstraintImpl <em>Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see canard.impl.ConstraintImpl
	 * @see canard.impl.CanardPackageImpl#getConstraint()
	 * @generated
	 */
	int CONSTRAINT = 7;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__FEATURE = 0;

	/**
	 * The feature id for the '<em><b>Cons flags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__CONS_FLAGS = 1;

	/**
	 * The number of structural features of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link canard.impl.FlagToEBooleanMapImpl <em>Flag To EBoolean Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see canard.impl.FlagToEBooleanMapImpl
	 * @see canard.impl.CanardPackageImpl#getFlagToEBooleanMap()
	 * @generated
	 */
	int FLAG_TO_EBOOLEAN_MAP = 8;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLAG_TO_EBOOLEAN_MAP__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Key</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLAG_TO_EBOOLEAN_MAP__KEY = 1;

	/**
	 * The number of structural features of the '<em>Flag To EBoolean Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLAG_TO_EBOOLEAN_MAP_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link canard.FeatureRelationType <em>Feature Relation Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see canard.FeatureRelationType
	 * @see canard.impl.CanardPackageImpl#getFeatureRelationType()
	 * @generated
	 */
	int FEATURE_RELATION_TYPE = 9;


	/**
	 * The meta object id for the '{@link canard.Boolnull <em>Boolnull</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see canard.Boolnull
	 * @see canard.impl.CanardPackageImpl#getBoolnull()
	 * @generated
	 */
	int BOOLNULL = 10;

	/**
	 * The meta object id for the '{@link canard.ValueType <em>Value Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see canard.ValueType
	 * @see canard.impl.CanardPackageImpl#getValueType()
	 * @generated
	 */
	int VALUE_TYPE = 11;


	/**
	 * Returns the meta object for class '{@link canard.CanardModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see canard.CanardModel
	 * @generated
	 */
	EClass getCanardModel();

	/**
	 * Returns the meta object for the containment reference list '{@link canard.CanardModel#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Links</em>'.
	 * @see canard.CanardModel#getLinks()
	 * @see #getCanardModel()
	 * @generated
	 */
	EReference getCanardModel_Links();

	/**
	 * Returns the meta object for the containment reference list '{@link canard.CanardModel#getBlocks <em>Blocks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Blocks</em>'.
	 * @see canard.CanardModel#getBlocks()
	 * @see #getCanardModel()
	 * @generated
	 */
	EReference getCanardModel_Blocks();

	/**
	 * Returns the meta object for the containment reference list '{@link canard.CanardModel#getFlags <em>Flags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Flags</em>'.
	 * @see canard.CanardModel#getFlags()
	 * @see #getCanardModel()
	 * @generated
	 */
	EReference getCanardModel_Flags();

	/**
	 * Returns the meta object for the containment reference list '{@link canard.CanardModel#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraints</em>'.
	 * @see canard.CanardModel#getConstraints()
	 * @see #getCanardModel()
	 * @generated
	 */
	EReference getCanardModel_Constraints();

	/**
	 * Returns the meta object for the containment reference list '{@link canard.CanardModel#getConfigurations <em>Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Configurations</em>'.
	 * @see canard.CanardModel#getConfigurations()
	 * @see #getCanardModel()
	 * @generated
	 */
	EReference getCanardModel_Configurations();

	/**
	 * Returns the meta object for class '{@link canard.Topic <em>Topic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Topic</em>'.
	 * @see canard.Topic
	 * @generated
	 */
	EClass getTopic();

	/**
	 * Returns the meta object for the attribute '{@link canard.Topic#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see canard.Topic#getName()
	 * @see #getTopic()
	 * @generated
	 */
	EAttribute getTopic_Name();

	/**
	 * Returns the meta object for the attribute '{@link canard.Topic#getUniqueID <em>Unique ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unique ID</em>'.
	 * @see canard.Topic#getUniqueID()
	 * @see #getTopic()
	 * @generated
	 */
	EAttribute getTopic_UniqueID();

	/**
	 * Returns the meta object for class '{@link canard.Flag <em>Flag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flag</em>'.
	 * @see canard.Flag
	 * @generated
	 */
	EClass getFlag();

	/**
	 * Returns the meta object for the attribute '{@link canard.Flag#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see canard.Flag#getName()
	 * @see #getFlag()
	 * @generated
	 */
	EAttribute getFlag_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link canard.Flag#getChild <em>Child</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Child</em>'.
	 * @see canard.Flag#getChild()
	 * @see #getFlag()
	 * @generated
	 */
	EReference getFlag_Child();

	/**
	 * Returns the meta object for the attribute '{@link canard.Flag#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see canard.Flag#getType()
	 * @see #getFlag()
	 * @generated
	 */
	EAttribute getFlag_Type();

	/**
	 * Returns the meta object for the attribute '{@link canard.Flag#isIsAbstract <em>Is Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Abstract</em>'.
	 * @see canard.Flag#isIsAbstract()
	 * @see #getFlag()
	 * @generated
	 */
	EAttribute getFlag_IsAbstract();

	/**
	 * Returns the meta object for class '{@link canard.Block <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block</em>'.
	 * @see canard.Block
	 * @generated
	 */
	EClass getBlock();

	/**
	 * Returns the meta object for the attribute '{@link canard.Block#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see canard.Block#getName()
	 * @see #getBlock()
	 * @generated
	 */
	EAttribute getBlock_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link canard.Block#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see canard.Block#getAttributes()
	 * @see #getBlock()
	 * @generated
	 */
	EReference getBlock_Attributes();

	/**
	 * Returns the meta object for the containment reference list '{@link canard.Block#getTopics <em>Topics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Topics</em>'.
	 * @see canard.Block#getTopics()
	 * @see #getBlock()
	 * @generated
	 */
	EReference getBlock_Topics();

	/**
	 * Returns the meta object for class '{@link canard.Rel <em>Rel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rel</em>'.
	 * @see canard.Rel
	 * @generated
	 */
	EClass getRel();

	/**
	 * Returns the meta object for the reference '{@link canard.Rel#getSrc <em>Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Src</em>'.
	 * @see canard.Rel#getSrc()
	 * @see #getRel()
	 * @generated
	 */
	EReference getRel_Src();

	/**
	 * Returns the meta object for the reference '{@link canard.Rel#getTgt <em>Tgt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tgt</em>'.
	 * @see canard.Rel#getTgt()
	 * @see #getRel()
	 * @generated
	 */
	EReference getRel_Tgt();

	/**
	 * Returns the meta object for the attribute '{@link canard.Rel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see canard.Rel#getName()
	 * @see #getRel()
	 * @generated
	 */
	EAttribute getRel_Name();

	/**
	 * Returns the meta object for class '{@link canard.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see canard.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the attribute '{@link canard.Attribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see canard.Attribute#getName()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Name();

	/**
	 * Returns the meta object for the attribute '{@link canard.Attribute#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see canard.Attribute#getValue()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Value();

	/**
	 * Returns the meta object for class '{@link canard.Configuration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration</em>'.
	 * @see canard.Configuration
	 * @generated
	 */
	EClass getConfiguration();

	/**
	 * Returns the meta object for the attribute '{@link canard.Configuration#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see canard.Configuration#getName()
	 * @see #getConfiguration()
	 * @generated
	 */
	EAttribute getConfiguration_Name();

	/**
	 * Returns the meta object for the map '{@link canard.Configuration#getConfigflags <em>Configflags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Configflags</em>'.
	 * @see canard.Configuration#getConfigflags()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_Configflags();

	/**
	 * Returns the meta object for class '{@link canard.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint</em>'.
	 * @see canard.Constraint
	 * @generated
	 */
	EClass getConstraint();

	/**
	 * Returns the meta object for the attribute '{@link canard.Constraint#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feature</em>'.
	 * @see canard.Constraint#getFeature()
	 * @see #getConstraint()
	 * @generated
	 */
	EAttribute getConstraint_Feature();

	/**
	 * Returns the meta object for the reference list '{@link canard.Constraint#getCons_flags <em>Cons flags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Cons flags</em>'.
	 * @see canard.Constraint#getCons_flags()
	 * @see #getConstraint()
	 * @generated
	 */
	EReference getConstraint_Cons_flags();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>Flag To EBoolean Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flag To EBoolean Map</em>'.
	 * @see java.util.Map.Entry
	 * @model features="value key" 
	 *        valueDataType="org.eclipse.emf.ecore.EString"
	 *        keyType="canard.Flag"
	 * @generated
	 */
	EClass getFlagToEBooleanMap();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getFlagToEBooleanMap()
	 * @generated
	 */
	EAttribute getFlagToEBooleanMap_Value();

	/**
	 * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getFlagToEBooleanMap()
	 * @generated
	 */
	EReference getFlagToEBooleanMap_Key();

	/**
	 * Returns the meta object for enum '{@link canard.FeatureRelationType <em>Feature Relation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Feature Relation Type</em>'.
	 * @see canard.FeatureRelationType
	 * @generated
	 */
	EEnum getFeatureRelationType();

	/**
	 * Returns the meta object for enum '{@link canard.Boolnull <em>Boolnull</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Boolnull</em>'.
	 * @see canard.Boolnull
	 * @generated
	 */
	EEnum getBoolnull();

	/**
	 * Returns the meta object for enum '{@link canard.ValueType <em>Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Value Type</em>'.
	 * @see canard.ValueType
	 * @generated
	 */
	EEnum getValueType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CanardFactory getCanardFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link canard.impl.CanardModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see canard.impl.CanardModelImpl
		 * @see canard.impl.CanardPackageImpl#getCanardModel()
		 * @generated
		 */
		EClass CANARD_MODEL = eINSTANCE.getCanardModel();

		/**
		 * The meta object literal for the '<em><b>Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CANARD_MODEL__LINKS = eINSTANCE.getCanardModel_Links();

		/**
		 * The meta object literal for the '<em><b>Blocks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CANARD_MODEL__BLOCKS = eINSTANCE.getCanardModel_Blocks();

		/**
		 * The meta object literal for the '<em><b>Flags</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CANARD_MODEL__FLAGS = eINSTANCE.getCanardModel_Flags();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CANARD_MODEL__CONSTRAINTS = eINSTANCE.getCanardModel_Constraints();

		/**
		 * The meta object literal for the '<em><b>Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CANARD_MODEL__CONFIGURATIONS = eINSTANCE.getCanardModel_Configurations();

		/**
		 * The meta object literal for the '{@link canard.impl.TopicImpl <em>Topic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see canard.impl.TopicImpl
		 * @see canard.impl.CanardPackageImpl#getTopic()
		 * @generated
		 */
		EClass TOPIC = eINSTANCE.getTopic();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOPIC__NAME = eINSTANCE.getTopic_Name();

		/**
		 * The meta object literal for the '<em><b>Unique ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOPIC__UNIQUE_ID = eINSTANCE.getTopic_UniqueID();

		/**
		 * The meta object literal for the '{@link canard.impl.FlagImpl <em>Flag</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see canard.impl.FlagImpl
		 * @see canard.impl.CanardPackageImpl#getFlag()
		 * @generated
		 */
		EClass FLAG = eINSTANCE.getFlag();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLAG__NAME = eINSTANCE.getFlag_Name();

		/**
		 * The meta object literal for the '<em><b>Child</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLAG__CHILD = eINSTANCE.getFlag_Child();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLAG__TYPE = eINSTANCE.getFlag_Type();

		/**
		 * The meta object literal for the '<em><b>Is Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLAG__IS_ABSTRACT = eINSTANCE.getFlag_IsAbstract();

		/**
		 * The meta object literal for the '{@link canard.impl.BlockImpl <em>Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see canard.impl.BlockImpl
		 * @see canard.impl.CanardPackageImpl#getBlock()
		 * @generated
		 */
		EClass BLOCK = eINSTANCE.getBlock();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOCK__NAME = eINSTANCE.getBlock_Name();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK__ATTRIBUTES = eINSTANCE.getBlock_Attributes();

		/**
		 * The meta object literal for the '<em><b>Topics</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK__TOPICS = eINSTANCE.getBlock_Topics();

		/**
		 * The meta object literal for the '{@link canard.impl.RelImpl <em>Rel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see canard.impl.RelImpl
		 * @see canard.impl.CanardPackageImpl#getRel()
		 * @generated
		 */
		EClass REL = eINSTANCE.getRel();

		/**
		 * The meta object literal for the '<em><b>Src</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REL__SRC = eINSTANCE.getRel_Src();

		/**
		 * The meta object literal for the '<em><b>Tgt</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REL__TGT = eINSTANCE.getRel_Tgt();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REL__NAME = eINSTANCE.getRel_Name();

		/**
		 * The meta object literal for the '{@link canard.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see canard.impl.AttributeImpl
		 * @see canard.impl.CanardPackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__NAME = eINSTANCE.getAttribute_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__VALUE = eINSTANCE.getAttribute_Value();

		/**
		 * The meta object literal for the '{@link canard.impl.ConfigurationImpl <em>Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see canard.impl.ConfigurationImpl
		 * @see canard.impl.CanardPackageImpl#getConfiguration()
		 * @generated
		 */
		EClass CONFIGURATION = eINSTANCE.getConfiguration();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURATION__NAME = eINSTANCE.getConfiguration_Name();

		/**
		 * The meta object literal for the '<em><b>Configflags</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__CONFIGFLAGS = eINSTANCE.getConfiguration_Configflags();

		/**
		 * The meta object literal for the '{@link canard.impl.ConstraintImpl <em>Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see canard.impl.ConstraintImpl
		 * @see canard.impl.CanardPackageImpl#getConstraint()
		 * @generated
		 */
		EClass CONSTRAINT = eINSTANCE.getConstraint();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINT__FEATURE = eINSTANCE.getConstraint_Feature();

		/**
		 * The meta object literal for the '<em><b>Cons flags</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINT__CONS_FLAGS = eINSTANCE.getConstraint_Cons_flags();

		/**
		 * The meta object literal for the '{@link canard.impl.FlagToEBooleanMapImpl <em>Flag To EBoolean Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see canard.impl.FlagToEBooleanMapImpl
		 * @see canard.impl.CanardPackageImpl#getFlagToEBooleanMap()
		 * @generated
		 */
		EClass FLAG_TO_EBOOLEAN_MAP = eINSTANCE.getFlagToEBooleanMap();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLAG_TO_EBOOLEAN_MAP__VALUE = eINSTANCE.getFlagToEBooleanMap_Value();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLAG_TO_EBOOLEAN_MAP__KEY = eINSTANCE.getFlagToEBooleanMap_Key();

		/**
		 * The meta object literal for the '{@link canard.FeatureRelationType <em>Feature Relation Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see canard.FeatureRelationType
		 * @see canard.impl.CanardPackageImpl#getFeatureRelationType()
		 * @generated
		 */
		EEnum FEATURE_RELATION_TYPE = eINSTANCE.getFeatureRelationType();

		/**
		 * The meta object literal for the '{@link canard.Boolnull <em>Boolnull</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see canard.Boolnull
		 * @see canard.impl.CanardPackageImpl#getBoolnull()
		 * @generated
		 */
		EEnum BOOLNULL = eINSTANCE.getBoolnull();

		/**
		 * The meta object literal for the '{@link canard.ValueType <em>Value Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see canard.ValueType
		 * @see canard.impl.CanardPackageImpl#getValueType()
		 * @generated
		 */
		EEnum VALUE_TYPE = eINSTANCE.getValueType();

	}

} //CanardPackage
