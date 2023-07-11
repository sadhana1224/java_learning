package codekata; //1 test case passed

import java.util.Scanner;
import java.util.*;
public class Basics36FindMaxMin {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("num1");
		int n=s.nextInt();
		
		int[] ar=new int[n];
		System.out.println("array");
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=s.nextInt();
		}
		
		int min=ar[0];
		int n1=1;
		int max=ar[0];
		int m=1;
		for(int i=0;i<ar.length;i++)
		{
			if(min>ar[i])
			{
				min=ar[i];
				n1=i+1;
			}
		}
		for(int i=0;i<ar.length;i++)
		{
			if(max<ar[i])
			{
				max=ar[i];
				m=i+1;
			}
		}
		System.out.println(min+" "+max);
		
		/*
		LinkedList<Integer> li=new LinkedList<Integer>();
		for(int i=0;i<ar.length;i++)
		{
			li.add(ar[i]);
		}
		for(int i=0;i<li.size();i++)
		{
			//System.out.println(li.get(i));
			
		}
		int val=li.getFirst();
		int val1=li.getLast();
		System.out.println(val+" "+val1);
		*/
		
		
	}

}
