package Testng16july;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyTitle 
{
@Test
public void Title()
{

	System.setProperty("webdriver.chrome.driver","C:\\Users\\vaidyat1\\Downloads\\chromedriver.exe" );
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.co.in");
	String PageTitle = driver.getTitle();
	Assert.assertEquals("Google", PageTitle);
	driver.close();
		
	}
}

