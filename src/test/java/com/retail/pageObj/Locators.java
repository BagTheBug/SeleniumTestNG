package com.retail.pageObj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators {
	// ADMIN PAGE
	public static By adminUname = By.id("input-username");
	public static By adminPwd = By.id("input-password");
	public static By loginBtn = By.xpath("//button[@type='submit']");

	// HOME PAGE
	public static By catalogIcon = By.xpath("//*[@id='menu-catalog']");
	public static By categoriesLink = By.xpath("//*[@id='menu-catalog']//a[contains(text(),'Categories')]");
	public static By productsLink = By.xpath("//*[@id='menu-catalog']//a[contains(text(),'Products')]");

	public static By addNewIcon = By.xpath("//a[@data-original-title='Add New']");

	// CREATING CATEOGRY PAGE
	public static By mandatoryNameField = By.id("input-name1");
	public static By descriptionField = By.xpath("//div[@class='note-editable panel-body']");
	public static By metaTagTitleField = By.id("input-meta-title1");
	public static By categoryMetaDescriptionField = By.id("input-meta-description1");
	public static By saveIconButton = By.xpath("//button[@type='submit']");
	public static By successAlert = By.xpath("//div[@class='alert alert-success']");
	public static By dataTab = By.xpath("//a[text()='Data']");
	public static By modelField = By.id("input-model");
	public static By priceField = By.id("input-price");
	public static By quantityField = By.id("input-quantity");
	public static By linksTab = By.xpath("//a[text()='Links']");
	public static By categoriesField = By.id("input-category");
	public static By categorySelected = By.xpath("//a[text()='EARRINGS']");

	// LOGOUT
	public static By logout = By.xpath("//a/*[text()='Logout']");

	// USER SITE
	public static By myAccountLink = By.xpath("//a/span[@class='tb_text' and text()='My Account']");
	public static By fingerRingTab = By.xpath("(//a[contains(text(),'Ring')])[2]");
	public static By slideNextTab=By.xpath("//*[@title='Next']");
}
