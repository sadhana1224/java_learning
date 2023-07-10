package collectionsPractice;
import java.util.*;
public class LinkedList1Practice {

	public static void main(String[] args) {
		LinkedList<Integer> l1=new LinkedList<Integer>();
		//1 append the specified element to the end of a linked list.
		l1.add(2);
		l1.add(23);
		l1.add(13);
		System.out.println(l1);
		
		l1.addLast(10);
		System.out.println("append element to end of list-->"+l1);
		System.out.println("------------------------------------------");
		
		//2 iterate
		
		for(int val:l1)
		{
			System.out.println(val);
		}
		System.out.println("------------------------------------------");
		
		//3 starring at specified position
		
		for(int i=0;i<l1.size();i++)
		{
			System.out.println("position "+ i +" is "+l1.get(i));
		}
		System.out.println("------------------------------------------");
		
		//4 reverse order
		
		Collections.sort(l1);
		System.out.println("sort elements-->"+l1);
		
		Collections.sort(l1,Collections.reverseOrder());
		System.out.println("reverse order--->"+l1);
		System.out.println("------------------------------------------");
		
		//5 insert a specified element at specified position
		
		Collections.sort(l1);
		System.out.println("sort elements-->"+l1);
		l1.add(1, 25);
		System.out.println("insert a specified element at specified position-->"+l1);
		System.out.println("------------------------------------------");
		
		//6 insert an element at first and last
		
		l1.addFirst(1);
		l1.addLast(55);
		System.out.println("insert an element at first and last-->"+l1);
		System.out.println("------------------------------------------");
		
		//7 insert the specified element at the front of a linked list
		l1.addFirst(5);
		System.out.println("front of a linkedlist-->"+l1);
		System.out.println("------------------------------------------");
		
		//8 insert the specified element at the end of a linked list.
		l1.addLast(61);
		System.out.println("end of a linkedlist-->"+l1);
		System.out.println("------------------------------------------");
		
		//9  insert some elements at the specified position into a linked list.
		LinkedList li=new LinkedList();
		li.add(10);
		li.add("java");
		System.out.println(li);
		LinkedList li1=new LinkedList();
		li1.add(1);
		li1.add("guvi");
		li1.addAll(1,li);
		System.out.println("insert some elements at the specified position-->"+li1);
		System.out.println("------------------------------------------");
		
		//10 get the first and last occurrence of the specified elements in a linked list.
		LinkedList<String> s=new LinkedList<String>();
		s.add("java");
		s.add("c++");
		s.add("pascal");
		s.add("python");
		System.out.println("elements in the list "+s);
		System.out.println("get the first occurance-->"+s.getFirst());
		System.out.println("get the last occurance-->"+s.getLast());
		System.out.println("------------------------------------------");
		
		//11 display elements and their positions in a linked list.
		for(int i=0;i<s.size();i++)
		{
			System.out.println(" position "+ i +" is "+s.get(i));
		}
		System.out.println("------------------------------------------");
		
		//12  remove a specified element from a linked list.
		System.out.println(s);
		s.remove(2);
		System.out.println("after removing a specified element-->"+s);
		System.out.println("------------------------------------------");
		
		// 13  remove the first and last elements from a linked list.
		System.out.println(s);
		s.removeFirst();
		System.out.println("after removing the first element-->"+s);
		s.removeLast();
		System.out.println("after removing the last element-->"+s);
		System.out.println("------------------------------------------");
		
		//14  remove all elements from a linked list.
		
		LinkedList<Integer> l=new LinkedList<Integer>();
		l.add(2);
		l.add(15);
		System.out.println(l);
		LinkedList<Integer> l11=new LinkedList<Integer>();
		l11.removeAll(l);
		System.out.println("after removing all elements-->"+l11);
		System.out.println("------------------------------------------");
		
		//15  swaps two elements in a linked list.
		LinkedList<Integer> sw=new LinkedList<Integer>();
		sw.add(2);
		sw.add(15);
		sw.add(3);
		System.out.println("elements-->"+sw);
		Collections.swap(sw,1,0);
		System.out.println("after swapping-->"+sw);
		System.out.println("------------------------------------------");
		
		//16 shuffle elements in a linked list.
		LinkedList<Integer> lin=new LinkedList<Integer>();
		lin.add(12);
		lin.add(25);
		lin.add(23);
		Collections.sort(lin);
		System.out.println("sort-->"+lin);
		Collections.shuffle(lin);
		System.out.println("after shuffle-->"+lin);
		System.out.println("------------------------------------------");
		
		//17  join two linked lists.
		
		LinkedList<Float> t=new LinkedList<Float>();
		t.add((float) 11.2);
		t.add((float) 13.5);
		t.add((float) 10.8);
		System.out.println("first linkedlist-->"+t);
		LinkedList<Float> t1=new LinkedList<Float>();
		t1.add((float) 21.2);
		System.out.println("second linkedlist-->"+t1);
		t1.addAll(t);
		System.out.println("join two linkedlist-->"+t1);
		System.out.println("------------------------------------------");
		
		//18  to copy a linked list to another linked list.
		LinkedList<Integer> cp=new LinkedList<Integer>();
		cp.add(10);
		cp.add(5);
		cp.add(23);
		cp.add(54);
		System.out.println("elements in one linkedlist-->"+cp);
		LinkedList<Integer> cp1=new LinkedList<Integer>();
		cp1.add(22);
		cp1.add(2);
		System.out.println("elements in another linkedlist-->"+cp1);
		cp1.addAll(cp);
		System.out.println("copy one LinkedList to another-->"+cp1);
		System.out.println("------------------------------------------");
		
		//19 remove and return the first element of a linked list
		LinkedList<String> st=new LinkedList<String>();
		st.add("audi");
		st.add("bmw");
		st.add("alto");
		System.out.println(st);
		
		st.removeFirst();
		System.out.println("after removing the first element-->"+st);
		System.out.println("return the first element-->"+st.get(0));
		System.out.println("------------------------------------------");
		
		//20 Java program to retrieve, but not remove, the first element of a linked list.
		
		System.out.println("retrieve first element "+cp.getFirst());
		System.out.println("elements in  linkedlist-->"+cp);
		System.out.println("------------------------------------------");

		//21  retrieve, but not remove, the last element of a linked list.
		System.out.println("retrieve last element "+cp.getLast());
		System.out.println("elements in  linkedlist-->"+cp);
		System.out.println("------------------------------------------");
		
		//22  check if a particular element exists in a linked list.
		
		System.out.println("elements in  linkedlist-->"+cp);
		System.out.println(cp.contains(2));
		System.out.println("------------------------------------------");
		
		//23 convert a linked list to an array list.
		LinkedList<String> con=new LinkedList<String>();
		con.add("cat");
		con.add("dog");
		System.out.println("linkedlist-->"+con);
		ArrayList<String> al=new ArrayList<String>();
		al.addAll(con);
		System.out.println("convert linkedList to arraylist-->"+al);
		
		System.out.println("------------------------------------------");
		
		//24 compare two linked lists and print the linked list
		LinkedList<Integer> cm=new LinkedList<Integer>();
		cm.add(1);
		cm.add(2);
		System.out.println("linkedlist 1-->"+cm);
		LinkedList<Integer> cm1=new LinkedList<Integer>();
		cm1.add(1);
		cm1.add(2);
		System.out.println("linkedlist 2-->"+cm1);
		System.out.println(cm1.equals(cm));
		System.out.println("------------------------------------------");
		
		//25  check if a linked list is empty or not.
		System.out.println("elements in  linkedlist-->"+cp);
		System.out.println(cp.isEmpty());
		System.out.println("------------------------------------------");
		//26 replace an element in a linked list.
		System.out.println("linkedlist-->"+con);
		con.set(0, "rat");
		System.out.println("after replacing an element-->"+con);
		
		
	}

}
