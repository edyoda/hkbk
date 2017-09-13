package ds.algo;

import java.util.Stack;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3,6,10,8,9};
		findMin(arr);
		
	}

	private static void findMin(int[] a) {
		 Stack<Integer> s = new Stack<Integer>();
	        for(int i = 0; i < a.length; i++){                        
	            while(!s.isEmpty() && s.peek() >= a[i]){                
	                s.pop();                
	            }
	            if(s.isEmpty())
	                System.out.print(-1+",");               
	            else
	                System.out.print(s.peek() + ", ");
	            s.push(a[i]);
	        }
		
	}
}
