package dataProvider;

import org.testng.annotations.DataProvider;

import com.retail.utils.ExcelUtils;

public class TestData {
	@DataProvider
	public Object[][] adminLogin() {
		return ExcelUtils.getData("TestData.xls", "adminLogin");
	}
}
