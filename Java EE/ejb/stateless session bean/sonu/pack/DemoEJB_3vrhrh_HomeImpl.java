/**
* This code was automatically generated at 5:20:08 AM on Mar 24, 2010
* by weblogic.ejb20.ejbc.Ejb2Rmi -- do not edit.
*
* @version WebLogic Server 8.1  Thu Mar 20 23:06:05 PST 2003 246620 
* @author Copyright (c) 2010 by BEA Systems, Inc. All Rights Reserved.
*/

package pack;
import weblogic.ejb20.interfaces.WLEnterpriseBean;
public final class DemoEJB_3vrhrh_HomeImpl
extends    weblogic.ejb20.internal.StatelessEJBHome
implements pack.DemoHome, weblogic.utils.PlatformConstants

{
  public weblogic.ejb20.internal.MethodDescriptor md_eo_add_ii;
  
  
  public weblogic.ejb20.internal.MethodDescriptor md_ejbCreate;
  
  
  
  
  
  private static java.lang.reflect.Method mth_ejbCreate;
  private static java.lang.reflect.Method mth_postejbCreate;
  
  
  
  
  
  public weblogic.ejb20.internal.MethodDescriptor md_eo_remove;
  
  public weblogic.ejb20.internal.MethodDescriptor md_ejbRemove_javax_ejb_Handle;
  public weblogic.ejb20.internal.MethodDescriptor md_ejbRemove_O;
  
  static {
    
    try {
      
      
      mth_ejbCreate = DemoEJB_3vrhrh_Intf.class.getMethod(
      "ejbCreate", null);
      
      if (false) {
        mth_postejbCreate = DemoEJB_3vrhrh_Intf.class.getMethod(
        "ejbPostCreate", null); 
      }
      
      
      
      
      
    } catch (Exception e) {
      throw new AssertionError("Unable to find expected "+
      "methods.  Please check your classpath for stale versions of "+
      "your ejb classes and re-run weblogic.ejbc");
    }
  }
  
  
  public DemoEJB_3vrhrh_HomeImpl() {
    super(DemoEJB_3vrhrh_EOImpl.class
    );
  }
  
  
  public pack.Demo create ()
  throws javax.ejb.CreateException, java.rmi.RemoteException
  {
    try {
      return (pack.Demo) super.create(md_ejbCreate);
    } catch (java.lang.Exception e) {
      if (e instanceof java.rmi.RemoteException) {
        throw (java.rmi.RemoteException)e;
      }
      else if (e instanceof javax.ejb.CreateException) {
        throw (javax.ejb.CreateException) e;
      }
      else {
        throw new javax.ejb.CreateException ("Error while creating bean: " + 
        e.toString());
      }
    }
  }
  
  
  
  
  
  
  
  public void remove(java.lang.Object pk) 
  throws java.rmi.RemoteException, javax.ejb.RemoveException
  {
    super.remove(md_ejbRemove_O, pk);
  }
  
  public void remove(javax.ejb.Handle h)
  throws java.rmi.RemoteException, javax.ejb.RemoveException
  {
    super.remove(md_ejbRemove_javax_ejb_Handle, h);
  }
  
  
}

