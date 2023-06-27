package codekata;  //Strings 132..right

import java.util.Arrays;
import java.util.Scanner;

public class Strings132Sort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("String");
		String s=sc.nextLine();
		
		char[] c=s.toCharArray();
		Arrays.sort(c);
		
		String str=new String(c);
		System.out.println(str);
	}

}
