package PracticeForInterview;

public class SecondLargestinArray {

	public static void main(String[] args) {

		int[] ar= {34,56,23,87,85};
		
		int size=ar.length;
		
		for(int i=0;i<size;i++)
		{
			for(int j=i+1;j<size;j++)
			{
				if(ar[i]>ar[j])
				{
					int temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
		}
		System.out.println("second largest-->"+ar[size-2]);
	}

}
