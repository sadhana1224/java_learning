package PracticeForInterview;

public class MissingNumberInArray {

	public static void main(String[] args) {

		//array dont have duplicates
		//no need to sort the array
		//value should be in range
		
		int a[]= {1,2,4,5};
		//sum=1+2+4+5=12;
		//sum1=1+2+3+4+5;
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum+=a[i];
		}
		System.out.println("sum of all elements in array-->"+sum);
		
		int sum1=0;
		for(int i=1;i<=5;i++)
		{
			sum1+=i;
		}
		System.out.println("sum of 1 to 5 elements in array-->"+sum1);
		
		System.out.println("Missing Number is-->"+(sum1-sum));
	}

}
