package oops.concept;

public class ShapeInheritance{
	public static void main(String args[])
	{
		Shape shape = new Shape();
		Shape s = new Square();//upcasting
		Shape rect = new Rectangle();//upcasting
		shape.draw();
		s.draw();
		rect.draw();//Virtual method invocation
		
		//Downcasting
		((Rectangle)rect).getID();
		//instanceof
		boolean b = rect instanceof Rectangle;
		System.out.println(b);
	}
	
}

class Shape {
	
	void draw()
	{
		System.out.println("Drawing Shape");
	}

}

class Square extends Shape{
	void draw()
	{
		super.draw();
		System.out.println("Drawing Square");
	}
}

class Rectangle extends Shape{
	int id =12;
	void draw()
	{
		System.out.println("Drawing Rectangle");
	}
	void getID()
	{
		System.out.println("ID is : " +id);
	}
}
