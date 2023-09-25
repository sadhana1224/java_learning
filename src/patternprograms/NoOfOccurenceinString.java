package patternprograms;

public class NoOfOccurenceinString {

	public static void main(String[] args) {

		String str="selenium learning";
		
		char c='e';
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==c)
			{
				count++;
			}
		}
		System.out.println(count);
		
		//2nd approach
		String s="sadhana";
		int c1=s.length();
		System.out.println(c1);
		String sp=s.replace("a", "");
		System.out.println(sp);
		int c2=sp.length();
		System.out.println(c2);
		int tot=c1-c2;
		System.out.println(tot);
	}

}
