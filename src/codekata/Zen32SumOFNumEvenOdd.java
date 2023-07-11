package codekata; //right

import java.util.Scanner;

public class Zen32SumOFNumEvenOdd {

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
		//System.out.println(sum);
		if(sum%2==0)
		{
			System.out.println("even");
		}
		else
		{
			System.out.println("odd");
		}
	}

}
