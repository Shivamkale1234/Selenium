package seleniumlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class E_XpathExample1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","H:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoblaze.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.manage().deleteAllCookies();
		
		
		WebElement signup = driver.findElement(By.xpath("(/html[1]/body[1]/nav[1]/div[1]/ul[1]/li)[8]/a"));
		signup.click();
				
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='sign-username']")).sendKeys("shivamkale123@gmail.com");
		
		driver.findElement(By.xpath("(//input[@class='form-control'])[4]")).sendKeys("Shivam@123");
		
		driver.findElement(By.xpath("(//button[text()='Sign up'])[1]")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
	    driver.findElement(By.xpath("(//button[text()='Close'])[2]"));
	    
	   
		

	}

}
