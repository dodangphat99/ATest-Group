package pages;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.utils.FileUtil;
import helpers.JsonHelper;
import helpers.RegisterHelper;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import reports.AbstractAssertion;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class BasePage extends RegisterHelper {
    public static WebDriver driver;
    public static ExtentHtmlReporter reporter;
    public static ExtentReports extent;
    public static ExtentTest logger;
    public static AbstractAssertion aa;

    @BeforeTest
    public static void before(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.navigate().to("https://fumart.vn/");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        reporter = new ExtentHtmlReporter("C:\\Users\\PC\\IdeaProjects\\Test\\Reports\\report.html");
        extent = new ExtentReports();
        extent.attachReporter(reporter);
        aa = new AbstractAssertion();
        logger = extent.createTest("RegisterTest");
    }

    public void waitForElementAppear(WebDriver drive, By locator){
        WebDriverWait webDriverWait = new WebDriverWait(drive,ELEMENT_TIME_WAIT);
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public void waitForElementDisAppear(WebDriver drive, By locator){
        WebDriverWait webDriverWait = new WebDriverWait(drive,ELEMENT_TIME_WAIT);
        webDriverWait.until(ExpectedConditions.numberOfElementsToBe(locator, 0));
    }

    public static String captureScreen(){
        TakesScreenshot ts = (TakesScreenshot) driver;
        File src = ts.getScreenshotAs(OutputType.FILE);
        String destination = "C:\\Users\\PC\\Downloads\\"+getCurrentDateAndTime()+".png";
        File finalDestination = new File(destination);

        try{
            FileUtils.copyFile(src,finalDestination);
        } catch (IOException e){
            System.out.print("Capture Failed "+e.getMessage());
        }

        return destination;
    }

    public static String getCurrentDateAndTime(){
        String str = null;
        try{
            DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss:SSS");
            Date date = new Date();
            str= dateFormat.format(date);
            str = str.replace(" ", "").replaceAll("/", "").replaceAll(":", "");
        }
        catch(Exception e){

        }
        return str;
    }


    @AfterTest
    public void afterTest(){
        driver.quit();
        extent.flush();
    }

}
