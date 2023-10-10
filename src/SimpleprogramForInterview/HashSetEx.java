package SimpleprogramForInterview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx {

	public static void main(String[] args) {

		HashSet<String> hs=new HashSet<String>();
		hs.add("java");
		hs.add("perl");
		hs.add("ruby");
		hs.add("python");
		
		System.out.println(hs);
		HashSet<String> hs1=new HashSet<String>();
		hs1.add("c++");
		hs1.add("java");
		
		hs1.addAll(hs);
		System.out.println(hs1);
	
		//convertion
		/*
		ArrayList<String> al=new ArrayList<String>(hs1);
		Collections.sort(al);
		System.out.println(al);
		*/
		
		System.out.println(hs1.isEmpty());
		System.out.println(hs1.contains("ruby"));
		
		System.out.println(hs1.size());
		//iterate-1
		for(Object val:hs1)
		{
			System.out.println(val);
		}
		System.out.println("====================");
		//iterate-2
		Iterator it=hs1.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
