package actionPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.locators.RelativeLocator;

public class Doubleclick {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","H:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://api.jquery.com/dblclick/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.manage().deleteAllCookies();
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("/html/body/div"));
		WebElement box_ele = driver.findElement(RelativeLocator.with(By.tagName("div")));
		Thread.sleep(3000);
		Actions act = new Actions(driver);
		Thread.sleep(3000);
		act.doubleClick(box_ele).build().perform();

	
	}

}
