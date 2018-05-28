package IntCheck;
import java.util.Date;
import java.util.Scanner;
public class Integr extends Exception{
	String message="";
	public Integr(String mesg)
	{
		message=mesg;
	}
	public String getMessage()
	{
		return message;
	}
	public Integr()
	{
	}
	@Override
	public String toString()
	{
		return this.getClass().getName()+ new Date()+"";
	}
}
class Wrapper
{
	Integer num;
	int flag=0;
	public void validate(Wrapper gE) throws Integr
	{
		if(gE.num>this.num)
		{
		throw new Integr("Value of second class greater  is" +gE.num);
		}
		else
		{
			throw new Integr("Value of the first class less is"+this.num);
		}
	}
	public void accept()
	{
		Wrapper firstobj=new Wrapper();
		Wrapper secondobj=new Wrapper();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter first number");
		firstobj.num=new Integer(scanner.nextInt());
		System.out.println("Please enter second number");
		secondobj.num=new Integer(scanner.nextInt());
		try
		{
			firstobj.validate(secondobj);
		}
		catch(Integr k)
		{
		
			System.out.println(k.getMessage()+"  "+ k +firstobj.num);
		}
		finally
		{
			System.out.println("Finished_Problem_3");
		}
	}
}