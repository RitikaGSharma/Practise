package Assignment7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TP4 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		Thread.sleep(3000);
	String url=	driver.getCurrentUrl();
	if(url.contains("dashboard"))
	{
		System.out.println("Dashboard present");
	}
	driver.findElement(By.xpath("//img[@class='oxd-userdropdown-img']")).click();
	driver.findElement(By.xpath("//a[normalize-space()='Logout']")).click();
	}

}
