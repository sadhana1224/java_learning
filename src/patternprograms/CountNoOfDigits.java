package patternprograms;

public class CountNoOfDigits {

	public static void main(String[] args) {

		int num=45672634;
		int count=0;
		
		while(num>0)
		{
			num=num/10;
			count++;
		}
		System.out.println(count);
	}

}
