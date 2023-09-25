package patternprograms;

public class LinearSearch {

	public static void main(String[] args) {
		int[] a= {50,65,98,20,64,10};
		
		int search=150;
		
		boolean flag=false;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==search)
			{
				System.out.println("value is present "+i);
				flag=true;
			}
		}
		if(flag==false)
		{
			System.out.println("not present");
		}
	}

}
