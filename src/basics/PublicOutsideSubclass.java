package basics;  //my program
import oops.PublicEx;  //import the other package
public class PublicOutsideSubclass extends PublicEx{  //outside the package of subclass

	public static void main(String[] args) {
		
		PublicOutsideSubclass pos=new PublicOutsideSubclass();
		pos.rangeDisplay();
		System.out.println(pos.range);

	}

}
