package corejava;
import java.util.*;
import java.util.Map.Entry;
public class LinkedHashMapEx {

	public static void main(String[] args) {
		LinkedHashMap lhs=new LinkedHashMap();
		
		LinkedHashMap<Integer,String> lh=new LinkedHashMap<Integer,String>();
		
		LinkedHashMap ls=new 	LinkedHashMap(100);
		
		LinkedHashMap ls1= new	LinkedHashMap (100,(float)0.75);
		
		lh.put(101, "java");
		lh.put(102, "c++");
		lh.put(103, "python");
		lh.put(null,"pascal");
		lh.put(104, null);
		System.out.println(lh);
		
		System.out.println("size is-->"+lh.size());
		lh.remove(103);
		System.out.println("after removing-->"+lh);
		//lh.remove(null);
		//System.out.println("after removing-->"+lh);
		
		System.out.println("empty or not-->"+lhs.isEmpty());
		
		System.out.println("contains key-->"+lh.containsKey(101));
		System.out.println("contains key-->"+lh.containsKey(105));
		
		System.out.println("contains value-->"+lh.containsValue("java"));
		System.out.println("contains value-->"+lh.containsValue("c"));
		
		System.out.println("get keys-->"+lh.keySet());
		
		System.out.println("get values-->"+lh.values());
		
		System.out.println("entry set-->"+lh.entrySet());
		
		//iterate
		for(Map.Entry entry: lh.entrySet())

		{
			System.out.println(entry.getKey()+"---"+entry.getValue());
		}
		System.out.println("--------------------");
		
		Set s=lh.entrySet();
		Iterator it=s.iterator();
		while(it.hasNext())
		{
			Map.Entry entry=(Entry) it.next();
			
			System.out.println(entry.getKey()+"-----"+entry.getValue());
			
		}
				

	}

}
