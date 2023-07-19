package assignment;
import java.util.*;
public class JoinTwoArrayList {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		ArrayList<String> al1=new ArrayList<String>();
		
		al.add("java");
		al.add("ruby");
		al.add("c++");
		al.add("pascal");
		System.out.println(al);
		al1.addAll(al);
		al1.add("C sharp");
		System.out.println("join two arraylist-->"+al1);
		
		ArrayList<String> al2=new ArrayList<String>();
		al2.addAll(al1);
		al2.add("C");
		System.out.println("join two arraylist in one arraylist-->"+al2);

	}

}
