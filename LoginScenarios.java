package LoanApp.Login;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginScenarios {

    public static void main(String[] args) {
    	WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

        try {
            // Test positive scenario for valid username and password
            testValidLogin(driver, "validUsername", "validPassword");

            // Test negative scenario for invalid username
            testInvalidUsername(driver, "invalidUsername", "validPassword");

            // Test negative scenario for invalid password
           testInvalidPassword(driver, "validUsername", "invalidPassword");
        } finally {
            // Close the browser
            driver.quit();
        }
    }

    private static void testValidLogin(WebDriver driver, String username, String password) {
        // Navigate to the login page
        driver.get("https://loan.sivren.org/loan/ins/index.php/authentication/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        // Locate the username and password fields
        WebElement usernameField = driver.findElement(By.id("username"));
        WebElement passwordField = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.id("submit"));

        // Enter valid username and password
        usernameField.sendKeys("rajesh@db1.com");
        passwordField.sendKeys("Rajesh@123");

        // Click the login button
        loginButton.click();

        // Perform validation/assertion for the positive scenario
        // (Check if the login is successful, navigate to the next page, or any other expected behavior)
        WebElement module_dashboard = driver.findElement(By.id("menu"));

        // Assert that the dashboard title element is displayed
        if (module_dashboard.isDisplayed()) {
            System.out.println("Positive scenario: Login successful. Landed on the dashboard.");
        } else {
            System.out.println("Positive scenario: Login successful, but failed to land on the dashboard.");
        }
    }

    private static void testInvalidUsername(WebDriver driver, String username, String password) {
    	 driver.get("https://loan.sivren.org/loan/ins/index.php/authentication/login");
    	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
         // Locate the username and password fields
         WebElement usernameField = driver.findElement(By.id("username"));
         WebElement passwordField = driver.findElement(By.id("password"));
         WebElement loginButton = driver.findElement(By.id("submit"));

         // Enter valid username and password
         usernameField.sendKeys("rajesh@db");
         passwordField.sendKeys("Rajesh@123");

         // Click the login button
         loginButton.click();

         // Perform validation/assertion for the positive scenario
         // (Check if the login is successful, navigate to the next page, or any other expected behavior)
         WebElement errormessage = driver.findElement(By.className("message_error"));

         // Assert that the dashboard title element is displayed
         if (errormessage.isDisplayed()) {
        	 System.out.println(driver.findElement(By.className("message_error")).getText());
         } else {
             System.out.println("Positive scenario: Login successful, but failed to land on the dashboard.");
         }
    }

    private static void testInvalidPassword(WebDriver driver, String username, String password) {
    	 driver.get("https://loan.sivren.org/loan/ins/index.php/authentication/login");
    	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
         // Locate the username and password fields
         WebElement usernameField = driver.findElement(By.id("username"));
         WebElement passwordField = driver.findElement(By.id("password"));
         WebElement loginButton = driver.findElement(By.id("submit"));

         // Enter valid username and password
         usernameField.sendKeys("rajesh@db1.com");
         passwordField.sendKeys("Rajesh@12");

         // Click the login button
         loginButton.click();

         // Perform validation/assertion for the positive scenario
         // (Check if the login is successful, navigate to the next page, or any other expected behavior)
         WebElement errormessage1 = driver.findElement(By.className("message_error"));

         // Assert that the dashboard title element is displayed
         if (errormessage1.isDisplayed()) {
        	 System.out.println(driver.findElement(By.className("message_error")).getText());
         } else {
             System.out.println("Positive scenario: Login successful, but failed to land on the dashboard.");
         }
    }
}
