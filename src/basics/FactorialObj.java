package basics;

public class FactorialObj {

	public void Factorial(int factnum)   //the name should be different from class name
	{
		int fact=1;
		for(int i=1;i<=factnum;i++)
		{
			fact=fact*i;
		}
		System.out.println("the factorial of :"+ factnum + " is "+fact);
	}
	public static void main(String[] args) {
		FactorialObj obj1=new FactorialObj();
		obj1.Factorial(5);
		
		FactorialObj obj2=new FactorialObj();
		obj2.Factorial(6);

	}

}
