package PracticeForInterview;

// two conditions
//1....n>1
//2...number have only 2 factors, 1 and itself
public class PrimeNumber {

	public static void main(String[] args) {
		
		int num=17;
		int count=0;
		if(num>1)
		{
			for(int i=1;i<=num;i++)
			{
				if(num%i==0)
					count++;
			}
		
				if(count==2)
				{
					System.out.println("prime number");
				}
				else
				{
					System.out.println("not a prime number");
				}
		}
		else
		{
			System.out.println("Not prime number");
		}

	}
}


