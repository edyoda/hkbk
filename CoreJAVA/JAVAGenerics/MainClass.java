package JAVAGenerics;

import java.util.*;

public class MainClass {

	public static void main(String[] args) throws InterruptedException {

			GenericsType<String> type = new GenericsType<>();
			
			type.set("Raginee"); //valid
			//This is also allowed but should not be done as it leads to ClasscastException
			GenericsType<Object> type1 = new GenericsType<>(); //raw type
			type1.set("Raginee"); //valid
			type1.set(10); //valid and autoboxing support
			
			
			//type1 = type;// Not allowed 
			
			System.out.println(type.get());
			System.out.println(type1.get());
			System.out.println(type.compare(10, 10));
			
			List list = new ArrayList<>();
			list.add('5');
			list.add(45);
			list.add("Raginee");
			type1.printData(list); 
			
			int[] arr = new int[2];
			
			
			System.out.println(arr[8]);
			int j = 90/0;
        
        Object[] intList = new Object[5];
		//List<Integer>[] inList = new List<Integer>[5]; // compile error
        Object[] objArray = intList;
        List<Double> doubleList = new ArrayList<>();
        doubleList.add(Double.valueOf(1.23));
        objArray[0] = doubleList; // this should fail but it would pass because at runtime intList and doubleList both are just List
        
        MyStackImplement<Integer> msi = new MyStackImplement<>();
        msi.push(6);
        msi.push(78);
        

	}

}
