package PracticeForInterview;

public class StringsImmutable {

	public static void main(String[] args) {

		String s1="java";
		
		String s2="java";
		
		System.out.println(s1.equals(s2));
		
		s1=s1+"hello";
		
		System.out.println(s1.equals(s2));
	}

}
