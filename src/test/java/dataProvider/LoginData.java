package dataProvider;

import org.testng.annotations.DataProvider;

import com.retail.utils.ExcelUtils;

public class LoginData {

	@DataProvider
	public Object[][] adminLogin() {
		System.out.println("Getting Data");
		return new Object[][] { { "admin", "admin@123" } };

	}

	@DataProvider
	public Object[][] addProduct() {
		System.out.println("Getting Data");
		return new Object[][] { { "admin", "admin@123" } };

	}
}
