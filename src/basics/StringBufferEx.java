package basics;

public class StringBufferEx {

	public static void main(String[] args) {
		
		
		StringBuffer sbb= new StringBuffer();
		System.out.println("default Capacity-->"+sbb.capacity());
		
		StringBuffer sbb1= new StringBuffer("hello");
		sbb1.append("world");
		System.out.println(sbb1);
		
		StringBuffer sbb2= new StringBuffer(20);
		sbb2.append("java");
		sbb2.append("language");
		System.out.println(sbb2);
		
		
		//append method
		sbb.append("Hello");
		sbb.append("world");
		System.out.println("After inserting -->"+sbb);
		
		//insert method
		sbb.insert(2, "java");
		System.out.println("after insert :" +sbb);
		
		//delete method
		sbb.delete(2, 6);
		System.out.println("after delete : "+sbb);
		
		//replace method
		sbb.replace(0,5,"java");
		System.out.println("after replace : "+sbb);
		
		//reverse method
		sbb2.reverse();
		System.out.println("after reverse : "+sbb2);
		
		//charAt
		char ch=sbb.charAt(5);
		System.out.println(ch);
		//length
		System.out.println("String length : "+sbb.length());
		
		//capacity method
		
		StringBuffer sbb3= new StringBuffer();
		System.out.println("default capacity : "+sbb3.capacity());
		
		sbb3.append("hello");
		System.out.println("Capacity after appending Hello-->"+sbb3.capacity());
		
		sbb3.append("java is my favorite language");
		System.out.println("After inserting characters more than 16-->"+sbb3.capacity());
		
		//ensure capacity
		StringBuffer sbb4= new StringBuffer();
		System.out.println("default capacity : "+sbb4.capacity());
		
		sbb4.append("hello");
		System.out.println("Capacity after appending Hello-->"+sbb4.capacity());
		
		sbb4.append("java is my favorite language");
		System.out.println("After inserting characters more than 16-->"+sbb4.capacity());
		
		sbb4.ensureCapacity(20);
		System.out.println("checking the capacity when the minimumcapacity (20) < current capacity (34)-->"+sbb4.capacity());
		
		sbb4.ensureCapacity(60);
		System.out.println("Checking the capacity when the minimum capacity(60) > current capacity(34)-->"+sbb4.capacity()); //70



	}

}
