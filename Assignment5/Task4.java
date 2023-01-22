package Assignment5;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task4 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	Thread.sleep(5000);
	String link=driver.findElement(By.xpath("//a[contains(@href,'linkedin')]")).getText();
String fb=driver.findElement(By.xpath("//a[contains(@href,'facebook')]")).getText();
	String twitter=driver.findElement(By.xpath("//a[contains(@href,'twitter')]")).getText();
	String youtube=driver.findElement(By.xpath("//a[contains(@href,'youtube')]")).getText();
	Map<String, String> lhm    = new LinkedHashMap<>();
	lhm.put("Linkedin", link);
	lhm.put("Facebook", fb);
	lhm.put("Twitter", twitter);
	lhm.put("Youtube", youtube);
	for(Map.Entry<String, String> entry:lhm.entrySet())
	{
		System.out.println(entry.getKey()+":"+entry.getValue() );
	}
	}

}
