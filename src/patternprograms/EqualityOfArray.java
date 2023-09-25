package patternprograms;

import java.util.Arrays;

public class EqualityOfArray {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		int b[]={1,2,3,4,5};;

		boolean status=Arrays.equals(a, b);
		if(status==true)
		{
			System.out.println("array is equal");
		}
		else
			System.out.println("array is not equal");
		
		//2nd method
		
		boolean s=true;
		
		if(a.length==b.length)
		{
			for(int i=0;i<a.length;i++)
			{
				if(a[i]!=b[i])
					s=false;
			}
		}
		else
		{
			System.out.println("not e");
		}
		if(s==true)
		{
			System.out.println("array is equal");
	
		}
		else
			System.out.println("array is not equal");


	}

}
