package PracticeForInterview;

public class ReverseString {

	public static void main(String[] args) {
//one method
		String str="12345";
		String rev="";
		for(int i=str.length()-1;i>=0;i--)
		{
			rev+=str.charAt(i);
		}
		System.out.println(rev);
	
	}

}
