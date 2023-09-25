package patternprograms;

public class DiamondPattern {

	public static void main(String[] args) {
		pattern7(5);
	}
	
	static void pattern7(int n)
	{
		for(int i=0;i<2*n;i++)
		{
			int totCol=i > n ? 2*n-i : i ;
			int spaces=n-totCol;
			for(int s=0;s<spaces;s++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<totCol;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

}
