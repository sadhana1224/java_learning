package basics;  //access modifiers

import oops.PublicEx;  //import the other package file name

public class PublicEx2 {  //we access outside the package

	public static void main(String[] args) {  //check--> oops package -->'PublicEx.java,PublicEx1.java'
		
		PublicEx ranobj=new PublicEx();
		System.out.println(ranobj.range);
		ranobj.rangeDisplay();

	}

}
