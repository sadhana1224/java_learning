package codekata; //strings 102..1 testcase pass

import java.util.Scanner;

public class ReplaceCharCheckPalin {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the string");
		String s1=s.nextLine();
		
		StringBuilder sb=new StringBuilder(s1); //replace a character in index 2
		sb.setCharAt(2, 'a');
		System.out.println(sb);
		
		StringBuffer sbb=new StringBuffer(sb); //reverse a string of sb
		sbb.reverse();
		System.out.println(sbb);
		 if (sb.toString().equals(sbb.toString()))
		{
		System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
		
	}

}
