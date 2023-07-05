package codekata; //  basics 20...right
import java.util.*;
public class Basics20SwapEvenNadOddChar {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("string");
		
		String str=s.nextLine();
		
		char[] ch=str.toCharArray();
		int l=ch.length;
		for(int i=0;i<l-1;i+=2)
		{
			char temp=ch[i];
			ch[i]=ch[i+1];
			ch[i+1]=temp;
			System.out.print(""+ch[i]+""+ch[i+1]);
		}
		if(l%2!=0)
		{
			System.out.println(ch[l-1]);
		}




	
	}
}


