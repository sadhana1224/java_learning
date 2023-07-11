package codekata; //right
import java.util.*;
public class Zen13PrintNum {

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
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]<15)
			{
				if(i<ar.length-1)
				System.out.print(ar[i]+" ");
				else
					System.out.print(ar[i]);
			}
			else
			{
				System.out.println("-1");
			}
		}
		}
		
	}


