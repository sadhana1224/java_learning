package PracticeForInterview;

public class RemoveCharFromString {

	public static void main(String[] args) {

		String str="programming";
		char c='m';
		
		//String res=str.replace(String.valueOf(c), "");
		String res=str.replaceFirst(String.valueOf(c), "");
	
		System.out.println(res);
	}

}
