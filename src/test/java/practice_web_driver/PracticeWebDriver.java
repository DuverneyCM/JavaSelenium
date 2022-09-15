package practice_web_driver;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeWebDriver {
    public static void main(String[] args) {
        //Set driver path
        System.setProperty("webdriver.chrome.driver", "c:\\webdrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http:\\automationpractice.com");
        driver.findElement(By.className("login")).click();
        driver.findElement(By.id("email_create")).sendKeys("duver5@hotmail.com");
        driver.findElement(By.id("SubmitCreate")).click();
        String pageHeading = driver.findElement(By.className("page-heading")).getText();
        //System.out.println("Page Heading: " + pageHeading);
        Assertions.assertEquals("Create an account", pageHeading);
    }
}