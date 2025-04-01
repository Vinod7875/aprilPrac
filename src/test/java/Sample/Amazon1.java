package Sample;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Amazon1 {
	@Test
	public void addToCart() throws Exception {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get(
				"https://www.amazon.in/b/?ie=UTF8&node=6628733031&ext=6972-32150&ref=pd_sl_5szpgfto9i_e&tag=googhydrabk1-21&hvpos=&hvnetw=g&hvrand=17266329461635736907&hvpone=&hvptwo=&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9040229&hvtargid=kwd-64107830&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=155259813593&hvpone=&hvptwo=&hvadid=674893540034&hvpos=&hvnetw=g&hvrand=17266329461635736907&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9040229&hvtargid=kwd-64107830&hydadcr=14452_2316413&gad_source=1");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(1));
		WebDriverWait wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(10));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement searchbox = driver.findElement(By.xpath("//input[@type='text']"));
		searchbox.sendKeys("Laptop");

		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[3]")).click();

		// span[@class='a-size-medium a-color-base a-text-normal']
		List<WebElement> allName = driver
				.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		//// span[@class='a-price-whole']
		List<WebElement> allDisprices = driver.findElements(By.xpath("//span[@class='a-price-whole']"));

		System.out.println(allName.size());
		System.out.println(allDisprices.size());

		for (int i = 0; i < allDisprices.size(); i++) {
			if (i < 5) {
				System.out.println("LaptopName :" + allName.get(i).getText() + "  ");
				System.out.println("Price ::" + allDisprices.get(i).getText());
			}
		}

		allName.get(0).click();
		// windows handle
		String ParentWindow = driver.getWindowHandle();
		System.out.println(ParentWindow);

		Set<String> allAddress = driver.getWindowHandles();

		Iterator<String> it = allAddress.iterator();
		while (it.hasNext()) {
			String ChildWindow = it.next();

			if (!ChildWindow.equals(ParentWindow)) {
				driver.switchTo().window(ChildWindow);
				WebElement Addtocart = driver
						.findElement(By.xpath("//input[@name='submit.add-to-cart' and @type='submit']"));

				wait.until(ExpectedConditions.visibilityOf(Addtocart));

				js.executeScript("arguments[0].scrollIntoView()", Addtocart);

				Addtocart.click();
				// frame
				// verify text=assert
//			String verify="Added to Cart";
//			WebElement amazonaddedtocart=driver.findElement(By.xpath("(//h4[(@class='a-alert-heading')])[5]"));
//			
//			
//			Assert.assertEquals(amazonaddedtocart.getText(), verify);
//			
			}
		}
		// driver.switchTo().window(ParentWindow);

		WebElement closeButton = driver.findElement(By.id("attach-close_sideSheet-link"));
		Thread.sleep(1500);
		closeButton.click();

		WebElement carticon = driver.findElement(By.xpath("//span[@class='nav-cart-icon nav-sprite']"));
		wait.until(ExpectedConditions.elementToBeClickable(carticon));

		js.executeScript("arguments[0].scrollIntoView()", carticon);

		WebElement cartcount = driver.findElement(By.xpath("//span[@id='nav-cart-count']"));

		Assert.assertTrue(cartcount.getText().equals("1"), "No Listed...!!");

//		if (cartcount.getText().equals("1")) {
//			System.out.println("product added successfully " + cartcount.getText());
//			
//		} else {
//			System.out.println("==NotListed");
//		}
		// driver.close();
		// input[(@name='submit.add-to-cart')and @type='button' ]
	}

}
