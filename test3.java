package Day1;

import java.io.File;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



	public class test3 {
		public  WebDriver driver;
		@Test (priority = 1)
		public void launchBrowser(){
			File file = new File("C:\\Users\\vaidyat1\\Downloads\\chromedriver.exe");
			System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
			 driver = new ChromeDriver();
		}
	

			
		@Test (priority = 2)
		public void verifyTitle(){
			driver.get("https://www.google.co.in/");
			
			String PageTitle = driver.getTitle();
			
			Assert.assertEquals("Google", PageTitle);
		}
			
		@Test (priority = 3)
		public void login(){
		driver.findElement(By.className("gb_P")).click();
		driver.findElement(By.className("whsOnd zHQkBf")).sendKeys("surveswapnil01@gmail.com");
		
			
		}
			@Test (priority =4 )
			
			public void closeBrowser()
			{
				driver.close();
				
			}
			
		}

	  
		
		

