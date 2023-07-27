package codekata;// correct

import java.util.Scanner;

public class Strings18 {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("string");
		String str=s.nextLine();
		int l=str.length();
		//System.out.println(l);
		
		if(l==3)
		{
			System.out.println("1");
		}
		else
		{
			System.out.println("0");
		}
	}

}
