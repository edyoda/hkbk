package oops.concept;

public class EgVarArgs {
	
		//var args
	public static void display(String...strings)
	{
		String str = "";
		for(String s : strings)
		{
			str = str+s;
		}
		System.out.println(str + " ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		display("Raginee");
		display("Raginee" , "Kumari");
		display("AA", "BB", "CC");
		
		
		
	}

}
