package PracticeForInterview;

import java.util.ArrayList;

public class convertArrayListTOStringArray {

	public static void main(String[] args) {

		ArrayList<String> al=new ArrayList<String>();
		al.add("sahu");
		al.add("suba");
		al.add("lokii");
		al.add("pri");
		
		String[] sar=al.toArray(new String[al.size()]);
		for(String val:sar)
		{
			System.out.println(val);
		}
	}

}
