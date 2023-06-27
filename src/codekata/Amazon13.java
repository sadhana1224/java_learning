package codekata; //1 tc passes

import java.util.Scanner;

public class Amazon13 {

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
        int res=a[0]+a[1];
        int res1=res+a[2];
        int res2=res1+a[3];
        	
        System.out.println(a[0]+" "+res+" "+res1+" "+res2);
	}

}
