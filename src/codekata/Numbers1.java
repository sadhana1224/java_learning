package codekata;  //numbers 1..right

import java.util.Scanner;

public class Numbers1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("num");
		int n=sc.nextInt();
		int[] n1=new int[n];
		
		System.out.println("array");
		for(int i=0;i<n;i++)
		{
			n1[i]=sc.nextInt();
		}
		int res = 0;
		for(int i=0;i<=n-1;i++)
		{
			 res+=n1[i];
			
		}
		//System.out.println(res);
		if(res%2==0 && res%3==0 && res%5==0)
		{
			System.out.println("1");
		}
		else
		{
			System.out.println("0");
		}
	}

}
