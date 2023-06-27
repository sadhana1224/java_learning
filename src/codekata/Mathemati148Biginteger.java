package codekata;

import java.math.BigInteger;
import java.util.Scanner;
class Fact
{
	static BigInteger largenum(long n)
	{
		BigInteger fact=BigInteger.ONE;
		for(int i=1;i<=n;i++)
		{
			 fact = fact.multiply(BigInteger.valueOf(i));
		}
		return fact;
	}
}
public class Mathemati148Biginteger {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("number");
		int n=sc.nextInt();
		Fact f=new Fact();
		BigInteger fact=f.largenum(n);
		System.out.println(fact);
		
		
	}

}
