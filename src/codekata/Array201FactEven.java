package codekata; //right
import java.util.*;
public class Array201FactEven {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("num");
		int n=s.nextInt();
		boolean temp = false;
		for(int i=2;i<=n;i++)
		{
			if(n%i==0&& i%2==0)
			{
				if(temp)
				System.out.print(" "+i);
				else
					System.out.print(i);
				temp =true;	
			}
			
		}
		if(!temp)
			
			System.out.print("-1");
		System.out.println();
	}
	

}
