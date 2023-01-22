package Assignment7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TP2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
	String capture=	driver.findElement(By.xpath("//span[contains(normalize-space(),'Required')]")).getText();
if(capture.equals("Required"))
{
	System.out.println("Details captured");
}
	}

}
