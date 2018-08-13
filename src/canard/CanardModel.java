/**
 */
package canard;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link canard.CanardModel#getLinks <em>Links</em>}</li>
 *   <li>{@link canard.CanardModel#getBlocks <em>Blocks</em>}</li>
 *   <li>{@link canard.CanardModel#getFlags <em>Flags</em>}</li>
 *   <li>{@link canard.CanardModel#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link canard.CanardModel#getConfigurations <em>Configurations</em>}</li>
 * </ul>
 *
 * @see canard.CanardPackage#getCanardModel()
 * @model
 * @generated
 */
public interface CanardModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Links</b></em>' containment reference list.
	 * The list contents are of type {@link canard.Rel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Links</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links</em>' containment reference list.
	 * @see canard.CanardPackage#getCanardModel_Links()
	 * @model containment="true"
	 * @generated
	 */
	EList<Rel> getLinks();

	/**
	 * Returns the value of the '<em><b>Blocks</b></em>' containment reference list.
	 * The list contents are of type {@link canard.Block}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Blocks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Blocks</em>' containment reference list.
	 * @see canard.CanardPackage#getCanardModel_Blocks()
	 * @model containment="true"
	 * @generated
	 */
	EList<Block> getBlocks();

	/**
	 * Returns the value of the '<em><b>Flags</b></em>' containment reference list.
	 * The list contents are of type {@link canard.Flag}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flags</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flags</em>' containment reference list.
	 * @see canard.CanardPackage#getCanardModel_Flags()
	 * @model containment="true"
	 * @generated
	 */
	EList<Flag> getFlags();

	/**
	 * Returns the value of the '<em><b>Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link canard.Constraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraints</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraints</em>' containment reference list.
	 * @see canard.CanardPackage#getCanardModel_Constraints()
	 * @model containment="true"
	 * @generated
	 */
	EList<Constraint> getConstraints();

	/**
	 * Returns the value of the '<em><b>Configurations</b></em>' containment reference list.
	 * The list contents are of type {@link canard.Configuration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configurations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configurations</em>' containment reference list.
	 * @see canard.CanardPackage#getCanardModel_Configurations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Configuration> getConfigurations();

} // CanardModel
