package scrollingEx;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","H:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.manage().deleteAllCookies();
		
		Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,500)");
        
        Thread.sleep(2000);
        JavascriptExecutor js1 = (JavascriptExecutor)driver;
        js1.executeScript("window.scrollBy(0,1000)");
        
        Thread.sleep(2000);
        JavascriptExecutor js2 = (JavascriptExecutor)driver;
        js2.executeScript("window.scrollBy(0,1500)");
        
        Thread.sleep(2000);
        JavascriptExecutor js3 = (JavascriptExecutor)driver;
        js3.executeScript("window.scrollBy(0,2000)");
        
        Thread.sleep(2000);
        JavascriptExecutor js4 = (JavascriptExecutor)driver;
        js4.executeScript("window.scrollBy(0,2500)");
        
        Thread.sleep(2000);
        JavascriptExecutor js5 = (JavascriptExecutor)driver;
        js5.executeScript("window.scrollBy(0,3000)");  
        
        
        Thread.sleep(2000);
        JavascriptExecutor js6 = (JavascriptExecutor)driver;
        js6.executeScript("window.scrollBy(0,3500)");
        
        Thread.sleep(2000);
        JavascriptExecutor js7 = (JavascriptExecutor)driver;
        js7.executeScript("window.scrollBy(0,4000)");
        
        Thread.sleep(2000);
        JavascriptExecutor js8 = (JavascriptExecutor)driver;
        js8.executeScript("window.scrollBy(0,4500)");
        

	}
		
}		

	
