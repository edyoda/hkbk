package oops.concept;

class InnerClass {
	static int data = 30;

	static class Inner {
		void msg() {
			System.out.println("data is " + data);
		}
	}

	public static void main(String args[]) {
		InnerClass.Inner obj = new InnerClass.Inner();
		obj.msg();
	}
}