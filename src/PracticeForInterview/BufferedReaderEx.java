 package PracticeForInterview;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderEx {

	public static void main(String[] args) throws NumberFormatException, IOException {

		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("enter the number");
		int a=Integer.parseInt(br.readLine());
		
		System.out.println("enter the string");
		String str=br.readLine();
		
		System.out.println(a+" "+str);
		
		
		
	}

}
