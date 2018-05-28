package com.niit.sort;

class DataElements
{
	int age;
	String sname;
	int id;
	public DataElements(int myid,String myname,int myage)
	{
		this.id=myid;
		this.sname=myname;
		this.age=myage;
	}

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
}
