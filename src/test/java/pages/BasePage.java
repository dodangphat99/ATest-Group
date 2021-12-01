package pages;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
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
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import reports.SoftAssertion;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class BasePage {

    public static void waitForElementAppear(WebDriver driver, By locator){
        WebDriverWait webDriverWait = new WebDriverWait(driver,RegisterHelper.ELEMENT_TIME_WAIT);
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public static void waitForElementDisAppear(WebDriver driver, By locator){
        WebDriverWait webDriverWait = new WebDriverWait(driver,RegisterHelper.ELEMENT_TIME_WAIT);
        webDriverWait.until(ExpectedConditions.numberOfElementsToBe(locator, 0));
    }

}
