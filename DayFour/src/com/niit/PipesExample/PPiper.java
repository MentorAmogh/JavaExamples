package com.niit.PipesExample;

import java.io.*;

/**
	  A thread that reads numbers from a stream and writes their
	  average to an output stream.
	*/
	class PPiper extends Thread
	{ 
	  /**
	   Constructs a filter thread.
	   @param is the output stream
	   @param os the output stream
	  */
		
		  private DataInputStream in;
		  private DataOutputStream out;
		  private double total = 0;
		  private int count = 0;

		public PPiper(InputStream is, OutputStream os)
	  { 
	   in = new DataInputStream(is);
	   out = new DataOutputStream(os);
	  }
		  static int counter=0;
	
	  public void run()
	  { 
	   for (;;)
	   { 
	     try
	     { 
	      double x = in.readDouble();
	      total += x;
	      count++;
	      counter++;
	      if (count != 0) out.writeDouble(total / count);
	     }
	     catch(IOException e)
	     { 
	      System.out.println("Error: " + e);
	     }

	   }
	  }
	}
	