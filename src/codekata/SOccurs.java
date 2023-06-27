package codekata;  //strings 37.. right

import java.util.Scanner;

public class SOccurs {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the string");
		String str=s.nextLine();
		System.out.println("enter the second string");
		String str1=s.nextLine();
		int count=0;
		if(str.contains(str1))
			
		{
			count++;
			System.out.println(count);
		}
		else
		{
			System.out.println("-1");
		}
	}

}
