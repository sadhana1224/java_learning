package collectionsPractice;
import java.util.*;
public class Palindrome {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("string");
		String str=s.nextLine();

		char[] c=str.toCharArray();
		//int l=str.length();
		String res="";
		for(int i=c.length-1;i>=0;i--)
		{
			res+=str.charAt(i);
		}
		System.out.println(res);
		if(res.equals(str))
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not");
		}
	}

}
