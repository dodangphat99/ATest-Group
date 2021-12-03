package tests;

import commons.GlobalVariable;
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
    public static final String sauceUrl = "https://oauth-thanhtngcd17200-3d846:cd009abb-df5d-4feb-a9ab-c1391b369a69@ondemand.us-west-1.saucelabs.com:443/wd/hub";
    WebDriver driver;

    @BeforeMethod
    public void setUp() throws MalformedURLException {
        System.out.print(baseUrl);
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("browserName", browserName);
//        capabilities.setCapability("browserVersion", browserVersion);
        capabilities.setCapability("platformName", platformName);
        driver = new RemoteWebDriver(new URL(sauceUrl), capabilities);
        System.out.print("Start.");
    }

    @Test
    public void main() {
        System.out.print("Run.");
        driver.navigate().to(baseUrl);
    }

    @AfterMethod
    public void exit() {
        driver.quit();
        System.out.print("End.");
    }
}
