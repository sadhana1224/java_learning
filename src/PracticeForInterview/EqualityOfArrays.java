package PracticeForInterview;

import java.util.Arrays;

public class EqualityOfArrays {

	public static void main(String[] args) {
//method 1
		
		int[] a1= {1,2,3,4,5};
		int[] a2= {1,2,3,4,5};
		
	boolean status=	Arrays.equals(a1,a2);
		if(status==true)
		{
			System.out.println("Arrays are equal");
		}
		else
		{
			System.out.println("Arrays are Not equal");
		}
			
		//2nd Method
		
		boolean status1=true;
		if(a1.length==a2.length)
		{
			for(int i=0;i<a1.length;i++)
			{
				if(a1[i]!=a2[i])
					status1=false;
			}
			
		}
		else
		{
			status1=false;
		}
		if(status1==true)
		{
			System.out.println("Arrays are  Equal");
		}
		else
		{
			System.out.println("Arrays are Not Equal");
		}
		
	}

}
