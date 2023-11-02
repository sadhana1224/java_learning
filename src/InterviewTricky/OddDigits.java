package InterviewTricky;

public class OddDigits {

	public static void main(String[] args) {

		int num=413; //add the odd digits and check the res is even or odd
		int sum=0;
		int sum1=0;
		while(num>0)
		{
			int rem=num%10;
			if(rem%2!=0)
			{
				sum=sum+rem;	
			}
			else if(rem%2==0)
			{
				sum1=sum1+rem;
			}
			num=num/10;
		}
		
		if(sum%2==0)
		{
			System.out.println("E");
		}
		else
		{
			System.out.println("O");
		}
	}

}
