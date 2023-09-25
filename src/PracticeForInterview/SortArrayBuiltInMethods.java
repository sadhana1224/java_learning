package PracticeForInterview;

import java.util.Arrays;

public class SortArrayBuiltInMethods {

	public static void main(String[] args) {

		int a[]= {50,20,80,40,30};
		
		//Approach-1
		System.out.println("before sorting->"+Arrays.toString(a));
		Arrays.parallelSort(a);
		System.out.println("after sorting->"+Arrays.toString(a));

		int a1[]= {10,20,80,40,30};
		//Approach-2
		System.out.println("before sorting->"+Arrays.toString(a1));
		Arrays.sort(a1);
		System.out.println("after sorting->"+Arrays.toString(a1));

	}

}
