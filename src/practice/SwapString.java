package practice;

public class SwapString {

	public static void main(String[] args) {

		String s1="hello";
		String s2="world";
		
		String temp=s1;
		s1=s2;
		s2=temp;
		
		System.out.println(s1+" "+s2);
	}

}
