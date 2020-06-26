package dataProvider;

import org.testng.annotations.DataProvider;

public class LoginData {

	@DataProvider
	public Object[][] addCategory() {
		System.out.println("Getting Data");
		return new Object[][] { { "admin", "admin@123", "RetailData", "TestCase1" } };

	}

	@DataProvider
	public Object[][] addProduct() {
		System.out.println("Getting Data");
		return new Object[][] { { "admin", "admin@123" } };
	}

}
