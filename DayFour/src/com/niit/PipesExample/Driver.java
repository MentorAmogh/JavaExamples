package com.niit.PipesExample;
import java.io.*;

	public class Driver
	{ 
	  public static void main(String args[])
	  { 
	   try
   { 
	     /* set up pipes */
	     PipedOutputStream pout1 = new PipedOutputStream();
	     PipedInputStream pin1 = new PipedInputStream(pout1);
	
	     PipedOutputStream pout2 = new PipedOutputStream();
	     PipedInputStream pin2 = new PipedInputStream(pout2);
	
	     /* construct threads */
	
	     FServer producer = new FServer(pout1);
	     PPiper Ppiper = new PPiper(pin1, pout2);
	     Client consumer = new Client(pin2);
	
	     /* start threads */
	
	     producer.start();
	     Ppiper.start();
	     consumer.start();
	    // consumer.setDaemon(true);

	     try
	     {
	     System.out.println("Demon Called");
	     }
	     catch(Exception h)
	     {
	    	 
	     }
	     
	     //producer.setDaemon(true);
	
   }
	   catch (IOException e){}
	  }
	}
