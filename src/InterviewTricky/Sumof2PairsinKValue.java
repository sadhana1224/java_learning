package InterviewTricky;

import java.util.Scanner;

public class Sumof2PairsinKValue {

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		System.out.println("num1");
		
		int n=s.nextInt();
		int[] ar=new int[n];
		System.out.println("k value");
		int k=s.nextInt();
		
		System.out.println("array");
		for(int i=0;i<n;i++)
		{
			ar[i]=s.nextInt();
		}
		boolean flag=false;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(ar[i]+ar[j]==k)
				{
					flag=true;
					break;
				
				}
			}
		}
		if(flag)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
		
	}

}
