package seleniumPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AGetMethod {
	
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","H:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com/");   
		
		String title = driver.getTitle();
		System.out.println(title);
		 
		String Url = driver.getCurrentUrl();
		System.out.println(Url);
	
		String htmlcode = driver.getPageSource();
		System.out.println(htmlcode);
		
		driver.close();
		
		}

}
