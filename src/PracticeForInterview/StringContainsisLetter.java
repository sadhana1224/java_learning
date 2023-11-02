package PracticeForInterview;

public class StringContainsisLetter {

	public static boolean isletter(String str) {

		//String str="sadhana";
		
		for(int i=0;i<str.length();i++)
		{		
		 if ((Character.isLetter(str.charAt(i)) == false)) {
		return  false;
		 }
		}
		
		return true;
	}
public static void main(String[] args) {
	
	String str="sadhana";
	StringContainsisLetter s=new StringContainsisLetter();
	System.out.println(s.isletter(str));
}
}
