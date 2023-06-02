package actionPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartMouseOver {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","H:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.manage().deleteAllCookies();
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.xpath("//div[text()='Mobiles']")).click();
		driver.navigate().refresh();
		
		WebElement element = driver.findElement(By.xpath("//span[text()='Electronics']"));
		
		Actions act = new Actions(driver);
		act.moveToElement(element).build().perform();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Apple']")).click();
		
		

	}

}
