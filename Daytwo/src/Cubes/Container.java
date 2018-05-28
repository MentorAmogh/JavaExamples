package Cubes;

public class Container {
private double length,breadth,height;
public Container(double length,double breadth,double height)
{
	this.length=length;
	this.breadth=breadth;
	this.height=height;
}

public boolean isEqual(Container obj)
{
if((this.length==obj.length) && (this.breadth==obj.breadth) && (this.height==obj.height))
	return true;
else
	return false;
}	
}

