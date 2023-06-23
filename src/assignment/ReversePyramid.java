package assignment;
import java.util.Scanner;
class ReversePyramid{
    public static void main(String[] args)
    {
 Scanner sc=new Scanner(System.in);
 System.out.println("enter the number");
 int r=sc.nextInt();
 
 for(int i=r;i>=1;i--)
 {
     for(int s=0;s<=r-i;s++)
     {
          System.out.print(" ");
     }
     for(int j=1;j<=i;j++)
     {
          System.out.print("* ");
     }
      System.out.println();
 }
     
 }
        
    }
