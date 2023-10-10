package SimpleprogramForInterview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListEx {

	public static void main(String[] args) {

		ArrayList<Integer> al=new ArrayList<>();
		al.add(10);
		al.add(25);
		al.add(5);
		al.add(33);
		ArrayList<Integer> al1=new ArrayList<>();
		al1.add(2);
		al1.addAll(al);
	System.out.println(al.isEmpty());	
	System.out.println(al.contains(10));
al1.set(1, 56);
		System.out.println(al1);
		Collections.sort(al1);
		System.out.println(al1);
		//Collections.shuffle(al);
	//	System.out.println(al);
		
		Collections.sort(al1,Collections.reverseOrder());
		System.out.println(al1);
		
		//iterate-1
		for(int i=0;i<al1.size();i++)
		{
			System.out.println(al1.get(i));
		}
		System.out.println("=========");
		//iterate-2
		for(Object data:al1)
		{
			System.out.println(data);
		}
		System.out.println("=========");
		//iterate-3
		Iterator it=al1.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
