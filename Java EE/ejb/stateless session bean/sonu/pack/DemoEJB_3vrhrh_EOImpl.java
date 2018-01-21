/**
* This code was automatically generated at 5:20:08 AM on Mar 24, 2010
* by weblogic.ejb20.ejbc.Ejb2Rmi -- do not edit.
*
* @version WebLogic Server 8.1  Thu Mar 20 23:06:05 PST 2003 246620 
* @author Copyright (c) 2010 by BEA Systems, Inc. All Rights Reserved.
*/

package pack;

import weblogic.ejb20.interfaces.WLEnterpriseBean;

public final class DemoEJB_3vrhrh_EOImpl
extends weblogic.ejb20.internal.StatelessEJBObject
implements pack.Demo, weblogic.utils.PlatformConstants
{
  
  public DemoEJB_3vrhrh_EOImpl() {}
  
  public int add(int arg0, int arg1) throws java.rmi.RemoteException
  {
    java.lang.Throwable __ee = null;
    
    weblogic.ejb20.interfaces.InvocationWrapper __wrap;
    weblogic.ejb20.internal.MethodDescriptor __md = 
    ((DemoEJB_3vrhrh_HomeImpl)getEJBHome()).md_eo_add_ii;
    try {
      __wrap = super.preInvoke(
      __md, weblogic.ejb20.internal.DummyContextHandler.THE_ONE);
    } catch (weblogic.ejb20.internal.NeedRealContextHandlerError e) {
      __wrap = super.preInvoke(
      __md, new weblogic.ejb20.internal.EJBContextHandler(
      __md, new Object [] { new Integer( arg0),new Integer( arg1)}));          
    }
    
    DemoEJB_3vrhrh_Intf __bean = (DemoEJB_3vrhrh_Intf) __wrap.getBean();
    
    int result = 0;
    
    int __oldState = __bean.__WL_getMethodState();
    
    try {
      __bean.__WL_setMethodState(WLEnterpriseBean.STATE_BUSINESS_METHOD);
      
      result =  __bean.add( arg0, arg1);
      
    } catch (java.lang.Throwable t) {
      __ee = t;
    }
    finally {
      __bean.__WL_setMethodState(__oldState);
    }
    
    try {
      super.postInvoke(__wrap, __ee);
      
    } catch (java.lang.Exception e) {
      if (e instanceof java.rmi.RemoteException) {
        throw (java.rmi.RemoteException)e;
      } 
      
      else {
        throw new java.rmi.UnexpectedException("Unexpected exception in " +
        "pack.DemoBean.add():" + EOL +	
        weblogic.utils.StackTraceUtils.throwable2StackTrace(e), e);
      } 
    }
    return result;
  }
  
  
  
  public void remove()
  throws javax.ejb.RemoveException, java.rmi.RemoteException
  {
    super.remove(((DemoEJB_3vrhrh_HomeImpl)getEJBHome()).md_eo_remove);
  }
  
}

