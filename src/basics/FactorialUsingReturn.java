package basics;

public class FactorialUsingReturn {
  
	public long Factorial(int factnum)   //here the return type is int...we can change it as a long,byte,short
	{
		long fact=1;
		for(int i=1;i<=factnum;i++)
		{
			fact=fact*i;
			
		}
		return fact;               
	}
	public static void main(String[] args) {
		
		FactorialUsingReturn obj1=new FactorialUsingReturn();
		long res=obj1.Factorial(12);               //store the values
		System.out.println("the factorial of the number is : "+res);
		
		FactorialUsingReturn obj2=new FactorialUsingReturn();
		long res1=obj2.Factorial(10);              //store the values
		System.out.println("the factorial of the number is : "+res1);   //and then print the result
	}

}
