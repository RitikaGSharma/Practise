package CalenadrH;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleEg {

	public static void main(String[] args) throws InterruptedException {

WebDriver driver=new ChromeDriver();
driver.get("https://ineuron-courses.vercel.app/login");
String parent=driver.getWindowHandle();
Thread.sleep(2000);
List<WebElement> capture= driver.findElements(By.xpath("//div[@class='social']//a"))	;
for(WebElement ele:capture)
{
	ele.click();
	driver.switchTo().window(parent);
	Thread.sleep(2000);
}
Set<String>allhandles=driver.getWindowHandles();
for(String value:allhandles)
{
	driver.switchTo().window(value);
	String title=driver.getTitle();
	System.out.println(title);
	if(title.contains("Twitter"))
	{
		System.out.println("Twitter found");
		break;
	}
}
	}

}
