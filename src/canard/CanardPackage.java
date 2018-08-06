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
	 * The feature id for the '<em><b>Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANARD_MODEL__CONFIGURATIONS = 2;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANARD_MODEL__FEATURES = 3;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANARD_MODEL__RELATIONS = 4;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANARD_MODEL_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link canard.impl.AbstractFeatureImpl <em>Abstract Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see canard.impl.AbstractFeatureImpl
	 * @see canard.impl.CanardPackageImpl#getAbstractFeature()
	 * @generated
	 */
	int ABSTRACT_FEATURE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FEATURE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Abstract Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FEATURE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link canard.impl.FlagImpl <em>Flag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see canard.impl.FlagImpl
	 * @see canard.impl.CanardPackageImpl#getFlag()
	 * @generated
	 */
	int FLAG = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLAG__NAME = ABSTRACT_FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLAG__VALUE = ABSTRACT_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Flag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLAG_FEATURE_COUNT = ABSTRACT_FEATURE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link canard.impl.RelationImpl <em>Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see canard.impl.RelationImpl
	 * @see canard.impl.CanardPackageImpl#getRelation()
	 * @generated
	 */
	int RELATION = 2;

	/**
	 * The feature id for the '<em><b>Name Parent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__NAME_PARENT = 0;

	/**
	 * The number of structural features of the '<em>Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link canard.impl.BlockImpl <em>Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see canard.impl.BlockImpl
	 * @see canard.impl.CanardPackageImpl#getBlock()
	 * @generated
	 */
	int BLOCK = 4;

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
	 * The number of structural features of the '<em>Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link canard.impl.RelImpl <em>Rel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see canard.impl.RelImpl
	 * @see canard.impl.CanardPackageImpl#getRel()
	 * @generated
	 */
	int REL = 5;

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
	int ATTRIBUTE = 6;

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
	int CONFIGURATION = 7;

	/**
	 * The feature id for the '<em><b>Flags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__FLAGS = 0;

	/**
	 * The number of structural features of the '<em>Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link canard.FlagValues <em>Flag Values</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see canard.FlagValues
	 * @see canard.impl.CanardPackageImpl#getFlagValues()
	 * @generated
	 */
	int FLAG_VALUES = 8;

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
	 * Returns the meta object for the containment reference list '{@link canard.CanardModel#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Features</em>'.
	 * @see canard.CanardModel#getFeatures()
	 * @see #getCanardModel()
	 * @generated
	 */
	EReference getCanardModel_Features();

	/**
	 * Returns the meta object for the containment reference list '{@link canard.CanardModel#getRelations <em>Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relations</em>'.
	 * @see canard.CanardModel#getRelations()
	 * @see #getCanardModel()
	 * @generated
	 */
	EReference getCanardModel_Relations();

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
	 * Returns the meta object for the attribute '{@link canard.Flag#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see canard.Flag#getValue()
	 * @see #getFlag()
	 * @generated
	 */
	EAttribute getFlag_Value();

	/**
	 * Returns the meta object for class '{@link canard.Relation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation</em>'.
	 * @see canard.Relation
	 * @generated
	 */
	EClass getRelation();

	/**
	 * Returns the meta object for the attribute '{@link canard.Relation#getNameParent <em>Name Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Parent</em>'.
	 * @see canard.Relation#getNameParent()
	 * @see #getRelation()
	 * @generated
	 */
	EAttribute getRelation_NameParent();

	/**
	 * Returns the meta object for class '{@link canard.AbstractFeature <em>Abstract Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Feature</em>'.
	 * @see canard.AbstractFeature
	 * @generated
	 */
	EClass getAbstractFeature();

	/**
	 * Returns the meta object for the attribute '{@link canard.AbstractFeature#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see canard.AbstractFeature#getName()
	 * @see #getAbstractFeature()
	 * @generated
	 */
	EAttribute getAbstractFeature_Name();

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
	 * Returns the meta object for the reference list '{@link canard.Configuration#getFlags <em>Flags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Flags</em>'.
	 * @see canard.Configuration#getFlags()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_Flags();

	/**
	 * Returns the meta object for enum '{@link canard.FlagValues <em>Flag Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Flag Values</em>'.
	 * @see canard.FlagValues
	 * @generated
	 */
	EEnum getFlagValues();

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
		 * The meta object literal for the '<em><b>Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CANARD_MODEL__CONFIGURATIONS = eINSTANCE.getCanardModel_Configurations();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CANARD_MODEL__FEATURES = eINSTANCE.getCanardModel_Features();

		/**
		 * The meta object literal for the '<em><b>Relations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CANARD_MODEL__RELATIONS = eINSTANCE.getCanardModel_Relations();

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
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLAG__VALUE = eINSTANCE.getFlag_Value();

		/**
		 * The meta object literal for the '{@link canard.impl.RelationImpl <em>Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see canard.impl.RelationImpl
		 * @see canard.impl.CanardPackageImpl#getRelation()
		 * @generated
		 */
		EClass RELATION = eINSTANCE.getRelation();

		/**
		 * The meta object literal for the '<em><b>Name Parent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION__NAME_PARENT = eINSTANCE.getRelation_NameParent();

		/**
		 * The meta object literal for the '{@link canard.impl.AbstractFeatureImpl <em>Abstract Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see canard.impl.AbstractFeatureImpl
		 * @see canard.impl.CanardPackageImpl#getAbstractFeature()
		 * @generated
		 */
		EClass ABSTRACT_FEATURE = eINSTANCE.getAbstractFeature();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_FEATURE__NAME = eINSTANCE.getAbstractFeature_Name();

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
		 * The meta object literal for the '<em><b>Flags</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__FLAGS = eINSTANCE.getConfiguration_Flags();

		/**
		 * The meta object literal for the '{@link canard.FlagValues <em>Flag Values</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see canard.FlagValues
		 * @see canard.impl.CanardPackageImpl#getFlagValues()
		 * @generated
		 */
		EEnum FLAG_VALUES = eINSTANCE.getFlagValues();

		/**
		 * The meta object literal for the '{@link canard.FeatureRelationType <em>Feature Relation Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see canard.FeatureRelationType
		 * @see canard.impl.CanardPackageImpl#getFeatureRelationType()
		 * @generated
		 */
		EEnum FEATURE_RELATION_TYPE = eINSTANCE.getFeatureRelationType();

	}

} //CanardPackage
