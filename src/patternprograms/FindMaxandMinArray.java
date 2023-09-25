package patternprograms;

public class FindMaxandMinArray {

	public static void main(String[] args) {

		int[] a= {10,50,21,54,80};
		int max=a[0];
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println("max-->"+max);

		int min=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println("min-->"+min);

	}

}
