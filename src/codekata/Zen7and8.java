package codekata; //both right
import java.util.*;
public class Zen7and8 {//2 progeam

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("num");
		int n=s.nextInt();
		int[] ar=new int[n];
		int sum=0;
		System.out.println("array");
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=s.nextInt();
		}
		for(int i=0;i<ar.length;i++)
		{
			//sum+=ar[i]; //zen 7
			if(ar[i]%2==0) //zen 8
				System.out.print("even ");
			else
				System.out.print("odd ");
		}
		//System.out.println(sum); //zen 7
	}

}
