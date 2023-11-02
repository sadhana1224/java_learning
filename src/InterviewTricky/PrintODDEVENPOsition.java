package InterviewTricky;

public class PrintODDEVENPOsition {

	public static void main(String[] args) {

		String str="XCODE";
		char[] c=str.toCharArray();

		StringBuffer sb=new StringBuffer();
		StringBuffer sb1=new StringBuffer();

		for(int i=0;i<c.length;i++)
		{
			if(i%2==0)
			{
				sb.append(c[i]);
			}
			else
			{
				sb1.append(c[i]);
			}

		}
		System.out.println(sb+" "+sb1);
	}

}
