package assignment;

public class Immutable {  

	public static void main(String[] args) {
String str="sadhana";
str.concat("suba"); 
String str2=str.concat("suba");
System.out.println(str);  //sadhana
System.out.println(str2);//suba

	}

}
