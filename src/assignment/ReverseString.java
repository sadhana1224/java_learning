package assignment;  //without using in buit method
//How to reverse a string in Java without using the reverse method?
public class ReverseString {
	
	
	public static void main(String[] args) {
		String name="sadhana";
		String reverse="";
		int slength=name.length();
		System.out.println("length of the string is :"+slength);
		
		for(int i=slength-1;i>=0;i--)
		{
		 reverse=reverse+name.charAt(i);
		  //reverse=""+charAt(7-1)-->a(6th position)
		 //reverse=a+(6-1)=5--->n
		 //reverse=an+(5-1)=4-->a
		 //contiues..
		 
		}
			
		System.out.println("reverse string is : "+reverse);
	}

}
