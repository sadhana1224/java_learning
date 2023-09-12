package PracticeForInterview;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {

		System.out.println("enter the number"); //16461
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();	
		int rev=0;
	int	equalNum=num;
		while(num!=0)
		{
			rev=rev*10+num%10;
			num=num/10;
		}
		System.out.println(rev);
		
		if(rev==equalNum)
		{
			System.out.println("palindrome number");
		}
		else
		{
			System.out.println("Not a palindrome");
		}
	}

}
