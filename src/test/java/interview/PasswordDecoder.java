package interview;

import java.util.Base64;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class PasswordDecoder {
	
	@Test
	
	public void test() {
		
		ChromeOptions ops=new ChromeOptions();//
		ops.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(ops);
		
		driver.get("https://demo.guru99.com/V4/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(01,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("mngr582091");
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("AjYhYpa");
		
		//driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
		
	WebElement encryptedPasswordElement=driver.findElement(By.xpath("//input[@name='password']"));
		String encryptedPassword = encryptedPasswordElement.getText();
        System.out.println("Encrypted Password: " + encryptedPassword);
        
        System.out.println("Encrypted Password value: " + encryptedPasswordElement.getAttribute("Value"));
        
        String decryptedPassword = decryptPassword(encryptedPassword);
        System.out.println("Decrypted Password: " + decryptedPassword);
		
        driver.close();
		
	}
	
	
	
	
	
	 public static String decryptPassword(String encryptedPassword) {
	        // For Base64 encoding
	        byte[] decodedBytes = Base64.getDecoder().decode(encryptedPassword);
	        return new String(decodedBytes);
	    }
	
	
	

}
