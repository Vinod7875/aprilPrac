package shubham;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Gurubank {
	//User ID :	mngr582091
	//Password :	AjYhYpa
	
	public static boolean isAlertPresent(WebDriver driver) {
        try {
            driver.switchTo().alert();
            return true; // Alert is present
        } catch (NoAlertPresentException e) {
            return false; // No alert present
        }
    }	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		ChromeOptions ops=new ChromeOptions();//
		ops.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(ops);
		
		driver.get("https://demo.guru99.com/V4/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(01,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("mngr582091");
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("AjYhYpa");
		
		driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
		
		//Alert alt=driver.switchTo().alert();
		//System.out.println(alt.getText());
	//	alt.accept();
		//alt.dismiss();
		//Thread.sleep(1000);
		
		driver.navigate().refresh();
	WebElement drpDown1=driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[1]"));
	drpDown1.click();
//		Select sel=new Select(drpDown1);
//		sel.selectByVisibleText("Radio & Checkbox Demo");
	
	
	///*****************************************************
//	 driver.findElement(By.xpath("//a[text()='Radio & Checkbox Demo']")).click();
//	
//		 
//		 if (isAlertPresent(driver)) {
//			 Alert alt=driver.switchTo().alert();
//			 alt.dismiss();
//			 System.out.println("Alert dissmiss");
//	 }else {
//		 System.out.println("Alert Not present");
//	 }
//	 
//		 
//		 
//		 Thread.sleep(3500);
//		WebElement frameparent= driver.findElement(By.xpath("//iframe[@title='3rd party ad content']"));
//		driver.switchTo().frame(frameparent);
//		
//		WebElement frame= driver.findElement(By.id("ad_iframe"));
//		 driver.switchTo().frame(frame);
//		 
//		 Thread.sleep(3500);
//		 driver.findElement(By.xpath("//span[text()='Close']")).click();
//		
//		 driver.switchTo().defaultContent();
//		 Thread.sleep(2500);
//		 
//		 WebElement option2=driver.findElement(By.xpath("//input[@value='Option 2']"));
//		 option2.click();
//		 
//		 
//		 if(option2.isSelected()) {
//			 System.out.println("checkbox selected for option2");
//		 }else {
//			 System.out.println("not selected check box");
//		 }
//		 
//		 WebElement checkbox=driver.findElement(By.xpath("//input[@value='checkbox3']"));
//		 checkbox.click();
//		 if(checkbox.isSelected()) {
//			 System.out.println("checkbox 3 is selected");
//		 }else {
//			 System.out.println("checkbox not selected");
//		 }
		 
		//******************************88 
		 //drpDown1=driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[1]"));
//		 drpDown1.click();
//		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//a[text()='Table Demo']")).click();
		 
		 WebElement table=driver.findElement(By.xpath("//table[@cellspacing='1']"));
		 System.out.println(table.getText());
		 System.out.println(table.getSize());
		 
		 
		 //3rrd
		 
		 //drpDown1=driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[1]"));
		 drpDown1.click();
		 driver.findElement(By.xpath("//a[text()='Accessing Link']")).click();
		 
		 driver.findElement(By.xpath("(//a[text()='click here'])[1]"));
		 
		 System.out.println(driver.getCurrentUrl()+""+ driver.getTitle());
		 
		 driver.navigate().back();
		 
		 drpDown1=driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[1]"));
		 drpDown1.click();
		 //drpDown1.click();
		 driver.findElement(By.xpath("//a[@href='../../test/ajax.html']")).click();
		 
		 WebElement yesRbtn=driver.findElement(By.xpath("//input[@value='Yes']"));
		 yesRbtn.click();
		 if(yesRbtn.isSelected()) {
			 System.out.println("yesRbtn radio btn selected");
		 }else {
			 System.out.println("not selected yesRbtn ");
		 }
		 
		//input[@type='reset']
		 
		 driver.findElement(By.xpath("//input[@type='reset']")).click();
		 
		 if(yesRbtn.isSelected()) {
			 System.out.println("yesRbtn radio btn selected After reset");
		 }else {
			 System.out.println("not selected yesRbtn After reset");
		 }
		 
		 drpDown1=driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[1]"));
		 drpDown1.click();
		 driver.findElement(By.xpath("//a[text()='Inside & Outside Block Level Tag']")).click();
		 
		 driver.findElement(By.xpath("//a[text()=' Inside a block-level tag. ']")).click();
		 driver.navigate().back();
		 driver.findElement(By.xpath("//span[text()='Outside a block-level tag.']")).click();
		 driver.navigate().back();
		 drpDown1=driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[1]"));
		 drpDown1.click();
		 driver.findElement(By.xpath("//a[text()='Delete Customer Form']")).click();
		 driver.findElement(By.name("cusid")).sendKeys("mngr582091");
		 driver.findElement(By.xpath("//input[@name='submit']")).click();
		 
		 Alert alt=driver.switchTo().alert();
		 System.out.println(alt.getText());
		 alt.accept();
		 System.out.println(alt.getText());
		 alt.accept();
		// System.out.println(alt.getText());
		 
		 driver.switchTo().defaultContent();
		 
		 drpDown1=driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[1]"));
		 drpDown1.click();
		 driver.findElement(By.xpath("//a[text()='Yahoo']")).click();
		 
		 driver.findElement(By.id("pager1")).click();
		 WebElement p1=driver.findElement(By.xpath("//li[@class='slide1_2 slide']"));
		 System.out.println(p1.getTagName());
		 System.out.println(p1.getText());
		 
		 driver.findElement(By.id("pager2")).click();
		 
		 driver.findElement(By.id("pager3")).click();
		 
		 driver.findElement(By.id("pager4")).click();
		 
		 driver.findElement(By.id("pager5")).click();
		 
		 driver.findElement(By.id("pager6")).click();
		 
		 driver.findElement(By.id("pager7")).click();
		 
		 driver.navigate();
		 
		 
	 	try {
		//driver.close();
		
		}catch(Exception e) {
			System.out.println(e.getMessage());
			e.getStackTrace();
		}
		
		
	}

}
