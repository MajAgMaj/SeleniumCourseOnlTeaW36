package pl.coderslab.seleniumcourseonlteaw36;

import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Base {
    public static WebDriver driver = new ChromeDriver();
    @BeforeAll
    public static void setUp(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(16));
    }
}
