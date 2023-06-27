package codekata;  //right
import java.util.Scanner;
class Main{
   public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//System.out.println("num");
		int n=sc.nextInt();
		int[] n1=new int[n];
		//System.out.println("array");
		for(int i=0;i<n;i++)
		{
			n1[i]=sc.nextInt();
		}
		for(int i=0;i<n-1;i+=2)
		{
		int temp=n1[i];
		n1[i]=n1[i+1];
		n1[i+1]=temp;
		}
		for(int i=0;i<n;i++)
		{
		if(i<n-1)
			{
			System.out.print(n1[i]+" ");
			}
			else
			{
				System.out.print(n1[i]);
			}
		}
		
System.out.println();
	}

}
