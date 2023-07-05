package codekata; // right 
import java.util.Scanner;

public class Basics26AndBitwise {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] ar=new int[n];

		for(int i=0;i<ar.length;i++)
		{
			ar[i]=s.nextInt();
			
		}
		int ans=0;
		for(int i=0;i<ar.length;i++)
		{
			 ans=ans|ar[i];
		}
		System.out.println(ans);
	}

}
