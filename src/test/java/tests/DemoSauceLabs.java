package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class DemoSauceLabs {
    public static final String baseUrl = System.getProperty("baseUrl", "https://www.google.com/");
    //    public static final String host = System.getProperty("host", "localhost");
    public static final String browserName = System.getProperty("browserName", "chrome");
    public static final String browserVersion = System.getProperty("browserVersion", "75.0");
    public static final String platformName = System.getProperty("platformName", "Windows 10");
    public static final String sauceUser = "oauth-khoaprotk190-813ab";
    public static final String sauceKey = "0342794a-94d9-4fa3-966f-87ee123939ee";
    public static final String sauceUrl = "https://oauth-khoaprotk190-813ab:0342794a-94d9-4fa3-966f-87ee123939ee@ondemand.apac-southeast-1.saucelabs.com:443/wd/hub";

    protected WebDriver driver;

    @BeforeMethod
    public void setUp() throws MalformedURLException {
        System.out.print(baseUrl);
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("browserName", browserName);
//        capabilities.setCapability("browserVersion", browserVersion);
        capabilities.setCapability("platformName", platformName);
        driver = new RemoteWebDriver(new URL(sauceUrl), capabilities);
    }

    @Test
    public void main() {
        driver.navigate().to(baseUrl);
    }

    @AfterMethod
    public void exit() {
        driver.quit();
    }

//    @BeforeMethod
//    public static WebDriver createDriver() {
//        // Should probably validate the arguments here
//        try {
//            DesiredCapabilities capabilities = new DesiredCapabilities();
//            capabilities.setCapability(CapabilityType.BROWSER_NAME, browserName);
//            capabilities.setCapability(CapabilityType.VERSION, browserVersion);
//            capabilities.setCapability(CapabilityType.PLATFORM, platformName);
//            return new RemoteWebDriver(new URL("https://" + sauceUser + ":" + sauceKey + "@ondemand.saucelabs.com:443/wd/hub"),
//                    capabilities);
//        } catch (MalformedURLException e) {
//            throw new RuntimeException("Failure forming the URL to create a web driver", e);
//        }
//    }
//
//    @Test
//    public void main() {
//        WebDriver driver = createDriver();
//        try {
//            // simple output to see the thread for each test method instance
//            System.out.println("starting test in thread: " + Thread.currentThread().getName());
//            // Putting this in a try catch block because you want to be sure to close the driver to free
//            // up the resources even if the test fails
//            driver.get("https://www.google.com");
//        } finally {
//            driver.quit();
//        }
//    }
}