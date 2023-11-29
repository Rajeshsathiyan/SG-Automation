package LoanApp.Login;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class ErrorScreenScreenshot {

    public static void main(String[] args) throws InterruptedException {
    	WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://loan.sivren.org/loan/ins/index.php/authentication/login");
		 driver.findElement(By.id("username")).sendKeys("");
		 Thread.sleep(1000);
		 driver.findElement(By.id("password")).sendKeys("");
		 Thread.sleep(1000);
		 driver.findElement(By.id("submit")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));


        // Take a full-screen screenshot
        takeFullScreenScreenshot(driver, "./snaps/errormessage.png");

        // Close the browser
        driver.quit();
    }

    private static void takeFullScreenScreenshot(WebDriver driver, String fileName) {
        // Convert the WebDriver instance to TakesScreenshot
        TakesScreenshot screenshot = (TakesScreenshot) driver;

        // Capture the screenshot as a file
        File sourceFile = screenshot.getScreenshotAs(OutputType.FILE);

        // Define the destination file
        File destinationFile = new File(fileName);

        try {
            // Copy the screenshot file to the destination
            FileHandler.copy(sourceFile, destinationFile);
            System.out.println("Full-screen screenshot captured and saved to: " + destinationFile.getAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Failed to capture full-screen screenshot: " + e.getMessage());
        }
    }
}
