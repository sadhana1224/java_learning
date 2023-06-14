package oops;

//From Java8 , default method is supported inside an interface
//From Java9, static method is also supported inside an interface


interface BikeColor
{
	void getBikeColor();
	
	default void changeColor()
	{
		System.out.println("Changing the bike color");
	}
	
	static void setColor()
	{
		System.out.println("Setting the color of the bike");
	}
	
	
	
}
public class DefaultAndStaticInInterface implements BikeColor {
	
	@Override
	public void getBikeColor() {

			System.out.println("Get the color of the bike");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DefaultAndStaticInInterface obj= new DefaultAndStaticInInterface();
		obj.changeColor();
		obj.getBikeColor();
		BikeColor.setColor();
	}

	

}
