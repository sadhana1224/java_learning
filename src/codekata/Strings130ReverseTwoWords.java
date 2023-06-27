package codekata;  //Strings 130..right

import java.util.Scanner;

public class Strings130ReverseTwoWords {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("String");
		String s=sc.nextLine();
		
		String[] split=s.split(" ");
		for(int i=0;i<split.length;i++)
		{
			StringBuffer sb=new StringBuffer(split[i]);
			split[i]=sb.reverse().toString();
			System.out.print(split[i]+" ");
			
		}
		
		
		
	}

}
