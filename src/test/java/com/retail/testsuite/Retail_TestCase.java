package com.retail.testsuite;

import org.testng.annotations.Test;

import com.retail.pageObj.Locators;

import dataProvider.LoginData;

public class Retail_TestCase extends TestSetup {

	@Test(enabled = true, priority = 1, dataProvider = "adminLogin", dataProviderClass = LoginData.class)
	public void addMultipleCategories(String data[]) {
		System.out.println("data[0] = " + data[0] + ": data[1]= " + data[1]);
		wdu.type(Locators.adminUname, data[0]);
		wdu.type(Locators.adminPwd, data[1]);
		wdu.click(Locators.loginBtn);
		wdu.mouseOver(Locators.catalogIcon);
		wdu.click(Locators.categoriesLink);
		wdu.click(Locators.addNewIcon);
		wdu.type(Locators.mandatoryNameField, "Electronic");
		wdu.typeText(Locators.descriptionField, "Electronic");
		wdu.type(Locators.metaTagTitleField, "Electronic");
		wdu.type(Locators.categoryMetaDescriptionField, "Electronic");
		wdu.click(Locators.saveIconButton);
		wdu.verifyText(Locators.successAlert, "Success: You have modified categories!");

	}

	@Test(enabled = false, priority = 1, dataProvider = "adminLogin", dataProviderClass = LoginData.class)
	public void verifyProductAdded(String data[]) throws InterruptedException {
		System.out.println("data[0] = " + data[0] + ": data[1]= " + data[1]);
		wdu.type(Locators.adminUname, data[0]);
		wdu.type(Locators.adminPwd, data[1]);
		wdu.click(Locators.loginBtn);
		wdu.mouseOver(Locators.catalogIcon);
		wdu.click(Locators.productsLink);
		wdu.click(Locators.addNewIcon);
		wdu.type(Locators.mandatoryNameField, "FingerRing");
		wdu.type(Locators.metaTagTitleField, "Finger Ring for ladies");
		wdu.click(Locators.dataTab);
		wdu.type(Locators.modelField, "SKU-012");
		wdu.type(Locators.priceField, "500");
		wdu.type(Locators.quantityField, "50");
		wdu.click(Locators.linksTab);
		wdu.click(Locators.categoriesField);
		wdu.doubleClick(Locators.categorySelected);
		wdu.click(Locators.saveIconButton);
		wdu.click(Locators.logout);
		wdu.geturl("http://retail.upskills.in/");
	}

}
