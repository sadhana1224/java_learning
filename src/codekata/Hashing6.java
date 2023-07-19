package codekata; //one test case passed
import java.util.*;
public class Hashing6 {

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		System.out.println("string");
		String st=s.nextLine();
		
		String res=st.replace('c', 'a');
		//System.out.println(res);
		
		StringBuffer sb=new StringBuffer(res);
		StringBuffer ans=sb.reverse();
		//System.out.println(ans);
		String ans1=ans.toString();
		
		if(ans1.equals(res))
		{
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");
		}
	
	}

}