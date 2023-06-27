package codekata;  //string 71..here ans crct..but codekata error

import java.util.Scanner;

public class KrepeatedinS {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string ");
		String s=sc.nextLine();
		System.out.println("enter the second string ");
		char k=sc.nextLine().charAt(0);
		//int count=0;
		int po=s.indexOf(k);
		System.out.println(po+1);
		for(int i=0;i<s.length();i++)
		{
		if(s.charAt(i)!=k)
		{
			
		}
		}
		System.out.println("-1");
	}

}
