package PracticeForInterview;

public class NoOfOccuranceinString {

	public static void main(String[] args) {

		String str="selenium learning";
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

}
}
