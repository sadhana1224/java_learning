package codekata;  //right
import java.util.*;
public class Zen43 {

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
		ArrayList<Integer> al=new ArrayList<Integer>();
		for(int val:ar)
		{
			al.add(val);
		}
		//System.out.println(al);
		Collections.sort(al);
		Collections.sort(al,Collections.reverseOrder());
		//System.out.println(al);
		for(int i=0;i<al.size();i++)
		{
			if(i<al.size()-1)
				System.out.print(al.get(i)+" ");
			else
				System.out.print(al.get(i));

		}
	}

}
