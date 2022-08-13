/**
 */
package ciat;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rol</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ciat.Rol#getItsTeam <em>Its Team</em>}</li>
 *   <li>{@link ciat.Rol#getItsActor <em>Its Actor</em>}</li>
 *   <li>{@link ciat.Rol#getSupertype <em>Supertype</em>}</li>
 *   <li>{@link ciat.Rol#getSubtype <em>Subtype</em>}</li>
 * </ul>
 *
 * @see ciat.CiatPackage#getRol()
 * @model annotation="gmf.node label='name' tool.name='Rol' tool.small.bundle='org.chico.ciat.figures' tool.small.path='images/Rol.gif'"
 * @generated
 */
public interface Rol extends SociogramNode {
	/**
	 * Returns the value of the '<em><b>Its Team</b></em>' reference list.
	 * The list contents are of type {@link ciat.Team}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Its Team</em>' reference list.
	 * @see ciat.CiatPackage#getRol_ItsTeam()
	 * @model
	 * @generated
	 */
	EList<Team> getItsTeam();

	/**
	 * Returns the value of the '<em><b>Its Actor</b></em>' reference list.
	 * The list contents are of type {@link ciat.Actor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Its Actor</em>' reference list.
	 * @see ciat.CiatPackage#getRol_ItsActor()
	 * @model
	 * @generated
	 */
	EList<Actor> getItsActor();

	/**
	 * Returns the value of the '<em><b>Supertype</b></em>' reference list.
	 * The list contents are of type {@link ciat.Rol}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supertype</em>' reference list.
	 * @see ciat.CiatPackage#getRol_Supertype()
	 * @model
	 * @generated
	 */
	EList<Rol> getSupertype();

	/**
	 * Returns the value of the '<em><b>Subtype</b></em>' reference list.
	 * The list contents are of type {@link ciat.Rol}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subtype</em>' reference list.
	 * @see ciat.CiatPackage#getRol_Subtype()
	 * @model
	 * @generated
	 */
	EList<Rol> getSubtype();

} // Rol
