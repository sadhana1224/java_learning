package corejava;

import corejava.ThrowEx.ThrowException;

public class ThrowEx1 {

	public static void main(String[] args)  {
		ThrowException.ThrowExe(15);
	}
	
	class ThrowException
	{
		int age;
		static void ThrowExe(int age) {
			if(age<=18) {
				throw new RuntimeException("age must be greater than 18"); 
			}
			else
			{
				System.out.println("age is greater than 18");
			}
		}
	}

}