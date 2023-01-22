package Assignment5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
Thread.sleep(5000);
		WebElement img=driver.findElement(By.xpath("//img[@alt='company-branding']"));
if(img.isDisplayed())
{
	System.out.println("Logo is displayed");
}
	}

}
