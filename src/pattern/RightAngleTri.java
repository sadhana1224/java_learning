package pattern;

public class RightAngleTri {

	public static void main(String[] args) {
int n=3;

for(int i=0;i<n;i++)
{
	for(int j=1;j<=i*2+1;j++)
	{
		if(j==i*2+1)
		{
		System.out.print("1");
		}
		else {
			System.out.print("1 ");
		}
	}
	System.out.println();
}
	}

}
