package codekata;  //basics 29 righht
import java.util.*;
public class Basics29ScaleneTriangle {

	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("num1");
int a=s.nextInt();
System.out.println("num1");
int b=s.nextInt();
System.out.println("num1");
int c=s.nextInt();

if((a+b>c) && (b+c>a) && (c+a>b) && (a!=b)&&(b!=c)&&(c!=a))
{
	System.out.println("yes");
}
else
{
	System.out.println("no");
}
	}

}
