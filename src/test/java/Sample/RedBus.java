package Sample;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBus {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		
		
		WebElement date=driver.findElement(By.xpath("//div[@id='onwardCal']"));
		date.click();
		//SVG we not abled to find xpath .. for that have seperate methods
		
		Thread.sleep(1000);
		//div[contains(@class,'DayNavigator__CalendarHeader')]
//		WebElement nextbtn=driver.findElement(By.xpath("//div[contains(@class,'DayNavigator__CalendarHeader')]"));
//		nextbtn.click();
		
		String str="Dec 2027";
		List<WebElement> listcalendar=driver.findElements(By.xpath("//div[contains(@class,'DayNavigator')]"));
		List<String> dates=new ArrayList<String>();
		
		////span[contains(@class,'DayTiles__CalendarDaysSpan-sc')]
		do{
			List<WebElement>Weekends=driver.findElements(By.xpath("//span[contains(@class,'bwoYtA')]"));
			for(WebElement Reddays:Weekends) {
				
				String redall=Reddays.getText();
				dates.add(redall);
				
				//System.out.println(Reddays.getText());
			}
			System.out.println(dates +"All Weekends of "+listcalendar.get(2).getText());
			dates.clear();
			
			listcalendar.get(3).click();
			//Thread.sleep();
			
			if(listcalendar.get(2).getText().contains(str)) {

				System.out.println(listcalendar.get(2).getText());
			}
		}while(!(listcalendar.get(2).getText().contains(str)));
		
		
		driver.close();
		
	}

}
