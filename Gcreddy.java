package Day1;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Gcreddy {
	
		public static WebDriver driver;
		@Test(dataProvider = "testdata")
		public void adminLogin(String Username, String Password){
		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.gcrit.com/build3/admin/");
		driver.findElement(By.name("username")).sendKeys(Username);
		driver.findElement(By.name("password")).sendKeys(Password);
		driver.findElement(By.id("tdb1")).click();

		String URL = driver.getCurrentUrl();

		if (URL.contains("http://www.gcrit.com/build3/admin/index.php")){
		System.out.println("Admin Login Successful - Passed"); 
		}
		else {
		System.out.println("Admin Login Unsuccessful - Failed");
		}
		driver.close();
		}
		@DataProvider(name = "testdata")
		public Object [] [] readExcel() throws BiffException, IOException {
		File f = new File ("C:\\Users\\gcreddy\\Desktop\\Input.xls");
		Workbook w = Workbook.getWorkbook(f);
		Sheet s = w.getSheet("Sheet1");
		int columns = s.getColumns();
		int rows = s.getRows();
		//System.out.println(columns +", "+ rows);

		String inputData [] [] = new String [rows] [columns];

		for (int i=0; i<rows; i++){
		 for (int j=0; j<columns; j++){
		  Cell c = s.getCell(j,i);
		  inputData [i] [j] = c.getContents();
		  //System.out.println(inputData[i][j]);
		  
		 }
		}
		return inputData;
		}
		}

	