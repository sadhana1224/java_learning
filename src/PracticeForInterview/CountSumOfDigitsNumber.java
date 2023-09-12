package PracticeForInterview;

public class CountSumOfDigitsNumber {
//count number of digits in a number
	public static void main(String[] args) {

		
		int num=12349;
		int sum=0;
		while(num>0)
		{
			sum=sum+num%10;
			num=num/10;
		}
		System.out.println(sum);
	}

}
