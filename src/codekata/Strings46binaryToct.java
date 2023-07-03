package codekata; //strings 46 right
import java.util.*;

public class Strings46binaryToct {

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("String");
		String s1=sc.nextLine();
		
		
	int val=Integer.parseInt(s1,2);
	String oct=Integer.toOctalString(val);
	System.out.println(oct);
	}

	
	}
