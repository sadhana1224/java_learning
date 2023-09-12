package PracticeForInterview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

// How do you reverse a linked list in Java?
public class ReverseLinkedList {

	public static void main(String[] args) {

		LinkedList<Integer> li=new LinkedList<Integer>();
		li.add(12);
		li.add(2);
		li.add(8);
		li.add(21);
		li.add(5);		
		System.out.println("linked list-->"+li);
	
	LinkedList<Integer> revList=new LinkedList<Integer>();
	ListIterator<Integer> it=li.listIterator(li.size());
	
	while(it.hasPrevious())
	{
		revList.add(it.previous());
	}
	System.out.println(revList);	
	}

}
