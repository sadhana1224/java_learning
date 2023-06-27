package codekata; //strings 40..right

import java.util.Scanner;

public class FindLength_W_oPredefined {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the string");
		String str=s.nextLine();
		
		char[] c=str.toCharArray();
		int res=c.length;
		System.out.println(res);
	}

}
