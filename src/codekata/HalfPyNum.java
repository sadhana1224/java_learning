package codekata;  //26 in pattern  //wrong output

import java.util.Scanner;

public class HalfPyNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("number");
		int r=sc.nextInt();
		
		for(int i=r;i>0;i--)
		{
			for(int j=r;j>=i;j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
