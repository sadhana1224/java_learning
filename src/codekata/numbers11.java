package codekata;//numbers 11 ..right

import java.util.Scanner;

public class numbers11 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("num");
		int n=sc.nextInt();
		int res=1;
		for(int i=1;i<=n;i++)
		{
			res=i*i+1;
			if(i!=n)
			{
			System.out.print(res+" ");
			}
			else
			{
				System.out.print(res);
			}
		}
		
	}

}
