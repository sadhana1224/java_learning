package PracticeForInterview;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class FileReaderPractice {

	public static void main(String[] args) throws FileNotFoundException {

		FileReader f=new FileReader("C:\\\\Users\\\\Guest User\\\\guvilearning\\\\Javaguv\\\\src\\\\PracticeForInterview\\\\sample.txt");
	
		Scanner sc=new Scanner(f);
		System.out.println(sc.nextLine());
	
	}

}
