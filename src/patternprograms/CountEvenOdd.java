package patternprograms;

public class CountEvenOdd {

	public static void main(String[] args) {

		int num=12345;
		int evenc=0;
		int oddc=0;
		
		while(num>0)
		{
			int rem=num%10;
			if(rem%2==0)
			{
				evenc++;
			}
			else
			{
				oddc++;
			}
			num=num/10;
			
		}
		System.out.println(evenc);
		System.out.println(oddc);
	}

}
