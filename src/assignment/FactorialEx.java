package assignment;

public class FactorialEx {

	public static void main(String[] args) {

		int factorialNumber=5;
		int factorialResult=1;
		for(int i=1;i<=factorialNumber;i++)
		{
			factorialResult=factorialResult*i;
			//System.out.println("factorial of a number "+ i  +" is :"+factorialResult); // this is individual i result
		}
		System.out.println("factorial of a number "+ factorialNumber +" is :"+factorialResult);
	}

}
