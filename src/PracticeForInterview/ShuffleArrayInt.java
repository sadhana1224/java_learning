package PracticeForInterview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ShuffleArrayInt {

	public static void main(String[] args) {
		int[] array = { 1, 4,3,9,7,5,8 };
		
	ArrayList<Integer> al=new ArrayList<Integer>();
	
	for(int num:array)
	{
		al.add(num);
	}
	System.out.println(al);
	Collections.sort(al);
	System.out.println(al);
	
	Collections.shuffle(al);
	System.out.println(al);
	
	
	}

}
