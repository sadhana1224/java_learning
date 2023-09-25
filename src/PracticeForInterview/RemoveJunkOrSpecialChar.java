package PracticeForInterview;

public class RemoveJunkOrSpecialChar {

	public static void main(String[] args) {

		String s1="!~$#%&^%&^() hello world ^%&^*&885784 selenium ###^&%&^ Learning &^*&3658734";
		s1=s1.replaceAll("[^a-zA-Z0-9]", "");
		
		System.out.println(s1);
	}

}
