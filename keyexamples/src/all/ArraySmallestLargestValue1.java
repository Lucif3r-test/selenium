package all;

import java.util.Arrays;

public class ArraySmallestLargestValue1 {

	public static void main(String[] args) 
	{
		int a[] = {10, 324, 45, 90, 9808}; 
        int min = Arrays.stream(a).min().getAsInt();
        int max=Arrays.stream(a).max().getAsInt();
        System.out.println("Smallest in array"+ min); 
        System.out.println("Largest in Array"+ max);
	}

}
