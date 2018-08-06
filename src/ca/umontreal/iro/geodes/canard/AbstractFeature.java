/**
 */
package ca.umontreal.iro.geodes.canard;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.umontreal.iro.geodes.canard.AbstractFeature#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see ca.umontreal.iro.geodes.canard.CanardPackage#getAbstractFeature()
 * @model annotation="gmf.node label='name'"
 * @generated
 */
public interface AbstractFeature extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ca.umontreal.iro.geodes.canard.CanardPackage#getAbstractFeature_Name()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ca.umontreal.iro.geodes.canard.AbstractFeature#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // AbstractFeature
