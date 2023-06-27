package codekata;   //right

import java.util.Arrays;
import java.util.Scanner;

public class Ab23 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//System.out.println("num");
		int n=sc.nextInt();
		String s=Integer.toString(n);
		
		char[] c=s.toCharArray();
		Arrays.sort(c);
		int l=c.length;
		
		for(int i=0;i<l;i++)
		{
			if(c[i]%2==0)
			{
			    	if(i!=0)
				System.out.print(" ");
				System.out.print(c[i]);
			
			}
			
		}
		System.out.println();
		int loop=0;
		for(int i=0;i<l;i++)
		{
			if(c[i]%2!=0)
			{	if(loop!=0)
				System.out.print(" ");
				
				System.out.print(c[i]);
				loop++;
               // if((i+2)!=l && c[i]!=c[l])
				//    System.out.print(" ");
			}
		}
	}

}