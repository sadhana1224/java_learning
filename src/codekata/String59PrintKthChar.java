package codekata; //here crct answer..codekata failed

import java.util.Scanner;

public class String59PrintKthChar {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("String");
		String s=sc.nextLine();
		System.out.println("number");
		int k=sc.nextInt();
		int l=s.length();
		for(int i=k-1;i<l;i+=k)
		{
			if(i+k<l)
			{
			System.out.print(s.charAt(i)+" ");
			}
			else
			{
				System.out.print(s.charAt(i));
			}
		}
	}

}
