package basics;

public class StringbuilderNew {

	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder();
		sb.append("hello"); //append method
		sb.append("world");
		System.out.println(sb);
		
		StringBuilder sb1=new StringBuilder("hello");
		sb1.append("java");
		System.out.println(sb1);
		
		StringBuilder sb2=new StringBuilder(20);
		sb2.append("java");
		sb2.append("language");
		System.out.println(sb2);
		
		//methods
		//1.append
		
		//insert
		sb.insert(2, "java");
		System.out.println("after inserting : " +sb);
		
		//delete
		sb.delete(2,6);
		System.out.println("after delete : " +sb);
		
		//replace
		sb.replace(5, 10, "java");
		System.out.println("after replace : " +sb);
		
		//substring
		String sub=sb.substring(1);
		System.out.println("substring : " +sub);
		
		//reverse
		sb.reverse();
		System.out.println("reverse string : " +sb);
		
		//capacity
		StringBuilder sb3=new StringBuilder();
		sb3.append("hello");
		System.out.println("capacity : " +sb3.capacity());
		sb3.append("java is my favorite lanaguage");
		System.out.println("capacity : " +sb3.capacity());

	}

}
