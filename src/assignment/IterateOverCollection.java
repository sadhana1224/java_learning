package assignment;
import java.util.*;
public class IterateOverCollection {

	public static void main(String[] args) {
		
		LinkedList<Integer> l=new LinkedList<Integer>();
		l.add(5);
		l.add(8);
		l.add(1);
		l.add(13);
		LinkedList<Integer> l1=new LinkedList<Integer>();

		l1.add(23);
		l1.addAll(l);
		System.out.println("elements in the list-->"+l1);
		
		//first way iterate
		for(int i=0;i<l1.size();i++)
		{
			System.out.println(l1.get(i));
		}
		System.out.println("----------------------------");
		//second way
		for(int val:l1)
		{
			System.out.println(val);
		}
		System.out.println("----------------------------");
		//third way
		Iterator it=l1.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
	}

}
