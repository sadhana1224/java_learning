package codekata;

import java.util.Scanner;

public class Zen35RepeatNum {

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
		for(int i=0;i<ar.length;i++)
		{
			for(int j=1;j<i;j++)
			{
				if(ar[i]==ar[j])
				{
					System.out.print(ar[j]);
				}
				
			}
		}
		
	}
}


