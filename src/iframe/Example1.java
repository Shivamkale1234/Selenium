package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1 {
public static void main(String[] args)  {
		
		System.setProperty("webdriver.chrome.driver","H:\\chromedriver_win32\\chromedriver.exe");
				
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///E:/Manual%20Testing/iframe.html");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		//first name
		driver.findElement(By.xpath("//input[@id='fn1234']")).sendKeys("David");
		//switch from main page to frame
		// driver.switchTo().frame(0);
		driver.switchTo().frame("sdfgh");
		//city 
		driver.findElement(By.xpath("//input[@name='dfghjkl']")).sendKeys("Pune");
		//switch from iframe to main page
		driver.switchTo().parentFrame();
		//last name
		driver.findElement(By.xpath("//input[@id='ln1234']")).sendKeys("Warner");
		//switch from main page to frame
		WebElement frameElement = 
	    driver.findElement(By.xpath("//iframe[@id='1234test']"));
		driver.switchTo().frame(frameElement);
        //College
		driver.findElement(By.xpath("//input[@name='jhgfds']")).sendKeys("MIT");		
				
}
}