package Day1;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNg {
	
	@BeforeTest
	public void Login(){
		System.out.println("Login Successful");
	}
  @Test(priority=3)
  public void AddVendor(){
	  System.out.println("Vendor is added");
  }
  @Test(priority=4)
  public void AddProduct(){
	  System.out.println("Product is added");
  }
  @AfterTest
	public void Logout(){
		System.out.println("Logout Successful");
	}
}
