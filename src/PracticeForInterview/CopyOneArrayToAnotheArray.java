package PracticeForInterview;

public class CopyOneArrayToAnotheArray {

	public static void main(String[] args) {

		int[] a1= {1,4,5,6};
		int[] a2=new int[a1.length];
		
		for(int i=0;i<a1.length;i++)
		{
			//copy array1 to array2
			a2[i]=a1[i];
		}
		for(int i=0;i<a2.length;i++)
		{
			System.out.print(a2[i]+" ");
		}
	}

}
