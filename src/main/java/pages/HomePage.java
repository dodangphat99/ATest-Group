package pages;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class HomePage extends BasePage {
    private By confirm = By.xpath("//*[@id='select-store-modal___BV_modal_body_']/div/div/button");
    private By createAccount = By.xpath("//*[@id='app-wrapper']/header/div[1]/div/div/div/div[1]/a");
    private By imageSlide = By.xpath("//*[@id=\"__BVID__180\"]/img");
    private By cartButton = By.xpath("//*[@id=\"app-wrapper\"]/header/div[1]/div/div/div/div[2]/div[2]/a");

    public void clickRegister(){
        driver.findElement(confirm).click();
        driver.findElement(createAccount).click();
        ExtentTest logger = extent.createTest("SwitchToRegisterTest");
        logger.log(Status.INFO,"Switch To Register to Fumart");
        if(driver.getCurrentUrl().equals("https://fumart.vn/register")){
            logger.log(Status.PASS,"Switch To Register Successfully");
        } else {
            logger.log(Status.FAIL,"Switch To Register Failed");
        }
    }

    public void clickCart(){
        waitForElementDisAppear(driver,imageSlide);
        driver.findElement(cartButton).click();
        ExtentTest logger = extent.createTest("CartTest");
        logger.log(Status.INFO,"Switch to Cart Screen");
        if(driver.getCurrentUrl().equals("https://fumart.vn/cart")){
            logger.log(Status.PASS,"Switch to Cart Screen Successfully");
        } else {
            logger.log(Status.FAIL,"Switch to Cart Screen Failed");
        }
    }
}
