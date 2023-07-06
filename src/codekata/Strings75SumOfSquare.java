package codekata;  //right
import java.util.*;
public class Strings75SumOfSquare {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("num");
		int n=s.nextInt();

		String str=Integer.toString(n); //convert int to string
		
		int l=str.length();
		int sum=0;
		for(int i=0;i<l;i++)
		{
			int val=Character.getNumericValue(str.charAt(i)); //get the numeric value in a string
			sum=sum+(val*val);
		}
		System.out.println(sum);
	}

}
