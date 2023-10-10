package PracticeForInterview;

public class SwapTwoStrings {

	public static void main(String[] args) {

		String a="hello";
		String b="world";
		
		a=a+b; //helloworld
		
		b=a.substring(0,a.length()-b.length()); //(0,10-5)-->(0,5)
		a=a.substring(b.length());
		
		System.out.println(a+" "+b);
	}

}
