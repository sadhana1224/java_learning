package codekata; //right

import java.util.Scanner;

public class Zen34Reverse {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("String");
		String str=s.nextLine();
		String[] sp=str.split(" ");
		String val="";
		String res="";
		for(int i=0;i<sp.length;i++)
		{
			val+=sp[i]+" ";
			
		}
		//System.out.println(val);
		StringBuffer sb=new StringBuffer(val);
		sb.reverse();
		res=sb.toString();
		//System.out.println(res);
		String[] sp1=res.split(" ");
		String val1="";
		for(int i=sp1.length-1;i>=0;i--)
		{
			val1+=sp1[i]+" ";
			
		}
		System.out.println(val1.trim());
	}

}
