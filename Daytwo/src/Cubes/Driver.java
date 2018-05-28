package Cubes;
class Driver
{
	public void validate()
	{
		Container cube1=new Container(10,12,11);
		Container cube2=new Container(10,12,11);
		if(cube1.isEqual(cube2))
		{
			System.out.println("the containers are equal");
		}
		else
		{
			System.out.println("The containers are not equal");
		}
	}
	public static void main(String[] args) {
		Driver obj=new Driver();
		obj.validate();
	}
}