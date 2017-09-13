package oops.concept;

public class CarInheritance{
	
	public static void main(String args[])
	{
		//Car is abstract
		//Car c = new Car();
		DieselCar ds = new DieselCar("KUV500");
		PetrolCar ps = new PetrolCar("Sedan");
		System.out.println("Fuel of:" + ds.name + " is " + ds.getFuel());
		System.out.println("Fuel of:" + ps.name + " is " + ps.getFuel());
	}
}


 class Car {
	public String getFuel()
	{
		return "Calling car";
	}
	
}

class DieselCar extends Car{
	String name;
	
	DieselCar(String name){
		this.name = name;
	}

	public String getFuel() {
		// TODO Auto-generated method stub
		return "Diesel";
	} 
}

class PetrolCar extends Car{
	String name;
	
	PetrolCar(String name){
		this.name = name;
	}

	@Override
	public
	String getFuel() {
		// TODO Auto-generated method stub
		return "Petrol";
	} 
}