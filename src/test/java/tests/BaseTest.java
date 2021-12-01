package tests;

import commons.GlobalVariable;
import helpers.DriverHelper;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    @BeforeClass
    public static void before(){
        GlobalVariable.setDriver();
        GlobalVariable.getDriver().navigate().to("https://fumart.vn/");
        GlobalVariable.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

}
