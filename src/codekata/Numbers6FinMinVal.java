package codekata;  //right
import java.util.*;
public class Numbers6FinMinVal {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("num");
		int n=s.nextInt();
		int[] ar=new int[n];
		System.out.println("array");
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=s.nextInt();
		}
		int min=ar[0];
		//min=3;
		for(int i=1;i<ar.length;i++)  //3 4 9 1 6
		{
			if(ar[i]<min)
			{
				//ar[1]=4-->4<3
				min=ar[i];
			}
		}
		System.out.println(min);
		
	}

}
