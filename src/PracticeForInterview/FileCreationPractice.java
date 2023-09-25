package PracticeForInterview;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileCreationPractice {

	public static void main(String[] args) throws IOException {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the path");
		String path=sc.nextLine();
		
		System.out.println("Enter the filename");
		String filename=sc.nextLine();
		
		File f=new File(path+filename+".txt");
		f.createNewFile();
		
		
	}

}
