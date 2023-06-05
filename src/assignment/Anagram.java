package assignment;

import java.util.Arrays;

//How to check if two strings are anagrams of each other?
public class Anagram {

	public static void main(String[] args) {

		String s1="Race";
		String s2="Care";
		
		char[] c=s1.toLowerCase().toCharArray();
		//System.out.println(c);
		Arrays.sort(c);
		
		char[] c2= s2.toLowerCase().toCharArray();
		Arrays.sort(c2);
		
		System.out.println(Arrays.equals(c, c2));
		
		
	}

}
