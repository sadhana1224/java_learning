package PracticeForInterview;

import java.util.Arrays;

public class AnagramString {

	static void isAnagram(String str1,String str2)
	{
		
		boolean flag=true;
		
		if(str1.length()!=str2.length())
			
		{
			flag=false;
		}
		else
		{
			char[] c=str1.toLowerCase().toCharArray();
			char[] c1=str2.toLowerCase().toCharArray();
			
			Arrays.sort(c);
			Arrays.sort(c1);
			
			flag=Arrays.equals(c, c1);
		}
		if(flag)
		{
			System.out.println("2 strings are anagram");
		}
		else
		{
			System.out.println("not anagram");
		}
	}
	public static void main(String[] args) {

		
		isAnagram("listen","silent");
		isAnagram("keep","peek");
		isAnagram("vijay","vinay");
		
		
		/*
		String str="Race";
		String str1="Care";
		
		char[] c=str.toLowerCase().toCharArray();
		Arrays.sort(c);
		//System.out.println(c);
		
		char[] c1=str1.toLowerCase().toCharArray();
		Arrays.sort(c1);
		
		System.out.println(Arrays.equals(c, c1));
		*/
		
	
	}

}
