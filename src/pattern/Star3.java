package pattern;

public class Star3 {

	public static void main(String[] args) {

		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(i==1)
				{
			System.out.print(i);  //i/p as 1
				}
				else
				{
					System.out.print(i+" ");
					
				}
			}
			System.out.println();
		}
		
	}

}
