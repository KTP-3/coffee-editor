/**
 */
package org.eclipse.emfcloud.coffee;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Family</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link basicfamily.Family#getName <em>Name</em>}</li>
 * <li>{@link basicfamily.Family#getMembers <em>Members</em>}</li>
 * </ul>
 *
 * @see basicfamily.BasicfamilyPackage#getFamily()
 * @model
 * @generated
 */
public interface Family extends Identifiable {
   /**
    * Returns the value of the '<em><b>Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    *
    * @return the value of the '<em>Name</em>' attribute.
    * @see #setName(String)
    * @see basicfamily.BasicfamilyPackage#getFamily_Name()
    * @model
    * @generated
    */
   @Override
   String getName();

   /**
    * Sets the value of the '{@link basicfamily.Family#getName <em>Name</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    *
    * @param value the new value of the '<em>Name</em>' attribute.
    * @see #getName()
    * @generated
    */
   @Override
   void setName(String value);

   /**
    * Returns the value of the '<em><b>Members</b></em>' containment reference list.
    * The list contents are of type {@link basicfamily.Person}.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    *
    * @return the value of the '<em>Members</em>' containment reference list.
    * @see basicfamily.BasicfamilyPackage#getFamily_Members()
    * @model containment="true"
    * @generated
    */
   EList<Person> getMembers();

} // Family
