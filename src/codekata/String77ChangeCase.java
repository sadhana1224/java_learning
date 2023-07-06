package codekata; //right
import java.util.*;
public class String77ChangeCase {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("string");
		String str=s.nextLine();
		char c;
		int l=str.length();
		StringBuilder sb=new StringBuilder(l);
		for(int i=0;i<l;i++)
		{
			c=str.charAt(i);
			if(Character.isUpperCase(c))
			{
				c=Character.toLowerCase(c);
			}
			else if(Character.isLowerCase(c))
			{
             c=Character.toUpperCase(c);
			}
			sb.append(c);
		}
System.out.println(sb.toString());
	}

}
