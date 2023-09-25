package patternprograms;

public class reverse {

	public static void main(String[] args) {

		String str="sadhana";
		char[] c=str.toCharArray();
		
		String rev="";
		for(int i=c.length-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);
		
		String st="anu";
		StringBuffer sb=new StringBuffer(st);
		System.out.println(sb.reverse());
	}

}
