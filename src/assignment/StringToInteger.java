package assignment;  //How to convert string to integer?

public class StringToInteger {

	public static void main(String[] args) {
          String s="1010";
          String s1="1234";
          int value=Integer.parseInt(s);  //first method using parseint
          double val2= Double.parseDouble(s1);
          int val=Integer.valueOf(s1);   //second method using valueof method
		System.out.println("string to int conversion : "+ value);
		System.out.println("string to int conversion : "+ val);
		System.out.println("String to double: "+val);
	}

}
