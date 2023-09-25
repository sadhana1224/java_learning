package patternprograms;

public class EvenOddNumArray {

	public static void main(String[] args) {

		int[] a= {10,3,25,44,2};
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				System.out.println("even-->"+a[i]);
			}
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2!=0)
			{
				System.out.println("odd-->"+a[i]);
			}
		}
	}

}
