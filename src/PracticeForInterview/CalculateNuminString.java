package PracticeForInterview;

public class CalculateNuminString {

	public static void main(String[] args) {

		String str="java1234";
		int sum=0;
		for(int i=0;i<str.length();i++)
		{
			char c=str.charAt(i);
			if(Character.isDigit(c))
			{
				int b=Integer.parseInt(String.valueOf(c));
				sum+=b;
			}
		}
		System.out.println(sum);
	}

}
