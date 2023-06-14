//Write a program to find the factorial value of any number entered through the keyboard. 
import java.util.Scanner;
public class FactAny
{
	public static void main(String args[])
	{
		Scanner num=new Scanner(System.in);
		System.out.println("enter the number:");
		int value=num.nextInt();
		int fact=1;
		for(int i=1;i<=value;i++)
		{
			fact=fact*i;
			System.out.println(fact);
		}
		
	}
}