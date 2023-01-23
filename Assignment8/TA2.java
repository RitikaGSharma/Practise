package Assignment8;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TA2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		
List<WebElement> capture=driver.findElements(By.xpath("//div[@id='pageFooter']//a"));
String value="";
for(WebElement ele:capture)
{
	String text=ele.getText();
	System.out.println(text);
	if(text.equals("Create Page"))
	{
		
		value="true";
		
	}

}
if(value.equals("true"))
{System.out.println("Create Page link present");
	driver.findElement(By.xpath("//a[normalize-space()='Create Page']")).click();
}
	}

}
