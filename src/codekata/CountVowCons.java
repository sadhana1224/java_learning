package codekata; //strings 104 ..one TC pass

import java.util.Scanner;

public class CountVowCons {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the string");
		String s1=s.nextLine();
		int vow=0;
		int cons=0;
		String low=s1.toLowerCase();
		for(int i=0;i<low.length();i++)
		{
			if(low.charAt(i)=='a' ||low.charAt(i)=='e'||low.charAt(i)=='i'||low.charAt(i)=='o'||low.charAt(i)=='u' )
			{
				vow++;
			}
			else if(low.charAt(i)>='a' && low.charAt(i)<='z')
			{
				cons++;
			}
			
		}
		int a=vow;
		int b=cons;
		System.out.println(a+b);
	}

}
