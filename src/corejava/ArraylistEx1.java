package corejava;

import java.util.ArrayList;
import java.util.Collections;

public class ArraylistEx1 {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		System.out.println("before ad all "+al1);
		al.add(1);
		al.add(23);
		al.add(12);
		al.add(10);
		al.add(15);
		al1.addAll(al);
		System.out.println("after add all elements "+al);
		
		al1.removeAll(al);
		System.out.println("after remove all "+al1);
		
		Collections.sort(al);
		System.out.println("after sort "+al);
		
		Collections.sort(al,Collections.reverseOrder());
		System.out.println("after reverse "+al);
		
		Collections.shuffle(al);
		System.out.println("after one shuffle "+al);
		Collections.shuffle(al);
		System.out.println("after two shuffle "+al);
		Collections.shuffle(al);
		System.out.println("after three shuffle "+al);
		
		
		
	}

}
