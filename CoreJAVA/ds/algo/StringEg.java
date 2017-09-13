package ds.algo;

import java.io.BufferedReader;
import java.util.Scanner;

public class StringEg {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        String[] words = input.split(" ");
        int i = 0,j=words.length-1;
        
        while(i < j)
        {
        	boolean iisAlpha = words[i].matches("[a-zA-Z]+");
        	boolean jisAlpha = words[j].matches("[a-zA-Z]+");
        	if(iisAlpha && jisAlpha)
        	{
        		String temp = words[i];
        		words[i] = words[j];
        		words[j] = temp;
        		i++;j--;
        	}
        	else if(!jisAlpha)
        		j--;
        	else if(!iisAlpha)
        		i++;
        }
        System.out.println("Reversed string is : ");
        for(String s : words)
        {
        	System.out.print(s);
        }
        
        in.close();
	}

}
