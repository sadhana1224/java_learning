package codekata;

import java.util.Scanner;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.List;

public class Strings19 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("string");
		String str=s.nextLine();
		
		
		//LinkedHashSet<String> ls=new LinkedHashSet<String>();
		Set<Character> lh = new LinkedHashSet<>();
		StringBuilder sb=new StringBuilder();
		
		for(char c:str.toCharArray())
		{
			if(!lh.contains(c))
			{
				sb.append(c);
				
			}	
			lh.add(c);
		}
		System.out.println(sb.toString());
	}

}
