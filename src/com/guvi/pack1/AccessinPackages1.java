package com.guvi.pack1;

//To access a package, we need to use import statement.
//import packagename with no change in directory structure
//import a specific class from a package
import com.guvi.pack.AA;

//to import all the classes and interfaces in the package, use * with the package name. It wont import the subpackages inside this package
import com.guvi.pack.*;

import com.guvi.pack.subpack.*;


public class AccessinPackages1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AA obj = new AA();
		obj.msg();
		
		BB obj1= new BB();
		obj1.msg2();
		
		//using a fully qualified name instead of importing the package
		com.guvi.pack.AA obj3 = new com.guvi.pack.AA();
		obj3.msg();
		
		//Accessing the subpackage
		SubpackageEx obj4 = new SubpackageEx();
		obj4.message3();

	}

}
