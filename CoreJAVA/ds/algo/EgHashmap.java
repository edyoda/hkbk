package ds.algo;

import java.util.HashMap;

public class EgHashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student st1 = new Student(1, "ABC", "Maths");
		Student st2 = new Student(1, "XYZ", "Science");
		HashMap<String, Student> hm = new HashMap<>();
		hm.put("St1",new Student(1, "ABC", "Maths"));
		hm.put("St2",new Student(1, "XYZ", "Science"));
		boolean n = st1.equals(st2);
		System.out.println(n);
		System.out.println(hm);
//		if(equals(hm.get(st2)))
//				System.out.println("Same");
//		else
//			System.out.println("Different");

	}

}
