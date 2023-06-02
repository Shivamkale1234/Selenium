package dropDownHandling;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","H:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.manage().deleteAllCookies();
		
		WebElement drop = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		Thread.sleep(2000);
		
        Select s=new Select(drop);
    	Thread.sleep(2000);
    	
        //s.selectByIndex(5);
        //s.selectByValue("search-alias=electronics-intl-ship");
        s.selectByVisibleText("Electronics");
        
        //Count of options 
        List<WebElement> all_option = s.getOptions();
        int count = all_option.size();
        System.out.println(count);
        for(int i=0; i<count; i++)
        {
        	String data = all_option.get(i).getText();
        	System.out.println(data);
        }
        
    	Thread.sleep(2000);
        //enter text
        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iphone 13 pro");
    	Thread.sleep(2000);
        //click on search button
        driver.findElement(By.xpath("(//input[@class='nav-input nav-progressive-attribute'])[2]")).click();
             
       
        
	}	
}

