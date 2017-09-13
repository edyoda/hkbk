package JAVAGenerics;

import java.util.*;

public class GenericsType<T> {

	private T t;
	
	public T get(){
		return this.t;
	}
	
	public void set(T t1){
		this.t=t1;
	}
	public <X extends Comparable<X>> int compare(X x1,X x2){
		return x1.compareTo(x2);
	}
	
	public static void printData(List<? super Object> list){
		//list.add(null);
		for(Object obj : list){
			System.out.print(obj + " ");
		}
	}
}
