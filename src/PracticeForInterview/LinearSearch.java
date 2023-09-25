package PracticeForInterview;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {

		int[] ar= {15,60,26,70,30,80};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Searching element");
		int search_val=sc.nextInt();
		
		boolean flag=false;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]==search_val)
			{
				System.out.println("Element found at the index-->"+i);
				flag=true;
				break;
				
			}
		}
		if(flag==false)
		{
			System.out.println("No Elements Found");
		}
		
	}

}
