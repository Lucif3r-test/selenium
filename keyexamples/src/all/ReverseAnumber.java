package all;

import java.util.Scanner;

public class ReverseAnumber {

	public static void main(String[] args) 
	{
		//Reverse a Number
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int x=sc.nextInt();
		int y=0;
		while(x!=0)
		{
			int rem=x%10;
			y=y*10+rem;
			x=x/10;
		}
		System.out.println(y);

	}

}
