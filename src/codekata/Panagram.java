package codekata;  //strings 30  //logic crcrt but anser wrong
import java.util.Arrays;
import java.util.Scanner;
public class Panagram {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the string");
		String str=s.nextLine();
		System.out.println("enter the second string");
		String str1=s.nextLine();
		//palindrome
		
		StringBuffer sb=new StringBuffer(str);
		StringBuffer res=sb.reverse();
		StringBuffer sb1=new StringBuffer(str1);
		StringBuffer res1=sb1.reverse();
		System.out.println(res);
		System.out.println(res1);
		if(res.toString().equals(res1.toString()))
		{
			System.out.println("0");
		}
		else
		{
			System.out.println("1");
		}
	}
}
