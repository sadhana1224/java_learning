package InterviewTricky;

import java.util.Scanner;

public class Sumof2pairinKval {

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		System.out.println("enter the K value");
		
	
		int n=s.nextInt();
		
		int[] ar=new int[n];
		System.out.println("array");
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=s.nextInt();
		}
		boolean flag=false;
		for(int i=0;i<ar.length;i++)
		{
			for(int j=i+1;j<ar.length-1;j++)
			{
				if(ar[i]+ar[j]==n)
				{
					flag=true;
					break;
				}
			}
		}
		if(flag)
		{
			System.out.println("k is present");
		}
		else
		{
			System.out.println("not");
		}
	}

}
