package codekata;  //strings 49..right

import java.util.Scanner;

public class RemoveVow {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the string");
		String str=s.nextLine();
		
		String res=str.replaceAll("[aeiou]","");
		StringBuffer sb=new StringBuffer(res);
		StringBuffer res1=sb.reverse();
		int l=res1.length();
		if(l==0)
		{
			System.out.println("-1");
		}
		else
		{
			System.out.println(res1);
		}
	}

}
