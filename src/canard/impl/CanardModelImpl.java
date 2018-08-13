/**
 */
package canard.impl;

import canard.Block;
import canard.CanardModel;
import canard.CanardPackage;
import canard.Configuration;
import canard.Constraint;
import canard.Flag;
import canard.Rel;

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
 *   <li>{@link canard.impl.CanardModelImpl#getFlags <em>Flags</em>}</li>
 *   <li>{@link canard.impl.CanardModelImpl#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link canard.impl.CanardModelImpl#getConfigurations <em>Configurations</em>}</li>
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
	 * The cached value of the '{@link #getFlags() <em>Flags</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlags()
	 * @generated
	 * @ordered
	 */
	protected EList<Flag> flags;

	/**
	 * The cached value of the '{@link #getConstraints() <em>Constraints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<Constraint> constraints;

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
	public EList<Flag> getFlags() {
		if (flags == null) {
			flags = new EObjectContainmentEList<Flag>(Flag.class, this, CanardPackage.CANARD_MODEL__FLAGS);
		}
		return flags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constraint> getConstraints() {
		if (constraints == null) {
			constraints = new EObjectContainmentEList<Constraint>(Constraint.class, this, CanardPackage.CANARD_MODEL__CONSTRAINTS);
		}
		return constraints;
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
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CanardPackage.CANARD_MODEL__LINKS:
				return ((InternalEList<?>)getLinks()).basicRemove(otherEnd, msgs);
			case CanardPackage.CANARD_MODEL__BLOCKS:
				return ((InternalEList<?>)getBlocks()).basicRemove(otherEnd, msgs);
			case CanardPackage.CANARD_MODEL__FLAGS:
				return ((InternalEList<?>)getFlags()).basicRemove(otherEnd, msgs);
			case CanardPackage.CANARD_MODEL__CONSTRAINTS:
				return ((InternalEList<?>)getConstraints()).basicRemove(otherEnd, msgs);
			case CanardPackage.CANARD_MODEL__CONFIGURATIONS:
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CanardPackage.CANARD_MODEL__LINKS:
				return getLinks();
			case CanardPackage.CANARD_MODEL__BLOCKS:
				return getBlocks();
			case CanardPackage.CANARD_MODEL__FLAGS:
				return getFlags();
			case CanardPackage.CANARD_MODEL__CONSTRAINTS:
				return getConstraints();
			case CanardPackage.CANARD_MODEL__CONFIGURATIONS:
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
			case CanardPackage.CANARD_MODEL__FLAGS:
				getFlags().clear();
				getFlags().addAll((Collection<? extends Flag>)newValue);
				return;
			case CanardPackage.CANARD_MODEL__CONSTRAINTS:
				getConstraints().clear();
				getConstraints().addAll((Collection<? extends Constraint>)newValue);
				return;
			case CanardPackage.CANARD_MODEL__CONFIGURATIONS:
				getConfigurations().clear();
				getConfigurations().addAll((Collection<? extends Configuration>)newValue);
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
			case CanardPackage.CANARD_MODEL__FLAGS:
				getFlags().clear();
				return;
			case CanardPackage.CANARD_MODEL__CONSTRAINTS:
				getConstraints().clear();
				return;
			case CanardPackage.CANARD_MODEL__CONFIGURATIONS:
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CanardPackage.CANARD_MODEL__LINKS:
				return links != null && !links.isEmpty();
			case CanardPackage.CANARD_MODEL__BLOCKS:
				return blocks != null && !blocks.isEmpty();
			case CanardPackage.CANARD_MODEL__FLAGS:
				return flags != null && !flags.isEmpty();
			case CanardPackage.CANARD_MODEL__CONSTRAINTS:
				return constraints != null && !constraints.isEmpty();
			case CanardPackage.CANARD_MODEL__CONFIGURATIONS:
				return configurations != null && !configurations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CanardModelImpl
