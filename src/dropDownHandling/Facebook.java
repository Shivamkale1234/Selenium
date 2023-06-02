package dropDownHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","H:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/reg/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.manage().deleteAllCookies();
		
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
        Select s1=new Select(day);
        
		s1.selectByIndex(11);
		//s.selectByValue("");
        //s.selectByVisibleText("");
		
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
        Select s2=new Select(month);
        
        //s2.selectByIndex();
        s2.selectByValue("8");
        //s.selectByVisibleText("");
        
        WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
        Select s3=new Select(year);
       
        //s3.selectByIndex();
        s3.selectByValue("1996");
        //s3.selectByVisibleText("");
        
        WebElement male = driver.findElement(By.xpath("(//input[@name='sex'])[2]"));
        male.click();
        //Select s4=new Select(male);
        
        //s4.selectByIndex();
        //s4.selectByValue("");
        //s4.selectByVisibleText("");
	}

}
