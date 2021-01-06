package all;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) 
	{
		// Get Factorial(Here using double due to int limitations)
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a Number");
		double a=s.nextDouble();
		double fact=1;
		for(double i=1;i<=a;i++)
		{
			fact=fact*i;
		}
		System.out.println(fact);
		

	}

}
