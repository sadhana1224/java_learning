package PracticeForInterview;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashTableRules {

	public static void main(String[] args) {

		Hashtable<String,Integer> ht=new Hashtable();
		//Put a key-value pair into the hash table.
		ht.put("A", 101);
		ht.put("B", 102);
		ht.put("C", 103);
		
		System.out.println(ht.entrySet());
		//Get a value from the hash table for a given key.
		
		System.out.println(ht.get("A"));
		
		//Remove a key-value pair from the hash table for a given key.
		ht.remove("B", 102);
		System.out.println(ht.entrySet());
		
		Set s=ht.entrySet();
		
		Iterator it=s.iterator();
		while(it.hasNext())
		{
			Map.Entry entry=(Entry) it.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}

}
