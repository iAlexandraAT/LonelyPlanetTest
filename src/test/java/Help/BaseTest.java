package Help;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    public WebDriver driver;

    @Before
    public void setup() {
        System.setProperty("webdriver.gecko.driver", "C:\\GECKO\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get("https://lonelyplanet.com/");
        //  driver.navigate().to();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @After
    public void tearDown() {
     //   driver.quit();
    }
}

