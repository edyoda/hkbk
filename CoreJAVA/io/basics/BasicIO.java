package io.basics;

import java.util.Scanner;

public class BasicIO {
	
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		String str = in.nextLine();
		
		System.out.println(a);
		System.out.println(str);
	}

}
