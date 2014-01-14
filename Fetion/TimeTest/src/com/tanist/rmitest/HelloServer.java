package com.tanist.rmitest;

import java.rmi.Naming;   
import java.rmi.registry.LocateRegistry;   
  
public class HelloServer   
{   
   /**  
    * ���� RMI ע����񲢽��ж���ע��  
    */  
   public static void main(String[] argv)   
   {   
      try  
      {   
    	  if(System.getSecurityManager() == null){  
    	        System.setSecurityManager(new SecurityManager());  
    	    } 
         //����RMIע�����ָ���˿�Ϊ1099����1099ΪĬ�϶˿ڣ�   
         //Ҳ����ͨ������ ��java_home/bin/rmiregistry 1099����   
         //���������ַ�ʽ�������ٴ�һ��DOS����   
         //����������rmiregistry����ע����񻹱���������RMIC����һ��stub��Ϊ������   
         LocateRegistry.createRegistry(1999);   
           
         //����Զ�̶����һ������ʵ����������hello����   
         //�����ò�ͬ����ע�᲻ͬ��ʵ��   
         HelloInterface hello = new Hello("Hello, world!");   
           
         //��helloע�ᵽRMIע��������ϣ�����ΪHello   
         Naming.rebind("Hello", hello);   
            
         //���Ҫ��helloʵ��ע�ᵽ��һ̨������RMIע�����Ļ�����   
         //Naming.rebind("//127.0.0.1:1999/Hello",hello);   
           
         System.out.println("Hello Server is ready.");   
      }   
      catch (Exception e)   
      {   
         System.out.println("Hello Server failed: " + e);   
      }   
   }   
}  
