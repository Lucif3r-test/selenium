package all;

import java.util.Arrays;

public class demo 
{
	static void secondlargest(int a[], int n) 
	  {
		if(n>2)
		{
			Arrays.sort(a);
			int i=n-2;
			System.out.println("Second Largest Num is:"+a[i]);
		}
		return; 
	  }
	public static void main(String[] args) 
	{
		//To find second largest number
		  int[] a = {12, 35, 1, 10, 34, 1};
		  int n = a.length;
		  secondlargest(a, n);   
    }


	
}
 