/**
 */
package org.eclipse.emfcloud.coffee.workflow.glsp.server.wfgraph.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emfcloud.coffee.workflow.glsp.server.wfgraph.BasicfamilyPackage;
import org.eclipse.emfcloud.coffee.workflow.glsp.server.wfgraph.Identifiable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Identifiable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link basicfamily.impl.IdentifiableImpl#getId <em>Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class IdentifiableImpl extends MinimalEObjectImpl.Container implements Identifiable {
   /**
    * The default value of the '{@link #getId() <em>Id</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    *
    * @see #getId()
    * @generated
    * @ordered
    */
   protected static final String ID_EDEFAULT = null;

   /**
    * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    *
    * @see #getId()
    * @generated
    * @ordered
    */
   protected String id = ID_EDEFAULT;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    *
    * @generated
    */
   protected IdentifiableImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    *
    * @generated
    */
   @Override
   protected EClass eStaticClass() {
      return BasicfamilyPackage.Literals.IDENTIFIABLE;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    *
    * @generated
    */
   @Override
   public String getId() { return id; }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    *
    * @generated
    */
   @Override
   public void setId(final String newId) {
      String oldId = id;
      id = newId;
      if (eNotificationRequired()) {
         eNotify(new ENotificationImpl(this, Notification.SET, BasicfamilyPackage.IDENTIFIABLE__ID, oldId, id));
      }
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    *
    * @generated
    */
   @Override
   public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
      switch (featureID) {
         case BasicfamilyPackage.IDENTIFIABLE__ID:
            return getId();
      }
      return super.eGet(featureID, resolve, coreType);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    *
    * @generated
    */
   @Override
   public void eSet(final int featureID, final Object newValue) {
      switch (featureID) {
         case BasicfamilyPackage.IDENTIFIABLE__ID:
            setId((String) newValue);
            return;
      }
      super.eSet(featureID, newValue);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    *
    * @generated
    */
   @Override
   public void eUnset(final int featureID) {
      switch (featureID) {
         case BasicfamilyPackage.IDENTIFIABLE__ID:
            setId(ID_EDEFAULT);
            return;
      }
      super.eUnset(featureID);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    *
    * @generated
    */
   @Override
   public boolean eIsSet(final int featureID) {
      switch (featureID) {
         case BasicfamilyPackage.IDENTIFIABLE__ID:
            return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
      }
      return super.eIsSet(featureID);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    *
    * @generated
    */
   @Override
   public String toString() {
      if (eIsProxy()) {
         return super.toString();
      }

      StringBuilder result = new StringBuilder(super.toString());
      result.append(" (id: ");
      result.append(id);
      result.append(')');
      return result.toString();
   }

} // IdentifiableImpl
