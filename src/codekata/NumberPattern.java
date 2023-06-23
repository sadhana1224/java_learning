package codekata;

import java.util.Scanner;

public class NumberPattern {

		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("number");
			int r=sc.nextInt();
			
			for(int i=0;i<r;i++)
			{
				for(int j=1;j<=r-i;j++)
				{
					if(j==r-i)
					System.out.print("1");
					else
						System.out.print("1 ");
				}
		
				System.out.println();
			}

}
}