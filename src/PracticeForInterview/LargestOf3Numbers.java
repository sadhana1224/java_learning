package PracticeForInterview;

import java.util.Scanner;

public class LargestOf3Numbers {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first number");
		int a=sc.nextInt();
		System.out.println("enter the second number");
		int b=sc.nextInt();
		System.out.println("enter the Third number");
		int c=sc.nextInt();
		
		if(a>b && a>c)
		{
			System.out.println(a +"is a largest number");
		}
		else if(b>a && b>c)
		{
			System.out.println(b +"is a largest number");

		}
		else
		{
			System.out.println(c +"is a largest number");

		}
		
		//ternory operator
		
		int x=10,y=1541,z=56;
		int largest=x>y ? x:y;
		int largest1=z>largest ? z:largest;
		System.out.println(largest1 +"is a largest number");
			
	}

}
