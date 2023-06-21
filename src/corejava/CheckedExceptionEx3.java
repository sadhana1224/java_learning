package corejava;  //my program  //second method

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedExceptionEx3 {

	public static void main(String[] args) {

		try {
			CheckedEx3.checkedExcep();
		}
		catch(FileNotFoundException e) {
			System.out.println("Inside Filenot found exception");
			e.printStackTrace();
		}
		catch(InterruptedException e) {
			System.out.println("Inside Interrupted exception");
			e.printStackTrace();
		}
	}


}
class CheckedEx3{
	static void checkedExcep() throws InterruptedException, FileNotFoundException {
		Thread.sleep(5); //add throws
		
File f=new File("C:\\Users\\Guest User\\guvilearning\\Javaguv\\src\\basics\\exceptions.txt");
		
		FileReader fr=new FileReader(f); //add throws
	}
}