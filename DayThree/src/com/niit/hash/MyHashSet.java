package com.niit.hash;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class MyHashSet {
	 LinkedHashSet<Book> hs=new LinkedHashSet<Book>(5,0.150f);
String ans="";
Scanner readdata;
	public void addBucket()
	{
 		Book firstBook=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);
			Book secondBook=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
			Book thirdbook=new Book(103,"Operating System","Galvin","Wiley",6);
			hs.add(firstBook);
			hs.add(secondBook);
			hs.add(thirdbook);
	
	}
	 public void retrieve()
	 	{
		 
			 	//System.out.println("Enter Y to continue");
	 		/*	
	 		 	do
	 			{
	 			readdata=new Scanner(System.in);
	 			ans=readdata.next();
	 		//	System.out.println("Helloooooooooooo");
	 		}while(ans.equals("Y"));
	 			*/
	 			for(Book b:hs)
	 			{	
	 				System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity+hs.hashCode());
	 			}
	 	}
}