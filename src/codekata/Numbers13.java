package codekata;

import java.util.Scanner;

public class Numbers13 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("num");
		int n=sc.nextInt();
		
		String s=Integer.toString(n);
		int l=s.length();
		
	int res=0;
	int pro=1;
		for(int i=0;i<l;i++)
		{
			int val=Character.getNumericValue(s.charAt(i));
			res=res+val;
			pro=pro*val;
		}
		if((res+pro)==n)
		{
			System.out.println("great");
		}
		else
		{
			System.out.println("no");
		}
		
		
		
	}

}
