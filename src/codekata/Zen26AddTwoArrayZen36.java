package codekata; //right

import java.util.Scanner;

public class Zen26AddTwoArrayZen36 {

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
		int[] ar1=new int[n];
		for(int i=0;i<ar1.length;i++)
		{
			ar1[i]=s.nextInt();
		}
		int count=0;
		int l=Math.min(ar.length, ar1.length);
		int res[]=new int[l];
		for(int i=0;i<l;i++)
		{
			if(ar[i]==ar1[i]) //this part zen36
			{
				
				res[i]=ar[i]+ar1[i];
				if(count>0)
				{
					System.out.print(" ");
				}
				System.out.print(res[i]);
				count++;
			}
		}
		if(count==0)
		{
			
			System.out.print("-1");
			/*
			res[i]=ar[i]+ar1[i];  //this part zen26
			if(i<l-1)
			System.out.print(res[i]+" ");
			else
				System.out.print(res[i]);
				*/
		}
		
		
	}

}
