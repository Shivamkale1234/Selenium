package seleniumlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class H_RelativeXPathEX4 {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","H:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
				
		WebElement searchbox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		searchbox.sendKeys("iphone 13 pro"+ Keys.ENTER);
		
		driver.get("https://www.demoblaze.com/");
		Thread.sleep(2000);
		
		WebElement home = driver.findElement(By.xpath("//a[@class='nav-link']"));
		home.click();
		Thread.sleep(2000);
		
		WebElement contact = driver.findElement(By.xpath("(//a[@class='nav-link'])[2]"));
		contact.click();
		Thread.sleep(2000);
		
		WebElement contactemail=driver.findElement(By.xpath("//input[@id='recipient-email']"));
		Thread.sleep(2000);
	    contactemail.sendKeys("shivamkale123@gamil.com");
	    
	    WebElement contactname=driver.findElement(By.xpath("(//input[@id='recipient-name'])[1]"));
		Thread.sleep(2000);
	    contactname.sendKeys("shivamkale");
	 
	    WebElement massagebox=driver.findElement(By.xpath("//textarea[@id='message-text']"));
		Thread.sleep(2000);
		
	    massagebox.sendKeys("selenium is very nice software and enjoying to work on that i am vary happy"+ Keys.ENTER);
	    Thread.sleep(2000);
	    
	    WebElement close1 = driver.findElement(By.xpath("//button[@class='btn btn-secondary']"));
	    close1.click();
	    
	    WebElement aboutus = driver.findElement(By.xpath("(//a[@class='nav-link'])[3]"));
	    aboutus.click();
		Thread.sleep(2000);
	    
	    WebElement close2 = driver.findElement(By.xpath("(//button[@class='btn btn-secondary'])[4]"));
	    close2.click();
	    
		WebElement cart = driver.findElement(By.xpath("(//a[@class='nav-link'])[4]"));
		cart.click();
		Thread.sleep(2000);
		
		WebElement login = driver.findElement(By.xpath("//a[@id='login2']"));
		login.click();
		Thread.sleep(2000);
		
		WebElement loginname = driver.findElement(By.xpath("//input[@id='loginusername']"));
		loginname.sendKeys("shivamkale123@gamil.com");
		Thread.sleep(2000);
		
		WebElement password1 = driver.findElement(By.xpath("//input[@id='loginpassword']"));
		password1.sendKeys("Shivam@123");
		Thread.sleep(2000);
		
	    driver.findElement(By.xpath("//button[text()='Log in']")).click();
		Thread.sleep(2000);
		
		WebElement close3 = driver.findElement(By.xpath("//button[@class='btn btn-secondary']"));
		close3.click();
		Thread.sleep(2000);
		
		driver.quit();
		
		
		
		
        
        }

}
