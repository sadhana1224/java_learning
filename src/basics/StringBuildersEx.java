package basics;

public class StringBuildersEx {

	public static void main(String[] args) {
		
		//String Builder is an mutable (values are changeable) version of String class
		//the default no . of characters for STring builder is 16
		
		//first way of creating stringbuilder
		StringBuilder sb = new StringBuilder();
		sb.append("Hello");
		sb.append("world");
		
		System.out.println("sb-->"+sb);
		
		//second way of creating stringbuilder
		StringBuilder sb1 = new StringBuilder("Hello");
		sb1.append("world");
		
		System.out.println("Second way of creating stringbuilder-->"+sb1);
		
		//Third way of creating Stringbuilder
		StringBuilder sb2= new StringBuilder(20);
		sb2.append("java");
		sb2.append("language");
		System.out.println("Third way of ceating StringBuilder-->"+sb2);
		
		//other StringBuilder methods
		
		sb.insert(1, "java");
		System.out.println("After Inserting in sb-->"+sb);
		
		//beginindex is inclusive and the endindex is exlusive
		sb.delete(1,5);
		System.out.println("After deleting in sb-->"+sb);
		
		sb.replace(5,10,"java");
		System.out.println("After replacing in sb-->"+sb);
		
		
		String sub=sb.substring(0,5);
		System.out.println("Extracting Hello from sb-->"+sub);
		System.out.println("Extracting Hello from sb-->"+sb.substring(0,5));
		
		String sub1= sb.substring(5);
		System.out.println("Extracting Hello from sb-->"+sub1);
		
		//sb.reverse();
		//System.out.println("reversing sb-->"+sb);
		
		char ch=sb.charAt(1);
		System.out.println("charAt-->"+ch);
		
		System.out.println("Length of sb-->"+sb.length());
		
		StringBuilder sb4= new StringBuilder();
		System.out.println("Default capacity-->"+sb4.capacity());
		sb4.append("Hello");
		System.out.println("Capacity after appending Hello-->"+sb4.capacity());
		sb4.append("java is my favorite language");
		System.out.println("After inserting characters more than 16-->"+sb4.capacity());

/*
 * new capacity = (old capacity *2) +2;
 * newcapacity= (16*2)+2 = 32 +2 =34
 * 
 */

		//ensureCapacity
		StringBuilder sb5= new StringBuilder();
		System.out.println("Default capacity in sb5-->"+sb5.capacity()); //16
		sb4.append("Hello");
		System.out.println("Capacity after appending Hello in sb5-->"+sb5.capacity()); //16
		sb5.append("java is my favorite language");
		System.out.println("After inserting characters more than 16 in sb5-->"+sb5.capacity()); //34
		
		sb5.ensureCapacity(15);
		System.out.println("checking the capacity when the minimumcapacity (15) < current capacity (34)-->"+sb5.capacity());
		
		
		
		sb5.ensureCapacity(50);
		System.out.println("Checking the capacity when the minimum capacity(50) > current capacity(34)-->"+sb5.capacity());
		
		/*
		 * new capacity = (old capacity *2) +2;
		 * newcapacity= (34*2)+2 =68 +2 =70
		 * 
		 */
		

		
		

	}

}
