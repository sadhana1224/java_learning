package codekata;

import java.util.Scanner;

public class Strings127PrintVowCons {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string ");
		String str=sc.nextLine();

		String consonant=str.replaceAll("[aeiouAEIOU]", "");
		String vowels=str.replaceAll("[bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ]", "");
	
		
		String res=vowels.concat(consonant);
		System.out.println(res);
		
	}

}
