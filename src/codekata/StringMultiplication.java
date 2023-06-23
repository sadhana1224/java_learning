package codekata;  //string 8-->right 

import java.util.Scanner;

public class StringMultiplication {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first string ");
		String n1=sc.nextLine();
		System.out.println("enter the second string ");
		String n2=sc.nextLine();
		
		long num=Long.parseLong(n1);
		long num1=Long.parseLong(n2);
		
		long res=num*num1;
		System.out.println(res);
		
	}

}
