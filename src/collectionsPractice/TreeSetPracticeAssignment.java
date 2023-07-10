package collectionsPractice;
import java.util.*;

public class TreeSetPracticeAssignment {

	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<String>();
	//1. to create a tree set, add some colors (strings) and print out the tree set.
		ts.add("white");
		ts.add("black");
		ts.add("pink");
		System.out.println("tree set elements-->"+ts);
		System.out.println("----------------------------------------------------");
		
	//2. iterate through all elements in a tree set.
		Iterator it=ts.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("----------------------------------------------------");
		//3. add all the elements of a specified tree set to another tree set.
		TreeSet<String> ts1 = new TreeSet<String>();
		ts1.add("white");
		ts1.add("black");
		ts1.add("pink");
		TreeSet<String> ts2 = new TreeSet<String>();
		ts2.add("red");
		ts2.add("blue");
		ts2.addAll(ts1);
		System.out.println("add all the elements-->"+ts2);
		System.out.println("----------------------------------------------------");
		
	//4.  create a reverse order view of the elements contained in a given tree set.
		ArrayList<String> al=new ArrayList<String>();
		al.addAll(ts2);
		Collections.sort(al,Collections.reverseOrder());
		System.out.println("reverse order-->"+al);
		System.out.println("----------------------------------------------------");
		//5.  get the first and last elements in a tree set.
		System.out.println(ts2);
		System.out.println("get first element-->"+ts2.first());
		System.out.println("get last element-->"+ts2.last());
		System.out.println("----------------------------------------------------");
		//6.  clone a tree set list to another tree set.
		
		TreeSet<Integer> cl=new TreeSet<Integer>();
		cl.add(2);
		cl.add(41);
		cl.add(5);
		TreeSet<Integer> cl1=(TreeSet<Integer>)cl.clone();
		for(int val:cl1)
		{
			System.out.println(val);
		}
		System.out.println("----------------------------------------------------");
		//7.  get the number of elements in a tree set.
		System.out.println("number of elements-->"+cl.size());
		
		System.out.println("----------------------------------------------------");
		
		//8.  compare two tree sets.
		TreeSet<Integer> hn1=new TreeSet<Integer>();
		hn1.add(6);
		hn1.add(15);
		
		TreeSet<Integer> hn2=new TreeSet<Integer>();
		hn2.add(6);
		hn2.add(5);
		TreeSet<Integer> ans=new TreeSet<Integer>();
		for(int val:hn1)
		{
			System.out.println(hn2.contains(val)? "true":"false");
		}
		
		System.out.println("----------------------------------------------------");
		//9. Write a Java program to find numbers less than 7 in a tree set.
		System.out.println("elements in treeset  "+hn1);
		TreeSet<Integer> res=new TreeSet<Integer>();
		for(int res1:hn1)
		{
			if(res1<7)
			{
				res.add(res1);
			}
		}
		System.out.println("numbers less than 7-->"+res);
		
		System.out.println("----------------------------------------------------");
//10. get the element in a tree set which is greater than or equal to the given element.
		TreeSet<Integer> as=new TreeSet<Integer>();
		as.add(2);
		as.add(5);
		as.add(7);
		as.add(1);
		System.out.println(as);
		TreeSet<Integer> ans3=new TreeSet<Integer>();
		for(int res3:as)
		{
			if(res3>=6)
			{
               ans3.add(res3);
			}
		}
		System.out.println("greater than or equal to the given element 6 -->"+ans3);
		System.out.println("----------------------------------------------------");
		
	//11. get the element in a tree set less than or equal to the given element.
		System.out.println(as);
		TreeSet<Integer> ans2=new TreeSet<Integer>();
		for(int res2:as)
		{
			if(res2<=5)
			{
               ans2.add(res2);
			}
		}
		System.out.println("less than or equal to the given element 5-->"+ans2);
		
		System.out.println("----------------------------------------------------");
	//12.  get the element in a tree set strictly greater than or equal to the given element.
		
		System.out.println("----------------------------------------------------");
	//13. get an element in a tree set that has a lower value than the given element.
		System.out.println(as);
		TreeSet<Integer> ans1=new TreeSet<Integer>();
		for(int res1:as)
		{
			if(res1<5)
			{
               ans1.add(res1);
			}
		}
		System.out.println("lower value than the given element 5-->"+ans1);
		System.out.println("----------------------------------------------------");
	//14.  retrieve and remove the first element of a tree set.
		TreeSet<String> t1=new TreeSet<String>();
		t1.add("dog");
		t1.add("cat");
		t1.add("rat");
		System.out.println(t1);
		System.out.println("retrieve first element--"+t1.first());
		System.out.println("remove the first element-->"+t1.pollFirst());
		System.out.println(t1);
		
		
		System.out.println("----------------------------------------------------");
	//15.  retrieve and remove the last element of a tree set.
		t1.add("parrot");
		System.out.println(t1);
		System.out.println("retrieve last element--"+t1.last());
		System.out.println("remove the last element-->"+t1.pollLast());
		System.out.println(t1);
		System.out.println("----------------------------------------------------");
	//16. remove a given element from a tree set.
		t1.add("piegon");
		System.out.println(t1);
		t1.remove("dog");
		System.out.println("remove a given element-->"+t1);
		
	}

}
