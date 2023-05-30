package oops;  //access modifiers

 
public class PublicEx {  //within the same class
	public int range=129;

	public void rangeDisplay()
	{
		System.out.println("the range is :"+ range);
	}
	public static void main(String[] args) {
		
		PublicEx ranobj=new PublicEx();
		System.out.println(ranobj.range);
		ranobj.rangeDisplay();
	}

}
