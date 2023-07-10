package codekata; //right
import java.util.*;
public class Array199Prime {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("num");
		int n=s.nextInt();

		for(int i=2;i<=n;i++)
		{
			int count=0;
			for(int j=2;j<=i/2;j++)
			{
				if(i%j==0)
				{
					count++;
					break;
				}
			}
			if(count==0)
			{
				if(i<n-3)
				System.out.print(i+" ");
				else
					System.out.println(i);
			}
		}
	}

}
