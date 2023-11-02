package InterviewTricky;

import java.util.Scanner;

public class PrefixSumArray {

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		System.out.println("enter the num");
		int n=s.nextInt();
		
		int[] ar=new int[n];
		int[] pm=new int[n];
		
		System.out.println("array");
		for(int i=0;i<n;i++)
		{
			ar[i]=s.nextInt();
		}
		pm[0]=ar[0];
		for(int i=1;i<n;i++)
		{
			pm[i]=pm[i-1]+ar[i];
		}
		
		for(int i=0;i<n;i++)
		{
			if(i<n-1)
		System.out.print(pm[i]+" ");
			else
				System.out.println(pm[i]);
		}
	}

}
