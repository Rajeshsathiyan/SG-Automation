package LoanApp.Login;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class mlcbApplicationNegative {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://loan.sivren.org/loan/ins/index.php/authentication/login");
		driver.manage().window().maximize();
		 
			//    Mlcb application 
		driver.findElement(By.id("username")).sendKeys("rajesh@db1.com");
	    driver.findElement(By.id("password")).sendKeys("Rajesh@123");
	    driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
	    
		    	WebElement target = driver.findElement(By.xpath("//a[text()='MLCB']"));
		    	WebElement targ1 = driver.findElement(By.xpath("//a[text()='1. Application Form']")); 
		    	Actions s = new Actions (driver);
		    	driver.findElement(By.xpath("//a[text()='MLCB']")); 
		    	s.moveToElement(target);
		    	s.click(targ1);
		    	s.build().perform();
		    	WebElement targ2 =  driver.findElement(By.xpath("//a[text()='Add Mlcb Application(Personal)']"));
		    	Actions a = new Actions (driver);
		    	a.click(targ2);
		    	a.build().perform();
		    	WebElement submit = driver.findElement(By.name("submit_save_back"));
		    	 submit.click();   	
//		    	WebElement errormessage = driver.findElement(By.id("session_message"));
//		    	System.out.println(errormessage);
		    //	int List = errormessage.size();
			//	System.out.println(List);
				String text = driver.findElement(By.id("session_message")).getText();
				System.out.println(text);
		    
	}

	private static void testsubmitmlcb(WebDriver driver) {
		driver.findElement(By.id("username")).sendKeys("rajesh@db1.com");
	    driver.findElement(By.id("password")).sendKeys("Rajesh@123");
	    driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
		
	}

}
