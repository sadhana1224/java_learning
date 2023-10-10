package PracticeForInterview;

import java.util.ArrayList;

public class ConvertArrayListToArray {

	public static void main(String[] args) {

		ArrayList<Integer> al=new ArrayList();
		al.add(10);
		al.add(15);
		al.add(2);
		al.add(87);
		System.out.println(al);
		
		Object[] obj=al.toArray();
		
		for(Object val:obj)
		{
			System.out.println(val);
		}
	}

}
