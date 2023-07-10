package collectionsPractice;
import java.util.*;
public class LinkedHashSetPractice {

	public static void main(String[] args) {
		//HashSet lh=new HashSet();
		
		LinkedHashSet<String> lh=new LinkedHashSet<String>();
		lh.add("black");
		lh.add("white");
		lh.add("pink");
		lh.add("violet");
		
		//System.out.println("hashset -->"+lh);//doesn't maintain order
		
		System.out.println("linked hashset-->"+lh); //it maintains the order
	}

}
