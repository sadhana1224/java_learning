package InterviewTricky;

public class GivenStringisNumericOrNOT {

	public static void main(String[] args) {

		String str="sasfdj";

		if(isNumeric(str))
		{
			System.out.println("yes");

		}
		else
		{
			System.out.println("no");
		}
	}

	public static boolean isNumeric(String str) {
		try {
			Double.parseDouble(str);
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}

}
