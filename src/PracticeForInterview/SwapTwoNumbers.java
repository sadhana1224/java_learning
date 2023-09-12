package PracticeForInterview;
//How do you swap two numbers without using a third variable in Java?
public class SwapTwoNumbers {

	public static void main(String[] args)
	{
		int a=15;
		int b=20;
		int sum=a+b;
		
		a=sum-a;
		b=sum-b;
		System.out.println(a+"  "+b);

		//multiplication
		int sum1=a*b;
		int a1=sum1/b;
		int b1=sum1/a;
		System.out.println(a1+"-->"+b1);



	}

}
