package oops.concept;

public class MainOverload {

	public static void main(String[] args) {
		if (args.length > 0) {
			String s = args[0];
			for (int i = 1; i < args.length; i++) {
				s = s + args[i];
			}
			System.out.println(s);
		} else {
			System.out.println("Hi(from main)");
			MainOverload.main("Raginee");
		}
	}

	private static void main(String string) {
		System.out.println("Hi " + string);
		MainOverload.main("Raginee", "Java");

	}

	private static void main(String string, String string2) {
		System.out.println("Hi " + string + " Welcome to " + string2);

	}

}
