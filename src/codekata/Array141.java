package codekata;  //right..same as array 136
import java.util.*;
public class Array141 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("num");
		int n=s.nextInt();
		int[] ar=new int[n];
		System.out.println("array");
		for(int i=0;i<n;i++)
		{
			ar[i]=s.nextInt();
		}
		int[] sm=new int[n];
		sm[n-1]=ar[n-1];
		//4-1=3 sm[3]=ar[3]=2
		
		for(int i=n-2;i>=0;i--)//2 4 4 2
		{
			sm[i]=sm[i+1]+ar[i];
			//sm[2]=sm[2+1]+ar[2]
			//sm[2]=2+4=6---
			//i dec by1
			//i=4-2=2-->i-- 1
			//sm[1]=sm[1+1]+ar[1]
			//sm[1]=6+4	==10		
		}
		for(int i=0;i<n;i++)
		{
			if(i<n-1)
			{
			System.out.print(sm[i]+" ");
			}
			else
			{
				System.out.println(sm[i]);
			}
		}
	}

}
