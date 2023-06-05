package assignment;
//How to count the occurrence of the given character in a string?
public class OccurChar {

	public static void main(String[] args) {
		/*
		String s="sadhana";
		char c=s.charAt(4);
		System.out.println("Occurance character of the given string is : "+ c);
		*/
		
		//input String
		String str="java";
		//character for which occurence should be calculated
		char ch ='a';
		
		int count= 0;
		
		for (int i=0; i<str.length();i++)
		{
			if(str.charAt(i) == ch)
			{
				count++; //count=count+1
			}
		}
		
		System.out.println("The character "+ch+" has repeated "+count+ " times");
		


	}

}
