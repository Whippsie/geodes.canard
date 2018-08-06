/**
 */
package ca.umontreal.iro.geodes.canard;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.umontreal.iro.geodes.canard.Relation#getNameParent <em>Name Parent</em>}</li>
 * </ul>
 *
 * @see ca.umontreal.iro.geodes.canard.CanardPackage#getRelation()
 * @model
 * @generated
 */
public interface Relation extends EObject {
	/**
	 * Returns the value of the '<em><b>Name Parent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name Parent</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Parent</em>' attribute.
	 * @see #setNameParent(String)
	 * @see ca.umontreal.iro.geodes.canard.CanardPackage#getRelation_NameParent()
	 * @model
	 * @generated
	 */
	String getNameParent();

	/**
	 * Sets the value of the '{@link ca.umontreal.iro.geodes.canard.Relation#getNameParent <em>Name Parent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Parent</em>' attribute.
	 * @see #getNameParent()
	 * @generated
	 */
	void setNameParent(String value);

} // Relation
