package PracticeForInterview;

public class PrintDuplicateCharinString {

	public static void main(String[] args) {

		String str="programming";
		
		for(int i=0;i<str.length();i++)
		{
			for(int j=i+1;j<str.length();j++)
			{
				if(str.charAt(i)==str.charAt(j))
				{
					System.out.println(str.charAt(j));
					
				}
			}
		}
	}

}
