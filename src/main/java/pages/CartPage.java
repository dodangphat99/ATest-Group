package pages;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import lombok.experimental.UtilityClass;
import org.openqa.selenium.By;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

import java.io.IOException;

public class CartPage extends BasePage {
    private By keepBuyingButton = By.xpath("//div[@class=\"text-right\"]/button");
//    private By continueBuyButton = By.xpath("//*[@id=\"main-layout\"]/section/div[2]/div/div[1]/div[2]/button[1]");

    public void clickKeepBuyProduct(){
        waitForElementAppear(driver, keepBuyingButton);
        driver.findElement(keepBuyingButton).click();
        logger.log(Status.INFO,"Keep Buy Product Test");
        String failClickKeepBuyProduct=null;
        try {
            failClickKeepBuyProduct = "Keep Buy Product Failed" + aa.formatFailMessage("abc","xyz")
                    +"&emsp;&emsp;&emsp;&emsp;"
                    +logger.addScreenCaptureFromPath(captureScreen());
        } catch (IOException e) {
            e.printStackTrace();
        }
        logger.log(Status.FAIL,failClickKeepBuyProduct);
    }

    public void clickContinueBuyButton(){
        driver.findElement(keepBuyingButton).click();
    }
}
