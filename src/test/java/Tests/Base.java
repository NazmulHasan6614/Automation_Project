package Tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class Base {

    public static WebDriver driver;

    @BeforeTest
    public void setUpTest() {

        // WebDriverManager.firefoxdriver().setup();
        WebDriverManager.chromedriver().setup();

        // driver = new FirefoxDriver();
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("http://www.automationpractice.pl/index.php");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);


    }
}
