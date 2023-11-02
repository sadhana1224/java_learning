package PracticeForInterview;

import java.util.HashSet;

public class DuplicateCharInAString {

	public static void main(String[] args) {




		String st="sadhannfhna";

		char[] c=st.toCharArray();

		HashSet<Character> seen=new HashSet<>();
		HashSet<Character> dup=new HashSet<>();

		for(char ch:c)
		{
			if(!seen.add(ch))
			{
				dup.add(ch);
			}
		}
		System.out.println(dup);

	}

}

