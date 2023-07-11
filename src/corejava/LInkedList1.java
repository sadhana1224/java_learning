package corejava;
import java.util.Collections;
import java.util.LinkedList;

public class LInkedList1 {

	public static void main(String[] args) {
		//linkedlist with homogenous data
		LinkedList<Integer> ll=new LinkedList<Integer>();
		LinkedList<Integer> ll1=new LinkedList<Integer>();
		
		ll.add(7);
		ll.add(2);
		ll.add(3);
		ll.add(16);
		ll.add(60);
		ll1.addAll(ll);
		System.out.println("after add all elements "+ll);
		
		
		ll1.removeAll(ll);
		System.out.println("after remove all "+ll1);
		
		Collections.sort(ll);
		System.out.println("after sort "+ll);
		
		Collections.sort(ll,Collections.reverseOrder());
		System.out.println("after reverse "+ll);
		
		Collections.shuffle(ll);
		System.out.println("after one shuffle "+ll);
		ll1.getFirst();
		
		
	}

}
