package codekata; //right
import java.util.*;
public class Basics2Present {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("num1");
		int n=s.nextInt();
		int[] ar=new int[n];
		System.out.println("num2");
		int k=s.nextInt();
		System.out.println("array");
		boolean isPre=false;
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=s.nextInt();
		}
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]==k)
			{
				isPre=true;
				break;
			}
		}
	
	if(isPre)
	{
		System.out.println("yes");
	}
	else
	{
		System.out.println("no");
	}
	}

}
