package com.tanist.rmitest;

import java.rmi.Naming;   

public class HelloClient   
{   
   /**  
    * ����Զ�̶��󲢵���Զ�̷���  
    */  
   public static void main(String[] argv)   
 
   {   int i;  try{
	   i=Integer.parseInt("12.36");
	   System.out.println(i);
   }catch(NumberFormatException e){
	   System.out.println(e.getMessage());
   }
	   
//      try  
//      {   
//         //HelloInterface hello = (HelloInterface) Naming.lookup("Hello");   
//            
//         //���Ҫ����һ̨������RMIע�����Ļ����ϲ���helloʵ��   
//         HelloInterface hello = (HelloInterface)Naming.lookup("//172.16.3.10:1099/Hello");   
//            
//         //����Զ�̷���   
//         System.out.println(hello.say());   
//      }   
//      catch (Exception e)   
//      {   
//         System.out.println("HelloClient exception: " + e);   
//      }   
   }   
}   