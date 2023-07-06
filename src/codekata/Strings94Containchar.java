package codekata; //check
import java.util.*;
public class Strings94Containchar {

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		System.out.println("string");
		String str=s.nextLine();

		int l=str.length();
		char c;
		boolean ans=false;

		for(int i=0;i<l;i++)
		{
			c=str.charAt(i);

			if(c=='a' || c=='b')
			{
				ans=true;
				break;
			}
		}
		if(ans)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}

	}
}

