package InterviewTricky;

public class PrintCountLetterSymbol {

	public static void main(String[] args) {

		String st="dhfj^%$^jsfhg";
		int charc=0;
		int sym=0;
		
		for(int i=0;i<st.length();i++)
		{
			if(st.charAt(i)>='a' && st.charAt(i)<='z')
			{
				charc++;
			}
			else
			{
				sym++;
			}
		}
		
		System.out.println(charc);
		System.out.println(sym);
	}

}
