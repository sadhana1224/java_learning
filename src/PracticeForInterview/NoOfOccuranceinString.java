package PracticeForInterview;

public class NoOfOccuranceinString {

	public static void main(String[] args) {

		String str="selenium learning";
		//Appraoch1
		char c='l';
		int count=0;
		for(int i=0;i<str.length();i++)
		{
		if(str.charAt(i)==c)
		{
			count++;
		}
	}
		System.out.println(count);

		//Approach 2
		
		String st="java program awards";
		int totcount=st.length();
		
		st=st.replace("a", "");
		int repCount=st.length();
		
		int count1=totcount-repCount;
		System.out.println("No Of Occurence of a Character "+count1);
}
}
