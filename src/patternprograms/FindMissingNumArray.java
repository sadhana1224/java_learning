package patternprograms;

public class FindMissingNumArray {

	public static void main(String[] args) {

		int[] a= {1,2,4,5};
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		System.out.println(sum);
		
		int[] b= {1,2,3,4,5};
		int s=0;
		for(int i=0;i<b.length;i++)
		{
			s=s+b[i];
		}
		System.out.println(s);
		System.out.println("missing number is-->"+(s-sum));
	}

}
