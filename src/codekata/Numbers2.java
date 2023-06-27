package codekata;

import java.util.Scanner;

public class Numbers2 {

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
		
		int max=0;
		int mf=0;
		for(int i=0;i<n;i++)
		{
			int count=0;
			for(int j=0;j<n;j++)
			{
				if(n1[i]==n1[j])
				{
					count++;
				}
			}
			if(count>max)
			{
				max=count;
				mf=n1[i];
			}
		}
		System.out.println(mf);
	}

}
