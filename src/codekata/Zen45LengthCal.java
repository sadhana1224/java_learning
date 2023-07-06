package codekata;
import java.util.*;
public class Zen45LengthCal {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("string");
		String str=s.nextLine();

		String rep=str.replace(" ", "");
		int l=rep.length();
		System.out.println(l);
	}

}
