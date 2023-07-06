package codekata;  //right
import java.util.*;
public class Array136 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("num");
		int n=s.nextInt();
		int[] ar=new int[n];
		int[] pm=new int[n];

		System.out.println("array");
		for(int i=0;i<ar.length;i++)
		{
         ar[i]=s.nextInt();
		}
		pm[0]=ar[0];  //first element is default
		for(int i=1;i<n;i++)
		{
			
			pm[i]=pm[i-1]+ar[i]; //index starts from 1 and add prefix sum array
		}
		
		for(int i=0;i<n;i++) 
		{
			if(i<n-1)
			{
			System.out.print(pm[i]+" "); //print the array elements
			}
			else
			{
				System.out.print(pm[i]);
			}
		}

	}

}
