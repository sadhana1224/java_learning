package assignment;
import java.util.*;
import java.util.Map.Entry;
public class ValuesinHashMap {

	public static void main(String[] args) {
		HashMap<Integer,String> h=new HashMap<Integer,String>();
		h.put(101,"sadhana");
		h.put(103, "john");
		h.put(null,"smith");
		h.put(102, "david");
		h.put(104, null);
		System.out.println(h);
		
		System.out.println(h.keySet());
		System.out.println(h.values());
		System.out.println(h.entrySet());
		
		Set s=h.entrySet();
		Iterator it=s.iterator();
		while(it.hasNext())
		{
			Map.Entry entry=(Entry) it.next();
			System.out.println(entry.getKey()+"------"+entry.getValue());
		}

	}

}
