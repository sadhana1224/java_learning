package codekata;  //right..very important program

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class GuViLP4 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("num");
		int n=s.nextInt();
		int[] ar=new int[n];
		System.out.println("array");
		for(int i=0;i<ar.length;i++)//get array elements
		{
			ar[i]=s.nextInt();
		}
		
		LinkedList<Integer> ll1=new LinkedList<Integer>();
		for(int num:ar)//add the elements
		{
			
			ll1.add(num);
		}
		int l=ll1.size();
		for(int i=l-1;i>=0;i--)//print the reverse elements
		{
			if(i!=0)
			{
			System.out.print(ll1.get(i)+" ");
			}
			else
			{
				System.out.print(ll1.get(i));	
			}
		}
		
		
	}

}
