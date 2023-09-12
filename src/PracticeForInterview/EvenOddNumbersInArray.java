package PracticeForInterview;

public class EvenOddNumbersInArray {

	public static void main(String[] args) {
		int[] a= {2,5,4,7,9,6};
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				System.out.println("Even numbers are-->"+a[i]+" ");
			}
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2!=0)
			{
				System.out.println("Odd Numbers are-->"+a[i]+" ");
	
			}
				
		}
		
		//for each
		for(int val:a)
		{
			if(val%2==0)
			{
				System.out.println("even numers-->"+val);
			}
		}
	}

}
