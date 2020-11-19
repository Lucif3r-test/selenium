package Business;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class GmailDriver {

	public static void main(String[] args) throws BiffException, IOException, RowsExceededException, WriteException, IllegalAccessException, IllegalArgumentException, InvocationTargetException 
	{
		//open excel file for read and write
		File f=new File("C:\\Git\\Selenium(N)\\BusinessDataDriven\\GmailTests.xlsx");
		Workbook rwb=Workbook.getWorkbook(f);
		//Go to sheet 1 for reading
		Sheet rsh1=rwb.getSheet(0);
		//count no. of tests(rows)
		int nor=rsh1.getRows();
		//Go to sheet 2 for reading
		Sheet rsh2=rwb.getSheet(1);
		//count no. of steps(rows)
		int nos=rsh2.getRows();
		//to write result on sheet 2
		WritableWorkbook wwb=Workbook.createWorkbook(f,rwb);
		WritableSheet wsh=wwb.getSheet(1);
		//create collection object for all methods
		GmailMethods gm=new GmailMethods();
		Method m[]=gm.getClass().getMethods();
		//0th row has column names
		for(int i=1;i<nor;i++)
		{
			//get data from 1st column and 3rd column from sheet 1
			String tid=rsh1.getCell(0, i).getContents();
			String mode=rsh1.getCell(2, i).getContents();
			if(mode.equalsIgnoreCase("yes"))
			{
				//oth row of sheet2 have column names
				for(int j=1;j<nos;j++)
				{
					//get 1st column data
					String sid=rsh2.getCell(0, j).getContents();
					if(tid.equalsIgnoreCase(sid))
					{
						//get 3rd,4th,5th,6th column of sheet2
						String mname=rsh2.getCell(2, j).getContents();
						String e=rsh2.getCell(3, j).getContents();
						String d=rsh2.getCell(4, j).getContents();
						String c=rsh2.getCell(5, j).getContents();
						for(int k=0;k<m.length;k++)
						{
							if(m[k].getName().equals(mname))
							{
								String res=(String)m[k].invoke(gm, e,d,c);
								Label l=new Label(6,j,res);
								wsh.addCell(l);
								break;//terminate from current loop
								
							}
						}
								
					}
				}
			}
		}
		wwb.write();
		wwb.close();
		rwb.close();
		
		

	}

}
