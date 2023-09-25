package patternprograms;

import java.util.LinkedList;
import java.util.ListIterator;

public class ReverseLinkedList {

	public static void main(String[] args) {

		LinkedList<Integer> li=new LinkedList<Integer>();
		
		li.add(10);
		li.add(52);
		li.add(84);
		li.add(23);
		System.out.println(li);
		
		LinkedList<Integer> rev=new LinkedList<Integer>();
		
		ListIterator<Integer> it=li.listIterator(li.size());
		
		while(it.hasPrevious())
		{
			rev.add(it.previous());
		}
		System.out.println(rev);
		

	}

}
