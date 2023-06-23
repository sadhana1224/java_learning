package codekata;//15 in pattern

import java.util.Scanner;

public class Fullpyramid {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int r=sc.nextInt();
		
		for(int i=1;i<=r;i++)
		{
			for(int s=1;s<=r-i;s++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(" *");
			}
			for(int s=1;s<=r;s++)
			{
				System.out.print("");
			}
			System.out.println();
		}
	}

}
