/**
 */
package ca.umontreal.iro.geodes.canard.impl;

import ca.umontreal.iro.geodes.canard.CanardPackage;
import ca.umontreal.iro.geodes.canard.Relation;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.umontreal.iro.geodes.canard.impl.RelationImpl#getNameParent <em>Name Parent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RelationImpl extends MinimalEObjectImpl.Container implements Relation {
	/**
	 * The default value of the '{@link #getNameParent() <em>Name Parent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameParent()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_PARENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNameParent() <em>Name Parent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameParent()
	 * @generated
	 * @ordered
	 */
	protected String nameParent = NAME_PARENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CanardPackage.Literals.RELATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNameParent() {
		return nameParent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNameParent(String newNameParent) {
		String oldNameParent = nameParent;
		nameParent = newNameParent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CanardPackage.RELATION__NAME_PARENT, oldNameParent, nameParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CanardPackage.RELATION__NAME_PARENT:
				return getNameParent();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CanardPackage.RELATION__NAME_PARENT:
				setNameParent((String)newValue);
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
			case CanardPackage.RELATION__NAME_PARENT:
				setNameParent(NAME_PARENT_EDEFAULT);
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
			case CanardPackage.RELATION__NAME_PARENT:
				return NAME_PARENT_EDEFAULT == null ? nameParent != null : !NAME_PARENT_EDEFAULT.equals(nameParent);
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
		result.append(" (nameParent: ");
		result.append(nameParent);
		result.append(')');
		return result.toString();
	}

} //RelationImpl
