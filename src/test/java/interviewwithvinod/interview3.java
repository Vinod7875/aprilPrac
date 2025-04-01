package interviewwithvinod;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class interview3 {
	@Test
	public void test01() throws Exception {
		
		ChromeOptions ops=new ChromeOptions();//
		ops.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(ops);
		driver.get("https://www.espn.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(01,TimeUnit.SECONDS);
		
		WebElement nba=driver.findElement(By.xpath("//button[@aria-label='NBA']"));
		
		Actions act=new Actions(driver);
		act.moveToElement(nba).build().perform();
		////div[@id='submenu-sportsmenunba']//li
		//div[@id='submenu-sportsmenunba']//li
		
		List<WebElement> Nbalist=driver.findElements(By.xpath("//div[@id='submenu-sportsmenunba']//li"));
		
		for(WebElement ele:Nbalist) {
			System.out.println(ele.getText());
			
			String str=ele.getText();
			//Thread.sleep(2000);
			if(str.equals("Schedule")) {
				Thread.sleep(2000);
				ele.click();
				break;
			}
		}
		//driver.findElement(By.xpath("WebElement teamSchedule = driver.findElement(By.xpath(\"//h1[text()='NBA Schedule']//following-sibling::div//select[@class='dropdown__select']\"));"));
		WebElement teamSchedule = driver.findElement(By.xpath("//h1[text()='NBA Schedule']//following-sibling::div//select[@class='dropdown__select']"));
		Select sel=new Select(teamSchedule);
		//sel.selectByIndex(3);
		
		System.out.println(sel.getFirstSelectedOption()+ "  1st Options");
		int drpdsize=sel.getOptions().size();
		
		Assert.assertTrue(drpdsize==31,"count not mactch to 31");
		boolean flag=false;
		
		for(int i =0;i<drpdsize;i++) {
			
			String value=sel.getOptions().get(i).getText();
			System.out.println(value);
		if(value.equals("Chicago Bulls")) {
			
			flag=true;
			sel.selectByIndex(i);
			System.out.println(value+" dropdown value selected");
			//System.out.println(sel.selectByIndex(i));
			
			break;
			
		}
		}
		//System.out.println(flag+" Flag");
		Assert.assertTrue(flag,"dropdown value not present/found");
		
		
		
		
	}

}
