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
    private By deleteButton = By.xpath("//div[@class=\"text-right\"]/button[2]");
    private By spinner = By.xpath("//*[@class=\"spinner\"]");
//    private By continueBuyButton = By.xpath("//*[@id=\"main-layout\"]/section/div[2]/div/div[1]/div[2]/button[1]");
    private By paymentButton = By.xpath("//div[@class='row']/div[2]/div/div/button[@class='btn btn-primary w-100 mt-4']");
    private By backButton = By.xpath("//div[@class='mt-5 d-flex']/a");
    private By modal = By.xpath("//div[@id='vueConfirm']/div/span/p");
    private By acceptButton = By.xpath("//div[@id='vueConfirm']/div/div/button[@class='vc-btn']");

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

    public void clickPaymentButton(){
        driver.findElement(paymentButton).click();
    }

    public void clickBackButton(){
        waitForElementDisAppear(driver,spinner);
        driver.findElement(backButton).click();
    }

    public void clickDeleteAllProducts(){
        driver.findElement(deleteButton).click();
        waitForElementAppear(driver,modal);
        driver.findElement(acceptButton).click();
        waitForElementDisAppear(driver,spinner);
    }
}
