package com.tanist.rmitest;

import java.rmi.Naming;   

public class HelloClient   
{   
   /**  
    * 查找远程对象并调用远程方法  
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
//         //如果要从另一台启动了RMI注册服务的机器上查找hello实例   
//         HelloInterface hello = (HelloInterface)Naming.lookup("//172.16.3.10:1099/Hello");   
//            
//         //调用远程方法   
//         System.out.println(hello.say());   
//      }   
//      catch (Exception e)   
//      {   
//         System.out.println("HelloClient exception: " + e);   
//      }   
   }   
}   