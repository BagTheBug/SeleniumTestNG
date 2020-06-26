package com.retail.testsuite;

import java.io.IOException;
import java.util.Map;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.retail.pageObj.Locators;
import com.retail.utils.PropertyUtils;
import com.retail.utils.ReadExcel;

import dataProvider.LoginData;

public class Retail_TestCase extends TestSetup {

	PropertyUtils prop = new PropertyUtils();

	/*
	 * Test Case 1 ; Priority - Medium; Gets data from Excel Sheet
	 */
	@Test(enabled = false, priority = 1, dataProvider = "addCategory", dataProviderClass = LoginData.class)
	public void addMultipleCategories(String data[]) throws IOException {
		utils.type(Locators.adminUname, data[0]);
		utils.type(Locators.adminPwd, data[1]);
		Map<String, String> cateogoryTestData = ReadExcel.getDataToMap(data[2], data[3]);
		utils.click(Locators.loginBtn);
		utils.mouseOver(Locators.catalogIcon);
		utils.click(Locators.categoriesLink);
		utils.click(Locators.addNewIcon);
		utils.type(Locators.mandatoryNameField, cateogoryTestData.get("Category Name"));
		utils.typeText(Locators.descriptionField, cateogoryTestData.get("Description"));
		utils.type(Locators.metaTagTitleField, cateogoryTestData.get("Meta tag Title"));
		utils.type(Locators.categoryMetaDescriptionField, cateogoryTestData.get("Meta tag Description"));
		utils.click(Locators.saveIconButton);
		utils.verifyText(Locators.successAlert, cateogoryTestData.get("Success Message"));

	}

	/*
	 * Test Case 2; Priority - High; Gets data from property file
	 */
	@Test(enabled = true, priority = 1, dataProvider = "addProduct", dataProviderClass = LoginData.class)
	public void verifyProductAdded(String data[]) throws InterruptedException, IOException {
		utils.type(Locators.adminUname, data[0]);
		utils.type(Locators.adminPwd, data[1]);
		utils.click(Locators.loginBtn);
		utils.mouseOver(Locators.catalogIcon);
		utils.click(Locators.productsLink);
		utils.click(Locators.addNewIcon);
		utils.type(Locators.mandatoryNameField, prop.getData("ProductName"));
		utils.type(Locators.metaTagTitleField, prop.getData("ProductMetaTag"));
		utils.click(Locators.dataTab);
		utils.type(Locators.modelField, prop.getData("ProductModel"));
		utils.type(Locators.priceField, prop.getData("ProductPrice"));
		utils.type(Locators.quantityField, prop.getData("ProductQuantity"));
		utils.click(Locators.linksTab);
		utils.click(Locators.categoriesField);
		utils.doubleClick(Locators.categorySelected);
		utils.click(Locators.saveIconButton);
		utils.click(Locators.logout);
		utils.geturl(prop.getData("userUrl"));
		String s = utils.getSlidngElementText(Locators.fingerRingTab);
		utils.verifyElementPresent(By.xpath("//*[text()='" + s + "']"));
	}

}
