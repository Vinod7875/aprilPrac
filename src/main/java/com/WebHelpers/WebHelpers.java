package com.WebHelpers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WebHelpers {
	private WebDriver driver;

	public WebHelpers(WebDriver driver) {
		this.driver = driver;

	}

	public void click(By WebElement) {
		driver.findElement(WebElement).click();

	}

	public void Sendkeys(By WebElement, String value) {
		driver.findElement(WebElement).sendKeys(value);
	}

}
