package Data_Driven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Writing_Data_Inti_Excel {

	public static void main(String[] args) throws Throwable {
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\TestData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		 wb.getSheet("Sheet1").createRow(7).createCell(1).setCellValue("1234 5674 12341");
	        FileOutputStream fos=new FileOutputStream(".\\src\\test\\resources\\TestData.xlsx");
	        wb.write(fos);
	}

}
