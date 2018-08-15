/**
 */
package canard;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link canard.Configuration#getName <em>Name</em>}</li>
 *   <li>{@link canard.Configuration#getConfigflags <em>Configflags</em>}</li>
 * </ul>
 *
 * @see canard.CanardPackage#getConfiguration()
 * @model annotation="gmf.node label='name' figure='ellipse' border.color='0,0,0' color='255,242,15' label.color='255,255,255'"
 * @generated
 */
public interface Configuration extends EObject {
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
	 * @see canard.CanardPackage#getConfiguration_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link canard.Configuration#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Configflags</b></em>' map.
	 * The key is of type {@link canard.Flag},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configflags</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configflags</em>' map.
	 * @see canard.CanardPackage#getConfiguration_Configflags()
	 * @model mapType="canard.FlagToEBooleanMap<canard.Flag, org.eclipse.emf.ecore.EString>"
	 * @generated
	 */
	EMap<Flag, String> getConfigflags();

} // Configuration
