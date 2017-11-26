package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Liveproject {

	public static void main(String[] args) {
	/* Launch Browser*/
System.setProperty("webdriver.chrome.driver", "C:\\Users\\vaidyat1\\Downloads\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();

    /* Navigate to URL*/

driver.get("http://www.demo.guru99.com/V4/index.php");
driver.findElement(By.name("uid")).sendKeys("mngr100724");
driver.findElement(By.name("password")).sendKeys("geqYnus");
driver.findElement(By.name("btnLogin")).click();
String URL=driver.getCurrentUrl();
if ( URL.equals("http://www.demo.guru99.com/V4/manager/Managerhomepage.php"));
{
	System.out.println(" Login is successful");
}
 driver.close();
	}

}