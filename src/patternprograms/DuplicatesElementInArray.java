package patternprograms;

import java.util.HashSet;

public class DuplicatesElementInArray {

	public static void main(String[] args) {

		String[] st= {"c","c++","java","ruby","java","python"};

		HashSet<String> hs=new HashSet<String>();
		boolean flag=false;
		for(String val:st)
		{
			if(hs.add(val)==false)
			{
				System.out.println("duplicate=-->"+val);
				flag=true;
			}
		}
		if(flag==false)
		{
			System.out.println("no duplicates");
		}


		String[] st1= {"c","c++","java","ruby","java","python"};
boolean f=false;

		for(int i=0;i<=st1.length;i++)
		{
			for(int j=i+1;j<st1.length-1;j++)
			{
				if(st1[i]==st1[j+1])
				{
					System.out.println("duplicate=-->"+st1[i]);
					f=true;

				}
			}
		}
		if(f==false)
		{
			System.out.println("no duplicates");
	
		}

	}
}
