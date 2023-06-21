package corejava; //my program //3rd method

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedExcepEx4 {

	public static void main(String[] args) {
		CheckedEx4.checkedExc();
	}

}
class CheckedEx4{

	static void checkedExc() {
		//interrupted
		try {
			Thread.sleep(5); //add throws
		}
		catch(InterruptedException e) {
			System.out.println("Inside Interrupted exception");
			e.printStackTrace();
		}
//file not found
		File f=new File("C:\\Users\\Guest User\\guvilearning\\Javaguv\\src\\basics\\exceptions.txt");
		try {
			FileReader fr=new FileReader(f); //add throws
		}
		catch(FileNotFoundException e){
			System.out.println("Inside Interrupted exception");
			e.printStackTrace();
		}

		}
	}
