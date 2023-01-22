package Assignment5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task5 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(4000);
		driver.manage().window().maximize();
	List<WebElement> element=driver.findElements(By.xpath("//a"));

	
for(WebElement ele:element)
{
	String value=ele.getText();
	if(value.contains("youtube"))
	{
		System.out.println("Youtube found");
		break;
	}
}
	}

}
