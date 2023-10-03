package PracticeForInterview;

import java.util.ArrayList;
import java.util.HashSet;

public class DuplicateWordsInaString {

	public static void main(String[] args) {

		String str="hello world hello chennai people chennai";
		
		String[] sp=str.split(" ");
		
		ArrayList<String> repeatWords=new ArrayList<>();
		
		HashSet<String> uniqueWords=new HashSet<>();
		
		for(String st:sp)
		{
			if(!uniqueWords.add(st))
			repeatWords.add(st);
		}
		//System.out.println(uniqueWords);
		System.out.println("duplicate words-->"+repeatWords);
	}

}
