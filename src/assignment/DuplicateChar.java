package assignment;

public class DuplicateChar {

	public static void main(String[] args) {

		String str="hellojava";
		char c[]=str.toCharArray();
		System.out.println("character length : "+c.length);
		for(int i=0;i<str.length();i++)
		{
			System.out.println("character array : "+ c[i]);
		}
		System.out.println("duplicate characters are : ");
		int count=0;
		for(int i=0;i<c.length;i++)
		{
			//i=0;0<5;1++...true

			for(int j=i+1;j<c.length;j++)
			{
				// j=0+1; 1<5;1++
				//j=1+1;2<5 ;2++
				//j=2+1;3<5;3++
				//j=3+1;4<5;4++
				//j=4+1;5<5;5++.....false

				if(c[i]==c[j])  
				{
					//h e l l o
					//0 1 2 3 4
					//h==e,l,l,o  ..there is no match ..goto next,,check whether it is equal or not
					//e==l,l,0 ...there is no match
					//l==l


					System.out.println(c[j]);
					count++;

					c[j]='0';//i dont want to print again the same char, so put it as 0
					
				}
			}
			
		}
		System.out.println("duplicate character count : "+count);

	}

}
