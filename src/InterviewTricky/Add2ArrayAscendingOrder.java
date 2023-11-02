package InterviewTricky;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Add2ArrayAscendingOrder {

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		System.out.println("num");
		int n=s.nextInt();
		
	int ar1[]=new int[n];
	
	
	System.out.println("first array");
	for(int i=0;i<n;i++)
	{
		ar1[i]=s.nextInt();
	}
	System.out.println("num1");
	int n1=s.nextInt();
	int ar2[]=new int[n1];
	System.out.println("second array");
	for(int i=0;i<n1;i++)
	{
		ar2[i]=s.nextInt();
	}
	
	ArrayList<Integer> al=new ArrayList<>();
	for(int val:ar1)
	{
		al.add(val);
	}
	System.out.println(al);
	for(int val1:ar2)
	{
		al.add(val1);
	}
	System.out.println(al);
	Collections.sort(al);
	System.out.println("ascending order-->"+al);
	}

}
