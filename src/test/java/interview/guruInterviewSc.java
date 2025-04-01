package interview;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class guruInterviewSc {
	
	@Test
	public void tc012() {
	ChromeOptions ops=new ChromeOptions();//
	ops.addArguments("--disable-notifications");
	WebDriver driver=new ChromeDriver(ops);
	
	driver.get("https://demo.guru99.com/V4/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(02,TimeUnit.SECONDS);
	
	
	WebElement Logincred=driver.findElement(By.xpath("//input[@name='uid']"));
	Logincred.sendKeys("mngr582091");
	
	WebElement Passwordcred=driver.findElement(By.xpath("//input[@name='password']"));
	Passwordcred.sendKeys("AjYhYpa");
	System.out.println("Before login -- "+Logincred.getAttribute("value")+"   "+Passwordcred.getAttribute("value") );
	
	//driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("mngr582091");
	
	//driver.findElement(By.xpath("//input[@name='password']")).sendKeys("AjYhYpa");
	
	driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
	
	driver.navigate().back();
	
	Logincred=driver.findElement(By.xpath("//input[@name='uid']"));
	//System.out.println("after back Text  "+Logincred.getText());
	System.out.println("after back Attribute loginc "+" "+Logincred.getAttribute("value"));
	
	Passwordcred=driver.findElement(By.xpath("//input[@name='password']"));
	//System.out.println("after Back Text  "+Passwordcred.getText());
	System.out.println("after Back Attribute password "+" "+Passwordcred.getAttribute("value"));
	
	Assert.assertTrue(Passwordcred.getAttribute("value").isEmpty(),"PassWord is present there");
	
	
	
	}
}
