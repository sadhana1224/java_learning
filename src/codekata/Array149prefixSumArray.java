package codekata;  // 1 test case pass
import java.util.*;
public class Array149prefixSumArray {

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
		int[] pm=new int[n]; //2 4 4 4-->2 6 10 14
		pm[0]=ar[0];
		for(int i=1;i<n;i++)
		{
			if(ar[i]%2==0)
			{
			pm[i]=pm[i-1]+ar[i];
			//pm[1]=2+4-->6
			}
			else
			{
				pm[i]=ar[i];
			}
		}
			for(int i=0;i<n;i++)
			{
				if(i<n-1)
				System.out.print(pm[i]+" ");
				else
					System.out.print(pm[i]);
			}
			
			
		
	}

}
