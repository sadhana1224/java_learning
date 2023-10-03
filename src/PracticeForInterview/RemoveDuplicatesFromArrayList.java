package PracticeForInterview;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromArrayList {

	public static void main(String[] args) {

		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(15);
		al.add(10);
		al.add(7);
		al.add(18);
		al.add(7);
		al.add(15);
		
		System.out.println(al);
		
		Set<Integer> hs=new HashSet<Integer>(al);
	
		hs.addAll(al);
		System.out.println("after removing the duplicates--> "+hs);
	}

}
