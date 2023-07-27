package codekata;   //right
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Strings22PancardValid {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("num");
		String pn=s.nextLine();
		// Regex to check valid PAN Card number.
		//1)Pan must have uppercase letters only.

		//2)It must be of 10 character only

		//3)From index 1 to 5 all must be letters(A-Z),last index must be letter

		//4)Rest all must be integer Starting from 1
		String regex="[A-Z]{5}[0-9]{4}[A-Z]{1}";  //HXTPS2142R  
        Pattern p=Pattern.compile(regex);
        
        Matcher m = p.matcher(pn);
        if(m.matches())
        {
        	System.out.println("pan");
        }
        else
        {
        	System.out.println("not pan");
        }
        
	}

}
