package com.niit.PipesExample;
import java.io.*;

class Client extends Thread
	{ 
	  /**
	   Constructs a consumer thread.
	   @param is the input stream
	  */  
	  public Client(InputStream is)
	  {  
	   in = new DataInputStream(is);
	  }
	
	  public void run()
	  { 
	   for(;;)
	   { 
	     try
	     { 
	   	 double x = in.readDouble();
	      if (Math.abs(x - oldx) > THRESHOLD)
	      { 
	        System.out.println("Client"+x);
	        oldx = x;
	      }
	      
	        
	     }
	     catch(IOException e)
	     { 
	      System.out.println("Error: " + e);
	     }
	   }
	  }
	
	  private double oldx = 0;
	  private DataInputStream in;
	  private static final double THRESHOLD = 0.01;
	}