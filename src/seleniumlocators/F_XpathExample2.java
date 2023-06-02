
package seleniumlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class F_XpathExample2 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","H:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com/reg/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.manage().deleteAllCookies();
		
		driver.findElement(By.xpath("//input[contains(@id,'u_0_j')]")).sendKeys("shivam");
		
		driver.findElement(By.xpath("(//input[contains(@id,'u_0_l')])[1]")).sendKeys("kale");
		
        driver.findElement(By.xpath("(//input[contains(@id,'u_0_o')])[1]")).sendKeys("8421334270");
		
		driver.findElement(By.xpath("(//input[contains(@id,'password_step_input')])[1]")).sendKeys("********");
		
		
	}

}
