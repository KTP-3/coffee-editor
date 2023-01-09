/**
 */
package org.eclipse.emfcloud.coffee.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.eclipse.emfcloud.coffee.BasicfamilyPackage;
import org.eclipse.emfcloud.coffee.Family;
import org.eclipse.emfcloud.coffee.Identifiable;
import org.eclipse.emfcloud.coffee.Man;
import org.eclipse.emfcloud.coffee.Person;
import org.eclipse.emfcloud.coffee.Woman;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 *
 * @see basicfamily.BasicfamilyPackage
 * @generated
 */
public class BasicfamilySwitch<T> extends Switch<T> {
   /**
    * The cached model package
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    *
    * @generated
    */
   protected static BasicfamilyPackage modelPackage;

   /**
    * Creates an instance of the switch.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    *
    * @generated
    */
   public BasicfamilySwitch() {
      if (modelPackage == null) {
         modelPackage = BasicfamilyPackage.eINSTANCE;
      }
   }

   /**
    * Checks whether this is a switch for the given package.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    *
    * @param ePackage the package in question.
    * @return whether this is a switch for the given package.
    * @generated
    */
   @Override
   protected boolean isSwitchFor(final EPackage ePackage) {
      return ePackage == modelPackage;
   }

   /**
    * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    *
    * @return the first non-null result returned by a <code>caseXXX</code> call.
    * @generated
    */
   @Override
   protected T doSwitch(final int classifierID, final EObject theEObject) {
      switch (classifierID) {
         case BasicfamilyPackage.IDENTIFIABLE: {
            Identifiable identifiable = (Identifiable) theEObject;
            T result = caseIdentifiable(identifiable);
            if (result == null) {
               result = defaultCase(theEObject);
            }
            return result;
         }
         case BasicfamilyPackage.PERSON: {
            Person person = (Person) theEObject;
            T result = casePerson(person);
            if (result == null) {
               result = caseIdentifiable(person);
            }
            if (result == null) {
               result = defaultCase(theEObject);
            }
            return result;
         }
         case BasicfamilyPackage.FAMILY: {
            Family family = (Family) theEObject;
            T result = caseFamily(family);
            if (result == null) {
               result = caseIdentifiable(family);
            }
            if (result == null) {
               result = defaultCase(theEObject);
            }
            return result;
         }
         case BasicfamilyPackage.MAN: {
            Man man = (Man) theEObject;
            T result = caseMan(man);
            if (result == null) {
               result = casePerson(man);
            }
            if (result == null) {
               result = caseIdentifiable(man);
            }
            if (result == null) {
               result = defaultCase(theEObject);
            }
            return result;
         }
         case BasicfamilyPackage.WOMAN: {
            Woman woman = (Woman) theEObject;
            T result = caseWoman(woman);
            if (result == null) {
               result = casePerson(woman);
            }
            if (result == null) {
               result = caseIdentifiable(woman);
            }
            if (result == null) {
               result = defaultCase(theEObject);
            }
            return result;
         }
         default:
            return defaultCase(theEObject);
      }
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Identifiable</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    *
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Identifiable</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseIdentifiable(final Identifiable object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Person</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    *
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Person</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T casePerson(final Person object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Family</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    *
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Family</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseFamily(final Family object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Man</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    *
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Man</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseMan(final Man object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Woman</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    *
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Woman</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseWoman(final Woman object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch, but this is the last case anyway.
    * <!-- end-user-doc -->
    *
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject)
    * @generated
    */
   @Override
   public T defaultCase(final EObject object) {
      return null;
   }

} // BasicfamilySwitch