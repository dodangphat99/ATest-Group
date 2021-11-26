package reports;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

import java.sql.Driver;

public class SoftAssertion {
    public static void assertEqual( String expected, String pass, String fail){
        Status status = BasePage.driver.getCurrentUrl().equals(expected) ? Status.PASS : Status.FAIL;
        String message = status == Status.PASS ? pass : fail;
        BasePage.logger.log(status,message);
//        if(driver.getCurrentUrl().equals(expected)){
//            logger.log(Status.PASS,message);
//        } else {
//            logger.log(Status.FAIL,message);
//        }
    }
}
