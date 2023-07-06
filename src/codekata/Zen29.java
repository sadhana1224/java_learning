package codekata;
import java.util.*;
public class Zen29 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("string");
		String str=s.nextLine();
		
		String res=str.replaceAll("[aeiouAEIOU]", "");
		System.out.println(res);
	}

}
