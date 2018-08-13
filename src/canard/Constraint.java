/**
 */
package canard;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link canard.Constraint#getFeature <em>Feature</em>}</li>
 *   <li>{@link canard.Constraint#getCons_flags <em>Cons flags</em>}</li>
 * </ul>
 *
 * @see canard.CanardPackage#getConstraint()
 * @model
 * @generated
 */
public interface Constraint extends EObject {
	/**
	 * Returns the value of the '<em><b>Feature</b></em>' attribute.
	 * The literals are from the enumeration {@link canard.FeatureRelationType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature</em>' attribute.
	 * @see canard.FeatureRelationType
	 * @see #setFeature(FeatureRelationType)
	 * @see canard.CanardPackage#getConstraint_Feature()
	 * @model
	 * @generated
	 */
	FeatureRelationType getFeature();

	/**
	 * Sets the value of the '{@link canard.Constraint#getFeature <em>Feature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature</em>' attribute.
	 * @see canard.FeatureRelationType
	 * @see #getFeature()
	 * @generated
	 */
	void setFeature(FeatureRelationType value);

	/**
	 * Returns the value of the '<em><b>Cons flags</b></em>' reference list.
	 * The list contents are of type {@link canard.Flag}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cons flags</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cons flags</em>' reference list.
	 * @see canard.CanardPackage#getConstraint_Cons_flags()
	 * @model
	 * @generated
	 */
	EList<Flag> getCons_flags();

} // Constraint
