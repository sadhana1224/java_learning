package codekata; //strings 48..right

import java.util.Scanner;

public class Print1and3char {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the string");
		String str=s.nextLine();
		
		String res=str.substring(0,1);
		String res1=str.substring(2, 3);
		System.out.println(res+res1);
	}

}
