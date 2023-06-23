package assignment;
import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=s.nextInt();
		
		System.out.println("Multiplication Table");
		for(int i=1;i<=10;i++)
		{
			int m=i*n;
			//m=1*10=10;  i++
			//m=2*10=20; i++
			
			System.out.println(i +"*" +n +"=" + m);
		}
		
	}

}
