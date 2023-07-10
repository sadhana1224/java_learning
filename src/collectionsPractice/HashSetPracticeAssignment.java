package collectionsPractice;
import java.util.*;
public class HashSetPracticeAssignment {

	public static void main(String[] args) {
		
		HashSet<Integer> h=new HashSet<Integer>();
		// 1 append the specified element to the end of a hash set.
		
		h.add(12);
		h.add(7);
		h.add(84);
		h.add(3);
		System.out.println("elements in hashset-->"+h);
		
		HashSet<Integer> h1=new HashSet<Integer>();
		h1.add(22);
		h1.add(5);
		h1.addAll(h);
		System.out.println(h1);
	System.out.println("---------------------------------------");	
	// 2 Write a Java program to iterate through all elements in a hash list.
	for(int val:h1)
	{
		System.out.println(val);
	}
	System.out.println("---------------------------------------");	
	// 3 Write a Java program to get the number of elements in a hash set.
	
	System.out.println("number of elements in hashset-->"+h1.size());
	
	System.out.println("---------------------------------------");
	
	//4 Write a Java program to empty an hash set.
	
	HashSet<String> hs=new HashSet<String>();
	System.out.println("empty hashset-->"+hs);
	
	System.out.println("---------------------------------------");	
	///5 Write a Java program to test if a hash set is empty or not.
	
	System.out.println("empty or not-->"+ hs.isEmpty());
	
	System.out.println("---------------------------------------");	
	//6 Write a Java program to clone a hash set to another hash set.
	
	HashSet<String> hs1=new HashSet<String>();
	hs1.add("bmw");
	hs1.add("audi");
	HashSet<String> hs2=new HashSet<String>();
	hs2.add("kia");
	
	hs2.addAll(hs1);
	System.out.println("cole a hashset to another hashset-->"+hs2);
	System.out.println("---------------------------------------");	
	//7 Write a Java program to convert a hash set to an array.
	
	HashSet<String> hs3=new HashSet<String>();
	hs3.add("blue");
	hs3.add("grey");
	
	ArrayList<String> al=new ArrayList<String>();
	al.add("skyblue");
	
	al.addAll(hs3);
	System.out.println("convert hashset to arraylist-->"+al);
	
	System.out.println("---------------------------------------");	
	//8 Write a Java program to convert a hash set to a tree set.
	HashSet<String> hs4=new HashSet<String>();
	hs3.add("blue");
	hs3.add("grey");
	
	TreeSet<String> t=new TreeSet<String>();
	t.add("silver");
	
	t.addAll(hs3);
	System.out.println("convert hashset to tree set-->"+t);
	
	
	System.out.println("---------------------------------------");	
	//9 Write a Java program to find numbers less than 7 in a tree set.
	
	HashSet<Integer> hn=new HashSet<Integer>();
	hn.add(12);
	hn.add(3);
	hn.add(6);
	hn.add(15);
	
	HashSet<Integer> res=new HashSet<Integer>();
	for(int res1:hn)
	{
		if(res1<7)
		{
			res.add(res1);
		}
	}
	System.out.println("numbers less than 7-->"+res);
	System.out.println("---------------------------------------");	
	//10 Write a Java program to compare two hash set.
	
	HashSet<Integer> hn1=new HashSet<Integer>();
	hn1.add(6);
	hn1.add(15);
	
	HashSet<Integer> hn2=new HashSet<Integer>();
	hn2.add(6);
	hn2.add(15);
	HashSet<Integer> ans=new HashSet<Integer>();
	for(int val:hn1)
	{
		System.out.println(hn2.contains(val)? "true":"false");
	}
	
	
	System.out.println("---------------------------------------");	
	//11 Write a Java program to compare two sets and retain elements that are the same.
	HashSet<Integer> hn3=new HashSet<Integer>();
	hn3.add(12);
	hn3.add(3);
	System.out.println("hashset 1-->"+hn3);
	HashSet<Integer> hn4=new HashSet<Integer>();
	hn4.add(12);
	hn4.add(4);
	System.out.println("hashset 2-->"+hn4);
	hn4.retainAll(hn3);
	System.out.println("compare two hashset-->"+hn4);
	System.out.println("---------------------------------------");	
	//12 Write a Java program to remove all elements from a hash set.
	
	System.out.println("---------------------------------------");	
    hn4.removeAll(hn3);
System.out.println("remove all elements in hashset-->"+hn4);
	}

}
