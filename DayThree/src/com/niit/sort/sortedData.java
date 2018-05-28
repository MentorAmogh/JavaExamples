package com.niit.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class sortedData
{
	public void acceptdata()
	{
	DataElements firstdata=new DataElements(21,"Amogh",40);
	DataElements seconddata=new DataElements(4,"raju",20);
		ArrayList<DataElements> mylist=new ArrayList();
		mylist.add(firstdata);
		mylist.add(seconddata);
	//	compare(firstdata,seconddata);
		Collections.sort(mylist,new CompareById());
		for(DataElements resultlist:mylist)
		{
			System.out.println(resultlist.id+resultlist.sname+resultlist.age);
		}
	}
	
}
