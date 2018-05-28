package com.niit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.niit.EmployeeDetail.Employee;
public class TestCase {
	Employee empobj;
	@Before
	public void setUp() throws Exception {
	empobj=new Employee();
	}
	@Ignore
	@Test
	public void testAddElements() {
		
		assertEquals("Values Not Matching",8,empobj.sumUp(3,5));
		
		//fail("Not yet implemented");
	}

	@Ignore
	@Test
	public void testStrings() {
		
		assertEquals("Strings re not matching",true,empobj.compareStrings("Amogh","Amogh"));
		
		//fail("Not yet implemented");
	}
	@Test
public void doubleTest()
{
	assertEquals("Strings re not matching",8.0,empobj.compareDouble(2.5,5.5),0.0);
	
}
}
