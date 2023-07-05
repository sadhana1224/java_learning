package corejava;
import java.util.*;

public class LinkedListEx {

	public static void main(String[] args) {
		//linkedlist with heterogenous data
		LinkedList l1=new LinkedList();

		l1.add("python");
		l1.add("c++");
		l1.add(true);
		l1.add(12.5);
		l1.add(null);

		System.out.println("Linkedlist values-->"+l1);//[python, c++, true, 12.5, null ]
		System.out.println("Linkedlist size-->"+l1.size());//5

		l1.add(1,"java");
		System.out.println("After adding at index 1"+l1);//[python, java, c++, true, 12.5, null]

		
		System.out.println(l1.get(0)); //python

		l1.set(0, "C++");
		System.out.println("After replacing the value at index 0 "+l1);//[C++, java, c++, true, 12.5, null]

		System.out.println(l1.contains("java")); //true
		System.out.println(l1.contains("pascal"));  //false
		System.out.println("--------------------------------");
		//First way to iterate over a collection
		for(int i=0;i<l1.size();i++)
		{
			System.out.println(l1.get(i));
		}
		System.out.println("--------------------------------");
		
		//second way for iterating over a collection
		
		//for(Datatype variablename:collection)
		
		for(Object data:l1)
		{
			System.out.println(data);
		}
		System.out.println("--------------------------------");
		
		//Iterator
		Iterator it=l1.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("--------------------------------");
		
		
	}

}
