package exception.handling;

public class trycatchEg {
	@SuppressWarnings("finally")
	public static Employee test() {
		Employee m = new Employee();
		
		try{
			int ii =89/0;
		}
		catch(ArithmeticException ae)
		{
			return m;
		}
		finally
		{
		m.name = "ghy";
		}
		return null;
		
	}
	
	public static void main(String args[])
	{
		Employee i = test();
		System.out.println(i.name);
		try{
			int a[] = new int[10];
			int h = a[89];
			int k = 90/0;
		}
		//using one catch for multiple exceptions
		catch (ArithmeticException|ArrayIndexOutOfBoundsException ex) {
		   System.out.println(ex);
		    //throw ex;
		}
		
	}

}
class Employee{
	String name = "abc";
}