package PracticeForInterview;


public class SplitSentence {

	public static void main(String[] args) {

		String str="java,selenium,maven,testng,pom";
		String sp=str.replace(","," ");
		System.out.println(sp);
		
		String s1="ABS";
		String s2="xyz";
		String s3="pqr";
		
		String con=s1.concat(s2);
		String finalres=con.concat(s3);
		System.out.println(finalres);
		System.out.println(s1.concat(s2).concat(s3));
		
		//using string buffer
		StringBuffer sb=new StringBuffer(s1);
		sb.append(s2);
		StringBuffer res=sb.append(s3);
		System.out.println(res.toString());
		
		
		
	}

}
