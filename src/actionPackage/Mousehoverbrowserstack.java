package actionPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousehoverbrowserstack {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","H:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://browserstack.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.manage().deleteAllCookies();
		
		WebElement ele = driver.findElement(By.xpath("//span[text()='Developers ']"));
		
		Actions act = new Actions(driver);
		act.moveToElement(ele).build().perform();
		
		driver.findElement(By.xpath("//a[text()='Open Source']")).click();
		
		

	}

}
