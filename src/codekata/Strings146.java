package codekata; //Strings 146...right

import java.util.Scanner;

public class Strings146 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
        System.out.println("Enter the string");
        String s1=sc.nextLine();
        System.out.println("Enter the string");
        String s2=sc.nextLine();
        
        //boolean res=s1.contains(s2);
        //System.out.println(res);
        int index=s1.indexOf(s2);
        if(index!=-1)
        {
        	System.out.println(index);
        }
        else
        {
        	System.out.println("-1");
        }
        
        
	}

}
