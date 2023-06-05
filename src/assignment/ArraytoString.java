package assignment; // How to convert an array to string in Java?
import java.util.Arrays;
public class ArraytoString {

	public static void main(String[] args) {

		String str[]= {"java","is", "my","favorite","language"};
		
		//convert array to sttring
		//using toString
		String str1=Arrays.toString(str);
		System.out.println(str1);
		
		//join method
		String str2=String.join("/", str); // check without space and with space see the difference or give any character to sepearate each element
		System.out.println(str2);
	}
	

}
