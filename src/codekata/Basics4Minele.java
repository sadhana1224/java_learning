package codekata; //right
import java.util.Scanner;
import java.util.*;
public class Basics4Minele {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int[] ar=new int[10];

		System.out.println("array");
		for(int i=0;i<10;i++)
		{
			ar[i]=s.nextInt();
		}
		int min=ar[0];
		for(int i=0;i<10;i++)
		{
			if(min>ar[i])
			{
				min=ar[i];
			}
		}
		System.out.println(min);
		
	}

}
