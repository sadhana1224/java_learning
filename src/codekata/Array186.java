package codekata;  //one test case pass
import java.util.*;
public class Array186 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("num");
		int n=s.nextInt();
		String st=Integer.toString(n);
		int val=0;
		for(int i=0;i<st.length();i++)
		{
			int dig=Character.getNumericValue(st.charAt(i));
			
			 val+=dig;
			
		}
		//System.out.println(val);
		
		String res=new StringBuffer(Integer.toString(val)).reverse().toString();
		
		if(Integer.toString(val).equals(res))
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
		
	}

}
