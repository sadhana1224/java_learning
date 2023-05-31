package oops;  //herarchial method
class Bank
{
	void interest()
	{
		System.out.println("interest rate is 6");
	}
}
class HDFC extends Bank
{
	void interest()
	{
		System.out.println("interest rate is 7");
	}
	
}
class ICICI extends Bank
{
	void interest()
	{
		System.out.println("interest rate is 8");
	}
}
class Axis extends Bank
{
	void interest()
	{
		System.out.println("interest rate is 9");
	}
}

public class MethodOverriding1 {

	public static void main(String[] args) {
		
		HDFC h=new HDFC();
		h.interest();
		
		ICICI in=new ICICI();
		in.interest();
		
		Axis a=new Axis();
		a.interest();
	}

}
