package all;

public class ArrayElementSum 
{
	static int a[]={12,36,4,25,9};
	//method for sum
	static int sum()
	{
		int x=0;
		for(int i=0;i<a.length;i++)
		{
			x=x+a[i];
		}
		return x;
	}

	public static void main(String[] args) 
	{
		System.out.println("Sum of Elements = "+ sum());

	}

}