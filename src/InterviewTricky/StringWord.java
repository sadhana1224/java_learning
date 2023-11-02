package InterviewTricky;

import java.util.HashMap;
import java.util.Map;

public class StringWord {

	public static void main(String[] args) {

		String str="hello how are you , hope you are doing well";
		
		String[] sp=str.split(" ");
		int count=1;
		for(int i=0;i<sp.length;i++)
		{
			for(int j=i+1;j<sp.length-1;j++)
			{
				if(sp[i].equals(sp[j]))
				{
					count++;
					sp[j]="";
					
				}
				
			}
			if(!sp[i].isEmpty())
			System.out.println(sp[i]+"-->"+count);
			count=1;
			
		}
		
		
		/*
		HashMap<String,Integer> hm=new HashMap<>();
		
		for(String st:sp)
		{
		
			
			if(hm.containsKey(st))
			{
				hm.put(st, hm.get(st)+1);
			}
			else
			{
				hm.put(st, 1);
			}
		}
		
		for(Map.Entry<String, Integer> ent:hm.entrySet())
		{
			System.out.println(ent.getKey()+" "+ent.getValue());
		}
		*/
	}

}
