package PracticeForInterview;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {

		String str="learning   Selenium   with   Java";
		str=str.replaceAll("\\s", ""); //or(" ","")
		System.out.println("After Removing WhiteSpace -->"+str);
	}

}
