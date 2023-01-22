package elementinteraction;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Usercreation {
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://ineuron-courses.vercel.app/login");
	
		driver.findElement(By.xpath("//a[text()='New user? Signup']")).click();
		Thread.sleep(5000);
		boolean result=	driver.findElement(By.xpath("//button[normalize-space()='Sign up']")).isEnabled();
				System.out.println("Button Enabled:"+result);
		driver.findElement(By.cssSelector("#name")).sendKeys("Ritika");
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("ritikaritz16@gmail.com");
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("ritika1234");
	Thread.sleep(3000);
driver.findElement(By.xpath("//label[normalize-space()='Testing']")).click();
try {
	driver.findElement(By.xpath("//input[@value='Female']")).click();
} catch (Exception e) {
	System.out.println("Webelement click failed trying with JSscript");
	JavascriptExecutor js=(JavascriptExecutor)driver;
	WebElement ele=	driver.findElement(By.xpath("//input[@value='Female']"));
	js.executeScript("arguments[0].click()", ele);

}
Thread.sleep(3000);
new Select(driver.findElement(By.xpath("//select[@name='state']"))).selectByVisibleText("Chandigarh");
result=	driver.findElement(By.xpath("//button[normalize-space()='Sign up']")).isEnabled();
System.out.println("After entering values button enabled:"+result);
driver.findElement(By.xpath("//button[normalize-space()='Sign up']")).click();

	}

}
