
package oops.concept;
/**
 * @author kumarira
 *
 */
import java.util.*;

public class Book 
	{    
	
	int id;    
	String name,author,publisher;    
	int quantity; 
	ArrayList<String>  lis = new ArrayList<String>();
	
	
	public Book(int id, String name, String author, String publisher, int quantity) 
		{    
		    this.id = id;    
		    this.name = name;    
		    this.author = author;    
		    this.publisher = publisher;    
		    this.quantity = quantity;
		    lis.add(0,name);
		    lis.add(1,author);
		    lis.add(2,publisher);
		}  
	
	public void printmetadata()
	{
		Iterator<String> it = lis.iterator();
		while(it.hasNext())
		{
			System.out.println(it.toString());
		}
	}
	} 

