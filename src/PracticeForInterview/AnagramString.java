package PracticeForInterview;

import java.util.Arrays;

public class AnagramString {

	public static void main(String[] args) {

		String str="Race";
		String str1="Care";
		
		char[] c=str.toLowerCase().toCharArray();
		Arrays.sort(c);
		//System.out.println(c);
		
		char[] c1=str1.toLowerCase().toCharArray();
		Arrays.sort(c1);
		
		System.out.println(Arrays.equals(c, c1));
	}

}
