package codekata;//Strings 148..right

import java.util.Scanner;

public class Strings148LengthLongPalin {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
        System.out.println("Enter the string");
        String s1=sc.nextLine();
        
        String v=s1.substring(1);
        System.out.println(v);
        
        StringBuffer sb=new StringBuffer(v);
        sb.reverse();
        String rev=sb.toString();//this is very important line..we cant directly check the string buffer,convert to string and then check
        if(v.equals(rev))
        {
        	int length=v.length();
        	System.out.println(length);
        }
	}

}
