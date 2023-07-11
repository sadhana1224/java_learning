package codekata; //right

import java.util.Scanner;

public class Numbers7 {

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
		System.out.println("num2");
		int k=s.nextInt();
		
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]%k==0)
			{
				if(i<ar.length-1)
				System.out.print("1"+" ");
				else
					System.out.print("1");
			}
			else
			{
				if(i<ar.length-1)
				{
					System.out.print("0"+" ");
				}
				else
				{
					System.out.println("0");
				}
			}
				
		}


	}

}
