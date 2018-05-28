package com.niit.sort;

import java.util.Comparator;

class CompareById implements Comparator<DataElements>
{
	@Override
	public int compare(DataElements one,DataElements two) {
		if(one.id>two.id)
			return 1;
		else if(one.id<two.id)
			return -1;
		else
			return 0;
	}

}
