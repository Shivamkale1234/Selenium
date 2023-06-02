package seleniumPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ABrowserCommands {

	public static void main(String[] args) throws InterruptedException {
		
        System.setProperty("webdriver.chrome.driver","H:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();   // maximize the browser window
		Thread.sleep(2000);
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.get("https://www.amazon.com/"); 
		
		Thread.sleep(2000);   // stop loading browser some time by using proving second 
				
		driver.quit(); // close all window present in the browser
		
		driver.close();  // close current browser window 
		
		
		
		
		

	}

}
