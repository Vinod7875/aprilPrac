package shubham;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Broken_link {
	
	@Test
	public void test003() {
		
		ChromeOptions ops=new ChromeOptions();//
		ops.addArguments("--disable-notifications");
		ops.addArguments("--ignore-certificate-errors");
		ops.setAcceptInsecureCerts(false);
		WebDriver driver=new ChromeDriver(ops);

		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(01,TimeUnit.SECONDS);
		
		List<WebElement> Alllinks=driver.findElements(By.tagName("a"));
		
		for(WebElement link: Alllinks) {
			String urlString=link.getAttribute("href");
			if(urlString==null||urlString.isEmpty()) {
				continue;
			}
			
			try {
			URL url=new URL(urlString);
			HttpURLConnection httpcon=(HttpURLConnection) url.openConnection();
			httpcon.setConnectTimeout(8000);
			httpcon.setReadTimeout(5000); 
			httpcon.connect();
			
			if(httpcon.getResponseCode()==200) {
				System.out.println("no broken");
			}else {
				System.out.println("broken links"+""+urlString+""+httpcon.getResponseCode());
			}
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}

	}


}
