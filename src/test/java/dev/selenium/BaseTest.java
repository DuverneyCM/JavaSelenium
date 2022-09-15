package dev.selenium;

//import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
    public WebDriver driver;
    //@BeforeALL
    //@BeforeStep
    //@BeforeEach
    //@AfterALL
    //@AfterStep
    //@AfterEach
    //@Rule
    //@Background
    //@Scenario / @example
    //@Scenario Outline -> @examples -> tables | x | y |


    @BeforeAll
    public static void setDriver() {
        //WebDriverManager.chromedriver().setup();
        System.setProperty("webdriver.chrome.driver", "c:\\webdrivers\\chromedriver.exe");
    }

    @BeforeEach
    public void setup() {
        driver = new ChromeDriver();
    }

    @AfterEach
    public void quit() {
        driver.quit();
    }
}