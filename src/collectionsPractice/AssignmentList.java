package collectionsPractice;
import java.util.*;
public class AssignmentList {

	public static void main(String[] args) {
		LinkedList<Integer> li=new LinkedList<Integer>();
		li.add(20);
		li.add(40);
		li.add(50);
		li.add(40);
		li.add(70);
		li.add(70);
		li.add(10);
		li.add(15);
		
		System.out.println(li);
		HashSet<Integer> h=new HashSet<Integer>();
		for(int val:li)
		{
			h.add(val);
		}
		System.out.println("unique elements in the list "+h);
		for(int i=0;i<li.size();i++)
		{
			for(int j=1;j<i;j++)
			{
				if(li.get(i).equals(li.get(j)))
				{
					System.out.println("repeated elements in the list "+li.get(i));
				}
				
			}
		}
		
	}

}
