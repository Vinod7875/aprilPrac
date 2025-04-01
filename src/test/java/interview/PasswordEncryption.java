package interview;

import java.util.Base64;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class PasswordEncryption {
	
	@Test
	
	public void test12() {
	ChromeOptions ops=new ChromeOptions();
	ops.addArguments("--disable-notifications");
	WebDriver driver=new ChromeDriver(ops);
	
	driver.get("https://demo.guru99.com/V4/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(01,TimeUnit.SECONDS);
	
	driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("mngr582091");
	
	//.sendKeys("AjYhYpa")
	WebElement passwordbox=driver.findElement(By.xpath("//input[@name='password']"));
	
	String encpassword=PasswordEncryption.Password("AjYhYpa");
	passwordbox.sendKeys(encpassword);
	
	
	
	System.out.println("Password "+passwordbox.getAttribute("Value"));
	
	//driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
	
	
	driver.close();
	}
	
	
	
	
	public static String Password(String password) {
		
		byte []encrepted=Base64.getEncoder().encode(password.getBytes());
		
		return new String(encrepted);
	}
	

}
