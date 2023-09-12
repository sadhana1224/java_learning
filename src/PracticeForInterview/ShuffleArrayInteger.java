package PracticeForInterview;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ShuffleArrayInteger {

	public static void main(String[] args) {

		Integer[] a= {2,9,7,8,3,5};
		List<Integer> li=Arrays.asList(a);
		Collections.sort(li);
		System.out.println(li);
		
		Collections.shuffle(li);
		System.out.println(li);
	}

}
