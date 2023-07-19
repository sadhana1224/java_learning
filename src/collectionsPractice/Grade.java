package collectionsPractice;
import java.util.*;
public class Grade {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("mark");
		int n=s.nextInt();
		String Grade="";
		
	if((n>=35)&&(n<45))
	{
		Grade="D";
	}
	else if(n>=50)
	{
		Grade="C";
	}
	else if(n>=75)
	{
		Grade="B";
	}
	else if(n>=85)
	{
		Grade="A";
	}
	else
	{
		System.out.println("fail");
	}
	System.out.println(Grade);
	}
	

}
