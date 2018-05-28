package com.niit.PipesExample;
import java.io.*;
import java.util.Random;

class FServer extends Thread
	{ 
	  /**
	   Constructs a producer thread.
	   @param os the output stream
	  */
	
	  private DataOutputStream out;
	  private Random rand = new Random();

	public FServer(OutputStream os)
	  { 
	   out = new DataOutputStream(os);
	  }
	
	  public void run()
	  { 
	   while (true)
	   { 
	     try
	     { 
	      double num = rand.nextDouble();
	      out.writeDouble(num);
	      out.flush();
	      sleep(Math.abs(rand.nextInt() % 1000));
	     }
	     catch(Exception e)
	     { 
	      System.out.println("Error: " + e);
	     }
	   }
	  }
	}