package seleniumlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C_Example2 {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","H:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.manage().deleteAllCookies();
		Thread.sleep(2000);
		
		//usarname
		WebElement search_box = driver.findElement(By.id("email"));
		search_box.sendKeys("shivamkale41@gmail.com");
		
		//password
		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("Shivam@7875");
		
		WebElement login = driver.findElement(By.name("login"));
		login.click();
		
		WebElement forgot_pass = driver.findElement(By.linkText("Forgotten password?"));
		forgot_pass.click();
		
		WebElement goteen_pass = driver.findElement(By.partialLinkText("gotten pass"));
		goteen_pass.click();
		
		driver.close();
		
	}

}
