package patternprograms;

public class Starpattern {

	public static void main(String[] args) {
		pattern1(4);
		pattern2(5);
		pattern3(4);
	
	}
	static void pattern1(int n)
	{
		for(int row=1;row<=n;row++)
		{
			for(int col=1;col<=row;col++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("-----------------------------");

	}
	
	static void pattern2(int n)
	{
		for(int row=1;row<=n;row++)
		{
			for(int col=1;col<=n;col++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("-----------------------------");
	}
		static void pattern3(int n)
		{
			for(int row=0;row<=n;row++)
			{
				for(int col=1;col<=n-row;col++) //c=n-n-r+1-->r=1  if r=0-->c=n-r
				{
					System.out.print("* ");
				}
				System.out.println();
			}
			System.out.println("-----------------------------");
	}
	
}
	
