package Sample;

import java.util.concurrent.TimeUnit;

import org.bouncycastle.oer.its.ieee1609dot2.basetypes.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Amazon {

public static void main(String[] args) throws Exception {
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.co.in/");
	driver.manage().window().maximize();
	
	//WebDriverWait wait=new WebDriverWait(driver,Duration.seconds);
	//wait.until(ExpectedConditions.visibilityOf());
	driver.manage().timeouts().implicitlyWait(01,TimeUnit.SECONDS);
	
	WebElement searchBox=driver.findElement(By.name("q"));
	String str="Amazon";
	
	char[] ch1=str.toCharArray();
	for(char o:ch1) {
		searchBox.sendKeys(String.valueOf(o));
		//Thread.sleep(1000);
	}
	
//	for(int i=0;i<=str.length()-1;i++) {
//		
//		char ch=str.charAt(i);
//		searchBox.sendKeys(String.valueOf(ch));
//		Thread.sleep(1000);
//	}
}
}
