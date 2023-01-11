package CalenadrH;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarHandles {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		//driver.findElement(By.id("datepicker")).sendKeys("01/03/2023");
		driver.findElement(By.id("datepicker")).click();
		/*Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Next']")).click();
				driver.findElement(By.xpath("//a[text()='22']")).click(); */
		Thread.sleep(5000);
	List<WebElement>allitems=	driver.findElements(By.xpath("//table[contains(@class,'calendar')]//a"));
	Thread.sleep(3000);
	for (WebElement ele:allitems)
		
	{
		String date=ele.getText();
		if(date.contains("26"))
		{
			System.out.println(date);
			ele.click();
			break;
		}
	}
	}

}
