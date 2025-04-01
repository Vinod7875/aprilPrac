package interviewwithvinod;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Espn_interview4 {

	
	@Test
	public void test01() throws Exception {
	ChromeOptions ops=new ChromeOptions();//
	ops.addArguments("--disable-notifications");
	WebDriver driver=new ChromeDriver(ops);
	driver.get("https://www.espn.in/nba/schedule");
	
	driver.manage().timeouts().implicitlyWait(01,TimeUnit.SECONDS);
	
	
	Thread.sleep(3000);
	WebElement teamSchedule = driver.findElement(By.xpath("//h1[text()='NBA Schedule']//following-sibling::div//select[@class='dropdown__select']"));
	Select sel=new Select(teamSchedule);
	//sel.selectByIndex(3);
	
	//System.out.println(sel.getFirstSelectedOption().getText());
	//System.out.println(driver.getTitle()+ " :  is title");
	//System.out.println(sel.getAllSelectedOptions()+" selected option");
	
	
	//sel.selectByValue("Boston Celtics");//Boston Celtics
	//sel.deselectByVisibleText("San Antonio Spurs");
	

	Actions act=new Actions(driver);
	
	
	
	
	
	
	
	driver.navigate().to("https://www.google.co.in/");
	Thread.sleep(2000);
	
	driver.manage().window().maximize();
	WebElement google=driver.findElement(By.name("q"));
	act.moveToElement(google);
	act.keyDown(Keys.SHIFT).sendKeys("Shubham").keyUp(Keys.SHIFT).sendKeys(" Dabhade").build().perform();
	
	
	}
}
