//Write a program that prompts the user to input a positive integer. It should then print the multiplication table of that number. 
import java.util.Scanner;
public class MultiTable{
public static void main(String args[])
{
	int num=5;
	for(int i=1;i<=10;i++)
	{
		System.out.println("the table is : " + num+"*"+i+"="+ (num*i));
	}
}

}