package codekata; //one test case pass

import java.util.Scanner;

public class Zen27 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("String");
		String str=s.nextLine();
		char[] c=str.toCharArray();
		for(int i=0;i<c.length;i++)
		{
		if(str.contains("[\"\\f\\\t\n\b\r\']"))
		{
			System.out.println(str);
		}
		else
		{
			System.out.println("-1");
		}
		}
	}

}
