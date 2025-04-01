package interview;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Redbus121 {
	
	//runtime value change of xpath
	////div[text()='Humsafar Travels']//parent::div//following-sibling::div//div[@class='fare d-block']//span

	@Test
	public  void Test012() throws Exception {
		
		
			ChromeOptions ops=new ChromeOptions();//
		ops.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(ops);
		
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(01,TimeUnit.SECONDS);
		
		//Himalaya Travels
		String input="Himalaya Travels";//
		String pricexpath=String.format("//div[text()='%s']//parent::div//following-sibling::div//div[@class='fare d-block']//span", input);
		
		WebElement from=driver.findElement(By.xpath("//input[@type='text']"));
		from.sendKeys("Mumbai");
		
		List<WebElement>list= driver.findElements(By.xpath("//ul[@class='sc-dnqmqq dZhbJF']//li"));
		list.get(0).click();
		
		driver.findElement(By.xpath("//input[@id='dest']")).sendKeys("Aurangabad(Maharashtra)");
		//System.out.println(pricexpath);
		List<WebElement> to=driver.findElements(By.xpath("//ul[@class='sc-dnqmqq dZhbJF']//li"));
		to.get(0).click();
		
		driver.findElement(By.className("dateText")).click();
		
		LocalDate today2=LocalDate.now().plusDays(2);
		System.out.println(today2);
		String[] stringdate=today2.toString().split("-");
		System.out.println(stringdate+"  stringdate");
		String day=stringdate[2];
		String dynamicdate= String.format("//span[@class='DayTiles__CalendarDaysSpan-sc-1xum02u-1 dkWAbH' and(text()='%s')]", day);
		
		WebElement calendar=driver.findElement(By.xpath("//div[@class='sc-jzJRlG hrJoeL']"));
		WebElement date26=driver.findElement(By.xpath(dynamicdate));
		calendar.click();
		//calendar.click(date26);
		
		date26.click();
		
		driver.findElement(By.id("search_button")).click();
		Thread.sleep(4000);
		JavascriptExecutor js = (JavascriptExecutor) driver;

		List<WebElement> ticketPrices = new ArrayList<WebElement>();
		int previousSize = 0;
		int currentSize = 0;

		do {
			
			previousSize = ticketPrices.size();
			ticketPrices = driver.findElements(By.xpath(pricexpath));
			
			Thread.sleep(1000);
			
			js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			Thread.sleep(1000);
			currentSize = ticketPrices.size();
		} while (currentSize > previousSize);

		Thread.sleep(1000);
		List<WebElement> allprices=driver.findElements(By.xpath(pricexpath));
		Thread.sleep(1000);
		
		List<String> allstoredprices=new ArrayList<String>();
	for(WebElement ele:allprices) {
			
			System.out.println(ele.getText());
			allstoredprices.add(ele.getText().trim());
			}
	
	int min=Integer.parseInt(allstoredprices.get(0));
	for(int i=0;i<allstoredprices.size();i++) {
		
		if(min>Integer.parseInt(allstoredprices.get(i))) {
			
			min=Integer.parseInt(allstoredprices.get(i));
			
		}
			
	}
	System.out.println(min+" "+"Minimum price is");
	Thread.sleep(4000);
	for(int j=0;j<allstoredprices.size();j++) {
		
		if(allstoredprices.get(j).equals(String.valueOf(min))) {
			js.executeScript("arguments[0].scrollIntoView()",allprices.get(j) );
			
			//allprices.get(j).click();
			break;
		}
	}
	}
	
}
