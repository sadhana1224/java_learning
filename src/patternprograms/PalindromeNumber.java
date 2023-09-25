package patternprograms;

public class PalindromeNumber {

	public static void main(String[] args) {

		int num=141;
		int rem = 0;
		int equalnum=num;
		while(num>0)
		{
			rem=rem*10+num%10;
			num=num/10;
		}
		System.out.println(rem);
		
		if(rem==equalnum)
		{
			System.out.println("palindrome");
		}
		else
			System.out.println("not palindrome");
	}

}
