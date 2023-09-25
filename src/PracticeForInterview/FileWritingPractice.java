package PracticeForInterview;

import java.io.FileWriter;
import java.io.IOException;

public class FileWritingPractice {

	public static void main(String[] args) throws IOException {

		FileWriter fwrite=new FileWriter("C:\\Users\\Guest User\\guvilearning\\Javaguv\\src\\PracticeForInterview\\sample.txt");
	
		String word="successfully completed the course";
		fwrite.write(word);
		fwrite.close();
	
	}

}
