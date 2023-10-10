package PracticeForInterview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ConvertHashMaptoArrayList {

	public static void main(String[] args) {

		
		HashMap<String,Integer> hm=new HashMap();
		hm.put("A", 10);
		hm.put("B", 25);
		hm.put("C",45);
		
		System.out.println(hm.entrySet());
		
		ArrayList<Map.Entry<String,Integer>> al=new ArrayList<>(hm.entrySet());
		
		for(Map.Entry<String, Integer> entry:al)
		{
			System.out.println(entry.getKey()+"  "+entry.getValue());
		}
	}

}
