package com.tanist.rmitest;

 

import java.rmi.*;   
  
/**  
 * Զ�̽ӿڱ�����չ�ӿ�java.rmi.Remote  
 */  
public interface HelloInterface extends Remote   
{   
   /**  
    * Զ�̽ӿڷ��������׳� java.rmi.RemoteException  
    */  
   public String say() throws RemoteException;   
}   