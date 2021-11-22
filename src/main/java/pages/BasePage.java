package pages;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import helpers.JsonHelper;
import helpers.RegisterHelper;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class BasePage extends RegisterHelper {
    public static WebDriver driver;
    public static ExtentHtmlReporter reporter;
    public static ExtentReports extent;

    @BeforeTest
    public static void before(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.navigate().to("https://fumart.vn/");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        reporter = new ExtentHtmlReporter("C:\\Users\\PC\\IdeaProjects\\Test\\Reports\\report.html");
        extent = new ExtentReports();
        extent.attachReporter(reporter);
    }

    public void waitForElementAppear(WebDriver drive, By locator){
        WebDriverWait webDriverWait = new WebDriverWait(drive,ELEMENT_TIME_WAIT);
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public void waitForElementDisAppear(WebDriver drive, By locator){
        WebDriverWait webDriverWait = new WebDriverWait(drive,ELEMENT_TIME_WAIT);
        webDriverWait.until(ExpectedConditions.numberOfElementsToBe(locator, 0));
    }
    @AfterTest
    public void afterTest(){
        extent.flush();
    }

}
