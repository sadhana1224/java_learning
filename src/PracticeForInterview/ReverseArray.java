package PracticeForInterview;

public class ReverseArray {

	public static void main(String[] args) {

		int[] ar= {1,4,5,6,7};
		System.out.println("reversed array");
		for(int i=ar.length-1;i>=0;i--)
		{
			System.out.print(ar[i]+" ");
		}
		System.out.println();
		char[] c= {'a','c','f','d'};
		for(int i=c.length-1;i>=0;i--)
		{
			System.out.print(c[i]+" ");
		}
	}

}
