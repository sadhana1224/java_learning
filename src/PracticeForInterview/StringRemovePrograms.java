package PracticeForInterview;

public class StringRemovePrograms {

	public static void main(String[] args) {

		//How To Remove a Character from a String in Java
		
		String str="abc ABC 123 abc";
		String res=str.replace("a", "");
		System.out.println(res);
		
		
		//Remove Spaces from a String in Java
		String str1="abc ABC 123 abc";
		String space=str1.replace(" ", "");
		System.out.println(space);
		
		//Remove a Substring from a String in Java
		String st="hisadhu hisuba hilokii";
		String res1=st.replace("hi","");
		System.out.println(res1);
		
		//Remove all the Lowercase Letters from a String in Java
		String low="abc ABC 123 abc";		
		String res2=low.replaceAll("([a-z])", "");
		System.out.println(res2);
		
		//Remove the Last Character from a String in Java
		String last="sadhana";
		StringBuilder sb=new StringBuilder(last);
		System.out.println(sb.deleteCharAt(sb.length()-1));
		
		// How do you remove leading and trailing spaces from a string in Java?
		String ws="   abc ABC 123 abc  ";
		String resws=ws.trim();
		System.out.println(resws);
		
	}

}
