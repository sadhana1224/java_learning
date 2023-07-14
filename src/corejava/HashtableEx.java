package corejava;
import java.util.*;
import java.util.Map.Entry;

public class HashtableEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Hashtable ht = new Hashtable();
		
		Hashtable<Integer, String> ht1 = new Hashtable<Integer, String>();
		
		//Hashtable ht2= new Hashtable(100);
		
		//Hashtable ht3 = new Hashtable(100, (float)0.90);
		
		ht1.put(101, "John");
		ht1.put(102,"David");
		ht1.put(103, "Smith");
		//ht1.put(null, "X");
		
		System.out.println(ht1);
		
		ht1.remove(101);
		System.out.println("after removing-->"+ht1);
		System.out.println("size-->"+ht1.size());
		
		System.out.println("contains value -->"+ht1.containsValue("John"));
		System.out.println("contains value -->"+ht1.containsValue("David"));
		
		System.out.println("contains key-->"+ht1.containsKey(101));
		System.out.println("contains key-->"+ht1.containsKey(102));
		
		System.out.println("empty or not-->"+ht1.isEmpty());
		
		
		System.out.println("get keys-->"+ht1.keySet());
		System.out.println("get values-->"+ht1.values());
		System.out.println("entry set-->"+ht1.entrySet());
		
		
		
		//iterate
		for(Map.Entry entry:ht1.entrySet())
		{
			System.out.println(entry.getKey()+"---"+entry.getValue());
		}
		System.out.println("-----------------------");
		//iterator
		
		Set s=ht1.entrySet();
		Iterator it=s.iterator();
		while(it.hasNext())
		{
			Map.Entry entry= (Entry) it.next();
			System.out.println(entry.getKey()+"---"+entry.getValue());
			
		}
		
		

	}

}
