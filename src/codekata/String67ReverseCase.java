package codekata; //right
import java.util.*;
public class String67ReverseCase {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("string");
		String str=s.nextLine();
		
		int l=str.length();
		char c;
		StringBuffer sb=new StringBuffer(l);
		for(int i=0;i<l;i++)
		{
			c=str.charAt(i);//read the character in a string
			
			if(Character.isUpperCase(c)) //if character is uppercase convert lowercase
			{
				c=Character.toLowerCase(c);
			}
			else if(Character.isLowerCase(c))//if character is lowercase convert uppercase
			{
				c=Character.toUpperCase(c);
			}
			sb.append(c);	//append the characters in string buffer
		}
			System.out.println(sb.toString()); //convert stringbuffer to string
	}

}
