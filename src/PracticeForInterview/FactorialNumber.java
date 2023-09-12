package PracticeForInterview;

public class FactorialNumber {

	public static void main(String[] args) {

		int fact=7;
		int factRes=1;
		
		for(int i=1;i<=fact;i++)
		{
			factRes*=i;
		}
		System.out.println(factRes);
	}

}
