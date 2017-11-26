package Day1;



	import java.io.File;
	import java.io.FileInputStream;
	import java.io.FileNotFoundException;

	import org.apache.poi.xssf.usermodel.XSSFSheet;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;

	public class ReadEcelConfig {

		public static void main(String[] args) throws Exception {
			File src = new File ("C:\\Users\\vaidyat1\\Desktop\\Testdata.xlsx");
			
			FileInputStream fis = new FileInputStream(src);
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sheet1 = wb.getSheetAt(0);
			int rowcount= sheet1.getLastRowNum();
			System.out.println(rowcount);
			for(int i=1; i<rowcount;i++)
			{
				String data0 = sheet1.getRow(i).getCell(0).getStringCellValue();
				
				System.out.println("Test data from Excel is" +data0);
			}
			
		wb.close();
		}
	}