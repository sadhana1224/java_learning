package PracticeForInterview;

public class TotalNoOfCharOccuranceinGivenString {

	public static void main(String[] args) {

		String str="java is a programming language";
		
		char c='a';
		
		int val=str.length()-str.replace(String.valueOf(c), "").length();
		
		System.out.println(val);
		
		
		
		//convert integer to String
		
		int n=10;
		String s=String.valueOf(n);
		System.out.println(s);
	}

}
