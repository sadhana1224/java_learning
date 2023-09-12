package PracticeForInterview;

public class CountNoOfDigitsInNumber {

	public static void main(String[] args) {

		int num=12534556;
		//method-1
		int count=0;
		while(num>0)
		{
			num=num/10;
			count++;
		}
		System.out.println("No.Of Digits in a Number-->"+count);
		
		
		//using stringBufffer method
		int num1=454352416;
		StringBuffer sb=new StringBuffer(String.valueOf(num1));
		System.out.println(sb.length());
	}

}
