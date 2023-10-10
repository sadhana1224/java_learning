package PracticeForInterview;

import java.util.HashMap;

public class OccurencesOfEachCharinString {

	
	public static void getCharcount(String name)
	{
		HashMap<Character,Integer> hm=new HashMap();
		char[] ch=name.toCharArray();
		
		for(char c:ch)
		{
			if(!String.valueOf(c).isBlank()) //avoid spaces
			{
			if(hm.containsKey(c))
			{
				hm.put(c, hm.get(c)+1);
			}
			else
			{
				hm.put(c, 1);
			}
		}
		}
		System.out.println(name+" is "+hm);
	}
	
	public static void main(String[] args) {
		getCharcount("sadhana logesh");
	}

}
