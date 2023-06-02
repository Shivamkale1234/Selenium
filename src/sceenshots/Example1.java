package sceenshots;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1 {

	public static void main(String[] args) throws IOException, InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","H:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.manage().deleteAllCookies();
 
		//take Screenshot
		B_UtilClass.takeSS(driver,"demoblaze_homepage");	
		driver.findElement(By.xpath("//a[@class='hrefch']")).click();
		//driver.quit();		
		//Thread.sleep(2000);	
		B_UtilClass.takeSS(driver, "Page no 1");	
		
	}

}
