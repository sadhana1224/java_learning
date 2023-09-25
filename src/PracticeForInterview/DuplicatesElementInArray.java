package PracticeForInterview;

import java.util.HashSet;

public class DuplicatesElementInArray {

	public static void main(String[] args) {

		String[] ar= {"C","C++","JAVA","RUBY","PYTHON","RUBY"};
//approach 1		
		boolean flag=false;
		for(int i=0;i<ar.length;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[i]==ar[j])
				{
					System.out.println("duplicate element is-->"+ar[i]);
					flag=true;
				}
			}
		}
		if(flag==false)
		{
			System.out.println("Duplicates are not found");
		}
		
		//Approach-2 using HashSet
		String[] ar1= {"C","C++","JAVA","RUBY","PYTHON"};
		boolean f=false;
		HashSet<String> h=new HashSet<String>();
		for(String val:ar1)
		{
			if(h.add(val)==false)
			{
				System.out.println("duplicate element is-->"+val);
				f=true;
			}
			
		}
		if(f==false)
		{
			System.out.println("Duplicates are not found");
		}

		
	}

}
