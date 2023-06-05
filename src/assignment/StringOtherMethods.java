package assignment;

public class StringOtherMethods {

	public static void main(String[] args) {


		String str="hello world";
		//endsWith() method                          //endsWith() method returns a boolean value
		boolean endsWithString=str.endsWith("world");   //Tests if this string ends with the specified suffix.
		System.out.println(endsWithString);           //If the user provides a word or any single character.

		//strartsWith() method
		//it return a boolean value
		boolean startsWithString=str.startsWith("h");  //tests  if this string starts with the specified prefix.
		System.out.println(startsWithString);


		//StringJoin() method      //it returns a string joined with a given delimiter.
		String joinString=String.join("/","java","is","a","programming","language"); //Returns a new String composed of copies of the CharSequence elements joined together with a copy ofthe specified delimiter. 
		System.out.println("joinstring is : " +joinString);           //delimiter--> the delimiter that separates each element

		//String CompareTo() Method    //method compares the given string with the current string lexicographically. 
		String s1="hello";          //It returns a positive number, negative number, or 0.
		String s2="hello";
		String s3="hallo";
		String s4="hamlo";
		String s5="world";
		System.out.println(s1.compareTo(s2));  //it returns 0 because both are equal
		System.out.println(s1.compareTo(s3)); //it return 4--  'e' is 4 times greater than 'a'
		System.out.println(s3.compareTo(s4));  // it returns -1..because 'l' is 1 time less than 'm'
		System.out.println(s1.compareTo(s5)); //it return -15..because  'h' is 15 time less than 'w'

		//toCharArray method     //which converts a string into a character array.

		String str1="Hello world!"; //If I provide a string without spaces, it will be printed according to the stored string.
		char[] chArr=str1.toCharArray(); //the method is called on the string str1,which converts into a character array
		//System.out.println(chArr[1]);
		for(int i=0;i<chArr.length;i++)  //individual characters in the array are printed using a for loop.
		{
			System.out.println(chArr[i]);
		}

		//split() method
		//split() method is used to split or separate the given String into multiple substrings separated by the delimiters
		String str2="Java/works/on/different/platforms "; 
		String[] splitMsg=str2.split("/"); //the resulting words are stored in 'splitMsg' array, which is then printed using for loop
		for(int i=0;i<splitMsg.length;i++)//The loop iterates over the array indexes from 0 to 'splitMsg.length'
		{
			System.out.println("split string is: " +splitMsg[i]);// each element at the current index is printed using splitMsg[i].
		}

		//trim() method  --> method in java is used to remove leading and trailing whitespace from a string
		//trailing means a space character at the end of the string
		String str3="       Hello world!    ";//string that has leading and trailing whitespace.
		String trimString=str3.trim();//This method removes any leading and trailing whitespace from the string 
		System.out.println("trim string is :"+ trimString);//and returns a new string with the trimmed content.

		//valueOf() method -->it is used to convert different data types into their corresponding string representation.

		int value=14;
		boolean bool=false;
		double d=12.4;
		char c='a';
		
		String intString=String.valueOf(value+"10"); //concatenating string with 10  //integer to string
		String booleanString=String.valueOf(bool+ " statement"); //boolean to string
		String doubleString=String.valueOf(d);///String-->you can call a static method w/o creating an object of a class
		String charString=String.valueOf(c);
		System.out.println(intString);
		System.out.println(booleanString);
		System.out.println(doubleString);	 
		System.out.println(charString);	 


		//lastIndexOf()method   //  it returns the last index of the given character value or substring,If it is not found, it returns -1
		String str4="java program";
		int lastIndex=str4.lastIndexOf('a');  //it returns integer value ,if the specified character is present
		System.out.println("the last index is : "+lastIndex);
		lastIndex=str4.lastIndexOf("hello");//If the specified character is not present, it returns a negative value--> -1.
		System.out.println("the last index is : "+lastIndex);

		//replaceall()method 

		String str5="Hello, hello world!";
		//Returns a new string resulting from replacing all occurrences of oldChar in this string with newChar.
		String replaceString=str5.replace('H', 'h'); //syntax:(char oldchar,char newchar)
		System.out.println("replace the string : "+replaceString);

		//Replaces each substring of this string that matches the given regular expression with the given replacement.
		String replaceallString=str5.replaceAll("[Hh]ello", "Hi"); //syntax(String regex, String replacement)
		System.out.println("replace the all string : "+replaceallString);

		//replaceFirst() method //This method replaces the first substring of this string that matches the given regular expression with the given replacement.

		String str6="Welcome welcome to java welcome program";
		String replaefirst=str6.replaceFirst("welcome","to");//It replaces the first occurrence of the string 'welcome'
		System.out.println("replace the first string is : "+replaefirst);

		//getBytes() method   
		//it converts each character in the string into a byte using the default character encoding of the platform.
		String str7="sadhana, vengadashalam";
		byte[] byteArray=str7.getBytes();  //convert strings to byte array
		System.out.println(byteArray[7]); //it returns 7th position of the value in ASCII table

		//getchars() method
		String str8="hello, world";
		char[] charArray=new char[6];
		str8.getChars(0,6,charArray,0);
		for(int i=0;i<charArray.length;i++)
		{
			System.out.println(charArray[i]);
		}
	}
}
