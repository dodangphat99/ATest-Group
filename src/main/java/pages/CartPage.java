package pages;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import lombok.experimental.UtilityClass;
import org.openqa.selenium.By;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

import java.io.IOException;

public class CartPage extends BasePage {
    private By keepBuyingButton = By.xpath("//*[@id=\"main-layout\"]/section/div[2]/div/div/div[2]/button");
    private By continueBuyButton = By.xpath("//*[@id=\"main-layout\"]/section/div[2]/div/div[1]/div[2]/button[1]");

    public void clickKeepBuyProduct() throws IOException {
        waitForElementAppear(driver, keepBuyingButton);
        driver.findElement(keepBuyingButton).click();
        logger.log(Status.INFO,"Keep Buy Product Test");
        String message = "Keep Buy Product Failed" + aa.formatFailMessage("abc","xyz")+"&emsp;&emsp;&emsp;&emsp;"+logger.addScreenCaptureFromPath(captureScreen());
        logger.log(Status.FAIL,message);
    }

    public void clickContinueBuyButton(){
        driver.findElement(continueBuyButton).click();
        logger.log(Status.INFO,"Continue Buy Button Test");
        if(driver.getCurrentUrl().equals("https://fumart.vn/san-pham")){
            logger.log(Status.PASS,"Continue Buy Button Successfully");
        } else {
            logger.log(Status.FAIL,"Continue Buy Button Failed");
        }
    }

    public void aaa(Status a,Status b, Status c){

    }
}
