package codekata; //error
import java.util.*;
import java.util.HashSet;
import java.util.Scanner;

public class Zen22DuplString {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("String");
		String str=s.nextLine();
	
		char[] c=str.toCharArray();
		
		LinkedList<Character> h=new LinkedList<Character>();
		for(char val:c)
		{
			h.add(val);
		}
		System.out.println(h);
		for(int i=0;i<h.size();i++)
		{
			for(int j=1;j<i;j++)
			{
			if(h.get(i).equals(h.get(j)))
			{
				System.out.println(h.get(i));
			}
			}
		}
	}

}
