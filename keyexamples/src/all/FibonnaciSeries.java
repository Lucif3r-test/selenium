package all;

import java.util.Scanner;

public class FibonnaciSeries {

	public static void main(String[] args) 
	{
		// Fibonnaci
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the limit");
		int x=sc.nextInt();
		int a=0;
		int b=1;
		int c=a+b;
		System.out.println(a+" "+b);
		while(c<x)
		{
			System.out.println(c);
			a=b;
			b=c;
			c=a+b;
		}
		

	}

}
