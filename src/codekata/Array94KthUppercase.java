package codekata;//right

import java.util.Scanner;

public class Array94KthUppercase {

	 public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			
			String inp=sc.nextLine();
			String s=inp.split(" ")[0];
			int k=Integer.parseInt(inp.split(" ")[1]);
			
			char[] c=s.toCharArray();
			int l=s.length();
			String res=" ";
			if(k==0)
				System.out.println(s.toUpperCase());
			else {
			StringBuffer sb=new StringBuffer();
			for(int i=0;i<l;i++)
			{
				
				char ch=s.charAt(i);
				if((i+1)%k==0)
				{
					sb.append(Character.toUpperCase(ch));

					
				}
				else
				{sb.append(Character.toLowerCase(ch));
				}
						
			}
			System.out.println(sb.toString());}
		}

	}