package CalenadrH;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Fileuploaddemo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://ineuron-courses.vercel.app/login/");
		Thread.sleep(5000);
		driver.findElement(By.id("email1")).sendKeys("ineuron@ineuron.ai");
		driver.findElement(By.id("password1")).sendKeys("ineuron");
		driver.findElement(By.xpath("//input[@type='password']//following::button")).click();
		Thread.sleep(5000);
	WebElement value=	driver.findElement(By.xpath("//span[text()='Manage']"));
	Actions act=new Actions(driver);
	act.moveToElement(value).perform();
	driver.findElement(By.xpath("//span[text()='Manage Courses']")).click();
	driver.findElement(By.tagName("html")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//button[normalize-space()='Add New Course']")).click();
	driver.findElement(By.id("thumbnail")).sendKeys("C:\\Users\\HP\\Downloads");
	

	}

}
