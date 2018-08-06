/**
 */
package canard;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flag</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link canard.Flag#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see canard.CanardPackage#getFlag()
 * @model annotation="gmf.node label='name'"
 * @generated
 */
public interface Flag extends AbstractFeature {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The default value is <code>"NAN"</code>.
	 * The literals are from the enumeration {@link canard.FlagValues}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see canard.FlagValues
	 * @see #setValue(FlagValues)
	 * @see canard.CanardPackage#getFlag_Value()
	 * @model default="NAN" required="true"
	 * @generated
	 */
	FlagValues getValue();

	/**
	 * Sets the value of the '{@link canard.Flag#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see canard.FlagValues
	 * @see #getValue()
	 * @generated
	 */
	void setValue(FlagValues value);

} // Flag
