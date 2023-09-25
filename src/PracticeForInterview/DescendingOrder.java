package PracticeForInterview;


import java.util.Arrays;
import java.util.Collections;

public class DescendingOrder {

	public static void main(String[] args) {
		Integer a[]= {55,25,30,10,80};
		System.out.println("before sorting->"+Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("after sorting->"+Arrays.toString(a));
		
		//reverse order
		Arrays.sort(a,Collections.reverseOrder());
		System.out.println("reverseOrder-->"+Arrays.toString(a));
		
	}

}
