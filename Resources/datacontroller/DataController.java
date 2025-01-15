package datacontroller;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataController 
{
	static  FileInputStream fi;
	static  Workbook wb;
	static  Sheet sh;
	static  Row  rw;
	static Cell c;
	
public static	Object[][] Customer_DC() throws IOException 
	{
     	fi=new FileInputStream("./Resources/TestData/customer.xlsx");
     	wb=new XSSFWorkbook(fi);
     	sh=wb.getSheet("customerdetails");
     	Object[][] obj=new Object[sh.getLastRowNum()][sh.getRow(0).getLastCellNum()];
     	DataFormatter df=new DataFormatter();
		for(int i=0;i<=obj.length-1;i++) 
		{
			for(int j=0;j<=obj[0].length-1;j++) //0-1 
			{
				obj[i][j]=df.formatCellValue(sh.getRow(i+1).getCell(j));
						
			}	       
		}
		   	
		return obj;
	}

public static	Object[][] User_DC() throws IOException 
{
 	fi=new FileInputStream("./Resources/TestData/customer.xlsx");
 	wb=new XSSFWorkbook(fi);
 	sh=wb.getSheet("userdetails");
 	Object[][] obj=new Object[sh.getLastRowNum()][sh.getRow(0).getLastCellNum()];
 	DataFormatter df=new DataFormatter();
	for(int i=0;i<=obj.length-1;i++) 
	{
		for(int j=0;j<=obj[0].length-1;j++) //0-1 
		{
			obj[i][j]=df.formatCellValue(sh.getRow(i+1).getCell(j));
					
		}	       
	}
	   	
	return obj;
}
	

	
}