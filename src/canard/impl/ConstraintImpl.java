/**
 */
package canard.impl;

import canard.CanardPackage;
import canard.Constraint;
import canard.FeatureRelationType;
import canard.Flag;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link canard.impl.ConstraintImpl#getFeature <em>Feature</em>}</li>
 *   <li>{@link canard.impl.ConstraintImpl#getCons_flags <em>Cons flags</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConstraintImpl extends EObjectImpl implements Constraint {
	/**
	 * The default value of the '{@link #getFeature() <em>Feature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeature()
	 * @generated
	 * @ordered
	 */
	protected static final FeatureRelationType FEATURE_EDEFAULT = FeatureRelationType.REQUIRES;

	/**
	 * The cached value of the '{@link #getFeature() <em>Feature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeature()
	 * @generated
	 * @ordered
	 */
	protected FeatureRelationType feature = FEATURE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCons_flags() <em>Cons flags</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCons_flags()
	 * @generated
	 * @ordered
	 */
	protected EList<Flag> cons_flags;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CanardPackage.Literals.CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureRelationType getFeature() {
		return feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeature(FeatureRelationType newFeature) {
		FeatureRelationType oldFeature = feature;
		feature = newFeature == null ? FEATURE_EDEFAULT : newFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CanardPackage.CONSTRAINT__FEATURE, oldFeature, feature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Flag> getCons_flags() {
		if (cons_flags == null) {
			cons_flags = new EObjectResolvingEList<Flag>(Flag.class, this, CanardPackage.CONSTRAINT__CONS_FLAGS);
		}
		return cons_flags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CanardPackage.CONSTRAINT__FEATURE:
				return getFeature();
			case CanardPackage.CONSTRAINT__CONS_FLAGS:
				return getCons_flags();
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
			case CanardPackage.CONSTRAINT__FEATURE:
				setFeature((FeatureRelationType)newValue);
				return;
			case CanardPackage.CONSTRAINT__CONS_FLAGS:
				getCons_flags().clear();
				getCons_flags().addAll((Collection<? extends Flag>)newValue);
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
			case CanardPackage.CONSTRAINT__FEATURE:
				setFeature(FEATURE_EDEFAULT);
				return;
			case CanardPackage.CONSTRAINT__CONS_FLAGS:
				getCons_flags().clear();
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
			case CanardPackage.CONSTRAINT__FEATURE:
				return feature != FEATURE_EDEFAULT;
			case CanardPackage.CONSTRAINT__CONS_FLAGS:
				return cons_flags != null && !cons_flags.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (feature: ");
		result.append(feature);
		result.append(')');
		return result.toString();
	}

} //ConstraintImpl
