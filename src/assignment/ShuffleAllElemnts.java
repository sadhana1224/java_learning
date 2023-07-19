package assignment;
import java.util.*;
public class ShuffleAllElemnts {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(15);
		al.add(24);
		al.add(2);
		al.add(34);
		al.add(7);
		System.out.println("elements in the list-->"+al);
		
		Collections.shuffle(al);
		System.out.println("after suffle all the elements-->"+al);

	}

}
