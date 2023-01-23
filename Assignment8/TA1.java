package Assignment8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TA1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
	String capture=	driver.findElement(By.className("_8eso")).getText();
	System.out.println("Captured text:"+capture);
	if(capture.equals("Facebook helps you connect and share with the people in your life."))
	{
		System.out.println("Text captured");
		
	}
	}

}
