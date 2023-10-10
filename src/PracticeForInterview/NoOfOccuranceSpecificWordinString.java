package PracticeForInterview;

public class NoOfOccuranceSpecificWordinString {

	public static void main(String[] args) {

		String str="hi sadhu how are you how is your work and hi suba";
		String word="how";
		int count=0;
		String[] ap=str.split(" ");
		for(int i=0;i<ap.length;i++)
		{
			if(word.equals(ap[i]))
			{
				count++;
			}
		}
		System.out.println("the word--> "+word +" "+ count);
		
	}

}
