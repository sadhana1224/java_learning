package codekata; //right
import java.util.*;
public class String26CountWords {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("string");
		String st=s.nextLine();
		
		char[] c=st.toCharArray();
		
		StringBuilder sb=new StringBuilder();
		StringBuilder sb1=new StringBuilder();
		
		for(int i=0;i<c.length;i++)
		{
			if(i%2==0)
			{
				sb.append(c[i]);
			}
			else
			{
				sb1.append(c[i]);
			}
		}
		System.out.println(sb+" "+sb1);
	}

}
