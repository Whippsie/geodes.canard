/**
 */
package canard.impl;

import canard.AbstractFeature;
import canard.Block;
import canard.CanardModel;
import canard.CanardPackage;
import canard.Configuration;
import canard.Rel;
import canard.Relation;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link canard.impl.CanardModelImpl#getLinks <em>Links</em>}</li>
 *   <li>{@link canard.impl.CanardModelImpl#getBlocks <em>Blocks</em>}</li>
 *   <li>{@link canard.impl.CanardModelImpl#getConfigurations <em>Configurations</em>}</li>
 *   <li>{@link canard.impl.CanardModelImpl#getFeatures <em>Features</em>}</li>
 *   <li>{@link canard.impl.CanardModelImpl#getRelations <em>Relations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CanardModelImpl extends EObjectImpl implements CanardModel {
	/**
	 * The cached value of the '{@link #getLinks() <em>Links</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<Rel> links;

	/**
	 * The cached value of the '{@link #getBlocks() <em>Blocks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlocks()
	 * @generated
	 * @ordered
	 */
	protected EList<Block> blocks;

	/**
	 * The cached value of the '{@link #getConfigurations() <em>Configurations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigurations()
	 * @generated
	 * @ordered
	 */
	protected EList<Configuration> configurations;

	/**
	 * The cached value of the '{@link #getFeatures() <em>Features</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractFeature> features;

	/**
	 * The cached value of the '{@link #getRelations() <em>Relations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelations()
	 * @generated
	 * @ordered
	 */
	protected EList<Relation> relations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CanardModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CanardPackage.Literals.CANARD_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Rel> getLinks() {
		if (links == null) {
			links = new EObjectContainmentEList<Rel>(Rel.class, this, CanardPackage.CANARD_MODEL__LINKS);
		}
		return links;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Block> getBlocks() {
		if (blocks == null) {
			blocks = new EObjectContainmentEList<Block>(Block.class, this, CanardPackage.CANARD_MODEL__BLOCKS);
		}
		return blocks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Configuration> getConfigurations() {
		if (configurations == null) {
			configurations = new EObjectContainmentEList<Configuration>(Configuration.class, this, CanardPackage.CANARD_MODEL__CONFIGURATIONS);
		}
		return configurations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractFeature> getFeatures() {
		if (features == null) {
			features = new EObjectContainmentEList<AbstractFeature>(AbstractFeature.class, this, CanardPackage.CANARD_MODEL__FEATURES);
		}
		return features;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Relation> getRelations() {
		if (relations == null) {
			relations = new EObjectContainmentEList<Relation>(Relation.class, this, CanardPackage.CANARD_MODEL__RELATIONS);
		}
		return relations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CanardPackage.CANARD_MODEL__LINKS:
				return ((InternalEList<?>)getLinks()).basicRemove(otherEnd, msgs);
			case CanardPackage.CANARD_MODEL__BLOCKS:
				return ((InternalEList<?>)getBlocks()).basicRemove(otherEnd, msgs);
			case CanardPackage.CANARD_MODEL__CONFIGURATIONS:
				return ((InternalEList<?>)getConfigurations()).basicRemove(otherEnd, msgs);
			case CanardPackage.CANARD_MODEL__FEATURES:
				return ((InternalEList<?>)getFeatures()).basicRemove(otherEnd, msgs);
			case CanardPackage.CANARD_MODEL__RELATIONS:
				return ((InternalEList<?>)getRelations()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CanardPackage.CANARD_MODEL__LINKS:
				return getLinks();
			case CanardPackage.CANARD_MODEL__BLOCKS:
				return getBlocks();
			case CanardPackage.CANARD_MODEL__CONFIGURATIONS:
				return getConfigurations();
			case CanardPackage.CANARD_MODEL__FEATURES:
				return getFeatures();
			case CanardPackage.CANARD_MODEL__RELATIONS:
				return getRelations();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CanardPackage.CANARD_MODEL__LINKS:
				getLinks().clear();
				getLinks().addAll((Collection<? extends Rel>)newValue);
				return;
			case CanardPackage.CANARD_MODEL__BLOCKS:
				getBlocks().clear();
				getBlocks().addAll((Collection<? extends Block>)newValue);
				return;
			case CanardPackage.CANARD_MODEL__CONFIGURATIONS:
				getConfigurations().clear();
				getConfigurations().addAll((Collection<? extends Configuration>)newValue);
				return;
			case CanardPackage.CANARD_MODEL__FEATURES:
				getFeatures().clear();
				getFeatures().addAll((Collection<? extends AbstractFeature>)newValue);
				return;
			case CanardPackage.CANARD_MODEL__RELATIONS:
				getRelations().clear();
				getRelations().addAll((Collection<? extends Relation>)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case CanardPackage.CANARD_MODEL__LINKS:
				getLinks().clear();
				return;
			case CanardPackage.CANARD_MODEL__BLOCKS:
				getBlocks().clear();
				return;
			case CanardPackage.CANARD_MODEL__CONFIGURATIONS:
				getConfigurations().clear();
				return;
			case CanardPackage.CANARD_MODEL__FEATURES:
				getFeatures().clear();
				return;
			case CanardPackage.CANARD_MODEL__RELATIONS:
				getRelations().clear();
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CanardPackage.CANARD_MODEL__LINKS:
				return links != null && !links.isEmpty();
			case CanardPackage.CANARD_MODEL__BLOCKS:
				return blocks != null && !blocks.isEmpty();
			case CanardPackage.CANARD_MODEL__CONFIGURATIONS:
				return configurations != null && !configurations.isEmpty();
			case CanardPackage.CANARD_MODEL__FEATURES:
				return features != null && !features.isEmpty();
			case CanardPackage.CANARD_MODEL__RELATIONS:
				return relations != null && !relations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CanardModelImpl
