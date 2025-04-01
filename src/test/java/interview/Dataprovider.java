package interview;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider {

	@Test(dataProvider="getData")
	public void test1(String input) {
		// TODO Auto-generated method stub

		ChromeOptions ops=new ChromeOptions();//
		ops.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(ops);
		
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(01,TimeUnit.SECONDS);
		
		WebElement SearchBox=driver.findElement(By.name("q"));
		SearchBox.sendKeys(input);
		
		List<WebElement> suggestions=driver.findElements(By.xpath("//ul[@role='listbox']//li"));
		System.out.println();
		Assert.assertTrue(suggestions.get(0).getText().toLowerCase().contains(input.toLowerCase()),"suggestion fails");
		
		for(WebElement ele:suggestions) {
		
			System.out.println(ele.getText());
		
		}
		
		driver.quit();
	}
	@DataProvider
	public String [][] getData() {
		
		String [][]data= {{"Amazon"},{"flipkart"},{"Myntra"},{"meesho"}};
		return data;
		
	}
	
	
	

}
