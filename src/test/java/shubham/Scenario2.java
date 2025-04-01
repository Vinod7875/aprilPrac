package shubham;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Scenario2 {
	
	@Test
	public void test002() {
		
		ChromeOptions ops=new ChromeOptions();//
		ops.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(ops);
		
		driver.get("https://demo.guru99.com/V4/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(01,TimeUnit.SECONDS);
		
		
	}

}
