package PracticeForInterview;

public class DuplicateCharInAString {

	public static void main(String[] args) {

		String str="subashini";
		
		for(int i=0;i<str.length();i++)
		{
			for(int j=i+1;j<str.length();j++)
			{
				if(str.charAt(i)==str.charAt(j))
				{
					System.out.println("dulicates char are-->"+str.charAt(i));
				}
			}
		}
	}

}
