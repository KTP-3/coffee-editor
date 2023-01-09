/**
 */
package org.eclipse.emfcloud.coffee.workflow.glsp.server.wfgraph;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link basicfamily.Person#getName <em>Name</em>}</li>
 * <li>{@link basicfamily.Person#getChildren <em>Children</em>}</li>
 * <li>{@link basicfamily.Person#getParents <em>Parents</em>}</li>
 * <li>{@link basicfamily.Person#getMother <em>Mother</em>}</li>
 * <li>{@link basicfamily.Person#getFather <em>Father</em>}</li>
 * </ul>
 *
 * @see basicfamily.BasicfamilyPackage#getPerson()
 * @model abstract="true"
 * @generated
 */
public interface Person extends Identifiable {
   /**
    * Returns the value of the '<em><b>Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    *
    * @return the value of the '<em>Name</em>' attribute.
    * @see #setName(String)
    * @see basicfamily.BasicfamilyPackage#getPerson_Name()
    * @model
    * @generated
    */
   @Override
   String getName();

   /**
    * Sets the value of the '{@link basicfamily.Person#getName <em>Name</em>}' attribute.
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
    * Returns the value of the '<em><b>Children</b></em>' reference list.
    * The list contents are of type {@link basicfamily.Person}.
    * It is bidirectional and its opposite is '{@link basicfamily.Person#getParents <em>Parents</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    *
    * @return the value of the '<em>Children</em>' reference list.
    * @see basicfamily.BasicfamilyPackage#getPerson_Children()
    * @see basicfamily.Person#getParents
    * @model opposite="parents"
    * @generated
    */
   EList<Person> getChildren();

   /**
    * Returns the value of the '<em><b>Parents</b></em>' reference list.
    * The list contents are of type {@link basicfamily.Person}.
    * It is bidirectional and its opposite is '{@link basicfamily.Person#getChildren <em>Children</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    *
    * @return the value of the '<em>Parents</em>' reference list.
    * @see basicfamily.BasicfamilyPackage#getPerson_Parents()
    * @see basicfamily.Person#getChildren
    * @model opposite="children" upper="2"
    * @generated
    */
   EList<Person> getParents();

   /**
    * Returns the value of the '<em><b>Mother</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    *
    * @return the value of the '<em>Mother</em>' reference.
    * @see #setMother(Woman)
    * @see basicfamily.BasicfamilyPackage#getPerson_Mother()
    * @model derived="true"
    * @generated
    */
   Woman getMother();

   /**
    * Sets the value of the '{@link basicfamily.Person#getMother <em>Mother</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    *
    * @param value the new value of the '<em>Mother</em>' reference.
    * @see #getMother()
    * @generated
    */
   void setMother(Woman value);

   /**
    * Returns the value of the '<em><b>Father</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    *
    * @return the value of the '<em>Father</em>' reference.
    * @see #setFather(Man)
    * @see basicfamily.BasicfamilyPackage#getPerson_Father()
    * @model derived="true"
    * @generated
    */
   Man getFather();

   /**
    * Sets the value of the '{@link basicfamily.Person#getFather <em>Father</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    *
    * @param value the new value of the '<em>Father</em>' reference.
    * @see #getFather()
    * @generated
    */
   void setFather(Man value);

} // Person
