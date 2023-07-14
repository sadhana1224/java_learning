package collectionsPractice;
import java.util.*;
import java.util.Map.Entry;
public class HashMapPractice {

	public static void main(String[] args) {
// heterogenous data
		HashMap hm=new HashMap();
		//homogeneous data
		HashMap<Integer,String> hm1=new HashMap<Integer,String>();
		
		//capacity
		HashMap hm2=new HashMap(100);
		
		//factor
		HashMap hm3=new HashMap(100,(float)0.90);
		
		hm1.put(101, "sadhu");
		hm1.put(102, "suba");
		hm1.put(103, "lokii");
		hm1.put(null, "jo");
		hm1.put(104, null);
		System.out.println(hm1); //doesnot maintain order
		
		hm1.put(104,"rithu");
		System.out.println("chance the value "+hm1);
		
		System.out.println(hm1.containsKey(106)); //false
		System.out.println(hm1.containsKey(101)); //true
		
		System.out.println(hm1.containsValue("sadhu")); //true
		System.out.println(hm1.containsValue("natu"));//false
		
		System.out.println(hm.isEmpty()); //true
		
		System.out.println("size "+hm1.size()); //5
		
		hm1.remove(101);
		System.out.println("after remove "+hm1);
		
		System.out.println("key set "+hm1.keySet());
		System.out.println("values "+hm1.values());
		
		System.out.println("entry set "+hm1.entrySet());
		
		//iterate
		
		for(Map.Entry eachEntry: hm1.entrySet())
		{
			System.out.println(eachEntry.getKey()+"----"+eachEntry.getValue());
		}
		
		//iterator
		
		Set s=hm1.entrySet();
		Iterator it=s.iterator();
		while(it.hasNext())
			{
			Map.Entry entry= (Entry) it.next();
			
			System.out.println(entry.getKey()+"---"+entry.getValue());
			
		}
		
	}

}
