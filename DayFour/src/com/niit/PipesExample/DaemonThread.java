package com.niit.PipesExample;

public class DaemonThread extends Thread {
	public void run()
	{
	 if(Thread.currentThread().isDaemon())
     { 
         System.out.println("This is Daemon thread"); 
     } 
      
     else
     { 
         System.out.println("This is User thread"); 
     }
	}
}
