/**
* This code was automatically generated at 5:20:08 AM on Mar 24, 2010
* by weblogic.ejb20.ejbc.Ejb2Rmi -- do not edit.
*
* @version WebLogic Server 8.1  Thu Mar 20 23:06:05 PST 2003 246620 
* @author Copyright (c) 2010 by BEA Systems, Inc. All Rights Reserved.
*/

package pack;

import weblogic.ejb20.interfaces.WLEnterpriseBean;

public interface DemoEJB_3vrhrh_Intf 
extends WLEnterpriseBean
{
  
  public int add(int arg0, int arg1) throws java.rmi.RemoteException;
  public void ejbActivate();
  public void ejbCreate()
  throws javax.ejb.CreateException, java.rmi.RemoteException;
  public void ejbPassivate();
  public void ejbRemove();
  public void setSessionContext(javax.ejb.SessionContext arg0);
  
  
}
