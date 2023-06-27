package codekata;  //strings 133 right

import java.util.Scanner;

public class Strings133RevWord {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("String");
		String s=sc.nextLine();
		
		String[] sp=s.split(" ");
		for(int i=0;i<sp.length;i++)
		{
			StringBuilder sb=new StringBuilder(sp[i]);
			sp[i]=sb.reverse().toString();
		}
		String res=String.join(" ", sp);
		System.out.println(res);
	}

}
