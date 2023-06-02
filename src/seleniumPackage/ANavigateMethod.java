package seleniumPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ANavigateMethod {
	
	public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver","H:\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.amazon.com/");
						
			//navigate to
			driver.navigate().to("https://www.facebook.com/");
			Thread.sleep(2000); 
								
			//navigate back
			driver.navigate().back();
			Thread.sleep(2000);
			
			//navigate forward
			driver.navigate().forward();
			Thread.sleep(2000);
			
			//navigate refresh
			driver.navigate().refresh();
			Thread.sleep(2000);
			
			driver.close();
	}

}