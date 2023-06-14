package oops;

interface Car10
{
	void accelerateCar();

}

interface Car11 extends Car10
{
	void changeCarColor();
}

public class ExtendTwoInterfacesEx implements Car11 {
	
	@Override
	public void accelerateCar() {
		System.out.println("Accelerate the car");
	}

	@Override
	public void changeCarColor() {
		// TODO Auto-generated method stub
		System.out.println("Change the car color");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExtendTwoInterfacesEx obj = new ExtendTwoInterfacesEx();
		obj.accelerateCar();
		obj.changeCarColor();

	}

	

}
