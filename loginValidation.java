package LoanApp.Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class loginValidation {
	

	public static void main(String[] args) throws InterruptedException {
		mlcbApplicationNegative mlcbApp = new mlcbApplicationNegative(); 
		WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://loan.sivren.org/loan/ins/index.php/authentication/login");
		 Thread.sleep(2000);
	     driver.findElement(By.id("username")).sendKeys("rajesh@db1.com");
		 Thread.sleep(1000);
		 driver.findElement(By.id("password")).sendKeys("Rajesh@123");
		 Thread.sleep(1000);
		 driver.findElement(By.id("submit")).click();
		 Thread.sleep(2000);
		// driver.findElement(By.xpath("/html/body/div[2]/div[1]/ul/li[9]/a")).click();
	//	 driver.quit();
	//	 mlcbApp.mlcbMethod();
	}
	

}
