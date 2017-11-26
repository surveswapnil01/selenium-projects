package Day1;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {
  
  @Test (groups = {"sanity","Regression"},priority =1)
	public void Login(){
		System.out.println("Login Successful");
	}
  
  @Test (groups = {"sanity"},priority =2)
	public void AdvanceSearch(){
		System.out.println("AdvanceSearch Successful");
	}
  
@Test (groups = {"sanity","Regression"},priority =3)
public void Search(){
	System.out.println("Search Successful");
}
@Test (groups = {"Regression"},priority =4)
public void BillPayment(){
	System.out.println("BillPayment Successful");
}
@Test(groups = {"sanity","Regression"},priority =5)
public void PrepaidRecharge(){
	System.out.println("Prepaid Recharge Successful");
}
@Test (groups = {"sanity","Regression"},priority =6)
public void Logout(){
	System.out.println("Logout Successful");
}
}
