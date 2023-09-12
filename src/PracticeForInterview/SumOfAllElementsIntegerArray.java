package PracticeForInterview;

public class SumOfAllElementsIntegerArray {
//How do you get the sum of all elements in an integer array in Java?
	public static void main(String[] args) {
//first method
		int[] a= {2,5,9,7,5,6};
		
		int sum = 0;
		
		for(int val:a)
		{
			sum=sum+val;
		}
		System.out.println(sum);
		
		
		//second method-normal for loop
		int sum1=0;
		for(int i=0;i<a.length;i++)
		{
			 sum1=sum1+a[i];
		}
		System.out.println(sum1);
	}

}
