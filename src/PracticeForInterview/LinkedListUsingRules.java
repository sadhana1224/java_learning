package PracticeForInterview;

import java.util.LinkedList;

public class LinkedListUsingRules {

	public static void main(String[] args) {

		LinkedList<Integer> li=new LinkedList();
		
		li.addFirst(15);
		li.addLast(25);
		li.add(35);
		System.out.println(li);
		
		li.removeFirst();
		System.out.println(li);
		li.removeLast();
		System.out.println(li);
		
		System.out.println(li.isEmpty());
	}

}
