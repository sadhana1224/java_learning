package codekata;  //here crct but codekata..some error..strings 58

import java.util.Scanner;

public class EqualString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string ");
		String str=sc.nextLine();
		System.out.println("enter the second string ");
		String str1=sc.nextLine();
		
		String strr=str.toLowerCase();
		String strr1=str1.toLowerCase();
		
		char[] c=strr.toCharArray();
		char[] c1=strr1.toCharArray();
		
		int l=c.length;
		int l1=c1.length;
		if(l==l1)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
	}

}
