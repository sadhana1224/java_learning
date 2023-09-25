package patternprograms;

public class ReverseEachWord {

	public static void main(String[] args) {

		String str="welcome to chennai";
		
		String rev="";
		
		String[] sp=str.split(" ");
		for(String word:sp)
		{
			String revstr="";
			for(int i=word.length()-1;i>=0;i--)
			{
				revstr=revstr+word.charAt(i);
			}
			rev=rev+revstr+" ";
		}
		System.out.println(rev);
	}

}
