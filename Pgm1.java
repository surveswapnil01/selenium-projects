package Day1;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pgm1
{

	public static void main(String[] args) 
	{
		File file = new File("C:\\Users\\vaidyat1\\Downloads\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
    WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://opensource.demo.orangehrmlive.com/index.php/auth/login");
	driver.findElement(By.name("txtUsername")).sendKeys("Admin");
	driver.findElement(By.name("txtPassword")).sendKeys("admin");
	driver.findElement(By.name("Submit")).click();
	
	String url = driver.getCurrentUrl();
	try{
	if (url.contains("http://opensource.demo.orangehrmlive.com/index.php/dashboard"));
	{
		System.out.println(" Orange HRM Login successful");
	}
	}
	catch (NoSuchElementException e) {
		System.out.println("Orange HRM Login  Not successful");
}
	
	
	driver.findElement(By.linkText("Welcome Admin")).click();
	driver.findElement(By.linkText("Logout")).click();
	driver.close();

}
}
