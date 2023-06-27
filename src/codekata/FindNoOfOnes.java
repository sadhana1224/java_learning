package codekata;  //strings 85..right

import java.util.Scanner;

public class FindNoOfOnes {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int n=s.nextInt();
		
		String res=Integer.toBinaryString(n);
		System.out.println(res);
		int count=0;
		
		for(int i=0;i<res.length();i++)
		{
			if(res.charAt(i)=='1')
			{
				count++;
			}
		}
		System.out.println(count);
	}

}
