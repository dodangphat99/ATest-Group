package reports;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import commons.GlobalVariable;
import helpers.DriverHelper;
import org.openqa.selenium.WebDriver;

import java.sql.Driver;

public class SoftAssertion {
    public static final String FAIL_MESSAGE_FORMAT = "<br>&emsp;&emsp;&emsp;&emsp;Expected Result: %s<br/>"
            + "&emsp;&emsp;&emsp;&emsp;Actual Result: %s<br/>";

    public static void assertEqual( String expected, String pass, String fail){
        Status status = GlobalVariable.getDriver().getCurrentUrl().equals(expected) ? Status.PASS : Status.FAIL;
        String message = status == Status.PASS ? pass : fail;
        GlobalVariable.getLogger().log(status,message);
//        if(driver.getCurrentUrl().equals(expected)){
//            logger.log(Status.PASS,message);
//        } else {
//            logger.log(Status.FAIL,message);
//        }
    }

    public static String formatFailMessage(final String expected, final String actual){
        return String.format(FAIL_MESSAGE_FORMAT,expected,actual);
    }

}
