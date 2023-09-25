package PracticeForInterview;

import java.io.File;

public class FileDeletionPractice {

	public static void main(String[] args) {

		File f=new File("C:\\Users\\Guest User\\guvilearning\\Javaguv\\src\\PracticeForInterview\\sample.txt");
	

		if(f.exists())
		{
			f.delete();
			System.out.println("file deleted successfully");
		}
		else
		{
			System.out.println("file not deleted");
		}
	}

}
