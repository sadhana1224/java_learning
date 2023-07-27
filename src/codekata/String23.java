package codekata; //error
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList;
import java.util.Collections;
public class String23 {

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		System.out.println("string");
		String st=s.nextLine();
		String[] sp=st.split(" ");
		
		ArrayList<Integer> in=new ArrayList<Integer>();
		ArrayList<String> str=new ArrayList<String>();
		
		 String intRegex = "^\\d+$";
		 Pattern intPattern = Pattern.compile(intRegex);
		 
		 for(String words:sp)
		 {
			 Matcher m=intPattern.matcher(words);
			 if(m.matches())
			 {
				 in.add(Integer.parseInt(words));
			 }
			 else
			 {
				 str.add(words);
			 }
		 }
		 //System.out.println(in);
		 //System.out.println(str);
		 
		 int gn=Collections.max(in);
		 System.out.println(gn);
		
		 /*
		 int greatestNumber = Integer.MIN_VALUE;
		 for(int i=0;i<in.size();i++)
		 {
		 int num=in.get(i);
			 if(num>greatestNumber)
			 {
				 greatestNumber=num;
				
			 }
		 }
		 System.out.println(greatestNumber);
		 */
		 
	}

}
