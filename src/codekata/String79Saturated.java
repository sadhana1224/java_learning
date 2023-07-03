package codekata;//right

import java.util.Scanner;

public class String79Saturated {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("String");
		String s=sc.nextLine();

		String[] sp=s.split(" ");
		int l=sp.length;
		for(int i=0;i<l;i++)
		{
			//System.out.println(sp[i]);
			StringBuilder sb=new StringBuilder(sp[i]);
			sb.reverse();
			if(i!=l-1)
			{
				System.out.print(sb+" ");
			}
			else
			{
				System.out.print(sb);
			}
		}

	}

}
