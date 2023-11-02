package PracticeForInterview;

public class StringpreservingPosition {

	public static void main(String[] args) {

		String str="hi how are you";
		
		StringBuffer sb=new StringBuffer(str.replaceAll(" ", ""));
		sb.reverse();
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==' ')
			{
				sb.insert(i, " ");
			}
		}
		sb.append("");
		System.out.println(sb);
	}

}
