/**
 */
package canard;

import org.eclipse.emf.common.util.EList;

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
 *   <li>{@link canard.Configuration#getFlags <em>Flags</em>}</li>
 * </ul>
 *
 * @see canard.CanardPackage#getConfiguration()
 * @model
 * @generated
 */
public interface Configuration extends EObject {
	/**
	 * Returns the value of the '<em><b>Flags</b></em>' reference list.
	 * The list contents are of type {@link canard.Flag}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flags</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flags</em>' reference list.
	 * @see canard.CanardPackage#getConfiguration_Flags()
	 * @model
	 * @generated
	 */
	EList<Flag> getFlags();

} // Configuration
