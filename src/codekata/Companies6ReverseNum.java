package codekata;  //right
import java.util.*;
public class Companies6ReverseNum {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("num");
		int n=s.nextInt();
		int[] ar=new int[n];
		System.out.println("array");
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=s.nextInt();
			
		}
		LinkedList<Integer> t=new LinkedList<Integer>();
		for(int num:ar)
		{
			t.add(num);
		}
		int l=t.size();
		for(int i=l-1;i>=0;i--)
		{
			if(i!=0)
			System.out.print(t.get(i)+"->");
			else
				System.out.print(t.get(i));	
		}
		
	}

}
