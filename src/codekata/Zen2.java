package codekata; //right
import java.util.*;
public class Zen2 {

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
		boolean present=true;
		for(int i=0;i<ar.length;i++)
		{
		
		if(ar[i]>15)
		{
			System.out.println(ar[i]);
			present=false;
			break;
		}	
	}
		if(present)
		{
			System.out.println("-1");
		}

	}
}
