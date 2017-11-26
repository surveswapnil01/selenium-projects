package Day1;
import java.io.File;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

	public class WriteinExcel { 

		public static void main(String[] args) throws Exception {
			
			File src = new File ("C:\\Users\\vaidyat1\\Desktop\\Testdata.xlsx");
			FileInputStream fis = new FileInputStream(src);
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sheet1 = wb.getSheetAt(0);
			sheet1.getRow(1).createCell(4).setCellValue("pass");
			sheet1.getRow(2).createCell(4).setCellValue("fail");
			FileOutputStream fos = new FileOutputStream(src);
			wb.write(fos);
		wb.close();
		}
	}