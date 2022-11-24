package day1Anagram.java;

/**
 * 
 * @author kapil
 *
 */

import java.util.*;

public class Anagrams {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//Create two string 
		String a = "secure";
		String b ="rescue";
		
		//Change to the character array
		char x[]=a.toCharArray();
		char y[]=b.toCharArray();
		
		//Sorting
		Arrays.sort(x); //check equal or not
		Arrays.sort(y);
		
		boolean result=Arrays.equals(x,y); //compare to x and y in array equal
		
		//if check the condition true or false
		if(result)
		{
			System.out.println("String are Anagram");
		}
		else
		{
			System.out.println("String are not Anagram");

		}

	}

}
