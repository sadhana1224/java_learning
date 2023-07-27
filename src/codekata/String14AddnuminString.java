package codekata;  // correct
import java.util.*;
public class String14AddnuminString {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("string");
		String str=s.nextLine();
		int sum=0;
		StringBuffer sb=new StringBuffer();
		StringBuffer a = null;
		for(char c:str.toCharArray())
		{
			if(Character.isLetter(c))
			{
				a=sb.append(c);
			}
			else if(Character.isDigit(c))
			{
				sum+=Character.getNumericValue(c);
			}	
		}
		System.out.println(a.toString()+sum);

	}

}
