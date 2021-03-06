package all;

import java.util.Arrays;

public class SecondLargestNumberInArray 
{
	static void print2largest(int arr[], int n) 
    
	  {
	     int i, first, second;
	     if (n < 2) 
	  {
	       System.out.println(" Invalid Input ");
	       return;
	  }
	 
	       // Sort the array
	       Arrays.sort(arr);
	 
	      // Start from second last element
	      // as the largest element is at last
	       for (i = n - 2; i >= 0; i--) 
	  {
	      // If the element is not equal to largest element
	      if (arr[i] != arr[n - 1]) 
	    {
	      System.out.println("The second largest Element in Array is: "+ arr[i]);                  
	      return;
	    }
	  }
	 
	       System.out.println("There is no second " + "largest element\n");            
	}

	public static void main(String[] args) 
	{
		//To find second largest number
		  int arr[] = {12, 35, 1, 10, 34, 1};
		  int n = arr.length;
		  print2largest(arr, n);
        
    }


	}


