package tests;

import commons.GlobalVariable;
import helpers.DriverHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.interactions.Actions;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class BaseTest {

    @BeforeClass
    public static void before(){
        GlobalVariable.setDriver();
        Actions actions = new Actions(GlobalVariable.getDriver());
        GlobalVariable.getDriver().navigate().to("https://fumart.vn/");
        WebElement elementLocator = GlobalVariable.getDriver().findElement(By.xpath("//body"));
        GlobalVariable.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        actions.contextClick(elementLocator).build().perform();
    }

}
