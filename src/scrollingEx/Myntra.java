package scrollingEx;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","H:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().window().getPosition();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		WebElement contactus = driver.findElement(By.xpath("(//a[text()='Contact Us'])[2]"));
		Point s1 = contactus.getLocation();
		System.out.println(s1);
		
		int x = s1.getX();
		System.out.println(x);
		int y = s1.getY();
		System.out.println(y);
	 
		
			}

}
