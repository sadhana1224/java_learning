package codekata; //right
import java.util.*;
public class Sorting21 {

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
		Arrays.sort(ar);
		int l=ar.length;
		for(int i=0;i<l;i++)  //print the sort elements
		{
		    System.out.print(ar[i]);
		    if(i<l-1)
		    {
		    	System.out.print(" ");
		    }
		}
		
		/*
		Object[] ob=li.toArray();//convert list to array
		for(Object obj:ob)
		{
		System.out.print(obj+" ");
		}
		*/
		
	}

}
