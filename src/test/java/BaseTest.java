
import Library.BusinessLibrary;
import Utils.Utils;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;

/**
 * Created by SRI on 15-Jul-14.
 */
public class BaseTest {
    static WebDriver driver;
    static BusinessLibrary Library;
    static Utils Utils;

    @BeforeClass
    public static void start() {
        driver =new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://admin-demo.nopcommerce.com/login?ReturnUrl=%2fadmin%2f");
        Library = new BusinessLibrary(driver);
        Utils = new Utils(driver);

    }

    @AfterClass
        public static void stop()
        {
            driver.quit();
        }


    }

