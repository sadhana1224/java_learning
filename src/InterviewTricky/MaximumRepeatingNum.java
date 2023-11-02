package InterviewTricky;

import java.util.Scanner;

public class MaximumRepeatingNum {

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		System.out.println("enter the num");
		int n=s.nextInt();
		
		int[] ar=new int[n];
		System.out.println("array");
		for(int i=0;i<n;i++)
		{
			ar[i]=s.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n-1;j++)
			{
				if(ar[i]==ar[j])
				{
					System.out.println(ar[j]);
				}
			}
		}
	}

}
