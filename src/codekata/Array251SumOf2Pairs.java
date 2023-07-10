package codekata; //right
import java.util.*;
public class Array251SumOf2Pairs {

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		System.out.println("num");
		int n=s.nextInt();
		int[] ar=new int[n];
		System.out.println("k");
		int k=s.nextInt();
		System.out.println("array");
		boolean isOnce=false;
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=s.nextInt();
		}
		for(int i=0;i<ar.length;i++)
		{
			for(int j=1;j<ar.length-1;j++)
			{
				if(ar[i]+ar[j]==k)
				{
					isOnce=true;
					break;
				}

			}
		}
		if(isOnce)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
	}

	}
