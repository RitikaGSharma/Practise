package Assignment5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	Thread.sleep(5000);
	WebElement link=driver.findElement(By.xpath("//a[contains(@href,'linkedin')]"));
	WebElement fb=driver.findElement(By.xpath("//a[contains(@href,'facebook')]"));
	WebElement twitter=driver.findElement(By.xpath("//a[contains(@href,'twitter')]"));
	WebElement youtube=driver.findElement(By.xpath("//a[contains(@href,'youtube')]"));
	if(link.isDisplayed()&&fb.isDisplayed()&&twitter.isDisplayed()&&youtube.isDisplayed())
	{
		System.out.println("All 4 footer social media icons displayed");
	}

	


	}

}
