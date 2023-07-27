package codekata;  //1 tc pass
import java.util.*;
public class Strings9UpperCase {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("string");
		String str=s.nextLine();
		System.out.println("num");
		int n=s.nextInt();
		String res="";
		String res1="";
		String ans="";
		String ans1="";
		
		
		switch(n)
		{
		case 1:
			 res=str.toLowerCase();
			 ans=res.substring(0,1).toUpperCase()+res.substring(1);
			break;
			
	
		case 2:
			 res1=str.toUpperCase();
			 ans1=res1.substring(0,1).toUpperCase()+res1.substring(1);
			break;
			
			default:
				System.out.println("error");
			
		}
		if(n==1)
		System.out.println(ans);
		else
		System.out.println(ans1);
	}

}
