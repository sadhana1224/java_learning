package PracticeForInterview;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MaximumOccuringCharacter {

	public static void main(String[] args) {

		String str="loveglobal";
		
		char[] ch=str.toCharArray();
		
		HashMap<Character,Integer> hs=new HashMap<>();
		
		for(char c:ch)
		{
			if(hs.containsKey(c))
			{
				hs.put(c, hs.get(c)+1);
			}
			else
			{
				hs.put(c, 1);
			}
		}
		System.out.println(hs);
		
		Set<Map.Entry<Character,Integer>> entry=hs.entrySet();
		int maxcount=0;
		int maxchar=0;
		for(Entry<Character,Integer> ent:entry)
		{
			if(ent.getValue()>maxcount)
			{
				maxcount=ent.getValue();
				maxchar=ent.getKey();
			}
		}
		char key=(char) maxchar; //converting ascii to char
		System.out.println(key+" "+maxcount);
		
	}

}
