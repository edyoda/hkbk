package exception.handling;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class FirstTryCatchFinally {
	
	private static List<Integer> list;
	private static final int SIZE = 10;

	public static void writeList() {
	    PrintWriter out = null;
	    try {
	        //System.out.println("Entered try statement");
	        out = new PrintWriter(new FileWriter("OutFile.txt"));
	        for (int i = 0; i < SIZE; i++) {
	        	out.println("Printing");
	            out.println("Value at: " + i + " = " + list.get(i));
	        }
	    }
	    catch (NullPointerException e) {
	    System.err.println("NullPointerException: " + e);
		}   
		catch (IOException e) {
	    System.err.println("Caught IOException: " + e.getMessage());
		}
		finally {
	    if (out != null) { 
	        //System.out.println("Closing PrintWriter");
	        out.close(); 
	    } else { 
	        System.out.println("PrintWriter not open");
	    } 
	} 
	}
	
	public static void main(String args[])
	{
		writeList();
	}

}
