package PracticeForInterview;
//Write a Java program to check if a vowel is present in a string.
public class StringContainsVowels {

	public static void main(String[] args) {

		String str="selenium learning";
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='a' || str.charAt(i)=='e' ||str.charAt(i)=='i'
					||str.charAt(i)=='o' ||str.charAt(i)=='u' )
			{
				System.out.println(str.charAt(i)+" -->at the index of "+i);
			}
		}
		
	}

	
	}


