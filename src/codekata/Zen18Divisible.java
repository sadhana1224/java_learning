package codekata;  //right
import java.util.*;
import java.util.Scanner;

public class Zen18Divisible {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("num ");
		int n=sc.nextInt();
		System.out.println("num 1 ");
		int a=sc.nextInt();
		System.out.println("num 2 ");
		int b=sc.nextInt();
		System.out.println("num 3 ");
		int c=sc.nextInt();
		
		if((n%a==0) && (n%b==0) && (n%c==0))
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
	}

}
