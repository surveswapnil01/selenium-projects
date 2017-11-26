package Day1;

import org.testng.annotations.Test;

public class TestNg2 {
	
  @Test(priority=1)
  public void deleteVendor(){
	  System.out.println("vendor is deleted");
  }
  @Test(priority=2)
  public void deleteProduct(){
	  System.out.println("product is deleted");
  }
  
}



