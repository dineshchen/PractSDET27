import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.crm.comcast.genericutility.IConstants;

public class CopyPasteinExcel {
	public static void main(String[] args) throws Throwable {
		

		FileInputStream fis  = new FileInputStream("./testdata.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("org");
		Row ro = sh.getRow(1);
		Cell cel=ro.getCell(1);
		String value = cel.getStringCellValue();
		System.out.println(value);

		FileOutputStream fos=new FileOutputStream("./testdata.xlsx");
		Sheet sh1=wb.getSheet("org");
		Row ro1=sh1.getRow(6);
		ro1.createCell(6).setCellValue(value);
		wb.write(fos);
		System.out.println(value);
	/*	Sheet sh1 = wb.getSheet("org");
		Row ro1 = sh1.createRow(1);
		ro1.createCell(4).setCellValue(value);
		FileOutputStream fos=new FileOutputStream("./testdata.xlsx");
		wb.write(fos);
		*/
		

	
		
	}
}

