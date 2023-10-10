package PracticeForInterview;

public class CountCapitalWordsinString {

	public static void main(String[] args) {

		String str="AhjdJHGUY";
		int upc=0;
		int lwc=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)>='A' && str.charAt(i)<='Z')
			{
				upc++;
			}
			else if(str.charAt(i)>='a' && str.charAt(i)<='z')
			{
				lwc++;
			}
		}
		System.out.println(upc);
		System.out.println(lwc);
	}

}
