package LoanApp.Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class loginPositive {
static WebDriver driver;
	public void getWebDriver() {
WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
//		driver.get("https://loan.sivren.org/loan/ins/index.php/authentication/login");
//		driver.manage().window().maximize();
//		 driver.findElement(By.id("username")).sendKeys("rajesh@db1.com");
//		    driver.findElement(By.id("password")).sendKeys("Rajesh@123");
//		    driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
		
	}

}
