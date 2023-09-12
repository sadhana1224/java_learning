package codekata;// 1 tc passed

import java.util.Scanner;

public class Conpanies30Addarray {


	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("num");
		int n=s.nextInt();
		int[] ar=new int[n];
		System.out.println("array");
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=s.nextInt();
			
		}
		int sum=0;
		for(int i=0;i<ar.length;i++)
		{
		sum+=ar[i];	
		}
		System.out.println(sum);
	}

}
