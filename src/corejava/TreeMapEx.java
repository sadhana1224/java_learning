package corejava;
import java.util.*;
import java.util.Map.Entry;
public class TreeMapEx {

	public static void main(String[] args) {
		TreeMap t=new TreeMap();
		
		TreeMap<Integer,String> tm=new TreeMap<Integer,String>();
		
		HashMap hm = new HashMap();
		hm.put(101, "john");
		hm.put(104, "smith");
		hm.put(103, "david");
		hm.put(102, "rey");
		
		TreeMap<Integer,String> tm1=new TreeMap<Integer,String>(hm);
		System.out.println(tm1);

		
				
		tm.put(101, "john");
		tm.put(104, "smith");
		tm.put(103, "david");
		tm.put(102, "rey");
		
		System.out.println(tm); //ascending order
		
		System.out.println("size is-->"+tm.size());
		
		System.out.println("empty or not-->"+t.isEmpty());
		
		System.out.println("contains key-->"+tm.containsKey(101));
		System.out.println("contains key-->"+tm.containsKey(105));
		
		System.out.println("contains value-->"+tm.containsValue("david"));
		System.out.println("contains value-->"+tm.containsValue("johnson"));
		
		tm.remove(102);
		System.out.println("after removing-->"+tm);
		
		System.out.println("get keys-->"+tm.keySet());
		System.out.println("get values-->"+tm.values());
		System.out.println("entry set-->"+tm.entrySet());
		
		for(Map.Entry entry:tm.entrySet())
		{
			System.out.println(entry.getKey()+"---"+entry.getValue());
		}
		System.out.println("--------------------");
		
		Set s=tm.entrySet();
		Iterator it=s.iterator();
		while(it.hasNext())
		{
			Map.Entry entry=(Entry) it.next();
			System.out.println(entry.getKey()+"---"+entry.getValue());
		}
		

	}

}
