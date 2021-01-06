package all;

public class SumElementInArray {

	public static void main(String[] args) 
	{
		// sum of all element in array
		int[] a={1,3,89,45,2,564};
		int sum=0;
		for(int i:a)
		{
			sum+=i;
		}
		System.out.println(sum);

	}

}
