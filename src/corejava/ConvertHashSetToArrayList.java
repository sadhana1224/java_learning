package corejava;
import java.util.*;
import java.util.HashSet;

public class ConvertHashSetToArrayList {

	public static void main(String[] args) {
		HashSet<String> h4=new HashSet<String>();
		h4.add("audi");
		h4.add("kia");
		h4.add("alto");
		h4.add("bmw");
		
		ArrayList<String> al=new ArrayList<String>();
		al.addAll(h4);
		
		System.out.println("hashset  -->"+h4);
		System.out.println("arraylist-->"+al);
		
		Collections.sort(al);
		System.out.println("after sort--> "+al);
		
		Collections.sort(al,Collections.reverseOrder());
		System.out.println("after reverse--->" +al);
		
		Collections.shuffle(al);
		System.out.println("after shuffle-->" +al);
	}

}
