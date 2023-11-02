package PracticeForInterview;

public class StringContainsDigits {

	public static void main(String[] args) {

		String str="34454";
		
		if(str.matches("[0-9]+") && str.length()>0)
		{
			System.out.println("string contains digits");
		}
		else
		{
			System.out.println("not");
		}
	}

}
