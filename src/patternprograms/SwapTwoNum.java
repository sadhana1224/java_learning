package patternprograms;

public class SwapTwoNum {

	public static void main(String[] args) {

		int a=10;
		int b=20;
		
		int temp=a;
		a=b;
		b=temp;
		
		System.out.println(a+" "+b);
		
		int a1=10,b1=20;
		int sum=a1+b1;
		System.out.println(sum);
		a1=sum-a1;
		b1=sum-b1;
		System.out.println(a+" "+b);
	}

}
