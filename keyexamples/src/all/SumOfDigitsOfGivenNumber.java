package all;

public class SumOfDigitsOfGivenNumber 
{
    static int sum(int a)
    {
    	int b=0;
    	while(a!=0)
    	{
    		b=b+a%10;
    		a=a/10;
    	}
		return b;
    	
    }
	public static void main(String[] args) 
	{
		
		int a=12345;
	   System.out.println("Sum of digits ="+sum(a));

	}

}
