package PracticeForInterview;

public class CountWordsInString {

	public static void main(String[] args) {

		String str="i will achieve more in further days";
		
		String[] splitw=str.split(" ");
		int count=0;
		for(int i=0;i<splitw.length;i++)
		{
			System.out.println(splitw[i]);
		}
		System.out.println("no of words in a String is-->"+splitw.length);
		
		//Approach 2
		
		String s="Awesome place in bangalore is jakkur ";
		int countt=1;
		
		for(int i=0;i<s.length()-1;i++)
		{
			if(s.charAt(i)==' ' && s.charAt(i+1)!=' ')
			{
				countt++;
			}
		}
		System.out.println("word count-->"+countt);
		
	}

}
