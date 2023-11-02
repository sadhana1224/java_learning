package PracticeForInterview;

public class ConversionStringtoInteger {

	public static void main(String[] args) {

		String s="1234";
		
		int n=Integer.parseInt(s);
		
		float f=Float.parseFloat(s);
		
		double d=Double.parseDouble(s);
		
		System.out.println(n+" "+f+" "+d);
	}

}
