package Assignment8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TA8 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.xpath("//a[normalize-space()='Create new account']")).click();
		driver.manage().window().maximize();
		Thread.sleep(5000);	
driver.findElement(By.name("firstname")).sendKeys("ABC");
driver.findElement(By.name("lastname")).sendKeys("xyz");
Thread.sleep(2000);
driver.findElement(By.name("reg_email__")).sendKeys("ritika.kanchan1@gmail.com");
driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("abcde");
WebElement dropdown_date=driver.findElement(By.xpath("//select[@id='day']"));
WebElement dropdown_month=driver.findElement(By.xpath("//select[@id='month']"));
WebElement dropdown_year=driver.findElement(By.xpath("//select[@id='year']"));
Select date=new Select(dropdown_date);
Select month=new Select(dropdown_month);
Select year=new Select(dropdown_year);
date.selectByIndex(1);
month.selectByValue("1");
year.selectByVisibleText("2000");
driver.findElement(By.xpath("//label[normalize-space()='Female']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//button[@name='websubmit']")).click();
	}

}
