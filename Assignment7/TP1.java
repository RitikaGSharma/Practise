package Assignment7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TP1 {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		Thread.sleep(3000);
		List<WebElement>ele=driver.findElements(By.xpath("(//span[@class='oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message'][normalize-space()='Required'])"));
      
		for(WebElement value:ele)
       {
    	   String capture=value.getText();
    	   
    	   if(capture.equals("Required")&& ele.size()==2)
    	   {
    		   System.out.println("Details captured");
    		   break;
    	   }
       }
	WebElement user=	driver.findElement(By.xpath("//input[@placeholder='Username']"));
	String borderuser=user.getCssValue("border");
	WebElement password=	driver.findElement(By.xpath("//input[@placeholder='Password']"));
	String border_password=password.getCssValue("border");
	if(borderuser.contains("1px" )&& border_password.contains("1px"))
	{
		System.out.println("Border is 1px");
	}
	}

}
