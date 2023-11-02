package PracticeForInterview;

import java.util.ArrayList;
import java.util.Collections;

public class SortListOfStrings {

	public static void main(String[] args) {

		String[] str= {"jan","feb","mar","april","may","june","july"};
		
		ArrayList<String> al=new ArrayList<String>();
		
		
		for(String val:str)
		{
			al.add(val);
		}
		
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
	}

}
