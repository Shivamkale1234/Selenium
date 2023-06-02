package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RediffCom {
public static void main(String[] args)  {
		
		System.setProperty("webdriver.chrome.driver","H:\\chromedriver_win32\\chromedriver.exe");
				
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.rediff.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//switch the focus of selenium from main page to frame
		WebElement frame_web = driver.findElement(By.xpath("//iframe[@id='moneyiframe']"));
		driver.switchTo().frame(frame_web);

	    WebElement bsc_value = driver.findElement(By.xpath("//span[@id='bseindex']"));
		String value = bsc_value.getText();
		System.out.println(value);
		
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//a[text()='SPORTS']")).click();		
}
}