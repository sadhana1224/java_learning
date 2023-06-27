package codekata;

import java.util.Scanner;

public class Amazon4Array {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int[] a=new int[n];
        
        System.out.println("array");
        for(int i=0;i<n;i++)
        {
        	a[i]=sc.nextInt();
        }
       int res= a[0]+a[1]+a[2];
       int res1= a[4]+a[5]+a[6];
       
       if(res==res1)
       {
    	   System.out.println("1");
       }
       else
       {
    	   System.out.println("0");
       }
       
	}

}
