package PracticeForInterview;

import java.util.Arrays;

public class RemoveFirstStringPResentinSecondString {

	public static void main(String[] args) {

		String s1="sadhanawe";
		String s2="shanmu";
		
		char[] c=s1.toCharArray();
		char[] c1=s2.toCharArray();
		
		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<c1.length;j++)
			{
				if(c[i]==c1[j])
				{
					c[i]=' ';
				}
			}
		}
		System.out.println(Arrays.toString(c));
		
	}

}
