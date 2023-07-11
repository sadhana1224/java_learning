package codekata; //output right but in codekata output wrong checck this
import java.util.*;
public class Basics9Reptition {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("num1");
		int n=s.nextInt();
		System.out.println("num2");
		int k=s.nextInt();
		
		int[] ar=new int[n];
		System.out.println("array");
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=s.nextInt();
		}
		int count=0;
		for(int i=0;i<n;i++)
		{
			if(ar[i]==k)
			{
				count++;
			}
		}
if(count>0)
{
	System.out.println(count);
}
else
{
	System.out.println("-1");
}
	}

}
