package all;

public class Swap2Num 
{
	public static void swap(int a, int b)
	{
		b = a+b;
		a = b-a;
		b = b-a;
		System.out.println("a is:"+a);
		System.out.println("b is:"+b);
	}

	public static void main(String[] args) 
	{
		int a = 10;
		int b = 20;
		swap(a, b);
	}

}
