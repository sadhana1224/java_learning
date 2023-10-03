package PracticeForInterview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertArraytoArrayList {

	public static void main(String[] args) {

		Integer[] ar= {1,6,4,6,7};
		
		List<Integer> li=new ArrayList(Arrays.asList(ar));
		
		for(Integer num:li)
		{
			System.out.println(num);
		}
		
	}

}
