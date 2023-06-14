package assignment;

public class Encap {
	private int num;
	private String name;
	
	public void setname(String name1)
	{
		name=name1;
		
	}
	public void setnaum(int num1) {
		num=num1;
	}
	
	public String getname() {
		return name;
	}
	public int getnum() {
		return num;
	}

public static void main(String[] args) {
	Encap ob=new Encap();
	ob.setname("sadhana");
	ob.setnaum(163);
	System.out.println(ob.getname());
	System.out.println(ob.getnum());
	
}
}
