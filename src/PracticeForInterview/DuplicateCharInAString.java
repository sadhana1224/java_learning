package PracticeForInterview;

import java.util.HashSet;

public class DuplicateCharInAString {

	public static void main(String[] args) {

	String st="selenium learning";
		
		
		HashSet seen=new HashSet();
		HashSet<Character> dup=new HashSet<Character>();
		
		for(int i=0;i<st.length();i++)
		{
			char cc=st.charAt(i);
			if(cc!=' ')
			{
				if(!seen.add(cc))
				{
					dup.add(cc);
				}
			}
		}
		System.out.println(dup);

	}

}

