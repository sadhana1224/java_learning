package codekata; //right
import java.util.*;

public class Array146OddEven {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("num");
		int n=s.nextInt();
		String v=Integer.toString(n);
		char[] c=v.toCharArray();
		int l=c.length;
		int sum=0; //413
		for(int i=0;i<l;i++)
		{
			int val=Character.getNumericValue(v.charAt(i));
			if(val%2!=0) // 4%2
			{
			sum+=val;
			}
		}
		System.out.println(sum);
		if(sum%2==0)
		System.out.println("E");
		else
			System.out.println("O");
	
	}

}
