package PracticeForInterview;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		System.out.println("enter the number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int rev=0;
		// using algorithm
	while(num!=0)     //123!=0
		{
			rev=rev*10+num%10;  //rev=0+1234%10->4--->4
			                     //rev=4*10 + 123%10-->3-->40+3->43
			num=num/10;
			//num=1234/10-->123
			//num=123/10-->12
		}
		System.out.println(rev);
		
		//using stringBuffer and StringBuilder class
		
		int n=5467;
		
		StringBuffer sb=new StringBuffer(String.valueOf(n));
		StringBuffer reverse=sb.reverse();
		System.out.println("reverse a number using StringBuffer-->"+reverse);
	}

}
