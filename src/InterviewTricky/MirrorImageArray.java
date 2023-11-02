package InterviewTricky;

import java.util.Scanner;

public class MirrorImageArray {

	public static void main(String[] args) {
 
		Scanner s=new Scanner(System.in);
		System.out.println("enter the num");
		int n=s.nextInt();
		
		int[] ar=new int[n];
		int[] ar1=new int[n];
		
		System.out.println("enter the first array");
		for(int i=0;i<n;i++)
		{
			ar[i]=s.nextInt();
		}
		System.out.println("enter the second array");
		for(int i=0;i<n;i++)
		{
			ar1[i]=s.nextInt();
		}
		boolean flag=false;
		for(int i=0;i<n;i++)
		{
			if(ar[i]==ar1[n-i-1])
			{
				flag=true;
				break;
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
