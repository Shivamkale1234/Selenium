package dimentionClass;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DimentionEx1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","H:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		Dimension size1 = driver.manage().window().getSize();
		System.out.println(size1);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		Dimension size2 = driver.manage().window().getSize();
		System.out.println(size2);
		
		Dimension d = new Dimension(400, 700);
		driver.manage().window().setSize(d);

	}

}
