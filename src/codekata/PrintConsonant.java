package codekata;  //strings 3 --Right

import java.util.Scanner;

public class PrintConsonant {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string ");
		String str=sc.nextLine();
		
		
		String str1=str.replaceAll("[aeiouAEIOU]", "");
	
		
		System.out.println(str1);
		
	}

}
