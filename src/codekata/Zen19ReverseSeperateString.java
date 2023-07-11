package codekata; //right

import java.util.Scanner;

public class Zen19ReverseSeperateString {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("String");
		String str=s.nextLine();
		String val="";
		String[] sp=str.split(" ");
		for(int i=sp.length-1;i>=0;i--)
		{
			val+=sp[i]+" ";
		}
		System.out.println(val.substring(0,val.length()-1));
	}

}
