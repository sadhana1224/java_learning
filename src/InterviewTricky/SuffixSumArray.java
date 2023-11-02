package InterviewTricky;

public class SuffixSumArray {

	public static void main(String[] args) {

		int[] ar= {2,4,4,2};
		
		int[] pm=new int[ar.length];
		
		pm[0]=ar[0];
		for(int i=1;i<ar.length;i++)
		{
			pm[i]=pm[i-1]+ar[i];
		}
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(pm[i]+" ");
		}
		System.out.println();
		System.out.println("suffix sum array");
		int n=pm.length;
		for(int i=n-1;i>=0;i--)
		{
			System.out.print(pm[i]+" ");
		}
		
	}

}
