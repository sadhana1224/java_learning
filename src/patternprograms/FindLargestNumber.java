package patternprograms;

public class FindLargestNumber {

	public static void main(String[] args) {

		int a=14,b=344,c=56;
		
		if(a>b && a>c)
		{
			System.out.println("a is largest");
		}
		else if(b>c && b>a)
		{
			System.out.println("b is largest");

		}
		else
		{
			System.out.println("c is largest");

		}
	}

}
