package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiBrowser {
    static String browser  = "Chrome";
    static String  baseUrl = "https://www.saucedemo.com/";
    static WebDriver driver;

    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("Chrome")){
        driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        }else {
            System.out.println("Wrong Browser Name");
        }

        //open the url into browser
        driver.get(baseUrl);
        // maximise the browser
        driver.manage().window().maximize();
        // Print the title of the page
        String title = driver.getTitle();
        System.out.println(title);
        // Print the current url
        System.out.println("Current URL : " + driver.getCurrentUrl());
        //  Print the page source
        System.out.println("Page source : " + driver.getPageSource());
        //Enter the username to username field
        driver.findElement(By.id("user-name")).sendKeys("XYZ123@gmail.com");
        // Enter the password to password field
        driver.findElement(By.id("password")).sendKeys("Abc123");
        //Close the browser
        driver.close();
    }
}
