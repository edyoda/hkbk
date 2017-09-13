package io.basics;
import java.io.*;
import java.util.Scanner;
 
 public class FileByteCopier {
	 
	 public static void main(String[] args) throws IOException 
	 {
		 Scanner in1 = new Scanner(System.in);
		
		 int a = in1.nextInt();
		 System.out.println("Number is : " +a);
		 
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 
		 String hy = br.readLine();
		 
		 File inputFile = new File("scjp.txt");
		 File outputFile = new File("scjpcopy.txt");
		 FileInputStream in = new FileInputStream(inputFile);
		 FileOutputStream out = new FileOutputStream(outputFile);
		 int c;
		 while ((c = in.read()) != -1)out.write(c);
		 in.close();
		 out.close();
	 }
}

