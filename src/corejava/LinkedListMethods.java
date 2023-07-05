package corejava;

import java.util.LinkedList;

public class LinkedListMethods {

	public static void main(String[] args) {
		LinkedList<Integer> ll=new LinkedList<Integer>();
		LinkedList<Integer> ll1=new LinkedList<Integer>();
		ll.add(11);
		ll.add(23);
		ll.add(4);
		ll.add(16);
		ll.add(100);
		ll1.addAll(ll);
		System.out.println("after add all elements "+ll);
		
		ll1.addFirst(2);
		System.out.println("add first method "+ll1);
		System.out.println(".................................");
		
		ll1.addLast(200);
		System.out.println("add last method "+ll1);
		
		System.out.println(".................................");
		ll1.removeFirst();
		System.out.println("remove first -->"+ll1);
		System.out.println(".................................");
		
		ll1.removeLast();
		System.out.println("remove last -->"+ll1);
		
		System.out.println(".................................");
		
		System.out.println("get first element--> "+ll1.getFirst());
		
		System.out.println(".................................");
		
		System.out.println("get last element -->"+ll1.getLast());
	}

}
