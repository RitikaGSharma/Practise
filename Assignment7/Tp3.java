package Assignment7;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tp3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("mukesh");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("mukesh");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		Thread.sleep(3000);
		
		String text=driver.findElement(By.xpath("//div[@role='alert']")).getText();
		if(text.contains("Invalid credentials"))
		{
			System.out.println("Error msg captured");
		}

	}

}
