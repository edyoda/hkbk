package oops.concept;

public class Rectangle1 extends Shape1{

	@Override
	void area() {
		// TODO Auto-generated method stub
		System.out.println("Printing area");
	}
	public static void main(String args[])
	{
		
		Rectangle1 r = new Rectangle1();
		r.area();
		//Shape1 s= new Shape1();
	}
	

}

abstract class Shape1{
	abstract void area();
}
