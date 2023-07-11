package codekata; //right

import java.util.Scanner;

public class Zen21SmallNum {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("num1");
		int n=s.nextInt();
		
		int[] ar=new int[n];
		System.out.println("array");
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=s.nextInt();
		}
		int small=ar[0];
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]<small)
			{
				small=ar[i];
			}
		}
System.out.println(small);
	}

}
