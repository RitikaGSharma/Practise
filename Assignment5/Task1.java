package Assignment5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		String title=driver.getTitle();
System.out.println("Title is :"+title);
boolean check=title.contains("HRM");
System.out.println(check);
String url=driver.getCurrentUrl();
if(url.endsWith("login")){
	System.out.println("Ends with login");
}
	
		
	}

}
