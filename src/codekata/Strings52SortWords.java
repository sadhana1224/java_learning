package codekata;  //strings 52 right

import java.util.Arrays;
import java.util.Scanner;

public class Strings52SortWords {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("String");
		String s=sc.nextLine();
		
		String[] sp=s.split(" ");
		Arrays.sort(sp);
		//System.out.println(Arrays.toString(sp));
		String ans=String.join(" ",sp);
		System.out.println(ans);
				
	}

}
