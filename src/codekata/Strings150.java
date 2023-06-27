package codekata;  //error

import java.util.Scanner;

public class Strings150 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
        System.out.println("Enter the string");
        String s1=sc.nextLine();
        System.out.println("Enter the number");
        int  k=sc.nextInt();
        
        String res=s1.substring(0, 2);
        String res1=s1.substring(1, 3);
        String res2=s1.substring(2, 4);
        
        System.out.println(res+" "+res1+" "+res2);
	}

}
