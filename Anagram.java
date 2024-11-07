package StringNovPract;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram 
{
	public static void main(String[] args) 
	{
		Scanner s1= new Scanner(System.in);
		System.out.println("Enter input Strings: ");
		String in1=s1.next();
		System.out.println();

		String in2=s1.next();
		System.out.println();

		char c1[]=in1.toCharArray();// converted string into char array
		System.out.println("char array of String: "+Arrays.toString(c1));
		System.out.println();
		
		Arrays.sort(c1); //sorted char array
		System.out.println("sorted char array: "+ Arrays.toString(c1));
		
		char c2[]=in1.toCharArray();// converted string into char array
		System.out.println("char array of String: "+Arrays.toString(c2));
		System.out.println();
		
		Arrays.sort(c2); //sorted char array
		System.out.println("sorted char array: "+ Arrays.toString(c2));
		
		if(Arrays.equals(c1, c2))
		{
			System.out.println("Anagram");
		}
		else
		{
			System.out.println("Not Anagram");
		}
		
		
		
	}

}
