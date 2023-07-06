package collectionsPractice;
import java.util.*;
public class Arraylist1 {

	public static void main(String[] args) {
		ArrayList<String> cl=new ArrayList<String>();
		cl.add("black");
		cl.add("blue");
		cl.add("pink");
		cl.add("white");
		System.out.println("Colors--> "+cl); //1
		System.out.println("-------------------------");

		//2 ---iterate
		Iterator it=cl.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("----------------------------------------");
		
		//3 insert an element
		cl.add(0,"red");
		System.out.println("inserting an element at index 0-->"+cl);
		System.out.println("----------------------------------------");
		
		//4 retrieve an element
		System.out.println("Retrieve an element at specified index-->"+cl.get(2));
		System.out.println("-----------------------------------------");
		
		//5 update 
		cl.add("orange");
		System.out.println("update an array elemnt-->"+cl);
		System.out.println("-----------------------------------------");
		
		//6 remove a third element
		cl.remove(2);
		System.out.println("after removing third element-->"+cl);
		System.out.println("-----------------------------------------");
		
		//7 search for an element
		
		System.out.println("search for an element-->"+cl.contains("grey"));
		System.out.println("-----------------------------------------");
		
		//8 sort an arraylist
		Collections.sort(cl);
		System.out.println("after sorting-->"+cl);
		System.out.println("-----------------------------------------");
		
		//9 copy one arraylist to another
		ArrayList<Integer> cp=new ArrayList<Integer>();
		cp.add(10);
		cp.add(5);
		cp.add(23);
		cp.add(54);
		ArrayList<Integer> cp1=new ArrayList<Integer>();
		cp1.add(22);
		cp1.add(2);
		
		cp1.addAll(cp);
		System.out.println("copy one arraylist to another-->"+cp1);
		System.out.println("-----------------------------------------");
		
		//10 shuffle elements
		Collections.shuffle(cp1);
		System.out.println("after shuffle-->"+cp1);
		System.out.println("-----------------------------------------");
		
		//11 reverse elements
		Collections.sort(cp);
		System.out.println("sort-->"+cp);
		Collections.sort(cp,Collections.reverseOrder());
		System.out.println("after reverse-->"+cp);
		System.out.println("-----------------------------------------");
		
		//12 Extract a portion
		System.out.println("cp1 elements-->"+cp1);
		cp.retainAll(cp1);
		System.out.println("extract cp--->"+cp);
		System.out.println("-----------------------------------------");
		
		//13 compare two arraylist
		ArrayList<Integer> cp11=new ArrayList<Integer>();
		cp11.add(10);
		cp11.add(5);
		ArrayList<Integer> cp12=new ArrayList<Integer>();
		cp12.add(10);
		cp12.add(5);
		System.out.println("compare two arraylist -->"+cp11.equals(cp12));
		System.out.println("-----------------------------------------");
		
		//14 swaps two elements in an array list.
		ArrayList<Integer> sw=new ArrayList<Integer>();
		sw.add(2);
		sw.add(15);
		sw.add(3);
		System.out.println("elements-->"+sw);
		Collections.swap(sw,1,0);
		System.out.println("after swapping-->"+sw);
		
		System.out.println("-----------------------------------------");
		// 15 join two array lists.
		ArrayList<Integer> j=new ArrayList<Integer>();
		j.add(10);
		j.add(5);
		System.out.println("arraylist 1-->"+j);
		ArrayList<Integer> j1=new ArrayList<Integer>();
		j1.add(1);
		j1.add(7);
		System.out.println("arraylist 2-->"+j1);
		j1.addAll(j);
		System.out.println("after joining two arraylist-->"+j1);
		System.out.println("-----------------------------------------");
		//16 clone an arraylist
		ArrayList<String> clo=new ArrayList<String>();
		clo.add("hi");
		clo.add("hello");
		System.out.println("before clone-->"+clo);
		ArrayList<String> clo1=(ArrayList<String>) clo.clone();
		System.out.println("clone an arraylist-->"+clo1);
		System.out.println("-----------------------------------------");
		
		//17  empty an arraylist
		ArrayList<String> em=new ArrayList<String>();
		System.out.println("empty arraylist-->"+em);
		System.out.println("-----------------------------------------");
		
		//18 arraylist empty or not
		
		System.out.println(em.isEmpty());
		System.out.println("-----------------------------------------");
		
		//19  trimming the capacity of an array list.
		j.trimToSize();
		for(Object ob:j)
		{
			System.out.println(ob);
		}
		System.out.println("-----------------------------------------");
		//20 increase an arraylist size
		
		ArrayList<Integer> s=new ArrayList<Integer>();
		s.add(4);
		s.add(12);
		s.add(34);
		s.add(6);
		s.ensureCapacity(7);
		s.add(1);
		s.add(14);
		s.add(7);

		System.out.println("increase an arraylist size-->"+s);
		System.out.println("-----------------------------------------");
		
		//21 replace the second element
		System.out.println("before replece-->"+s);
		s.set(1, 20);
		System.out.println("after replacing an second element-->"+s);
		System.out.println("-----------------------------------------");
		
		//22 element's position
		
		for(int i=0;i<s.size();i++)
		{
			System.out.println("position "+ i +" is " +s.get(i));
		}
		
	}

}
