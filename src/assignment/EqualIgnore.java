package assignment;  //How to check if two strings are the same ignoring their cases?

public class EqualIgnore {

	public static void main(String[] args) {

		String str1="hello";
		String str2="Hello";  //check hello/Hello/helloo  check the output see the difference
		
		boolean EqualIgnoreString=str1.equalsIgnoreCase(str2); //it return boolean value
		System.out.println(EqualIgnoreString);
	}

}
