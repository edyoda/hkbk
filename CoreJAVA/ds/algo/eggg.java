package ds.algo;

import java.util.ArrayList;

import javax.swing.text.html.HTMLDocument.Iterator;

public class eggg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Student> al = new ArrayList<>();
		Student st1 = new Student(1, "ABC", "Maths");
		Student st2 = new Student(1, "XYZ", "Science");
		al.add(st1);
		al.add(st2);
		System.out.println(al.get(0));
		java.util.Iterator<Student> it = al.iterator();
		while(it.hasNext())
		{
			Student s = it.next();
			System.out.println(s.id);
			System.out.println(s.name);
			System.out.println(s.sub);
			
		}
		
		
		
		
	}

}
