package patternprograms;

public class Starpattern1 {

	public static void main(String[] args) {
		pattern4(4);
		pattern5(5);
		
	}
	
	static void pattern4(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println("--------------------------------");
	}
	static void pattern5(int n)
	{
		for(int i=0;i<=2*n;i++)
		{
			int totColsInRow=i>n ? 2*n-i : i ;
			for(int j=0;j<totColsInRow;j++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		System.out.println("--------------------------------");
	}
	

}
