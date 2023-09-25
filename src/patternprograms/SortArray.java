package patternprograms;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {

		int[] a= {1,8,3,-1,-8,-7,21};
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		
		Arrays.parallelSort(a);
		System.out.println(Arrays.toString(a));
	}

}
