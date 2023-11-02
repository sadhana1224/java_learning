package PracticeForInterview;

public class EnsureCapacity {

	public static void main(String[] args) {

		StringBuffer sb=new StringBuffer("hello");
		//ensure cap=16
		System.out.println(sb.capacity());
		
		int min=40;
		sb.ensureCapacity(min);
		System.out.println(sb.capacity());
	}

}
