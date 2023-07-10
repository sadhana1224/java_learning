package collectionsPractice;
import java.util.*;
public class TreeSetPractice {

	public static void main(String[] args) {
		TreeSet<Integer> t=new TreeSet<Integer>();

		t.add(5);
		t.add(15);
		t.add(2);
		t.add(34);
		t.add(23);
		
		System.out.println(t);// o/p is ascending order
		
		t.add(1);
		System.out.println("after adding element-->"+t);
		
		System.out.println("size is-->"+t.size());
		
		t.remove(1);
		System.out.println("after removing one element-->"+t);
		System.out.println("---------------------");
		//iterate
		for(int val:t)
		{
			System.out.println(val);
		}
		System.out.println("---------------------");
		
		System.out.println(t.contains(1));
		
		System.out.println("---------------------");
		
		System.out.println(t.isEmpty());
		System.out.println("---------------------");
		
		TreeSet<Integer> t1=new TreeSet<Integer>();
		t1.add(15);
		System.out.println(t1);
		t1.addAll(t);
		System.out.println(t1);
		
	}

}
