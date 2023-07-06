package codekata; //right
import java.util.*;
public class Array100 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("num");
		int n=s.nextInt();

		int[] ar=new int[n];
		int[] ar1=new int[n];
		System.out.println("first array");
		for(int i=0;i<n;i++)
		{
			ar[i]=s.nextInt();
		}

		boolean ans=false;
		System.out.println("2nd array");
		for(int j=0;j<n;j++)
		{
			ar1[j]=s.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			if(ar[i]==ar1[n-i-1])
			{
				ans=true;
				break;
			}
		}
		if(ans)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
	}
}


