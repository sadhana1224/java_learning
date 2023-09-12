package PracticeForInterview;

import java.util.Random;

public class GenerateRandomNumStrings {

	public static void main(String[] args) {

		//Approach 1
		Random rand=new Random();  //Random is a class
		
		int rand_int=rand.nextInt(10);// it will print any num b/w 0 to 9
		System.out.println(rand_int);
		
		double rand_db=rand.nextDouble(); //0.0 to 0.1
		System.out.println(rand_db);
		
		//Approach 2-using Math class
		System.out.println(Math.random());
		
		//Appraoch 3- appachi common lang API
	
		
	}

}
