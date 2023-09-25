package SimpleprogramForInterview;

public class AlphabetOrNot {

	public static void main(String[] args) {

		char c='a';
		
		if((c>='a' && c<='z' ) || (c>='A' && c<='Z' ))
		{
			System.out.println("It is Alphabetic");
		}
		else
		{
			System.out.println("It is not Alphabetic");
		}
	}

}
