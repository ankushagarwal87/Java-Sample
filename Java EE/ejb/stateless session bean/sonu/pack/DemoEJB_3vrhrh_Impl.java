/**
* This code was automatically generated at 5:20:08 AM on Mar 24, 2010
* by weblogic.ejb20.ejbc.Ejb2Rmi -- do not edit.
*
* @version WebLogic Server 8.1  Thu Mar 20 23:06:05 PST 2003 246620 
* @author Copyright (c) 2010 by BEA Systems, Inc. All Rights Reserved.
*/

package pack;

public final class DemoEJB_3vrhrh_Impl
extends DemoBean
implements weblogic.ejb20.interfaces.WLEnterpriseBean,
DemoEJB_3vrhrh_Intf
{
  private int __WL_method_state;
  
  private boolean __WL_busy = false;
  
  private boolean __WL_isLocal = false;
  
  private boolean __WL_needsRemove;
  
  private boolean __WL_creatorOfTx;
  
  private javax.ejb.EJBContext __WL_EJBContext;
  
  private javax.transaction.Transaction __WL_bmtx;
  
  private Object __WL_loadUser;
  
  public DemoEJB_3vrhrh_Impl()  {}
  
  public boolean __WL_isBusy() { return __WL_busy; }
  public void __WL_setBusy(boolean b) { __WL_busy = b; }
  
  public boolean __WL_getIsLocal() { return __WL_isLocal; }
  public void __WL_setIsLocal(boolean b) { __WL_isLocal = b; }
  
  public javax.transaction.Transaction __WL_getBeanManagedTransaction() {
    return __WL_bmtx;
  }
  
  public void __WL_setBeanManagedTransaction(javax.transaction.Transaction tx) {
    __WL_bmtx = tx;
  }
  
  public javax.ejb.EJBContext __WL_getEJBContext() { return __WL_EJBContext; }
  public void __WL_setEJBContext(javax.ejb.EJBContext ctx) { 
    __WL_EJBContext = ctx; 
  }
  
  public int __WL_getMethodState() { return __WL_method_state; }
  public void __WL_setMethodState(int state) { __WL_method_state = state; }
  
  public boolean __WL_needsRemove() { return __WL_needsRemove; }
  public void __WL_setNeedsRemove(boolean b) { __WL_needsRemove = b; }
  
  public void __WL_setLoadUser(Object o) { __WL_loadUser = o;}
  public Object __WL_getLoadUser() { return __WL_loadUser; } 
  
  
  public void __WL_setCreatorOfTx (boolean b) { __WL_creatorOfTx = b; }
  public boolean __WL_isCreatorOfTx() { return __WL_creatorOfTx; }
  
  
  public void ejbActivate() 
  
  {
    int oldState = __WL_method_state;
    try {
      __WL_method_state = STATE_EJB_ACTIVATE;
      super.ejbActivate();
    } finally {
      __WL_method_state = oldState;
    }
  }
  
  public void ejbPassivate() 
  
  {
    int oldState = __WL_method_state;
    try {
      __WL_method_state = STATE_EJB_PASSIVATE;
      super.ejbPassivate();
    } finally {
      __WL_method_state = oldState;
    }
  }
  
  public void ejbRemove() 
  
  {
    int oldState = __WL_method_state;
    
    try {
      __WL_method_state = STATE_EJB_REMOVE;
      super.ejbRemove();
    } finally {
      __WL_method_state = oldState;
    }
  }
  
  
  public void setSessionContext(javax.ejb.SessionContext ctx)
  
  {
    int oldState = __WL_method_state;
    try {
      __WL_method_state = STATE_SET_CONTEXT;
      super.setSessionContext(ctx);
    } finally {
      __WL_method_state = oldState;
    }
  }
  
  
  
  
  
  
  
  // create, find, remove, EJB 2.0 home methods
  
  public void ejbCreate()
  throws javax.ejb.CreateException,java.rmi.RemoteException
  {
    int oldState = __WL_method_state;
    
    try {
      __WL_method_state = STATE_EJB_CREATE;
      
      // No return value
      
      super.ejbCreate();
      
      // No return result
    } finally {
      __WL_method_state = oldState;
    }
  }
  
  
  
  
}

