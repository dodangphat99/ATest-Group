package tests;

import commons.GlobalVariable;
import helpers.DriverHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class BaseTest {
//    public static Actions actions = new Actions(GlobalVariable.getDriver());
//    private static WebElement bodyXpath = By.xpath("//body");

    @BeforeClass
    public static void before(){
        GlobalVariable.setDriver();
        GlobalVariable.getDriver().navigate().to("https://fumart.vn/");
        GlobalVariable.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//        actions.contextClick(bodyXpath).perform();
    }

}
