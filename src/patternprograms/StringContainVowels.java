package patternprograms;

public class StringContainVowels {

	public static void main(String[] args) {

		String str="sadhumaa";
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' ||str.charAt(i)=='o' || str.charAt(i)=='u')
			{
				System.out.println(str.charAt(i)+" index is "+i);
			}
		}
	}

}
