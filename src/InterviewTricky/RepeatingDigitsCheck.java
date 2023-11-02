package InterviewTricky;

public class RepeatingDigitsCheck {

	public static void main(String[] args) {

		String st="11234";

		boolean flag=false;
		for(int i=0;i<st.length();i++)
		{
			for(int j=i+1;j<st.length()-1;j++)
			{
				if(st.charAt(i)==st.charAt(j))
				{
					flag=true;
					break;
				}
			}
		}
		if(flag)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
	}

}
