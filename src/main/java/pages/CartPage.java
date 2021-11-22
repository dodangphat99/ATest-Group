package pages;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;

public class CartPage extends BasePage {
    private By keepBuyingButton = By.xpath("//*[@id=\"main-layout\"]/section/div[2]/div/div/div[2]/button");
    private By continueBuyButton = By.xpath("//*[@id=\"main-layout\"]/section/div[2]/div/div[1]/div[2]/button[1]");

    public void clickKeepBuyProduct() {
        waitForElementAppear(driver, keepBuyingButton);
        driver.findElement(keepBuyingButton).click();
        ExtentTest logger = extent.createTest("KeepBuyProductTest");
        logger.log(Status.INFO,"Keep Buy Product Test");
        if(driver.getCurrentUrl().equals("https://fumart.vn/san-pham")){
            logger.log(Status.PASS,"Keep Buy Product Successfully");
        } else {
            logger.log(Status.FAIL,"Keep Buy Product Failed");
        }
    }

    public void clickContinueBuyButton(){
        driver.findElement(continueBuyButton).click();
        ExtentTest logger = extent.createTest("ContinueBuyButtonTest");
        logger.log(Status.INFO,"Continue Buy Button Test");
        if(driver.getCurrentUrl().equals("https://fumart.vn/san-pham")){
            logger.log(Status.PASS,"Continue Buy Button Successfully");
        } else {
            logger.log(Status.FAIL,"Continue Buy Button Failed");
        }
    }
}
