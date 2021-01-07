package all;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class StringCheckInFile 
{

	public static void main(String[] args) throws IOException 
	{
		// check file contain specific string or not
		File f=new File("C:\\Git\\Selenium(N)\\keyexamples\\String Check.txt");
		FileReader fr=new FileReader(f);
		BufferedReader br=new BufferedReader(fr);
		String x=br.readLine();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String a=sc.nextLine();
		while(x!=null)
		{
		   	if(x.contains(a))
		   	{
		   		System.out.println("File contains specified string");
		   	}
		   	else
		   	{
		   		System.out.println("File does not contains specified string");
		   	}
		   	x=br.readLine();
		}
		br.close();
		fr.close();
		System.exit(0);

	}

}
