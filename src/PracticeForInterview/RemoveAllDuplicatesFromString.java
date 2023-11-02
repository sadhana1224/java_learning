package PracticeForInterview;

import java.util.HashSet;

public class RemoveAllDuplicatesFromString {

	public static void main(String[] args) {

		String str="hello hi how hi to hi you";
		
		String[] sp=str.split(" ");
		
		HashSet<String> hs=new HashSet<String>();
		
		for(String s:sp)
		{
			hs.add(s);
		}
		
		System.out.println(hs);
	}

}
