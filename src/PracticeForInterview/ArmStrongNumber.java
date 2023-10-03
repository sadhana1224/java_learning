package PracticeForInterview;

public class ArmStrongNumber {

	public static void main(String[] args) {

		int n=371;
		int on=n;
		int res=0;
		while(n!=0)
		{
			int rem=n%10;
		//	res=res+(rem*rem*rem);
			res+=Math.pow(rem,3);
			n=n/10;
		}
		if(res==on)
		{
			System.out.println("armstrong number");
		}
		else
		{
			System.out.println("not armstrong number");
		}
	}

}
