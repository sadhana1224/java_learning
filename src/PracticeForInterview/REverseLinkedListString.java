package PracticeForInterview;

import java.util.LinkedList;
import java.util.ListIterator;

public class REverseLinkedListString {

	public static void main(String[] args) {
		LinkedList<String> li=new LinkedList<String>();
		li.add("chennai");
		li.add("asia");
		li.add("bengaluru");
		li.add("delhi");

		System.out.println(li);

		LinkedList<String> rev=new LinkedList<String>();
		ListIterator<String> it=li.listIterator(li.size());
		while(it.hasPrevious())
		{
			rev.add(it.previous());
		}
		System.out.println(rev);
	}

}
