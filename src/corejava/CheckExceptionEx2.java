package corejava;  //my program  //first method
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckExceptionEx2 {

	public static void main(String[] args) throws FileNotFoundException, InterruptedException {
		checkedEx1.checkedExceptions();//add throws...//call the static method using classname.methodname 

	}

}


class checkedEx1{
	
	 static void checkedExceptions() throws InterruptedException, FileNotFoundException {
		Thread.sleep(5); //add throws
		
		File f=new File("C:\\Users\\Guest User\\guvilearning\\Javaguv\\src\\basics\\exceptions.txt");
		
		FileReader fr=new FileReader(f); //add throws
	}
	
	
	
	
}