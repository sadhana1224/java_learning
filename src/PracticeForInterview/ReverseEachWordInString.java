package PracticeForInterview;

public class ReverseEachWordInString {

	public static void main(String[] args) {

		String str="Welcome to Chennai";
		String[] sp=str.split(" ");
		
		String revStr="";
	
		for(String w:sp)
		{
			String revWord="";
			for(int i=w.length()-1;i>=0;i--)
			{
				revWord+=w.charAt(i);
			}
			revStr=revStr+revWord+" ";
		}
		System.out.println("Reverse each word--> "+revStr);
	}

}
