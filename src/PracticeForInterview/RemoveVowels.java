package PracticeForInterview;

public class RemoveVowels {

	public static void main(String[] args) {

		String s="welcome";

		String res=s.replaceAll("[AEIOUaeiou]", "");

		System.out.println(res);
		//normal for loop

		for (int i = 0; i < s.length(); i++) { 
			if (s.charAt(i) == 'a' || s.charAt(i) == 'e'
					|| s.charAt(i) == 'i' || s.charAt(i) == 'o'
					|| s.charAt(i) == 'u' || s.charAt(i) == 'A'
					|| s.charAt(i) == 'E' || s.charAt(i) == 'I'
					|| s.charAt(i) == 'O'
					|| s.charAt(i) == 'U') { 
				continue; 
			} 
			else { 
				System.out.print(s.charAt(i)); 
			}

		}


	}
}
