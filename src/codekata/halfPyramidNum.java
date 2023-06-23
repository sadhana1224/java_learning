package codekata;  //23 in pattern

import java.util.Scanner;

public class halfPyramidNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("number");
		int r=sc.nextInt();
		
		for(int i=0;i<=r;i++)
		{
			for(int j=1+i;j<=r;j++)
			{
			System.out.print(j);
			}
			System.out.println();
		}
	}

}
