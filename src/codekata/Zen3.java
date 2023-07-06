package codekata; //right
import java.util.*;
public class Zen3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("num1");
		int m=s.nextInt();
		System.out.println("num2");
		int k=s.nextInt();

		for(int i=m+1;i<k;i++)
		{
			if(i<k-1)
			System.out.print(i+" ");
			else
				System.out.println(i);
		}
	}

}
