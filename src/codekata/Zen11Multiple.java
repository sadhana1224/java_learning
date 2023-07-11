package codekata;  //right
import java.util.*;
import java.util.Scanner;

public class Zen11Multiple {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("num ");
		int n=sc.nextInt();
		System.out.println("num2");
		int m=sc.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			
			sum=i*m;
			if(i<n)
			System.out.print(sum+" ");
			else
				System.out.print(sum);
		}
		
	}

}
