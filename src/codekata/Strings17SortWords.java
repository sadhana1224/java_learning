package codekata;

import java.util.*;
import java.util.Scanner;

public class Strings17SortWords {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("num");
		int n=sc.nextInt();
		sc.nextLine();
		System.out.println("String");
		
		String[] str=new String[n];
		for(int i=0;i<n;i++)
		{
			str[i]=sc.nextLine();
		}

		
		Arrays.sort(str);
		for(String res:str)
		{
			System.out.println(res);
		}
		
	}

}
