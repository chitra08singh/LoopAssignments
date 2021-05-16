package Pkg4;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Excel1 
{
	public static void ReadData(int col, int row) throws BiffException, IOException 
	{
		File f=new File("../ProjectCS_1/Excel File.xls");
		Workbook wk=Workbook.getWorkbook(f);
		Sheet st=wk.getSheet(0);
		
		int r=st.getRows();
		int c=st.getColumns();
		
		for(int i=0; i<r; i++) //for rows
		{
			for(int j=0; j<c; j++)  // for columns
			{
				Cell c1=st.getCell(j, i);
				System.out.println(c1.getContents());
			}
		}	
		
		
		
	}
	
	
	
}

}

