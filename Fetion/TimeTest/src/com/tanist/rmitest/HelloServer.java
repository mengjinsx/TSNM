package com.tanist.rmitest;

import java.rmi.Naming;   
import java.rmi.registry.LocateRegistry;   
  
public class HelloServer   
{   
   /**  
    * 启动 RMI 注册服务并进行对象注册  
    */  
   public static void main(String[] argv)   
   {   
      try  
      {   
    	  if(System.getSecurityManager() == null){  
    	        System.setSecurityManager(new SecurityManager());  
    	    } 
         //启动RMI注册服务，指定端口为1099　（1099为默认端口）   
         //也可以通过命令 ＄java_home/bin/rmiregistry 1099启动   
         //这里用这种方式避免了再打开一个DOS窗口   
         //而且用命令rmiregistry启动注册服务还必须事先用RMIC生成一个stub类为它所用   
         LocateRegistry.createRegistry(1999);   
           
         //创建远程对象的一个或多个实例，下面是hello对象   
         //可以用不同名字注册不同的实例   
         HelloInterface hello = new Hello("Hello, world!");   
           
         //把hello注册到RMI注册服务器上，命名为Hello   
         Naming.rebind("Hello", hello);   
            
         //如果要把hello实例注册到另一台启动了RMI注册服务的机器上   
         //Naming.rebind("//127.0.0.1:1999/Hello",hello);   
           
         System.out.println("Hello Server is ready.");   
      }   
      catch (Exception e)   
      {   
         System.out.println("Hello Server failed: " + e);   
      }   
   }   
}  
