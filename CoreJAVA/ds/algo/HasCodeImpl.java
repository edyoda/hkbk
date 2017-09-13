package ds.algo;

import java.util.*;

public class HasCodeImpl {
	
	public static void main(String args[])
	{
		Set<Test> tt= new LinkedHashSet<>();
		tt.add(new Test(1));
		tt.add(new Test(1));
		tt.add(new Test(1));
		
		//while(!tt.isEmpty())
			System.out.println(tt.toString());
			System.out.println(tt.size());
	}
	

}

class Test
{
	
	private int a;
	Test(int a)
	{
		this.a = a;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Test other = (Test) obj;
		if (a != other.a)
			return false;
		return true;
	}

	
	
	@Override
	public int hashCode() {
		return a;
	}
}
