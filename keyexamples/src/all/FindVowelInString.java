package all;

import java.util.Scanner;

public class FindVowelInString 
{
	public static boolean vowel(String s)
	{
		return s.toLowerCase().matches(".*[aeiou].*");
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String s=sc.nextLine();	
		System.out.println(vowel(s));
	}

}
