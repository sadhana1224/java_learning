package codekata; //one test case pass
import java.util.*;
public class Zen53Largest2nd {
	public static int SecondLarge(int n,int[] ar)
	{
		Arrays.sort(ar);
		return ar[n-2] ;
		
	}

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
		int large=SecondLarge(n,ar);
		System.out.println(large);

	}

}
