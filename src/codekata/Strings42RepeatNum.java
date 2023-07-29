package codekata;  //right
import java.util.*;
public class Strings42RepeatNum {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("num");
		int n=s.nextInt();
		String st=Integer.toString(n);
		//char[] c=st.toCharArray();
		
		boolean repeatnum=false;
		for(int i=0;i<st.length();i++)
		{
			for(int j=i+1;j<st.length();j++)
			{
				if(st.charAt(i)==st.charAt(j))
				{
					repeatnum=true;
					break;
				}
			}
		}
		if(repeatnum)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}

	}

}
