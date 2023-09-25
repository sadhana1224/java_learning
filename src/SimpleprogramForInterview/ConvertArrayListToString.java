package SimpleprogramForInterview;

import java.util.ArrayList;

public class ConvertArrayListToString {

	public static void main(String[] args) {

		ArrayList<String> al=new ArrayList<String>();
		
		al.add("hello");
		al.add("america");
		al.add("start");
		al.add("the");
		al.add("party");
		
		System.out.println(al);
		//converting to string
		
		String str=String.join(" ", al);
		System.out.println(str);
	}

}
