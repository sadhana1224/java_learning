package SimpleprogramForInterview;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class HashMapEx {

	public static void main(String[] args) {

		HashMap<Integer,String> hm=new HashMap<>();
		hm.put(101, null);
		hm.put(102,"sadhu");
		hm.put(null, null);
		hm.put(103, "lokii");
		hm.put(104, "anu");
		
		System.out.println(hm);
		System.out.println(hm.size());
		System.out.println(hm.isEmpty());
		System.out.println(hm.containsKey(102));
		System.out.println(hm.containsValue("lokii"));
		System.out.println(hm.entrySet());
		//iterate-1
		for(Map.Entry entry:hm.entrySet())
		{
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
		//iterator-2
		Set s=hm.entrySet();
		Iterator it=s.iterator();
		while(it.hasNext())
		{
			Map.Entry entry= (Entry) it.next();
			System.out.println(entry.getKey()+"  "+entry.getValue());
			
		}
		
	}

}
