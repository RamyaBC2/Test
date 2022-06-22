package Jeneric_script;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class fetch_data {
	public static String data(String sheet,int row,int cell) throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("./Excel1/1.xlsx");
		Workbook book=WorkbookFactory.create(file);
		Cell cell2 = book.getSheet(sheet).getRow(row).getCell(cell);
		String string = cell2.toString();
		return string;
		
	}

}
