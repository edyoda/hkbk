package ds.algo;

public class Student {
	int id;
	String name,sub;

	Student(int id,String name,String sub)
	{
		this.id = id;
		this.name = name;
		this.sub = sub;
	}
	/*@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (id != other.id)
			return false;
		return true;
	}
	@Override
	public int hashCode() {
		return id;
	}*/
}
