package codekata;  //right
import java.util.*;
public class Array202RepeatingNum {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("num");
		int n=s.nextInt();
		int[] ar=new int[n];
		int count=0;
		
		System.out.println("array");
		for(int i=0;i<ar.length;i++)
		{
		ar[i]=s.nextInt();
		}
		for(int i=0;i<ar.length;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[i]==ar[j])
				{
					System.out.println(ar[j]);
				}
			}
		}
		

	}
}

