package codekata; //right
import java.util.*;
public class Array212AscendingOrder {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("num1");
		int n=s.nextInt();
		int[] ar=new int[n];
		System.out.println("array1");
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=s.nextInt();
		}
		System.out.println("num2");
		int m=s.nextInt();
		int[] aj=new int[m];
		System.out.println("array1");
		for(int i=0;i<aj.length;i++)
		{
			aj[i]=s.nextInt();
		}
		
		TreeSet<Integer> ts = new TreeSet<Integer>();
		for(int val:ar)
		{
			ts.add(val);
		}
		//System.out.println(ts);
		TreeSet<Integer> ts1 = new TreeSet<Integer>();
		for(int val1:aj)
		{
			ts1.add(val1);
		}
		//System.out.println(ts1);
		ts.addAll(ts1);
		//System.out.println(ts);
		boolean ele=true;
		for(int ans:ts)
		{
			if(ele)
			{
			System.out.print(ans);
			ele=false;
			}
			else
			{
				System.out.print(" "+ans);
			}
		}
	}

}
