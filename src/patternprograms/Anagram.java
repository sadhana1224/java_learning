package patternprograms;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {

		String s1="Race";
		String s2="Care";
		
		char[] c=s1.toLowerCase().toCharArray();
		Arrays.sort(c);
		
		char[] c1=s2.toLowerCase().toCharArray();
		Arrays.sort(c1);
		
		System.out.println(Arrays.equals(c, c1));
	}

}
