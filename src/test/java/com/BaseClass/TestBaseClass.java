package com.BaseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Pages.GoogleHomePage;
import com.WebHelpers.WebHelpers;

import utility.ExcelDataProvider;
import utility.PropertyUtils;

import org.testng.annotations.BeforeSuite;

public class TestBaseClass {

	public PropertyUtils propertyUtils;
	public WebDriver driver;
	private WebHelpers webHelpers;
	private GoogleHomePage googleHomePage;
	public ExcelDataProvider excelDataProvider;

	@BeforeSuite
	public void setUp() {
		driver = new ChromeDriver();
		driver.get(propertyUtils.getProperty("QA1"));
		webHelpers = new WebHelpers(driver);
	}

	public TestBaseClass() {
		// this.webHelpers = new WebHelpers(driver);
		propertyUtils = PropertyUtils.getInstance();
		excelDataProvider = ExcelDataProvider.getInstance();
	}

	public GoogleHomePage getgoogleHomePage() {
		if (!(googleHomePage instanceof GoogleHomePage)) {
			return new GoogleHomePage(driver, webHelpers, excelDataProvider);
		}
		return googleHomePage;
	}

}
