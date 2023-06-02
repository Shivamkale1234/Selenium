package seleniumlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.Select;

public class X_Relativelocator {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","H:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/reg/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		WebElement fn = driver.findElement(By.xpath("//input[@name='firstname']"));
		fn.sendKeys("Shivam");
		
		WebElement ln = driver.findElement(RelativeLocator.with(By.tagName("input")).toRightOf(fn));
		ln.sendKeys("Kale");
		
		WebElement mn = driver.findElement(RelativeLocator.with(By.tagName("input")).below(ln));
		mn.sendKeys("8421334270");
		

		WebElement password = driver.findElement(RelativeLocator.with(By.tagName("input")).below(mn));
		password.sendKeys("Shivam@7875");
		
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
        Select s=new Select(day);
        s.selectByValue("12");
        
        WebElement month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
        Select s1=new Select(month);
        s1.selectByVisibleText("Aug");
        
        WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
        Select s2=new Select(year);
        s2.selectByValue("1996");
        
        WebElement sex = driver.findElement(By.xpath("(//input[@name='sex'])[2]"));
        sex.click();
        
        WebElement button = driver.findElement(By.xpath("//button[text()='Sign Up']"));
        button.click();
        
        
        
       
   
        
        
		
		
		
		



	}

}
