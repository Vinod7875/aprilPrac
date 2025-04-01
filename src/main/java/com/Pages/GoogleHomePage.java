package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.WebElements.GoogleHomesearchPage;
import com.WebHelpers.WebHelpers;

import utility.ExcelDataProvider;

public class GoogleHomePage implements GoogleHomesearchPage {
	private WebHelpers webHelpers;
	public WebDriver driver;
	public ExcelDataProvider excelDataProvider;

	public GoogleHomePage(WebDriver driver, WebHelpers webHelpers, ExcelDataProvider excel) {
		this.driver = driver;
		this.webHelpers = webHelpers;
		this.excelDataProvider = excel;
		PageFactory.initElements(driver, this);

	}

	public void clickonserachbox() {
		webHelpers.click(serachBox);
	}

	public void customsendkeys() {
		webHelpers.Sendkeys(serachBox, excelDataProvider.getexceldata("Sheet1", 0, 0));
	}

}
