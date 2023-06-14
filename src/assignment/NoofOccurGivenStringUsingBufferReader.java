package assignment;
import java.io.*;// It is part of the Java I/O (Input/Output) classes and is used for efficient reading of characters from a file, input stream, or any other source that provides character-based input.

public class NoofOccurGivenStringUsingBufferReader {

	public static void main(String[] args)throws Exception {
  InputStreamReader r=new InputStreamReader(System.in);//InputStreamReader (which converts bytes to characters).
  BufferedReader br=new BufferedReader(r); //Java BufferedReader class is used to read the text from a character-based input stream
  System.out.println("enter the string:");
  
  String str=br.readLine(); //It can be used to read data line by line by readLine() method.
  
		
		char ch='e';
		int count =0;
		int length=str.length();
		System.out.println("length of the string : "+length);
		
		for(int i=0;i<length;i++)
		{
			if(str.charAt(i)==ch)
			{
				count++;
			}
		}
		System.out.println("no.of occurance of the given character : "+count);
	}
	

}
