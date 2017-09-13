package io.basics;
import java.io.*;

public class SerializeDemo {

	   public static void main(String [] args) {
		   
		   //Serializing
	      Employee e = new Employee();
	      e.name = "ABC xyz";
	      e.address = "Andheri, Mumbai";
	      e.SSN = 11122333;
	      e.number = 101;
	      
	      try {
	         FileOutputStream fileOut = new FileOutputStream("employee.ser");
	         ObjectOutputStream out = new ObjectOutputStream(fileOut);
	         out.writeObject(e);
	         out.close();
	         fileOut.close();
	         System.out.printf("Serialized data is saved in employee.ser");
	      }catch(IOException i) {
	         i.printStackTrace();
	      }
	      
	      //Deserialization
	            Employee e1 = null;
	            try {
	               FileInputStream fileIn = new FileInputStream("employee.ser");
	               ObjectInputStream in = new ObjectInputStream(fileIn);
	               e1 = (Employee) in.readObject();
	               in.close();
	               fileIn.close();
	            }catch(IOException i) {
	               i.printStackTrace();
	               return;
	            }catch(ClassNotFoundException c) {
	               System.out.println("Employee class not found");
	               c.printStackTrace();
	               return;
	            }
	            
	            System.out.println("Deserialized Employee...");
	            System.out.println("Name: " + e1.name);
	            System.out.println("Address: " + e1.address);
	            System.out.println("SSN: " + e1.SSN);
	            System.out.println("Number: " + e1.number);
	   }
	}

class Employee implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	public String name;
	   public String address;
	   public transient int SSN;
	   public int number;
	   
	   public void mailCheck() {
	      System.out.println("Mailing a check to " + name + " " + address);
	   }
	}
