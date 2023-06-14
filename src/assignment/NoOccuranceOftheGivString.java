package assignment;
import java.util.Scanner; 

public class NoOccuranceOftheGivString {   //using scanner class

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
		// The Scanner class can read input from various sources
		//System.in: Standard input stream (keyboard input).
	    System.out.println("Enter the string");

	    String str = myObj.nextLine();  // Read user input  //nextLine(): Returns the next line of text as a string.
	   
	    //nextInt(), nextLong(), nextFloat(), nextDouble()-->i can use these methods also
	    
  //String str="Learining Selenium";
  
  int count=0;
  char c='e';
 
  int length=str.length();
  System.out.println("length of the string is :" +length);
  
  for(int i=0;i<str.length();i++)
  {
	  if(str.charAt(i)==c)
	  {
		  count++;
	  }
	  
	  
  }
  
  System.out.println("no.of occurance of the given character : "+count);
  
	}

}
