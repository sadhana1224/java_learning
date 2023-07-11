package codekata; //right
import java.util.*;
import java.util.Scanner;

public class Zen10MaximumNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("num ");
		int n=sc.nextInt();
		int[] ar=new int[n];
		System.out.println("array");
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}
		int max=ar.length-1;
		for(int i=0;i<ar.length;i++) //5 7 4 4 6 8
		{
			if(ar[i]>max)
			{
				max=ar[i];
			}
		}
		System.out.println(max);
	}

}
