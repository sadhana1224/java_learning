package PracticeForInterview;

public class ReverseStringUsingCharArrayAndSB {

	public static void main(String[] args) {

		//using charArray
	String str="sadhana";
	char[] c=str.toCharArray();
	int len=c.length;
	String rev="";
	
	for(int i=len-1;i>=0;i--)
	{
		rev=rev+c[i];
		//rev=""+c[7-1]=6-->a	
	}
	System.out.println(rev);
	
	
	//using StringBuffer and StringBuilder Class
	
	String s="logesh";
	StringBuilder sb=new StringBuilder(s);
	
	System.out.println(sb.reverse());
	}
}
