package patternprograms;

public class Factorial {

	public static void main(String[] args) {

		int fact=15;
		int factres=1;
		
		for(int i=1;i<=fact;i++)
		{
			factres*=i;
		}
		System.out.println(factres);
	}

}
