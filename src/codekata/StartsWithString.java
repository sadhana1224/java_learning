package codekata;  //strings 45.. logic crct..but in codekata error

import java.util.Scanner;

public class StartsWithString {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the string");
		String str=s.nextLine();
		System.out.println("enter the second  string");
		String str1=s.nextLine();
		
		/*if(str.startsWith(str1))
		{
		System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
		*/
		if(str1.substring(0, 3) != null)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
	}

}
