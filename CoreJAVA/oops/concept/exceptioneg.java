package oops.concept;

public class exceptioneg {
	
	static void tttt()throws MyNewException
	{
		throw new MyNewException("Custom Unchecked Exception");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	      try {
			tttt();
		} catch (MyNewException e) {
			// TODO Auto-generated catch block
			System.out.println("Exception caught");
		}

	}

}
